package com.study.test.v7;

public class Cat extends Feline {
	
	/**
	 * 猫的捕食方法
	 */

	@Override
	public void catchAnimal(Animal animal) {
		// TODO Auto-generated method stub
		//首先判断捕食的animal 是否为老鼠，如果是，可以捕食
		if(animal instanceof Mouse){
			System.out.println("猫正在捕食");
		}else {
			System.out.println("猫不能捕食");
		}
	}
	public static void main(String[] args) {
        Mouse mouse =new Mouse();
        Cat cat=new Cat();
        cat.catchAnimal(mouse);
    }

}


