package com.study.test.v6;

public class TestPeople {
	public static void main(String[] args) {
		Chinese c =new Chinese();
		c.setName("�й���");
		System.out.println(c.getName());
		c.speakChinese();
		HunanPeople h =new HunanPeople();
		h.setName("������");
		System.out.println(h.getName());
		h.eat();
		h.speakHunanLang();
		
	
	}
}
