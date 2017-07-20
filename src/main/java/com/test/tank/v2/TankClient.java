package com.test.tank.v2;
import java.awt.*;
import java.awt.event.*;

//0.2   1.添加关闭窗口的监听事件   2.固定窗口，不允许改变大小；
public class TankClient extends Frame {
	public void lauchFrame(){
		this.setLocation(400, 300);
		this.setSize(800, 600);
		this.setTitle("TankWar");
		
		//添加关闭窗口的监听事件，使用匿名类方法
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//正常退出
			}
			
			
		});
		this.setResizable(false);//固定窗口大小
		setVisible(true);
	}
	public static void main(String[] args) {
		TankClient tc =new TankClient();
		tc.lauchFrame();

	}

}
