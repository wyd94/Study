package com.test.tank.v2;
import java.awt.*;
import java.awt.event.*;

//0.2   1.��ӹرմ��ڵļ����¼�   2.�̶����ڣ�������ı��С��
public class TankClient extends Frame {
	public void lauchFrame(){
		this.setLocation(400, 300);
		this.setSize(800, 600);
		this.setTitle("TankWar");
		
		//��ӹرմ��ڵļ����¼���ʹ�������෽��
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//�����˳�
			}
			
			
		});
		this.setResizable(false);//�̶����ڴ�С
		setVisible(true);
	}
	public static void main(String[] args) {
		TankClient tc =new TankClient();
		tc.lauchFrame();

	}

}
