/*
 # �ܼ� �����
 1) �ܼ� : �ý����� ����ϱ� ���� Ű����� �Է�/ȭ������ ����ϴ� ����Ʈ����
 	- ���н�/������ : �͹̳�, Windows : ���������Ʈ(cmd)
  	- eclipse���� Ű���� �Է� �޴� ����/����� ����
 
 2) System.in �ʵ�
 	- �ڹ� ���α׷��� �ַܼκ��� �����͸� �Է�
 	ex) InputStream is  = System.in;
 	int ascii = is.read(); char inC = (char)ascii;
 	
 3) System.out �ʵ�
 	- �ڹ� ���α׷��� �ַܼκ��� �����͸� ���
 	ex) OutputStream os = System.out;
 	
 4) ConsoleŬ����
 	- �ڹ�6���� ���ڿ��� ���� ���� �� �ְ� ����
 	- java.io.ConsoleŬ����
 	ex) Console con = System.console();
 	
 5) �޼���
 	- readLine() : EnterŰ �Է� ���� ��� ���ڿ� ����
 	- readPassword() : Ű���� �Է� ������ �ֿܼ� �������� �ʰ� ����
*/
package a13_stream;

import java.io.Console;

public class A08_Console_0517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.console()�� ���� �ְܼ�ü ����
		Console console = System.console();
		
//		���̵� �Է�
		System.out.print("���̵� �Է�: ");
//		enterŰ �Է� ���� ���δ��� ���ڿ� �Է� : .readLine():	
		String id = console.readLine();

//		�н����� �Է�
		System.out.print("�н����� �Է�: ");
//		���δ��� �н������� ���ڿ� �Է� : .readPassword() return���� char[]
		char[] passChar = console.readPassword();
		String password = new String(passChar);
		System.out.println("�Է��� id�� password");
		System.out.println("ID: "+id);
		System.out.println("PASSWORD: "+password);
		
	}

}
