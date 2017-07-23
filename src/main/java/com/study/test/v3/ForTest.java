package com.study.test.v3;

import org.omg.CORBA.PRIVATE_MEMBER;

public class ForTest {
	public static void main(String[] args) {
		int i=10;

		if(i < 11){
			i +=2;
			System.out.println("Ð¡ÓÚ11£¬"+"i="+i);
		}
		for(int i1 =10;i1>0; i1-- ){
			System.out.println("Counting down..." + i1);
			
		}
		
		while(i>0){
		
			System.out.println("Counting down..." +i);
			i--;
		}
			
		}
		
	}

