package com.study.test.v6;

public class StaticTest {
	/**
	 * ��̬������Ǿ�̬����������
	 */
	
		int commonint =0; //�ձ����
		static int staticint= 0; // ��̬����
		
		public StaticTest(int x) {
			this.commonint=x;
		
		}
	public static void main(String[] args) {
		StaticTest s1=new StaticTest(1);
		StaticTest s2=new StaticTest(2);
		
		System.out.println("s1.commonint="+s1.commonint);
		System.out.println("s2.commonint="+s2.commonint);
		
		s1.staticint=1;
		System.out.println("s1Ϊstaticint��ֵΪ1");
		System.out.println("s1.staticint="+s1.staticint);
		System.out.println("s2.staticint="+s2.staticint);
		
		System.out.println("s1Ϊstaticint��ֵΪ15");
		s2.staticint=15;
		System.out.println("s1.staticint="+s1.staticint);
		System.out.println("s2.staticint="+s2.staticint);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
