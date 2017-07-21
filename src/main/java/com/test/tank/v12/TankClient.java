package com.test.tank.v12;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class TankClient extends Frame{
	//�����ع��������ڴ�С���峣��
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGH = 600;
	
	
    Tank tank =new Tank(50, 50,this);
	//ʹ������List<>
    List<Missile> missiles =new ArrayList<Missile>();
	Image OffScreenImage = null;
	
	
		//��дpaint
	public void paint(Graphics g) {
		//�滭�ڵ�����
		g.drawString("missiles count:" + missiles.size(), 10, 40);
	 //�����ӵ�
		for(int i =0; i<missiles.size(); i++){
			Missile m =missiles.get(i);
		/*	
		 * ����һ��
		 * if(!m.isLive()) missiles.remove(m);
			else m.draw(g);
		*/
			m.draw(g);
		}
		tank.draw(g);
		
	
				
	}
	public void update(Graphics g) {
		if(OffScreenImage == null){
			OffScreenImage=this.createImage(GAME_WIDTH,GAME_HEIGH);//��������ͼƬ��С
	  }	
	   Graphics gOffScreen= OffScreenImage.getGraphics();
	   Color color=gOffScreen.getColor();
	   gOffScreen.setColor(Color.CYAN);
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

		
		//����̧�����Ϣ
		public void keyReleased(KeyEvent e) {
			
			tank.keyReleased(e);
		}
		//���̰��µ���Ϣ
		public void keyPressed(KeyEvent e) {
			tank.keyPressed(e);
			
		}
	
		
	}
}

