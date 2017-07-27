package com.study.test.v7.t1;

/**
 * 封装人物
 * @author Administrator
 *
 */
public class Person1 {
    private String name ;
    private int age;
    private String occupation; //职业
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == ""){
		this.name = "输入空值";
	}else {
		this.name=name;
	}
}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void talk(){
    	
    }
    
}
