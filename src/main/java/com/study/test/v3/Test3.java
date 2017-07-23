package com.study.test.v3;

import java.util.*;



public class Test3 {
	public static void main(String[] args) {
		String greeting ="hello";
		int n =greeting.length();
		System.out.println("n="+n);
		
		//读取输入
		//new 构造一个scanner对象
		Scanner in =new Scanner(System.in);//system.in 输入流
		System.out.println("What is your name?");
		String name =in.nextLine();//输入姓名，读取下一行内容
		System.out.println("How old are you ?");
		int age =in.nextInt();
		System.out.println("hello,"+name+".Next year,you'll be " +(age + 1));
	}
	
	
}
