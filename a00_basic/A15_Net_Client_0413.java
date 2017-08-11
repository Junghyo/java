package a00_basic;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
public class A15_Net_Client_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Socket (클라이언트 통신 객체)
		// new Socket("접속하고자 하는 server ip주소", 해당port);
		try {
			Socket s1 = new Socket("localhost",5432);
			// localhost : 자신의 컴퓨터 호출 ip

			s1.getInputStream();
			// 입력하는 Stream InputStream
			// 서버 출력 OutputStream --> 클라이언트 InputStream으로 받음
			
			InputStream is=s1.getInputStream();
			// 출력 기본 객체에 받아옴 InputStream
			
			ObjectInputStream dis = new ObjectInputStream(is);
		
			System.out.println(dis.readObject());
			// client console 화면에 출력하려면
			// readObject() --> ObjectInputStream
			
			dis.close();
			s1.close();
			// 지원을 해제
		
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
