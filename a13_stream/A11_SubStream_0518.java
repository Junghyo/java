/*
 # ���� ��Ʈ��
 - �ٸ� ��Ʈ���� ����Ǿ� �������� ���� ����� �������ִ� ��Ʈ���� ���Ѵ�.
      ���� ��Ʈ���̶�� �ϱ⵵ �Ѵ�.
      �⺻ ��Ʈ���� ��ӹ޾� ���ں�ȯ, ����� ��� ���, �⺻ ������Ÿ�� �����, ��ü ����� ���� ���
   
 # ���� ��Ʈ���� �Բ�
 1) ��Ʈ��(�⺻ Ŭ����) InputStream
 	- ���� Ŭ����(������Ʈ��1) : InputStreamReader
 	- ���� Ŭ����(������Ʈ��2) : BufferedReader
 
 2) InputStream is = System.in;
 
 3) InputStreamReader reader = new InputStreamReader(is);
 
 4) BufferedReader br = new BufferedReader(reader);
 
*/
package a13_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A11_SubStream_0518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		������Ʈ�� Ȱ���ϱ�
//		1. �⺻ ��Ʈ�� Ŭ���� ���� �� ��ü ����.
		InputStream is  = System.in;
//		2. ������Ʈ��1 Ȱ��(�����ڿ� �Ҵ�)
		InputStreamReader reader = new InputStreamReader(is);
//		3. ������Ʈ��2 Ȱ��(�����ڿ� �Ҵ�)
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("�Է�");
		try {
			String lineString = br.readLine();
			System.out.println("���: "+lineString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
