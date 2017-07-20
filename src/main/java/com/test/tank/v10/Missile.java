package com.test.tank.v10;
import java.awt.Color;
import java.awt.Graphics;

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
	
	public Missile(int x, int y, Tank.Direction dir) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
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
}
}