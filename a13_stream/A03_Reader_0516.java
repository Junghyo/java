/*
 # ��Ʈ�� ���� ��ü Ȱ��
 ������ InputStream ������		������ InputStreamReader ������
 �� 	(�߻�Ŭ����)	   ��------->��	(����Ŭ����)			��
 ��������������������������������������		��	�����ڷ� ���μ� ó��	��
 							��������������������������������������������������
 
 InputStream in = System.in;
 InputStreamReader is = new InputStream(in);
*/
package a13_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A03_Reader_0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		InputStreamReader reader = null;
		System.out.println("���ڿ��Է�");
		reader = new InputStreamReader(in);
		try {
				int n = reader.read();
				System.out.println("�Էµ� ���ڿ�: "+(char)n);
				char[] chArr = new char[10];
				int cnt = reader.read(chArr);
				System.out.println("�Է��� ���ڿ��� ũ��: "+cnt);
				System.out.println("�Է��� ����: ");
				for(char c:chArr){
					System.out.print(c);
				}
				System.out.println("�Է�����");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/*
 ���ɸ޴��� �Է� �޾� ����ϼ���.
 ������ ������?
 ������ ������ @@@
*/
