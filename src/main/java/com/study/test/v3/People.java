package com.study.test.v3;

public class People {
	//2.给people对象添加属性
	public String name;
	public String sex;
	public int age;
	
	//构造方法
	public People(){
		System.out.println("默认的构造方法");
	}
	public People(String name){
		System.out.println("含有参数的构造方法");
	}
	public static void main(String[] args) {
		People people =new People();//1.从People中 new一个people对象
		people.Sleep();//调用类方法
		people.Eat();
	}
	//类方法
	public void Sleep(){
		System.out.println("每天睡8小时");
		
	}
	public void Eat(){
		System.out.println("一日三餐");
	}
}
