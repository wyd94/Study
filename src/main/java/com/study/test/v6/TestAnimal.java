package com.study.test.v6;

public class TestAnimal {
	public static void main(String[] args) {
		Tiger tiger =new Tiger();
		
		tiger.setType("�ϻ�");
		tiger.setSkin("���ɫ");
		tiger.eat();
		tiger.run();
		
		System.out.println(tiger.getType()+","+tiger.getSkin());
		
	}
}
