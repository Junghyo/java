package a00_basic;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
public class A15_Net_Client_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Socket (Ŭ���̾�Ʈ ��� ��ü)
		// new Socket("�����ϰ��� �ϴ� server ip�ּ�", �ش�port);
		try {
			Socket s1 = new Socket("localhost",5432);
			// localhost : �ڽ��� ��ǻ�� ȣ�� ip

			s1.getInputStream();
			// �Է��ϴ� Stream InputStream
			// ���� ��� OutputStream --> Ŭ���̾�Ʈ InputStream���� ����
			
			InputStream is=s1.getInputStream();
			// ��� �⺻ ��ü�� �޾ƿ� InputStream
			
			ObjectInputStream dis = new ObjectInputStream(is);
		
			System.out.println(dis.readObject());
			// client console ȭ�鿡 ����Ϸ���
			// readObject() --> ObjectInputStream
			
			dis.close();
			s1.close();
			// ������ ����
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
