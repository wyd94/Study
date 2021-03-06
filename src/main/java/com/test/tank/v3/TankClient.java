package com.test.tank.v3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankClient extends Frame{
	//设置位置的变量，坦克的左上角位置
	int x =50;
	int y =50;
		//重写paint
	public void paint(Graphics g) {
		Color color =g.getColor();
		g.setColor(Color.RED);
		g.fillOval(50, 50, 30, 30);//绘画同心圆
		g.setColor(color);
		
		y +=5;
				
	}
	public void lauchFrame(){
		this.setLocation(400, 300);
		this.setSize(800, 600);
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
				Thread.sleep(100);//每睡眠100毫秒重画一次
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
			
		}
		
	}
}
