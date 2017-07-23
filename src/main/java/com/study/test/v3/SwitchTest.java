package com.study.test.v3;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Select an optin：1~7");

		int week =in.nextInt();
		switch (week) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
	
		
		}
	}
}
