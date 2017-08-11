/*
 # 콘솔 입출력
 1) 콘솔 : 시스템을 사용하기 위해 키보드로 입력/화면으로 출력하는 소프트웨어
 	- 유닉스/리눅스 : 터미널, Windows : 명령프롬프트(cmd)
  	- eclipse에서 키보드 입력 받는 내용/출력을 지원
 
 2) System.in 필드
 	- 자바 프로그램이 콘솔로부터 데이터를 입력
 	ex) InputStream is  = System.in;
 	int ascii = is.read(); char inC = (char)ascii;
 	
 3) System.out 필드
 	- 자바 프로그램이 콘솔로부터 데이터를 출력
 	ex) OutputStream os = System.out;
 	
 4) Console클래스
 	- 자바6부터 문자열을 쉽게 읽을 수 있게 지원
 	- java.io.Console클래스
 	ex) Console con = System.console();
 	
 5) 메서드
 	- readLine() : Enter키 입력 전에 모든 문자열 읽음
 	- readPassword() : 키보드 입력 내용을 콘솔에 보여주지 않고 읽음
*/
package a13_stream;

import java.io.Console;

public class A08_Console_0517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.console()을 통한 콘솔객체 생성
		Console console = System.console();
		
//		아이디 입력
		System.out.print("아이디 입력: ");
//		enter키 입력 전에 라인단위 문자열 입력 : .readLine():	
		String id = console.readLine();

//		패스워드 입력
		System.out.print("패스워드 입력: ");
//		라인단위 패스워드형 문자열 입력 : .readPassword() return형은 char[]
		char[] passChar = console.readPassword();
		String password = new String(passChar);
		System.out.println("입력한 id와 password");
		System.out.println("ID: "+id);
		System.out.println("PASSWORD: "+password);
		
	}

}
