package com.test.tank.v1;
import java.awt.*;

public class TankClient extends Frame{
//从Frame 继承
	public void lauchFrame(){
		//创建一个窗口
		this.setLocation(400, 300);//定义窗口出现的位置
		this.setSize(800, 600);//设置长度和宽度
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		TankClient tc=new TankClient();
		tc.lauchFrame();
		
	}

}
