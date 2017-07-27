package com.study.test.v6;

public class TestAnimal {
	public static void main(String[] args) {
		Tiger tiger =new Tiger();
		
		tiger.setType("ÀÏ»¢");
		tiger.setSkin("½ğ»ÆÉ«");
		tiger.eat();
		tiger.run();
		
		System.out.println(tiger.getType()+","+tiger.getSkin());
		
	}
}
