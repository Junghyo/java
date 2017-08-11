/*
 # 스트림 구조 객체 활용
 ┌── InputStream ──┐		┌── InputStreamReader ──┐
 │ 	(추상클래스)	   │------->│	(실제클래스)			│
 └─────────────────┘		│	생성자로 감싸서 처리	│
 							└───────────────────────┘
 
 InputStream in = System.in;
 InputStreamReader is = new InputStream(in);
*/
package a13_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A03_Reader_0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		InputStreamReader reader = null;
		System.out.println("문자열입력");
		reader = new InputStreamReader(in);
		try {
				int n = reader.read();
				System.out.println("입력된 문자열: "+(char)n);
				char[] chArr = new char[10];
				int cnt = reader.read(chArr);
				System.out.println("입력한 문자열의 크기: "+cnt);
				System.out.println("입력한 문자: ");
				for(char c:chArr){
					System.out.print(c);
				}
				System.out.println("입력종료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/*
 점심메뉴를 입력 받아 출력하세요.
 오늘의 점심은?
 선택한 점심은 @@@
*/
