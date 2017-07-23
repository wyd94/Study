package com.study.test.v3;

public class TestFloat {
	public static void main(String[] args) {
		int i = 1;
		int i1 =3;
		float f1 = 1f;
		float f2 =3f;
		double d1 = 5;
		double d2 =3;
		float result1, result2;
		double result3;
		
		result1 = i / i1;//结果类型发生变化，为float类型
		result2 = f1 / f2;
		result3 = d1 / d2;
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
	}
}
