package com.study.test.v7;

public class Cat extends Feline {
	
	/**
	 * è�Ĳ�ʳ����
	 */

	@Override
	public void catchAnimal(Animal animal) {
		// TODO Auto-generated method stub
		//�����жϲ�ʳ��animal �Ƿ�Ϊ��������ǣ����Բ�ʳ
		if(animal instanceof Mouse){
			System.out.println("è���ڲ�ʳ");
		}else {
			System.out.println("è���ܲ�ʳ");
		}
	}
	public static void main(String[] args) {
        Mouse mouse =new Mouse();
        Cat cat=new Cat();
        cat.catchAnimal(mouse);
    }

}


