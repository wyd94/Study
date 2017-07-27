package com.study.test.v7;
/**
 * 猫科动物类
 * @author Administrator
 *
 */
public abstract class Feline {
	private int legCount=4; //定义腿的数量
	private String headShape="round"; //定义脑袋的形状
	private boolean meatEater=true; //定义是否为食肉动物
	
	/**
	 * 普通方法，动物叫喊
	 * 
	 */
	public void cry(){
		System.out.println("动物在狂吼");
	}
	/**
	 * 捕食  抽象类方法
	 * @param animal
	 */
	public abstract void catchAnimal(Animal animal);    //  抽象类方法
	
	
	
	public int getLegCount() {
		return legCount;
	}
	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}
	public String getHeadShape() {
		return headShape;
	}
	public void setHeadShape(String headShape) {
		this.headShape = headShape;
	}
	public boolean isMeatEater() {
		return meatEater;
	}
	public void setMeatEater(boolean meatEater) {
		this.meatEater = meatEater;
	}
}
