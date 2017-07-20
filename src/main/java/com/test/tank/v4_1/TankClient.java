package com.test.tank.v4_1;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankClient extends Frame{
     //����λ�õı�����̹�˵����Ͻ�λ��
	int x =50, y=50;
	
	Image OffScreenImage = null;
		//��дpaint
	public void paint(Graphics g) {
		Color color =g.getColor();
		g.setColor(Color.RED);
		g.fillOval(x, y, 30, 30);//�滭ͬ��Բ
		g.setColor(color);
		
		y +=5;
				
	}
	public void update(Graphics g) {
		if(OffScreenImage == null){
			OffScreenImage=this.createImage(800,600);//��������ͼƬ��С
	  }	
	   Graphics gOffScreen= OffScreenImage.getGraphics();
	   Color color=gOffScreen.getColor();
	   gOffScreen.setColor(Color.GREEN);
	   gOffScreen.fillRect(0, 0, 800, 600);
	   gOffScreen.setColor(color);
	   paint(gOffScreen);
	   g.drawImage(OffScreenImage, 0, 0, null);
	}
	public void lauchFrame(){
		this.setLocation(400, 300);
		this.setSize(800, 600);
		this.setTitle("TankWar");
		//��ӹرմ��ڵļ����¼�
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		this.setResizable(false);//�̶����ڴ�С
		this.setBackground(Color.GREEN);//���ڱ���ɫ
		setVisible(true);
		
		new Thread(new PaintThread()).start();//�ڲ����װpaint��graphics��
	}
	public static void main(String[] args) {
		TankClient tc = new TankClient();
		tc.lauchFrame();
	}
	//�����߳��ػ�Frame���ڲ���
	private class PaintThread implements Runnable{


		public void run() {
			while(true){
				repaint();//�����ⲿ��װ���repaint�������ػ�paint
			  try {
				Thread.sleep(50);//ÿ˯��100�����ػ�һ��
			} catch (InterruptedException e) {
			     e.printStackTrace();
			}
			}
			
		}
		
	}
}
