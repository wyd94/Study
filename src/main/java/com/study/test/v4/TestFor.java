package com.study.test.v4;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class TestFor {
	public static void main(String[] args) {
		//1.从大到小排序
		for(int i =10; i>0 ; i--){
			System.out.println("Counting down"+i);
		}
		//2.
		for(int j=20 ,i=0; i<=j; i++,j--){
			System.out.println("j="+j+",i="+i);
		}
		int ride=1;
		//3.利用for循环求阶层
		for(int i= 3;i>0;i--){
			ride *=i;
			
		}
		System.out.println(ride);
		
	}
	 
}
