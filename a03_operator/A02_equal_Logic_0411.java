/*
 # �� ������
 1) �񱳿��� : �� ���� ���� ũ�⸦ ���ϴ� �����ڷ� ���������� boolean���� ����ȴ�.
 
 2) a==b, a>b, a<b, a>=b, a<=b, a!=b
 - �ַ� if(�񱳿���), while(�񱳿���), for(�ʱ�:�񱳿���:����)���� Ȱ��ȴ�
 ex) if(point>=80),  while(breakChar !='S')
 ps) ���ڿ��� equals�� �޼���� Ȱ��  - if( inputID.equals("himan") )
 
 3) �������� : boolean(true/false)�� �̿��Ͽ� ����(&& - and), �븮��(|| - or), 
 				 ��Ÿ�� ����(^-xor), ������(!)�� ������ �����Ѵ�.
 - if(point >= 80 && point < 90)	�� ���� ���� ����(80~90)			 
 - if(point < 0 || point > 100)		�� ���� �� �ϳ��� ����
*/ 		
package a03_operator;

public class A02_equal_Logic_0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int point = 75;
		int passTarget = 60;
		System.out.println(point + "=="+passTarget+"?"+(point==passTarget));
		System.out.println(point + ">"+passTarget+"?"+(point>passTarget));
		System.out.println(point + "<"+passTarget+"?"+(point<passTarget));
		System.out.println(point + ">="+passTarget+"?"+(point>=passTarget));
		System.out.println(point + "<="+passTarget+"?"+(point<=passTarget));
		System.out.println(point + "!="+passTarget+"?"+(point!=passTarget));
		// �� ������
		// &&(and) : �ΰ��� �������� ��� ������ ��� true
		// ||(or)  : �ΰ��� ������ �� �ϳ��� �����ص� true
		int getPoint = 85;
		System.out.println( "ȹ���� ������ 80�̻� 90�̸� "+( (getPoint >= 80) && (getPoint < 90) ) );
		System.out.println( "������ ��ȿ���� ���� ����(0 �̸�, 100 �ʰ�)? "+( (getPoint < 0) || (getPoint > 100) ) );

	}

}
