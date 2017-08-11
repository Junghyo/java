/*
  # ��Ʈ�� Ŭ���� 2���� ����
 1) byte ��� ��Ʈ��
 		- �׸�, ��Ƽ�̵��, ���� �� ��� ������ �����͸� �Է�
 
 2) ����(char) ��� ��Ʈ��
 		- ���ڸ� �ְ� ���� �� ����.		
 		
 # InputStream
 1) ����Ʈ ��� �Է� ��Ʈ���� �ֻ��� Ŭ������ �߻� Ŭ����
 2) �޼���
 		- read() : 1byte�� ����.
 		- read(byte[] b) : byte[]b�� ���ڸ� ����
 		- read(byte[]b, int off, int len) : byte[]b�� ����(����:off, ����:len)�� ���Ͽ� �Է¹ް� ó��
 		- close() : ��Ʈ�� �ڿ� ���� 

 3) System.in �뿡�� read() ó�� ��
 		- ���� ���� char �Է½� 3���� �ν�
 		- enterŰ : 13(ĳ��������)+10(�����ǵ�) --> char�� 2�� �ν�
*/
package a13_stream;

import java.io.IOException;
import java.io.InputStream;

public class A02_StreamByte_0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
//		�Է¹��� �����͸� byte[]�� ����.
		byte[] bArray = new byte[5];
		System.out.println("�����͸� �Է��ϼ���.");
		is = System.in;
		int cnt=0;
	
		try {
//			�Է¹��� ������ �Ǽ� return		
			do{
				cnt = is.read(bArray);
				System.in.read();
				System.in.read();
				System.out.println("�Է� ����: "+cnt);
				for(byte data : bArray){
					System.out.println("�Է¹��� �� : "+(char)data);
				}
			}while(bArray[0]!='Q');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
