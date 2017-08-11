/*
  # 스트림 클래스 2가지 종류
 1) byte 기반 스트림
 		- 그림, 멀티미디어, 문자 등 모든 종류의 데이터를 입력
 
 2) 문자(char) 기반 스트림
 		- 문자만 주고 받을 수 있음.		
 		
 # InputStream
 1) 바이트 기반 입력 스트림의 최상위 클래스로 추상 클래스
 2) 메서드
 		- read() : 1byte를 읽음.
 		- read(byte[] b) : byte[]b에 문자를 저장
 		- read(byte[]b, int off, int len) : byte[]b에 범위(시작:off, 길이:len)를 정하여 입력받게 처리
 		- close() : 스트림 자원 해제 

 3) System.in 통에서 read() 처리 시
 		- 문자 한자 char 입력시 3개로 인식
 		- enter키 : 13(캐리지리턴)+10(라인피드) --> char값 2개 인식
*/
package a13_stream;

import java.io.IOException;
import java.io.InputStream;

public class A02_StreamByte_0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
//		입력받은 데이터를 byte[]로 선언.
		byte[] bArray = new byte[5];
		System.out.println("데이터를 입력하세요.");
		is = System.in;
		int cnt=0;
	
		try {
//			입력받은 데이터 건수 return		
			do{
				cnt = is.read(bArray);
				System.in.read();
				System.in.read();
				System.out.println("입력 갯수: "+cnt);
				for(byte data : bArray){
					System.out.println("입력받은 값 : "+(char)data);
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
