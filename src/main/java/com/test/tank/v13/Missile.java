package com.test.tank.v13;
import java.awt.Color;
import java.awt.Graphics;

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
	public boolean isLive() {
		return live;
	}
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
}