/*
 # ���� ǥ����
 1) Regular Expression(����ǥ����) 
 	- �ʿ�� �ϴ� ���ڿ� ������ �����ؼ� �� �������θ�
 	  �����Ͱ� �ԷµǴ� ���� check�ϱ� ���� ����� ���� ����
 	  ����ǥ�����̶�� �Ѵ�.
 	  
 	- API : java.util.regex.Pattern Ŭ������ ã�� ����
 	
 2) �ֿ� ��ȣ�� ����
 	- [] : �ش� �� ���� ���ڸ� ������
 	ex) [abc] : a,b,c �� �ϳ��� ����
 		[^abc] : a,b,c �̿� �ϳ��� ����
 		[a-zA-Z] : a~z, A~Z �� �ϳ��� ����
 		[0-9] : 0���� 9���� �ϳ��� ����
 		
 3)
 	\d : �Ѱ��� ����[0-9]�� ����
 	\s : ���� ó�� �ʿ�
 	\w : �Ѱ��� ���ĺ� �Ǵ� �Ѱ��� ����. [a-zA-Z 0-9]�� ����
 	? : ���� �Ǵ� �Ѱ�
 	* : ���� �Ǵ� �Ѱ��̻�
 	+ : �Ѱ� �̻�
 	{n} : ��Ȯ�� n��
 	{n.} : �ּ��� n��
 	{n,m} :�ּ�n��, �ִ�m��
 	() : �׷���
 	
 # ���Խ� ���� ����
 1) ��ȭ��ȣ : 02-223-2222, 0102433-4333
 - 02 �Ǵ� 010�� ���;� �Ѵ�.
   (02|010) - ����

 - ���ڷ� \d 3�ڸ� ���� 4�ڸ�{3,4}
 	\d{3,4} - ����
 	
 - ���ڷ� \d 4�ڸ�{4}
 
 - ��ȭ��ȣ�� ���� ���Խ� ǥ��
	(02|010)-\d{3,4}-\d{4}
	
 2) �̸��� : white@naver.com
 - �� �� �̻��� ���ĺ� �Ǵ� ����
 	\w+
 	
 - @
 
 - �� �� �̻��� ���ĺ� �Ǵ� ����
 	\w+
 	
 - \. : \.�� ������ ��(.)�̰� .������ ��� ���� �߿� �Ѱ��� ����
 
 - �Ѱ� �̻��� ���ĺ� �Ǵ� ����
 	\w+
 	
 # ���Խ� ó�� Ŭ����
 1) java.util.regex.Pattern Ŭ������ ���� �޼ҵ� matches() Ȱ��
 	- boolan result = Pattern.matches("������ ���Խ�", "������ ���ڿ�");
 		
 	
*/
package a10_api;

import java.util.regex.Pattern;

public class A08_regex_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��ȭ��ȣ ���Խ� pattern ����
//		(01|010)-\d(3.4)-\d(4)		
		String regExp = "(01|010)-\\d{3,4}-\\d{4}";
		String data1 = "010-123-4578";
		String data2 = "070-123-4578";
		String data3 = "010-1234-45784";
		boolean ch01 = Pattern.matches(regExp,data1);
		boolean ch02 = Pattern.matches(regExp,data2);
		boolean ch03 = Pattern.matches(regExp,data3);
		System.out.println("data1�� ����ǥ���� ��������: "+ch01);
		System.out.println("data2�� ����ǥ���� ��������: "+ch02);
		System.out.println("data3�� ����ǥ���� ��������: "+ch03);

	}

}
