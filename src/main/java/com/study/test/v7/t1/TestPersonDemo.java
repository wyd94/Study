package com.study.test.v7.t1;


public class TestPersonDemo {
		public static void main(String[] args) {
		Person1 p =new Person1();
		p.setName("");
		p.setAge(18);
		p.setOccupation("ѧ��");
		
		if (p.getName() =="�����ֵ") {
			System.out.println("��������");
		} else {
			System.out.println(p.getName());
		}
		System.out.println(p.getAge()+","+p.getOccupation());
	}
}
