/*
 # ��Ű��(package)
 - ���α׷��ֿ��� ���� Ŭ������ ���� �ϱ� ���� �������� ������ ��ĥ �� �ִ� Ŭ��������
   ������� ���� ���� �ȿ� ȿ�������� ȣ���ϱ� ���ؼ� ����ϴ� �����̴�.
 
 - ��Ű���� �������� ���� �ý��� ����̻����� ����� ó���� ���������� ���ٹ�����
   �����ϴ� ����� ���۰��迡 �־ �������������� �߰��Ͽ� �ֻ��� package.������Ű����
   �����ؾ� ���� package�� �ν��Ѵ�.
   ����package.����package   (����package�� ���� �����δ� ���� package��� �� �� ����.)
  
 # ��Ű�� ����� Ȱ��
 1) ��Ű���� Ŭ������ �� �ֻ� ��ġ�Ѵ�.
 - package ������Ű��.������Ű��
 - public class Ŭ������(){}
 
 2) ��� ��Ģ
 - ����(X), _$(���� Ư������)�� ���ȵ�
 - ��� �ҹ��ڷ� �ۼ��ϴ� ���� naming ��Ģ
 - java�� �����ϴ� ��Ű���� �ڹ� ǥ�� api�� ���ǹǷ� ����ؼ��� �ȵȴ�.

 3) ���� ��Ű�������� import��� ���� ���� ����� �����ϸ� 
 	������ Ŭ������ ������ �� ����.
 	
 # import��
 1) ���� ��Ű���� ����ϴ� ��ü������ Ư���� Ű�������
    Ŭ����(��ü)�� ȣ���ؼ� ����� �� �ִ�.
 	<Note.java>							<Pen.java>  
 - package com.util;				  package com.util;
 - public class Note(){}   			  public class Pen{
 										Note n = new Note();
 									  }
 2) ��Ű���� �ٸ� ���
 - ��Ű������� �����ؼ� Ŭ���� ����
 - package�� �ؿ� import.��Ű����.����� Ŭ����	
 	<Computer.java>
 package com.util.prog;
 public class Computer{
 	com.util.Note note01 = new com.util.Note();
 }
 �Ǵ�
  	<Computer.java>
 package com.util.prog;
 import com.util.Note;
 public class Computer{
 	Note note01 = new Note();
 }			
 
*/	
package a06_object;

public class A15_Package_Import_0420 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
