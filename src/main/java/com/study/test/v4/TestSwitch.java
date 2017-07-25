package com.study.test.v4;

public class TestSwitch {
	public static void main(String[] args){
		int week = 3;
		String string ="你输入的week是："+ week +"，对应的是：";
		switch (week) {
		case 1:
			string +="星期一";
			break;

		case 2:
			string +="星期二";
			break;
		case 3:
			string +="星期三";
			break;
		case 4:
			string +="星期四";
			break;
		case 5:
			string +="星期五";
			break;
		case 6:
			string +="星期六";
			break;
		case 7:
			string +="星期日";
			
			break;
		}
		System.out.println(string);
	}
}
