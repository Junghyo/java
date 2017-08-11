/*
 # Stream 
 �����Ͱ� �귯���� ���� �߻�ȭ�Ͽ� ���� ��ü��
 �ڹٿ����� Stream�� Ȱ���Ͽ� �����͸� �Է�, ���, ������ ó���ϰ� �ִ�.
 �⺻������
 1) local���� �����͸� ��/����ϴ� ��
 2) ������ �����Ͽ� ��/����ϴ� ��
 3) ��Ʈ��ũ������ �����͸� ��/����ϴ� ��
 �� ��ΰ� �� Stream�� Ȱ���Ͽ� ó���Ѵ�.
 
 ��, �̷��� ������ ������� �Ͼ�⿡ �߻��ϴ�
 ���� ���ܻ�Ȳ(��Ʈ��ũ, ������ ����, ���ȹ���)� ����Ͽ�
 Stream�� �ݵ�� Exceptionó���� �� �־�� �Ѵ�.
*/
package a00_basic;

import java.io.IOException;
import java.io.InputStream;

public class A10_Stream_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����͸� �Է��ϼ���");
		
		InputStream is = System.in;
		// InputStream : �Է��ϴ� Stream�̶�� ���� �Է��� �� Ȱ��Ǵ� �ֻ� Ŭ�����̴�.
		// System.in : JVM���� �����ϴ� �⺻ �Է�ó�� ��ü
		try {
			int n = is.read();
			System.out.println( "�Է°�: "+(char)n );
			is.close();
			// Stream�� �ڿ��� ��� �ֱ⿡ �ش� ������ ó���� �Ŀ��� close()�޼ҵ带 ���� ��������� �ڿ��� ������ �ش�.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
