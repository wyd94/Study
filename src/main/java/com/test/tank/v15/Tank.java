package com.test.tank.v15;
import java.awt.event.*;

import org.omg.CORBA.INTERNAL;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import java.awt.*;


public class Tank {
	public static final int XSPEED =5;
	public static final int YSPEED =5;
	
	public static final int WIDTH =30;
	public static final int HEIGHT=30;
	//设置坦克生死的量
	private boolean live=true;
	
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	TankClient tc;
	//设置坦克阵营
	private boolean good;
	private int x;
	private int y;
	
	private boolean bL=false, bU=false, bR=false, bD=false;
	//枚举类型
	enum Direction{L, LU, U, RU, R, RD, D, LD, STOP};
	private Direction dir = Direction.STOP;
	private Direction ptDir =Direction.D;//炮筒方向
	
	
	public Tank(int x, int y,boolean good) {
		this.x = x;
		this.y = y;
		this.good =good;
	}
	public Tank(int x, int y, boolean good, TankClient tc){
		this(x, y,good);//初始化x，y
		this.tc =tc;//初始化
	}

	public void draw(Graphics g) {
		if(!live) return;//如果死了，不绘画坦克
		Color color =g.getColor();
		if(good) g.setColor(Color.RED);
		else g.setColor(Color.BLUE);
		
		g.fillOval(x, y, 30, 30);//绘画同心圆
		g.setColor(color);
		//炮筒方向
		switch (ptDir) {
		case L:
			g.drawLine(x + Tank.WIDTH/2, y + Tank.HEIGHT/2, x, y +Tank.HEIGHT/2);
			break;
		case LU:
			g.drawLine(x + Tank.WIDTH/2, y + Tank.HEIGHT/2, x, y );
			break;
		case U:
			g.drawLine(x + Tank.WIDTH/2, y + Tank.HEIGHT/2, x +Tank.WIDTH/2, y );
			break;
		case RU:
			g.drawLine(x + Tank.WIDTH/2, y + Tank.HEIGHT/2, x + Tank.WIDTH, y );
			break;
		case R:
			g.drawLine(x + Tank.WIDTH/2, y + Tank.HEIGHT/2, x +Tank.WIDTH, y +Tank.HEIGHT/2);
			break;
		case RD:
			g.drawLine(x + Tank.WIDTH/2, y + Tank.HEIGHT/2, x +Tank.WIDTH, y +Tank.HEIGHT);
			break;
			
		case D:
			
			g.drawLine(x + Tank.WIDTH/2, y + Tank.HEIGHT/2, x +Tank.WIDTH/2, y +Tank.HEIGHT);
			break;
			
		case LD:
			g.drawLine(x + Tank.WIDTH/2, y + Tank.HEIGHT/2, x, y +Tank.HEIGHT);
			break;
	    case STOP:
		     break;

		}
		move();
		
	}
	void move(){
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
  	   if (this.dir != Direction.STOP) {
		this.ptDir =this.dir;
	}
  	   //控制坦克出界的问题
  	   if (x < 0) x = 0;
  	   if (y < 25) y =25;
  	   if(x + Tank.WIDTH > TankClient.GAME_WIDTH) x =TankClient.GAME_WIDTH -Tank.WIDTH;
  	   if(y + Tank.HEIGHT > TankClient.GAME_HEIGH) y = TankClient.GAME_HEIGH - Tank.HEIGHT;
		
	
  	}
  


	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		   switch (key) {
		  
		   case KeyEvent.VK_LEFT:
			   bL =true;
			break;
		   case KeyEvent.VK_RIGHT:
			   bR =true;
			break;
		   case KeyEvent.VK_UP:
			   bU=true;
			break;
		   case KeyEvent.VK_DOWN:
			   bD =true;
			break;
			
		   }
		locateDirection();
		
	}
	void locateDirection(){
		if(bL && !bU && !bR && !bD) dir = Direction.L;
		else if(bL && bU && !bR && !bD) dir = Direction.LU;
		else if(!bL && bU && !bR && !bD) dir = Direction.U;
		else if(!bL && bU && bR && !bD) dir = Direction.RU;
		else if(!bL && !bU && bR && !bD) dir = Direction.R;
		else if(!bL && !bU && bR && bD) dir = Direction.RD;
		else if(!bL && !bU && !bR && bD) dir = Direction.D;
		else if(bL && !bU && !bR && bD) dir = Direction.LD;
		else if(!bL && !bU && !bR && !bD) dir = Direction.STOP;
		
	}

	public void keyReleased(KeyEvent e) {
		
		int key = e.getKeyCode();
		   switch (key) {
		   case KeyEvent.VK_SPACE:
				 fire();
				 break;
			   
		   case KeyEvent.VK_LEFT:
			   bL =false;
			break;
		   case KeyEvent.VK_RIGHT:
			   bR =false;
			break;
		   case KeyEvent.VK_UP:
			   bU=false;
			break;
		   case KeyEvent.VK_DOWN:
			   bD =false;
			break;
	}
		   locateDirection();
		
	}
	//坦克发射方法
	public Missile fire(){
		int x =this.x + Tank.WIDTH/2 - Missile.WIDTH/2;
		int y =this.y + Tank.HEIGHT/2 - Missile.HEIGHT/2;
		Missile m =new Missile(x, y, ptDir,this.tc);//根据坦克现在的位置传递给子弹
		tc.missiles.add(m);
		return m;
		
	}
	public Rectangle getRect(){
		return new Rectangle(x, y, WIDTH, HEIGHT);
	}
}