package com.study.test.v3;

public class People {
	//2.��people�����������
	public String name;
	public String sex;
	public int age;
	
	//���췽��
	public People(){
		System.out.println("Ĭ�ϵĹ��췽��");
	}
	public People(String name){
		System.out.println("���в����Ĺ��췽��");
	}
	public static void main(String[] args) {
		People people =new People();//1.��People�� newһ��people����
		people.Sleep();//�����෽��
		people.Eat();
	}
	//�෽��
	public void Sleep(){
		System.out.println("ÿ��˯8Сʱ");
		
	}
	public void Eat(){
		System.out.println("һ������");
	}
}
