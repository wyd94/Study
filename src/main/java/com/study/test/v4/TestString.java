package com.study.test.v4;

public class TestString {
	public static void main(String[] args) {
		//1.
		System.out.println("Hello World!");
		//2.String类字符串变量
		String myString  ="Hello World!";
		System.out.println(myString);
		//3.字符串连接
		
		String name="Tom";
		String sex="male";
		String from="China";
		String info="名字是："+name+"\n性别是："+sex+"\n来自："+from;
		
		System.out.println(info);
		
		//4.求子串
		String string="HelloWorld";
		string=string.substring(0, 5 );
		System.err.println(string);
		//5.比较
		String s1="hello";
		String s2="world";
		String s3="hello" + "world";
		//比较内容
		System.out.println(s1.equals(s2));
		//比较内存地址
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
	}
}
