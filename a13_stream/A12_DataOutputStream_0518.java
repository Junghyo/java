package a13_stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A12_DataOutputStream_0518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dtfile = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/dataFile.dat";
//		���ڿ��� ���� ȣ��
//		�����͸� �ش� type ����� ȣ��
//		FileOutputStream : �����͸� ���� ��Ʈ�� Ŭ����
		FileOutputStream fos = null;

//		DataOutputStream : �����͸� ���� ���� ��Ʈ�� Ŭ����
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(dtfile);
			dos = new DataOutputStream(fos);

//			�����͸� �ش� ���Ͽ� ����
//			Ronaldo, 95.2(�Ǽ�), 1(����)
			dos.writeUTF("Ronaldo");
			dos.writeDouble(95.724);
			dos.writeInt(1);
			dos.writeUTF("4��Ÿ��");
			dos.writeDouble(20.2124);
			dos.writeInt(2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("��Ÿ���ܹ߻�");
		} finally {
			try {
//				Buff�޸� Ȱ��ÿ��� flush�� ���� ���������				
				dos.flush();
				dos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}


