package com.study.test.v4;

public class TestString {
	public static void main(String[] args) {
		//1.
		System.out.println("Hello World!");
		//2.String���ַ�������
		String myString  ="Hello World!";
		System.out.println(myString);
		//3.�ַ�������
		
		String name="Tom";
		String sex="male";
		String from="China";
		String info="�����ǣ�"+name+"\n�Ա��ǣ�"+sex+"\n���ԣ�"+from;
		
		System.out.println(info);
		
		//4.���Ӵ�
		String string="HelloWorld";
		string=string.substring(0, 5 );
		System.err.println(string);
		//5.�Ƚ�
		String s1="hello";
		String s2="world";
		String s3="hello" + "world";
		//�Ƚ�����
		System.out.println(s1.equals(s2));
		//�Ƚ��ڴ��ַ
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
	}
}
