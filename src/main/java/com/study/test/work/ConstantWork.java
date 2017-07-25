package com.study.test.work;

public class ConstantWork {  
    public static void main(String[] args){
    	final int APPLE_PRICE_PER_KG= 3;//声明变量，苹果每公斤3元
    	int weightOfApple =6;
    	int money;
    	money = weightOfApple * APPLE_PRICE_PER_KG;
    	System.out.println(money);
    }
 }
