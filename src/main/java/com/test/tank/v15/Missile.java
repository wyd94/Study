package com.test.tank.v15;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;


//�ӵ���

public class Missile {
	//�ٶ�
	public static final int XSPEED = 10;
	public static final int YSPEED = 10;
	
	public static final int WIDTH =10;
	public static final int HEIGHT=10;
	//�ӵ�����
	int x ,y;//λ��
	Tank.Direction dir;//����
	
	private  boolean live = true; //����������Boolean ���͵���
	private TankClient tc;

	public Missile(int x, int y, Tank.Direction dir) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
	
	public Missile(int x ,int y, Tank.Direction dir , TankClient tc ){
		//����
		this(x, y, dir);
		this.tc= tc;
	}
	public void draw(Graphics g){
		//�ж�̹���Ƿ����
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
	//Rectangle����
	//ͨ��̹�����Ͻǵ�λ��xy�Լ��ӵ����Ͻǵ�λ�����꣬��͸� ��ȡ��ײ�ķ���
	public Rectangle getRect(){
		return new Rectangle(x, y, WIDTH, HEIGHT);
	}
	public boolean hitTank(Tank t){
		if (this.getRect().intersects(t.getRect()) && t.isLive())//���ز���ֵ
		{
			t.setLive(false);
			this.live= false;
			return true;
			
		}
		return false;
	
	}
}