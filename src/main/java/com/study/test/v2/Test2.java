package com.study.test.v2;

public class Test2 {
 public static void main(String[] args) {
	//�����
	 int a = 5;  
     int b,c,d,f,g,h;  
     b = +a; //��ֵ  
     System.out.println("b="+b+",a="+a);  
     c = -a; //��ֵ  
     System.out.println("c="+c+",a="+a);  
     int l = 2;  
     d = ++l; //��l=l+1;��d=l  
     System.out.println("d="+d+",l="+l);  
     int m = 3;  
     f = m++;//��f=m;��m=m+1  
     System.out.println("f="+f+",m="+m);  
     int n = 4;  
     g = --n;//��n=n-1;��g=n  
     System.out.println("g="+g+",n="+n);  
     int o = 6;  
     h = o--;//��h=o;��o=o-1  
     System.out.println("h="+h+",o="+o);
	
     //��ϵ�����
     
     int x = 4;
     int y;
     
     y= x > a ? x : a ;//�ж������Ƿ�Ϊ�棬���x>aΪ�棬����x��ֵ�����Ϊ�٣�����a��ֵ
	 System.out.println("y="+y );
	 
	 //��ֵת��
	 int x1 =123456;
	 float y1 =x1;
	 System.out.println("y1="+y1);
	 
	 //ǿת����ת��
	 double A =3.14;
	 int B=(int) A; //()�б�ʾҪת��������
	 System.out.println("B="+B);
	 
}
}
