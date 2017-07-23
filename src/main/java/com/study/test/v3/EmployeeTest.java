package com.study.test.v3;

import java.util.*;




public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] staff =new Employee[3];
		staff[0] = new Employee("Tom", 4000, 2014, 11, 1);
		staff[1] = new Employee("Tony", 5000, 2013, 2, 4);
		staff[2] = new Employee("Bob", 3000, 2015, 6, 3);
		
		for(Employee e: staff)
			e.raiseSalary(5);
		for(Employee e: staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() +",hireDay"+e.getHireDay());
	}
}
	class Employee{
		public String name;
		public Double salary;
		public Date hireDay;//∆∏”√»’∆⁄
		
		public Employee(String n, double s ,int year, int month ,int day){
			name=n;
			salary =s;
			GregorianCalendar calendar =new GregorianCalendar(year,month -1,day);
			hireDay= calendar.getTime();
		}
		public void raiseSalary(double byPercent) {
			double raise =salary * byPercent /100;
			salary +=raise;
			
		}
		public String getName(){
			return name;
		}
		public Double getSalary(){
			return salary;
		}
		public Date getHireDay(){
			return hireDay;
		}
	}

