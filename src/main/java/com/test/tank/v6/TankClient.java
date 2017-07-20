package com.test.tank.v6;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankClient extends Frame{
	//代码重构，将窗口大小定义常量
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGH = 600;
	
	
    Tank tank =new Tank(50, 50);
	
	
	Image OffScreenImage = null;
		//重写paint
	public void paint(Graphics g) {
		tank.draw(g);
		
	
				
	}
	public void update(Graphics g) {
		if(OffScreenImage == null){
			OffScreenImage=this.createImage(GAME_WIDTH,GAME_HEIGH);//构建虚拟图片大小
	  }	
	   Graphics gOffScreen= OffScreenImage.getGraphics();
	   Color color=gOffScreen.getColor();
	   gOffScreen.setColor(Color.GREEN);
	   gOffScreen.fillRect(0, 0, GAME_WIDTH,GAME_HEIGH);
	   gOffScreen.setColor(color);
	   paint(gOffScreen);
	   g.drawImage(OffScreenImage, 0, 0, null);
	}
	public void lauchFrame(){
		this.setLocation(400, 300);
		this.setSize(GAME_WIDTH,GAME_HEIGH);
		this.setTitle("TankWar");
		//添加关闭窗口的监听事件
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		this.setResizable(false);//固定窗口大小
		this.setBackground(Color.GREEN);//窗口背景色
		//添加键盘监听
		this.addKeyListener(new KeyMonitor());
		
		setVisible(true);
		
		new Thread(new PaintThread()).start();//内部类包装paint（graphics）
	}
	public static void main(String[] args) {
		TankClient tc = new TankClient();
		tc.lauchFrame();
	}
	//启动线程重画Frame，内部类
	private class PaintThread implements Runnable{


		public void run() {
			while(true){
				repaint();//调用外部包装类的repaint方法，重画paint
			  try {
				Thread.sleep(50);//每睡眠100毫秒重画一次
			} catch (InterruptedException e) {
			     e.printStackTrace();
			}
			}
			
		}
		
	}
	//定义键盘的监听类，运用外部类，继承KeyAdapter
	private  class KeyMonitor extends KeyAdapter{

		
		public void keyPressed(KeyEvent e) {
			tank.KeyPressed(e);
			
		}
	
		
	}
}

