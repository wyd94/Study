package com.study.test.v5;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *  学生成绩管理系统
 */
public class TestArr {
	public static void main(String[] args) {
		int student;//学生变量
		double sum=0, avg=0;//总成绩和平均成绩
		double[] temp=new double[10];
		
		//创建一个Scanner对象，用它获得用户的输入
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入前10名的成绩：");
		
		for(student =0 ;student<temp.length;student++){
			//读取用户的输入
			temp[student]=scanner.nextDouble();
			sum +=temp[student];
			
		}
			avg=sum / 10;
		System.out.println("平均分数："+avg);
		
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
