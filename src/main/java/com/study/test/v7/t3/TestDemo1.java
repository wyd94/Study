package com.study.test.v7.t3;

public class TestDemo1 {
	public static void main(String[] args) {
		Student2 s =new Student2();
		s.play();
		s.eat();
		
		Person3 p3 =new Student3(); //向上转型，父类对象通过子类的对象去实例化
		p3.play();
		p3.eat();
		
//		Person3 p =new Person3();  
//		Student2 s =(Student2)p;    //向下转型 ，强制转换  （  运行结果报错 ）
//		s.play();
//		s.eat();
	}
}
