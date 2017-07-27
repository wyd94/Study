package com.study.test.v7;

public class Student  implements Person{

	//重写talk()方法
	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "学生--姓名："+this.name+",年龄："+this.age+",职业："+this.occupation;
	}

}
