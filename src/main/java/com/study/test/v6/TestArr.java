package com.study.test.v6;

import java.util.Scanner;

public class TestArr {
	
	public static void main(String[] args) {
		int student;
		double sum = 0 ,avg=0;
		 double[] temp=new double[10];
		Scanner scanner =new Scanner(System.in);
		System.out.println("����ǰ10��ͬѧ�ĳɼ���");
		
		for(student =0;student< temp.length; student++){
			temp[student]=scanner.nextDouble();
			sum  +=temp[student];
		
		}
		avg= sum / 10;
		System.out.println("ƽ�����ǣ�"+avg);
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
