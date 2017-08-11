/*
 # OutputStream
 1) 바이트 기반 출력 스트림의 최상위 클래스
 	- 하위 : FileOutputStream, PrintStream
 		 	BufferedOutputStream, DataOutStream
 
 2) 메서드
 	 - write(int b) : 1바이트 단위로 출력처리
 	 - write(byte[] b) : 바이트 배열 만큼 전송하여 출력처리
 	 - write(byte[] b, int off, int len) : 출력 스트림으로 주어진 바이트 배열의 크기만큼 보낸다.
 	 - flush() : 버퍼에 잔류하는 모든 바이트 출력
 	 - close() : 자원 반납 출력 스트림을 닫는다.
 
 # 파일에 자바의 문자열 출력
 1)FileOutputStream("txt경로")
 
 2) 파일에 보낼 문자
 	- byte[] data = "ABC".getBytes(); 
 	- 문자열을 byte[] 변경처리

 3) FileOutPutStream
  	- write(data[index]) : 파일에 등록처리
  	

*/
package a13_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class A05_OutputStream_0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out : 자바에서 지원하는 출력 기본객체
//		println() : 화면에 출력처리메서드
		String fileName = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/test01";
		try {
			OutputStream os = new FileOutputStream(fileName);
//			파일에 출력할 문자열 지정
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
