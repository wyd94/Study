package com.study.test.v4;

public class TestSwitch {
	public static void main(String[] args){
		int week = 3;
		String string ="�������week�ǣ�"+ week +"����Ӧ���ǣ�";
		switch (week) {
		case 1:
			string +="����һ";
			break;

		case 2:
			string +="���ڶ�";
			break;
		case 3:
			string +="������";
			break;
		case 4:
			string +="������";
			break;
		case 5:
			string +="������";
			break;
		case 6:
			string +="������";
			break;
		case 7:
			string +="������";
			
			break;
		}
		System.out.println(string);
	}
}
