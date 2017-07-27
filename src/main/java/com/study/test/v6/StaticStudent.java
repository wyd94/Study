package com.study.test.v6;

public class StaticStudent {
	int id =0;
	static int num=0;
	public StaticStudent(int id) {
		this.id=id;
		num++;
	}
	public static void main(String[] args) {
		StaticStudent s1=new StaticStudent(100);
		StaticStudent s2=new StaticStudent(102);
		StaticStudent s3=new StaticStudent(103);
		StaticStudent s4=new StaticStudent(104);
		System.out.println("s1的学号："+s1.id);
		System.out.println("s2的学号："+s2.id);
		System.out.println("s3的学号："+s3.id);
		System.out.println("s4的学号："+s4.id);
		
		System.out.println("学生的数目为："+StaticStudent.num);


	}
}
