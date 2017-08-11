/*
 # OutputStream
 1) ����Ʈ ��� ��� ��Ʈ���� �ֻ��� Ŭ����
 	- ���� : FileOutputStream, PrintStream
 		 	BufferedOutputStream, DataOutStream
 
 2) �޼���
 	 - write(int b) : 1����Ʈ ������ ���ó��
 	 - write(byte[] b) : ����Ʈ �迭 ��ŭ �����Ͽ� ���ó��
 	 - write(byte[] b, int off, int len) : ��� ��Ʈ������ �־��� ����Ʈ �迭�� ũ�⸸ŭ ������.
 	 - flush() : ���ۿ� �ܷ��ϴ� ��� ����Ʈ ���
 	 - close() : �ڿ� �ݳ� ��� ��Ʈ���� �ݴ´�.
 
 # ���Ͽ� �ڹ��� ���ڿ� ���
 1)FileOutputStream("txt���")
 
 2) ���Ͽ� ���� ����
 	- byte[] data = "ABC".getBytes(); 
 	- ���ڿ��� byte[] ����ó��

 3) FileOutPutStream
  	- write(data[index]) : ���Ͽ� ���ó��
  	

*/
package a13_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class A05_OutputStream_0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out : �ڹٿ��� �����ϴ� ��� �⺻��ü
//		println() : ȭ�鿡 ���ó���޼���
		String fileName = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/test01";
		try {
			OutputStream os = new FileOutputStream(fileName);
//			���Ͽ� ����� ���ڿ� ����
			byte[] data = "Hi! Man".getBytes();
			for(byte b : data){
				os.write(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
