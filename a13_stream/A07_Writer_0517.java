/*
 # Writer
 1) ���� ��� ��� ��Ʈ���� �ֻ��� Ŭ����
 
 2) ���� Ŭ���� : Writer Ŭ������ ���
 	- FileWriter, BufferedWriter, PrintWriter, OutputStreamWriter
 
 3) �ֿ� �޼���
 	- write(int c) : ��Ʈ������ �� ���ڸ� ������ ó��
 	- write(char[] cArray) : ��Ʈ������ ���� �迭�� ������ ó��
 	- write(char[] cArray, int off, int len) : ��Ʈ������ ���� �迭 �κ��� �����ؼ� ������ ó��
 	- write(String str) : ���ڿ��� ������ ó��
 	- flush() : ���ۿ� �ܷ��ϴ� ��� ���ڿ� ���
 	- close() : ����� �ý��� �ڿ��� �ݳ�, ��� ��Ʈ�� �ݱ�
*/
package a13_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class A07_Writer_0517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fold = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/";		
		String file = fold+"test03.txt";
		Writer writer = null;
		try {
//			Writer�� ���ؼ� File�� ���� ó�� -> FileWriter
//			new FileWriter() IO �߻����� ����ó�� �ʼ�	
			writer = new FileWriter(file);
			char[] data = "RONALDO".toCharArray();
			for(char d : data){
				writer.write(d);
			}
			writer.write("\nHELLO MAN!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
//				writer : ���ڿ� ��� ��Ʈ���� ���ο� ���� ���۰� �־ �����Ͱ� ��µǱ� ����
//				���ۿ� �����ٰ� ������� ����Ѵ�. �ڿ� ������, ���ۿ� �ܷ��ϰ� �ִ� �����͸� ���
//				��½�Ű�� �ڿ����� �ϴ� ���� �Ϲ����̴�.
				writer.flush();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
