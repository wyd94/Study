package com.study.test.v6;

public class StaticMethod {
	public static void main(String[] args) {
		MyMethod.printString("HelloWorld");//通过类名、方法名 调用
		MyMethod.printInt(100);
	}
}
class MyMethod{
	//定义两个静态方法
	static void printString(String str){
		System.out.println(str);
	}
	static void printInt(int i){
		System.out.println(i);
	}
}
