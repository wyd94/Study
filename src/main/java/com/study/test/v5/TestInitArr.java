package com.study.test.v5;

public class TestInitArr {
	public static void main(String[] args) {
		//创建不同的数组
		byte[] byteArray =new byte[1];
		char[] charArray = new char[1];
		int[] intArray =new int[1];
		long[] longArray =new long[1];
		float[] floatArray =new float[1];
		double[] doubleArray =new double[1];
		String[] stringArray =new String[1];
		
		//将上面声明的数组初始化值打印初出来
		System.out.println("byte类型的默认值是："+byteArray[0]);
		System.out.println("char类型的默认值是："+charArray[0]);
		System.out.println("int类型的默认值是："+intArray[0]);
		System.out.println("long类型的默认值是："+longArray[0]);
		System.out.println("float类型的默认值是："+floatArray[0]);
		System.out.println("double类型的默认值是："+doubleArray[0]);
		System.out.println("string类型的默认值是："+stringArray[0]);
		
		//初始化方法一：
		int[] array1=new int[5];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=5;
		//初始化方法二：声明初始化
		int[] array2={6,7,8,9,10};
		System.out.println("打印第一个数组");
		System.out.println("数组的长度是："+array1.length);
		for(int i=0; i<5;i++){
			System.out.println(array1[i]);
			
			
		}
		for(int i=0 ;i<5; i++){
			System.out.println(array2[i]);
		}
		
		
	}
}
