/*
 # 보조 스트림
 - 다른 스트림과 연결되어 여러가지 편리한 기능을 제공해주는 스트림을 말한다.
      필터 스트림이라고 하기도 한다.
      기본 스트림에 상속받아 문자변환, 입출력 기능 향상, 기본 데이터타입 입출력, 객체 입출력 등의 기능
   
 # 보조 스트림과 함께
 1) 스트림(기본 클래스) InputStream
 	- 하위 클래스(보조스트림1) : InputStreamReader
 	- 하위 클래스(보조스트림2) : BufferedReader
 
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

//		보조스트림 활용하기
//		1. 기본 스트림 클래스 선언 및 객체 생성.
		InputStream is  = System.in;
//		2. 보조스트림1 활용(생성자에 할당)
		InputStreamReader reader = new InputStreamReader(is);
//		3. 보조스트림2 활용(생성자에 할당)
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력");
		try {
			String lineString = br.readLine();
			System.out.println("출력: "+lineString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
