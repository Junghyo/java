/*
 여러 클래스 관계를 통해서 프로그램을 처리하는데 클래스 내부에 클래스를 선언하는
 # 중첩 인터페이스 예제
 public class View{
 	public interface OnClickListener{
 		public void onClick(View v); 		
 	}
 }
 
 # 중첩 클래스 종류
 1) 멤버 클래스( 외부$내부.class )
  - 인스턴스 멤버 클래스 : 외부객체를 생성해야만 사용할 수 있는 내부 중첩클래스
  class 외부{ class 내부{} }
  
  - 정적(static)멤버 클래스 : 외부클래스로 바로 접근할 수 있는 내부 중첩클래스
  class 외부{ static class 내부{} }
 
 2) 로컬 클래스 : 메서드가 실행할 때만 사용할 수 있는 중첩클래스( 외부$1내부.class ) 
 	- class 외부{
 	  	void 메서드(){
 	  		class 내부로컬클래스{}
 	  	}
 	  }
 
 # 멤버 클래스
 1. 인스턴스멤버 클래스와 정적멤버 클래스의 차이점
 	  1) 외부객체 생성 여부 차이
 	  2) static 멤버의 선언가능 여부
 	  		- 인스턴스 멤버 클래스 내부에서는 X
 	  		- 정적(static) 멤버 클래스 내부에서는 O
*/
package a08_objectdup;



// 인스턴스 멤버 클래스 : 외부객체가 생성된 내부클래스 사용 가능
class InstOuter{
// 인스턴스 멤버 클래스 InstOuter.InstInnerMember
	 
	class InstInnerMember{
//		인스턴스 필드		
		String name="호날두";
//		인스턴스 메서드		
		void callName(){
			System.out.println("호날두");
		}
//		static int num=1;	에러발생. 사용 불가
	}
}
// 정적 멤버 클래스
// 내부에 static 멤버 클래스로 선언된 것을 말한다.
class InstOuter2{
//	정적(static) 멤버 클래스
	static class StaticMemberClass{
		String name="정적(static)멤버 클래스";
		void CallName(){
			System.out.println(name+"가 호출됩니다.");
		}
//		static 멤버 사용 가능		
		static int num=1;		
	}
}
public class A01_dupClass_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		외부클래스 객체를 선언하지 않고 내부클래스를 먼저 선언하면 오류 발생		
//		InstInnerMember i1 = new InstInnerMember();

//		외부클래스에서 인스턴스멤버 클래스의 내부 클래스를  호출하려면 
//		1) 먼저 외부객체 생성		
		InstOuter o1 = new InstOuter();
//		2) 내부객체 -> 외부클래스명.내부클래스명 참조변수 = 외부객체참조.new 내부클래스명();
//		3) InstOuter$InstInnerMember.class 클래스파일이 생성.
		InstOuter.InstInnerMember i1 = o1.new InstInnerMember();
		System.out.println("내부 클래스 이름: "+i1.name);
		i1.callName();
		
//		정적멤버 클래스는 
//		외부클래스 객체를 생성할 필요 없음		
//		1) 외부클래스명.내부클래스명 참조변수 = new 외부클래스명.내부클래스명();
		InstOuter2.StaticMemberClass s1 = new InstOuter2.StaticMemberClass();
		s1.CallName();
	}

}
/*
 # URL(Uniform Resource Locator)
 1) 구성
 	- [프로토콜]://[호스트][포트][경로][파일명][.확장자][쿼리문자열]
 	ex) https://www.google.co.kr/search?q=jsp&oq=jsp&aqs=chrome..69i57j0l5.2494j0j7&sourceid=chrome&ie=UTF-8
 		- 프로토콜 : http
 		- 호스트 : www.google.co.kr
 		- 포트 : 80(http 프로토콜의 기본 포트)
 		- 경로 : /search
 		- 쿼리문자열 : q=jsp&oq=jsp&aqs=
 2) URL은 웹어플리케이션에 요청을 구분하기 위한 용도로 사용	
 
 # 서블릿과 JSP
 1. 자바를 만든 Sun에서 정한 웹 개발 표준
 	- 서블릿(Servlet) : 실행 코드 방식의 특징
 	- JSP(JavaServer Page)
 		
*/

			 