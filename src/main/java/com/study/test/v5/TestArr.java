package com.study.test.v5;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *  ѧ���ɼ�����ϵͳ
 */
public class TestArr {
	public static void main(String[] args) {
		int student;//ѧ������
		double sum=0, avg=0;//�ܳɼ���ƽ���ɼ�
		double[] temp=new double[10];
		
		//����һ��Scanner������������û�������
		Scanner scanner =new Scanner(System.in);
		System.out.println("������ǰ10���ĳɼ���");
		
		for(student =0 ;student<temp.length;student++){
			//��ȡ�û�������
			temp[student]=scanner.nextDouble();
			sum +=temp[student];
			
		}
			avg=sum / 10;
		System.out.println("ƽ��������"+avg);
		
		for(student =0 ;student<temp.length;student++){
			if (temp[student] < avg) {
				System.out.println("��ͬѧ�ķ�������ƽ����");
				
			}else if(temp[student] > avg){
				System.out.println("��ͬѧ�ķ�������ƽ����");
				
			}else {
				System.out.println("��ͬѧ�ɼ�����ƽ����");
			}
		}
	}
}
