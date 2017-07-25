package com.study.test.work;
/**
 * 
 * @author Administrator
 *	String 字符串练习
 */
public class StringWork {
	public static void main(String[] args){
		//String 连接
		String a = "Hello";
		String b = "World!";
		String c = a + b;
		System.out.println(c);
		
		//String 求子串
		String  s = "my name is WuYuanDong";
		s=s.substring(11,21);
		System.out.println("截取的子串是："+s);
		
	}
}
