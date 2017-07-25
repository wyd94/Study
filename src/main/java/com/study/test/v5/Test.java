package com.study.test.v5;

public class Test {
	
	public static void main(String[] args) {
		Test test =new Test();
		test.aMethod();
		int j =test.aMethod();
		System.out.println(j);
	}

	private int aMethod() {
		 int  i=0;
		i++;
		return i;
		
	}
}
