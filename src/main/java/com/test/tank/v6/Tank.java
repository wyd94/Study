package com.test.tank.v6;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;





//坦克类
public class Tank {

      int x ,y;

  	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}
  	
  	public void draw(Graphics g){
  		Color color =g.getColor();
		g.setColor(Color.RED);
		g.fillOval(x, y, 30, 30);//绘画同心圆
		g.setColor(color);
  	}
	
	public void KeyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		   switch (key) {
		   case KeyEvent.VK_LEFT:
			x -=5;
			break;
		   case KeyEvent.VK_RIGHT:
			x +=5;
			break;
		   case KeyEvent.VK_UP:
			y -=5;
			break;
		   case KeyEvent.VK_DOWN:
			y +=5;
			break;
			
		   }
		
	}
}
