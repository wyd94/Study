package com.study.test.work;

import org.omg.CORBA.ORBPackage.InconsistentTypeCode;

/**
 * 
 * @author Administrator
 * forÓï¾ä
 */
public class ForWork {
	public static void main(String[] args) {
		for(int i=5; i>0; i--){
			System.out.println(i);
		}
		for(int x=5 ,y=0; y<=x;x--,y++){
			System.out.println("x="+x+",y="+y);
		}
	}
}
