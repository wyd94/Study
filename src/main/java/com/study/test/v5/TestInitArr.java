package com.study.test.v5;

public class TestInitArr {
	public static void main(String[] args) {
		//������ͬ������
		byte[] byteArray =new byte[1];
		char[] charArray = new char[1];
		int[] intArray =new int[1];
		long[] longArray =new long[1];
		float[] floatArray =new float[1];
		double[] doubleArray =new double[1];
		String[] stringArray =new String[1];
		
		//�����������������ʼ��ֵ��ӡ������
		System.out.println("byte���͵�Ĭ��ֵ�ǣ�"+byteArray[0]);
		System.out.println("char���͵�Ĭ��ֵ�ǣ�"+charArray[0]);
		System.out.println("int���͵�Ĭ��ֵ�ǣ�"+intArray[0]);
		System.out.println("long���͵�Ĭ��ֵ�ǣ�"+longArray[0]);
		System.out.println("float���͵�Ĭ��ֵ�ǣ�"+floatArray[0]);
		System.out.println("double���͵�Ĭ��ֵ�ǣ�"+doubleArray[0]);
		System.out.println("string���͵�Ĭ��ֵ�ǣ�"+stringArray[0]);
		
		//��ʼ������һ��
		int[] array1=new int[5];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=5;
		//��ʼ����������������ʼ��
		int[] array2={6,7,8,9,10};
		System.out.println("��ӡ��һ������");
		System.out.println("����ĳ����ǣ�"+array1.length);
		for(int i=0; i<5;i++){
			System.out.println(array1[i]);
			
			
		}
		for(int i=0 ;i<5; i++){
			System.out.println(array2[i]);
		}
		
		
	}
}
