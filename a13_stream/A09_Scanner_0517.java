/*
 Scanner Ŭ����
  - �ַܼκ��� ���ڿ��� ���� �� ����
  - java.util.Scanner
  - �Է� : Scanner scan = new Scanner(System.in);
  - �޼���
  		1) nextXXX() : �޼��带 ���ؼ� �ش� ������ type�� �°� ó��
  		2) nextInt() : int������ �д´�.
  		3) nextDouble() : double������ �д´� 
  		4) nextLine() : ���ڿ����� �д´�.
*/
package a13_stream;

import java.util.Scanner;

public class A09_Scanner_0517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner Ŭ������ �����ڿ� System.in�� ���ؼ� �Է� ó���Ѵ�.		
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = scan.nextLine();
		System.out.println("�Է��� �̸�: "+name);
		System.out.println("������ �Է��ϼ���");
		int point = scan.nextInt();
		System.out.println("ȹ���� ����: "+point);
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = scan.nextDouble();
		System.out.println("�Է��� ������: "+weight);		


	}

}
