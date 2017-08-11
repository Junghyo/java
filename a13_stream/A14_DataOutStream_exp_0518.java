/*
 Ȯ�ο���
 1�ܰ� �Ʒ� �����͸� prodData.dat�� �����ϰ� ȣ��
 ���Ǹ�		����		����
 @@@		@@@		@@
 
 2�ܰ� Scanner Ŭ������ Ȱ���Ͽ� ���� ���� �����͸� �Է��Ͽ� ������ ���Ͽ� ����. ����� ������ �����͸� �ҷ��� ����Ʈ�ϴ� ó��
*/
package a13_stream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class A14_DataOutStream_exp_0518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/";
		String fname = "prodData.dat";
		File f01 = new File(dir+fname);
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			if(!f01.exists()){
				f01.createNewFile();
			}else{
				fos = new FileOutputStream(f01);
				dos = new DataOutputStream(fos);
				dos.writeUTF("ȣ����");
				dos.writeInt(40);
				dos.writeShort(7);
				dos.writeUTF("�޽�");
				dos.writeInt(10);
				dos.writeShort(10);
				dos.writeUTF("���ź");
				dos.writeInt(30);
				dos.writeShort(9);
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
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
/*
# ����
1. ����� ��Ʈ���� ���� ���� �� Ʋ�� ���� �����Դϱ�?
	1) �ϳ��� ��Ʈ������ �Է°� ����� ���ÿ� �����ϴ�.
	2) ���α׷��� �������� �����Ͱ� ������ �Է� ��Ʈ���̴�.
	3) ���α׷��� �������� �����Ͱ� ������ ��� ��Ʈ���̴�.
	4) �ֿܼ� ����ϰų�, ���Ͽ� �����Ϸ��� ��� ��Ʈ���� ����ؾ� �Ѵ�.

2. InputStream�� Reader�� ���� �������� Ʋ�� ���� �����Դϱ�?
	1) �̹��������ʹ� InputStream �Ǵ� Reader�� ��� ���� �� �ִ�.
	2) Reader�� read()�޼ҵ�� 1���ڸ� �д´�.
	3) InputStream�� read() �޼���� 1����Ʈ�� �д´�.
	4) InputStreamReader�� �̿��ϸ� InputStream�� Reader�� ��ȯ��ų �� �ִ�.
	
3. InputStream�� read(byte[] b, int off, int len)�޼��忡 ���� �������� Ʋ�� ���� �����Դϱ�?
 	1) �޼����� ���ϰ��� �д� ����Ʈ ���̴�.
 	2) ù��° �Ű��� b���� ���� �����Ͱ� ����ȴ�.
 	3) �ι�° �Ű��� off���� ù��° �Ű��� b���� �����Ͱ� ����� ���� �ε����̴�.
 	4) ����° �Ű��� len�� ù��° �Ű��� b���� �����Ͱ� ����� ������ �ε����̴�.
 	
4. ��� ��Ʈ������ ������ ��� ��, flush()�޼��带 ȣ���ϴ� ������ �����Դϱ�?  ��:1
	1) ��� ��Ʈ���� ���ۿ� �ִ� �����͸� ��� ��½�Ű�� ���۸� ����.
	2) ��� ��Ʈ���� �޸𸮿��� �����Ѵ�.
	3) ��� ��Ʈ���� ���ۿ� �ִ� �����͸� ��� �����Ѵ�.
	4) ��� ��Ʈ���� �ݴ� ������ �Ѵ�.
*/