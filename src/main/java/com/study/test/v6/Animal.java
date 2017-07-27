package com.study.test.v6;


public class Animal {
	private  String type;
	private  String skin;
	
	public void eat(){
		System.out.println("动物在吃东西");
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public void huxi(){
		System.out.println("动物在呼吸");
	}
}
