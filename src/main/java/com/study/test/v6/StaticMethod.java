package com.study.test.v6;

public class StaticMethod {
	public static void main(String[] args) {
		MyMethod.printString("HelloWorld");//ͨ�������������� ����
		MyMethod.printInt(100);
	}
}
class MyMethod{
	//����������̬����
	static void printString(String str){
		System.out.println(str);
	}
	static void printInt(int i){
		System.out.println(i);
	}
}
