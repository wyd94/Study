package com.test.tank.v1;
import java.awt.*;

public class TankClient extends Frame{
//��Frame �̳�
	public void lauchFrame(){
		//����һ������
		this.setLocation(400, 300);//���崰�ڳ��ֵ�λ��
		this.setSize(800, 600);//���ó��ȺͿ��
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		TankClient tc=new TankClient();
		tc.lauchFrame();
		
	}

}
