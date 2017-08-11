/*
 # 목표
 1) 자바프로그램에서 API의 역할을 안다.
 2) 프로그래밍시, API를 활용할 줄 안다.
 3) 사용을 많이 하는 클래스들에 대한 활용방법을 익힌다.
 	- String
 	- Object
 	- StringBuffer
 	- Arrays
 	- Wrapper
 	- Date, Calendar
 	
 # 생각해봅시다
 1. 자바 프로그래밍을 할 때와 API를 이용할 때를 구분하는 기준은 무엇인가?
 2. API의 내용을 빠르게 효과적으로 찾아서 활용하는 방법은 없는가?
 
 # 자바 API 도큐먼트
 1. API(Application Programming Interface)
 	- 프로그램 개발에 자주 사용되는 클래스 및 인터페이스 모음.	
 	  자바에서 라이브러리(library)라고 부르기도 한다.

 2. <JDK설치 경로>/jre/lib/rt.jar 라는 압축파일에 저장.
 
 3. API도큐먼트는 http://docs.oracle.com/javase/8/docs/api
 
 4. API는 3개의 프레임으로 나뉘어짐.
 	1) package 전체목록
 	2) package에 속하는 클래스와 인터페이스
 	3) 중앙 프레임 - 상세 설명

 5. 상세 내용 중 메서드
 	- 1) return값  2) 메서드명  3) param으로 입력할 값
 	- return값에 대한 상세설명
 	
 # 주요 패키지들
 	1. java.lang패키지 : import 없이 바로 사용가능한 default 패키지
 		1) Object : 자바 클래스(api클래스, 사용자정의 클래스)의 최상위 클래스로 사용
 		2) System 
 			- .in :  표준 입력 장치(키보드)로부터 데이터를 입력받을 때 사용
 			- .out : 표준 출력 장치(모니터)로 출력하기 위해 사용
 			- JVM을 종료시킬 때 사용
 			- 쓰레기 수집기(사용하지 않는 메모리 수집) 실행을 요청할 때 사용
 			
 Class : 클래스를 메모리에 로딩할 때 사용
 	- Class.forName("지정된 클래스") 지정된 클래스를 메모리에 올림
 
 String : 문자열을 지정하고 여러가지 정보를 얻을 때 사용
 
 StringBuffer, StringBuilder : 문자열을 저장하고 내부 문자열을 조작할 때 사용
 
 Math : 수학 함수
 
 Wrapper(Integer, Double..) : 기본 type의 데이터를 갖는 개체를 만들 때 사용. method()를 통해서 활용.
*/
package a10_api;

import java.io.IOException;

class Person{
	
}

public class A01_lang_package_0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		java의 모든 클래스의 최상위 클래스 : Object		
		Object o1 = new Object();
//		java.lang.Object@dcf3e99 : 클래스명@주소값		
		System.out.println("Object의 toString(): "+o1.toString());
		Person p1 = new Person();
		Person p2 = new Person();
//		a10_api.Person@1ee0005		
		System.out.println("Person의 toString(): "+p1.toString());
//		a10_api.Person@75a1cd57		
		System.out.println("Person의 toString(): "+p2.toString());
		
//		System.in : 입력 관련 객체
//		read()를 통해 입력 처리		
		try {
			System.out.println("문자 한자입력: "+(char)System.in.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out : 출력관련 객체
//		println()를 통해서 출력 처리
		System.err.println("에러 로그 처리 err.println()");
	}

}


