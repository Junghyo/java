/*
 # 자바란?
 자바의 시작
 - 현재는 오라클로 통합된 썬 마이크로 시스템즈의 제임스 고스링에 의해 개발된 객체 지향 프로그래밍 언어.
 1995년에 발표되어 현재 많은 Sever프로그램이나 웹프로그래밍에 활용되고 있다.
 
 특징
 1) 플랫폼 독립적(이식성이 높은) 언어이다.
    - 운영체제 상관없이 수행되는 언어.
 
 2) 객체지향 프로그래밍 언어이다. 
    - 가장 설계나 수행과정을 효과적으로 처리하는 것이 Object개념(사물, 물건)이기에 이러한 기초로 시작되었음.
 
 # 자바
 특징
 1) 분산 네트워크 기술을 지원
 	- 원격 메소드 호출 [ RMI(Remote method Invocation), CORBA(Common Request Broker Architecture) ]
  		: 네트워크 상의 다른 computer(서버)를 java 프로그래밍으로 연결해서 처리하는 것.
 
 2) 다중 쓰레드를 지원한다. (네트워크 상에서 한번에 여러 클라이언트 접속. 하나의 프로세스 안에 여러 단위의 요청 내용을 처리.)
 
 3) 보안 기능을 지원한다.
 - 접근에 대한 권한을 변수로 처리 - Access Modifier(접근제어자)
 
 4) 메모리를 자동 관리
 - 실제 메모리 주소까지 관리하지 않더라도 자동으로 메모리를 관리하게끔 설계. 쓰레기 수집기(Garage collecotr)를 통해 사용하지 않은 메모리 자동관리.

 
 # 개발 플랫폼에 따른 3가지 형태의 Java
 1) Java SE
 - 데스크탑에서 실행되는 응용 프로그램 개발 사용
 
 2) Java EE(Enterprise Edition)
 - 대규모 엔터프라이즈 기반 애플리케이션 개발
 - 서버와 클라이언트 분산에서 개발 시 활용
 
 3) Java ME(Micro Edition)
 - 모바일 및 임베디드(특정한 기기에 포함된 프로그램) 기반 애플리케이션 개발환경에서 활용
 
 
 # 자바 개발 환경 구축
 1) 자바 개발 도구(JDK) 설치
 - Java Development Kit
 - JVM(자바가상 기계), 라이브러리 API(손쉽게 프로그램을 할 수 있는 클래스 모음), 컴파일러 등 개발 도구가 포함
 
 2) 자바 개발 환경(JRE)
 - Java Runtime Environment
 - JVM + 표준 클래스 라이브러리
 
 3) 오라클(http://www.oracle.com)설치 사이트
 - 운영체제에 맞는 JDK를 다운로드(64bit/32bit)
 
 # 실행환경 Setting
 1) Java 설치
 - cmd 창에서 java 실행
 2) JAVA_HOME 환경변수로 setting하기
 - Java 설치된 곳 확인(C:\Program Files\Java\jdk1.8.0_121)
 3) 시스템변수에 등록
 - 윈도우 시작 -> 제어판 -> 시스템 및 보안 -> 시스템  -> 고급시스템 설정
 4) 시스템변수  Path에서 추가
 - %JAVA_HOME%\bin;
 
 # 자바프로그램
 1) 소스 작성에서 실행
 - Java 소스 파일 작성 
 ex) Hello.java : main 안에 System.out.println("안녕하세요");
 - 컴파일러(javac.exe)로 바이트 코드(.class-기계어)생성
 ex) javac Hello.java -> Hello.class
 - JVM 구동 명령어(java.exe)로 실행
 ex) java Hello
*/ 
package a01_start;

public class A01_Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl+F11 run 단축키;
		System.out.println("안녕하세요. 자바 시작입니다!!");
	}

}
/*
 JDK와 JRE는 어떤 부분에서 차이가 있는가?
 
 자바에서 말하는 플랫폼 독립적이라는 말은 무엇을 의미하는가?
 
 가베지 컬렉션을 통해서 처리되는 것은 무엇인가?
 
 프로그램 설치에서 32bit/64bit는 무엇을 의미하고 JDK와 eclipse버전에 어떤 영향을 미치는가?
 
 eclipse에서 workspace는 어떤 역할을 하는가?
 
 java프로그램의 실행 단게별 내용을 기술하세요.
 

*/
