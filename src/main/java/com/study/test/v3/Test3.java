package com.study.test.v3;

import java.util.*;



public class Test3 {
	public static void main(String[] args) {
		String greeting ="hello";
		int n =greeting.length();
		System.out.println("n="+n);
		
		//��ȡ����
		//new ����һ��scanner����
		Scanner in =new Scanner(System.in);//system.in ������
		System.out.println("What is your name?");
		String name =in.nextLine();//������������ȡ��һ������
		System.out.println("How old are you ?");
		int age =in.nextInt();
		System.out.println("hello,"+name+".Next year,you'll be " +(age + 1));
	}
	
	
}
