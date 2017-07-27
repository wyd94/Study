package com.study.test.v6;

import java.util.Scanner;

public class TestArr {
	
	public static void main(String[] args) {
		int student;
		double sum = 0 ,avg=0;
		 double[] temp=new double[10];
		Scanner scanner =new Scanner(System.in);
		System.out.println("输入前10名同学的成绩：");
		
		for(student =0;student< temp.length; student++){
			temp[student]=scanner.nextDouble();
			sum  +=temp[student];
		
		}
		avg= sum / 10;
		System.out.println("平均分是："+avg);
		for(student =0 ;student<temp.length;student++){
			if (temp[student] < avg) {
				System.out.println("该同学的分数低于平均分");
				
			}else if(temp[student] > avg){
				System.out.println("该同学的分数高于平均分");
				
			}else {
				System.out.println("该同学成绩等于平均分");
			}
		}
	}
		
}
