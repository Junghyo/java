/*
 # 예외
 1) 목표
 	- 예외가 프로그램에서 발생하는 상황에 대해서
 	  처리할 프로세스 구조를 안다.
 	- 자바에서 예외를 처리하는 프로그램의 기본 구조를 안다.
 	- 여러가지 예외를 처리하는 api의 기능을 알고 실행할 줄 안다.
 	- 사용자 정의 예외 클래스를 선언하고 활용할 줄 안다.
 
 # 예외란?
 1) 컴퓨터 하드웨어적으로 오동작, 고장으로 응용프로그램 실행이
 	발생하는 것을 자바에서는 error라고 한다.
 
 2) JVM 실행 문제가 생기는 것으로 프로그램을 견고하게 만들었어도
 	실행이 불능하게 된다.
 	
 3) 이런 프로그램에서 개발자는 대처할 방법이 없다.	
 
 4) 자바에서 error 이외에 예외(Exception)라고 부르는 오류가 있다.
 	예외란 사용자의 잘못된 조작 또는 개발자 코딩 문제로 발생하는
 	프로그램 오류를 말한다. 원래 이런 오류가 발생하면 프로그램은 종료된다.
 	자바에서는 예외처리(Exception)로 프로그램을 종료하지 않고
 	실행 상태가 유지되도록 한다.
 	
 5) 예외
 	- 일반 예외 : 컴파일 체크 예외
 	- 실행 예외 : 컴파일 후 실행 처리
 
 #
 ClassNotFoundException(일반 예외 : 컴파일시 발생)	---->
 InterruptedException(일반 예외 : 컴파일시 발생)	---->	java.lange.Exception
 RuntimeException(실행시 발생 예외)					---->
 
 NullPointerException(데이터, 변수 값이 없는 경우)	---->
 NumberFormatException(데이터 변환관련 에러)		---->	RuntimeException
 
 # 실행 예외들
 1) 컴파일 시 발생하는 것이 아니기에 개발자 경험이나
 	간단한 테스트 코드로 예외처리를 해야 하는 것을 말한다.
 
 2) NullPointerException
 	- 객체 참조가 없는 상태. null값을 갖는 참조 변수로
 	  접근 연산자(.)를 사용해서 멤버를 호출했을 때 발생하는 에외
 
 3)	ArrayIndexOutOfBoundsException
  	- 배열에서 인덱스의 범위를 초과해서 사용했을 때 발생하는 예외
  
 4) NumberFormatException
 	- 문자열을 숫자로 변환하는 경우 숫자형 문자여야 하는데 그렇지 않을 때
 	  처리하는 객체 메소드에서 예외 발생. 
 	- Integer.parseInt("정수형 문자열") -> 정수변환
 	- Integer.parseDouble("실수형 문자열") -> 실수변환
 	- 정수형 문자열이나 실수형 문자열이 아닌 경우, 
 	  ex) "1", "2", "3.4"가 아니고 "a1, "a2", "b3.4"로 된 내용은 에러 발생 
*/
package a09_exception;

public class A01_Exceptions_0427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		데이터가 입력되지 않았을 때 상태.		
		String data=null;
//		null 상황에서 (.)를 활용해서 해당 멤버를 호출시 발생.
//		System.out.println(data.length());
		// NullPointerException
//		에러 발생시 jvm에서 지원하는 에러 내용을 확인 후 
//		그 에러를 정리해서 예외 처리하면 된다.		
		
//		String data2 = args[0];
//		String data3 = args[1];
//		System.out.println(data2);
		// ArrayIndexOutOfBoundsException
// 		배열에 데이터값 없는데, index범위를 넘어서 호출되었을 때,
// 		발생하는 예외 
		String data4 = "100";
		String data5 = "a100";
		int num01 = Integer.parseInt(data4);
		int num02 = Integer.parseInt(data5);
		System.out.println(data4);
		System.out.println(num01);
		System.out.println(data5);
		System.out.println(num02);
		// NumberFormatException
		
		
	}

}
					