package com.study.test.v3;

public class TestBoolean {
	public static void main(String[] args){
		boolean b= false;
		boolean a =true;
		if (b) {
			System.out.println("b="+b+",满足条件，if语句执行");
		}else{
			System.out.println("b="+b+",条件不满足，else执行语句");
		}
		
		if(a) {
			System.out.println("a="+a+",满足条件，if语句执行");
		}else{
			System.out.println("a="+a+",条件不满足，else执行语句");
		}
	}
}
