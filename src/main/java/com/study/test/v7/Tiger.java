package com.study.test.v7;

public class Tiger extends Feline {

	@Override
	public void catchAnimal(Animal animal) {
		// TODO Auto-generated method stub
		System.out.println("ÀÏ»¢ÔÚ²¶Ê³");
	}
	public static void main(String[] args) {
		Tiger t =new Tiger();
		Mouse mouse=new Mouse();
		t.catchAnimal(mouse);
	}
}
