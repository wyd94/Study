package com.study.test.v6;

public class StaticTest {
	/**
	 * 静态变量与非静态变量的区别
	 */
	
		int commonint =0; //普遍变量
		static int staticint= 0; // 静态变量
		
		public StaticTest(int x) {
			this.commonint=x;
		
		}
	public static void main(String[] args) {
		StaticTest s1=new StaticTest(1);
		StaticTest s2=new StaticTest(2);
		
		System.out.println("s1.commonint="+s1.commonint);
		System.out.println("s2.commonint="+s2.commonint);
		
		s1.staticint=1;
		System.out.println("s1为staticint赋值为1");
		System.out.println("s1.staticint="+s1.staticint);
		System.out.println("s2.staticint="+s2.staticint);
		
		System.out.println("s1为staticint赋值为15");
		s2.staticint=15;
		System.out.println("s1.staticint="+s1.staticint);
		System.out.println("s2.staticint="+s2.staticint);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
