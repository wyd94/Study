package com.test.tank.v15;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;


//子弹类

public class Missile {
	//速度
	public static final int XSPEED = 10;
	public static final int YSPEED = 10;
	
	public static final int WIDTH =10;
	public static final int HEIGHT=10;
	//子弹属性
	int x ,y;//位置
	Tank.Direction dir;//方向
	
	private  boolean live = true; //设置生死的Boolean 类型的量
	private TankClient tc;

	public Missile(int x, int y, Tank.Direction dir) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
	
	public Missile(int x ,int y, Tank.Direction dir , TankClient tc ){
		//调用
		this(x, y, dir);
		this.tc= tc;
	}
	public void draw(Graphics g){
		//判断坦克是否活着
		if(!live){
			tc.missiles.remove(this);
			return;
		}
		Color c =g.getColor();
		g.setColor(Color.BLACK);
		g.fillOval(x, y, WIDTH, HEIGHT);
		g.setColor(c);
		
		move();
	}
	private void move() {
		
		switch (dir) {
	
	case L:
		x -=XSPEED;
		break;
	case LU:
		x -=XSPEED;
		y -=YSPEED;
		break;
	case U:
		y -=YSPEED;
		break;
	case RU:
		x +=XSPEED;
		y -=YSPEED;
		break;
	case R:
		x +=XSPEED;
		break;
	case RD:
		x +=XSPEED;
		y +=YSPEED;
		break;
		
	case D:
		
		y +=YSPEED;
		break;
		
	case LD:
		x -=XSPEED;
		y +=YSPEED;
		break;
    case STOP:
	
	
		break;
		
	}
		if (x < 0 || y < 0 || x > TankClient.GAME_WIDTH || y > TankClient.GAME_HEIGH) {
			live = false;
			tc.missiles.remove(this);
		}
		
}
	public boolean isLive() {
		return live;
	}
	//Rectangle矩形
	//通过坦克左上角的位置xy以及子弹左上角的位置坐标，宽和高 获取碰撞的方块
	public Rectangle getRect(){
		return new Rectangle(x, y, WIDTH, HEIGHT);
	}
	public boolean hitTank(Tank t){
		if (this.getRect().intersects(t.getRect()) && t.isLive())//返回布尔值
		{
			t.setLive(false);
			this.live= false;
			return true;
			
		}
		return false;
	
	}
}