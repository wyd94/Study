package com.study.test.v7.t1;

/**
 * ��װ����
 * @author Administrator
 *
 */
public class Person1 {
    private String name ;
    private int age;
    private String occupation; //ְҵ
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == ""){
		this.name = "�����ֵ";
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
