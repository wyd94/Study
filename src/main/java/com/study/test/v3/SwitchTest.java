package com.study.test.v3;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Select an optin��1~7");

		int week =in.nextInt();
		switch (week) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
	
		
		}
	}
}
