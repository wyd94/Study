package com.test.tank.v5;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankClient extends Frame{
	//�����ع��������ڴ�С���峣��
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGH = 600;
	
	
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
			OffScreenImage=this.createImage(GAME_WIDTH,GAME_HEIGH);//��������ͼƬ��С
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
		//��ӹرմ��ڵļ����¼�
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		this.setResizable(false);//�̶����ڴ�С
		this.setBackground(Color.GREEN);//���ڱ���ɫ
		//��Ӽ��̼���
		this.addKeyListener(new KeyMonitor());
		
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
	//������̵ļ����࣬�����ⲿ�࣬�̳�KeyAdapter
	private  class KeyMonitor extends KeyAdapter{

		
		public void keyPressed(KeyEvent e) {
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
}

