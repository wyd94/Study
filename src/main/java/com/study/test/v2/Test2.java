package com.study.test.v2;

public class Test2 {
 public static void main(String[] args) {
	//运算符
	 int a = 5;  
     int b,c,d,f,g,h;  
     b = +a; //正值  
     System.out.println("b="+b+",a="+a);  
     c = -a; //负值  
     System.out.println("c="+c+",a="+a);  
     int l = 2;  
     d = ++l; //先l=l+1;再d=l  
     System.out.println("d="+d+",l="+l);  
     int m = 3;  
     f = m++;//先f=m;再m=m+1  
     System.out.println("f="+f+",m="+m);  
     int n = 4;  
     g = --n;//先n=n-1;再g=n  
     System.out.println("g="+g+",n="+n);  
     int o = 6;  
     h = o--;//先h=o;再o=o-1  
     System.out.println("h="+h+",o="+o);
	
     //关系运算符
     
     int x = 4;
     int y;
     
     y= x > a ? x : a ;//判断条件是否为真，如果x>a为真，返回x的值，如果为假，返回a的值
	 System.out.println("y="+y );
	 
	 //数值转换
	 int x1 =123456;
	 float y1 =x1;
	 System.out.println("y1="+y1);
	 
	 //强转类型转换
	 double A =3.14;
	 int B=(int) A; //()中表示要转换的类型
	 System.out.println("B="+B);
	 
}
}
