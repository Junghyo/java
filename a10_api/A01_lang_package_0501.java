/*
 # ��ǥ
 1) �ڹ����α׷����� API�� ������ �ȴ�.
 2) ���α׷��ֽ�, API�� Ȱ���� �� �ȴ�.
 3) ����� ���� �ϴ� Ŭ�����鿡 ���� Ȱ������ ������.
 	- String
 	- Object
 	- StringBuffer
 	- Arrays
 	- Wrapper
 	- Date, Calendar
 	
 # �����غ��ô�
 1. �ڹ� ���α׷����� �� ���� API�� �̿��� ���� �����ϴ� ������ �����ΰ�?
 2. API�� ������ ������ ȿ�������� ã�Ƽ� Ȱ���ϴ� ����� ���°�?
 
 # �ڹ� API ��ť��Ʈ
 1. API(Application Programming Interface)
 	- ���α׷� ���߿� ���� ���Ǵ� Ŭ���� �� �������̽� ����.	
 	  �ڹٿ��� ���̺귯��(library)��� �θ��⵵ �Ѵ�.

 2. <JDK��ġ ���>/jre/lib/rt.jar ��� �������Ͽ� ����.
 
 3. API��ť��Ʈ�� http://docs.oracle.com/javase/8/docs/api
 
 4. API�� 3���� ���������� ��������.
 	1) package ��ü���
 	2) package�� ���ϴ� Ŭ������ �������̽�
 	3) �߾� ������ - �� ����

 5. �� ���� �� �޼���
 	- 1) return��  2) �޼����  3) param���� �Է��� ��
 	- return���� ���� �󼼼���
 	
 # �ֿ� ��Ű����
 	1. java.lang��Ű�� : import ���� �ٷ� ��밡���� default ��Ű��
 		1) Object : �ڹ� Ŭ����(apiŬ����, ��������� Ŭ����)�� �ֻ��� Ŭ������ ���
 		2) System 
 			- .in :  ǥ�� �Է� ��ġ(Ű����)�κ��� �����͸� �Է¹��� �� ���
 			- .out : ǥ�� ��� ��ġ(�����)�� ����ϱ� ���� ���
 			- JVM�� �����ų �� ���
 			- ������ ������(������� �ʴ� �޸� ����) ������ ��û�� �� ���
 			
 Class : Ŭ������ �޸𸮿� �ε��� �� ���
 	- Class.forName("������ Ŭ����") ������ Ŭ������ �޸𸮿� �ø�
 
 String : ���ڿ��� �����ϰ� �������� ������ ���� �� ���
 
 StringBuffer, StringBuilder : ���ڿ��� �����ϰ� ���� ���ڿ��� ������ �� ���
 
 Math : ���� �Լ�
 
 Wrapper(Integer, Double..) : �⺻ type�� �����͸� ���� ��ü�� ���� �� ���. method()�� ���ؼ� Ȱ��.
*/
package a10_api;

import java.io.IOException;

class Person{
	
}

public class A01_lang_package_0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		java�� ��� Ŭ������ �ֻ��� Ŭ���� : Object		
		Object o1 = new Object();
//		java.lang.Object@dcf3e99 : Ŭ������@�ּҰ�		
		System.out.println("Object�� toString(): "+o1.toString());
		Person p1 = new Person();
		Person p2 = new Person();
//		a10_api.Person@1ee0005		
		System.out.println("Person�� toString(): "+p1.toString());
//		a10_api.Person@75a1cd57		
		System.out.println("Person�� toString(): "+p2.toString());
		
//		System.in : �Է� ���� ��ü
//		read()�� ���� �Է� ó��		
		try {
			System.out.println("���� �����Է�: "+(char)System.in.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out : ��°��� ��ü
//		println()�� ���ؼ� ��� ó��
		System.err.println("���� �α� ó�� err.println()");
	}

}


