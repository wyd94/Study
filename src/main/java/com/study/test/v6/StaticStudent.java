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
		System.out.println("s1��ѧ�ţ�"+s1.id);
		System.out.println("s2��ѧ�ţ�"+s2.id);
		System.out.println("s3��ѧ�ţ�"+s3.id);
		System.out.println("s4��ѧ�ţ�"+s4.id);
		
		System.out.println("ѧ������ĿΪ��"+StaticStudent.num);


	}
}
