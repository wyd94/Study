package com.study.test.v6;

public class Time {
	private int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		//自己可以任意修改内部构造方法
		if(hour<0 || hour>24){
			this.hour=-1;
		}else{
		this.hour = hour;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
}
