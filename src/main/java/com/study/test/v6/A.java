package com.study.test.v6;

public class A {
	A(){
		System.out.println("调用A的无参构造方法");
	}
	A(int i){
		System.out.println("调用A的有参构造方法");
	}
	
}
class B extends A{
	B(){
		System.out.println("调用B的无参构造方法");
	}
	B(int i){
		super(i);
		System.out.println("调用B的有参构造方法");
	}
}

class C extends B{
	C(){
		super();
		System.out.println("调用C的无参构造方法");
	}
	C(int i){
		super(i);
		System.out.println("调用C的有参构造方法");
	}
}
