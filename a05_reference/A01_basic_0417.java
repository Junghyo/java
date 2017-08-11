/*
 데이터 타입의 종류
 기본 데이터 type
 -정수형, 실수형, 논리형
 
 참조 데이터 type
 - reference, adderess value
 - 객체-클래스
 - 배열
 - 인터페이스

	stack : 100번지( heap영역 주소)		
	heap : 100번(실제 객체, 배열)
*/

/*
 # JVM 메모리
 stack 영역과 heap영역
 
 stack 영역 
 1)	primitive data type
   		기본 데이터 타입(정수, 실수, boolean) 할당
   		변수 저장영역과 실제 데이터의 메모리 영역이 동일
   
 2) reference data type
   		참조형 데이터타입(객체, 배열, 인터페이스) 할당.
   		변수 저장영역에는 실제 데이터 메모리의 주소값을 할당하고
   		실제 데이터는 heap영역에 할당되는 것을 말한다.
 
 heap 영역
 	- 참조형 데이터가 들어가는 실제 메모리로 stack의 주소값에 의해 호출된다.
  
 # 메소드 영역
 - 상수플, 필드데이터, 메소드데이터, 메소드 코드, 생성자 코드 등을 분류해서 저장.
 - JVM이 시작될 때 생성되고 모든 스레드가 공유하는 영역이다.
 
 # 메모리에서 ==, != 연산
 - 기본데이터형에서는 데이터와 메모리가 동일하기에 같은 데이터는 같은 메모리로 동일한 값(boolean)값이 나타난다.
 ex) int num01 = 25;
 	 int num02 = 25;
 	 System.out.println(num01==num02);		- true
 
 - 참조형에서는 데이터와 메모리가 동일하지 않기 때문에 같은 객체를 호출하더라도 주소값이 다르기에 다른 주소값으로 인식하여 나타난다.
 ex) Person p1 = new Person();	 
 	 Person p2 = new Person();
 	 System.out.println(p1==p2); 		-false
*/

/*
 # null, nullPointer
 1) 참조형 데이터에서 참조변수만 선언하고 heap영역에 실제 객체를 생성하지 않을 때 null을 할당한다.
 - person p = null;
 
 2) 객체가 heap영역에 할당되지 않는 상황에서 메서드를 호출하면 발생하는 에러가 NullPointerException이다.
 - 배열이 없는 곳을 호출, 데이터가 없는 상황에서 호출
 ex) String name = null;
 	 System.out.println(name.length());
 	 System.out.println( args[0] );
*/

/*
 # String 객체 참조에 관해서
 1. String은 객체이다.
 1) 첫글자가 대문자인 것은 자바에서 객체로 정의한다.
 
 2) 객체는 여러 메서드를 가지고 있다.
 	- .length(), substing(idx01, idx02), concat();
 
 3) "문자열"을 바로 할당할 수 있다. new String("문자열")로도 할당 가능.
 	- 차이점 : "문자열"을 바로 할당하면 같은 문자열은 같은 stack주소로 할당되어 있기에
 	  비교 연산자를 쓰면 같은 문자열은 true값이 출력된다.
 	  ex) System.out.println("메시"=="메시"); true
 	
 	- new로 객체생성을 하면서 같은 문자열일지라도 다른 주소값을 호출하기에 false값이 출력된다.
 	  ex) String name01 = new String("메시");
		  String name02 = new String("메시");
		  System.out.println(name01==name02); false
		  System.out.println(name01.equals(name02)); equals : 문자열 자체를 비교하는 메서드를 활용
 	
 
*/
package a05_reference;

public class A01_basic_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 25;
		
		System.out.println(age==25);
		// == : 비교연산자. 실제 데이터 값의 저장영역을 확인할 수 있다.
		
		A01_basic_0417 p = new A01_basic_0417();
		System.out.println(p);
		/* a05_reference.A01_basic_0417@dcf3e99
		객체명@heap영역의 주소값을 16진수코드로 할당(JVM에서 자동할당)
		stack영역에서는 dcf3e99주소만 할당하고 실제 A01_basic_0417()은
		heap영역에 dcf3e99주소에 객체가 할당되어 있다. */
		
		/* 메모리의 ==, != 연산자 활용.
		stack 주소값에 대한 내용으로 기본 데이터형의 값이 동일하면 true.
		참조형데이터의 값은 객체가 동일하더라도 heap 영역에 참조 객체가 다르므로 false. */
		int num01 = 30;
		int num02 = 30;
		System.out.println("기본데이터형: "+(num01==num02));
		
		A01_basic_0417 a01 = new A01_basic_0417();
		A01_basic_0417 a02 = new A01_basic_0417();
		System.out.println("참조데이터형: "+(a01==a02));
		System.out.println(a01);
		System.out.println(a02);
		// 동일한 객체를 생성하더라도 heap 영역에 다른 위치를 참조하기에 stack영역의 주소값이 다르므로 false가 나온다.
		// a01 stack 주소 : 7dc5e7b4 , a02 stack 주소 : 1ee0005
		
		/* null값의 할당.
		실제 참조할 객체를 할당하지 않을 때 처리하는 부분.
		일반적으로 객체를 초기화할 때 활용된다.*/
		A01_basic_0417 a03 = null;
		String name=null;
		System.out.println("참조객체가 없는 참조변수 a03: "+a03);
		System.out.println("참조객체가 없는 참조변수 name: "+name);
		// int num07=null; 기본 데이터형은 참조형이 아니기에 null을 할당 할 수 없다.
		
		/* 참조형에 데이터를 할당되었을 때와 할당되지 않았을 때 에러발생 부분.
		heap영역에 데이터값 즉, 실제 객체가 할당되지 않았기에 하위에 메소드나 변수를 호출하면
		NullPointerException이 발생한다. */
		String name02 ="크리스티아누 호날두";
		System.out.println("객체가 할당된 경우: "+name02.length());
		// 문자열.length() : 문자열의 길이
//		 System.out.println("객체가 할당도지 않은 경우: "+name.length());
		// NullPointException : 참조되는 객체가 없는데 해당 하위 메서드를 호출할 경우
		
		
		// 배열에서도 해당 객체의 데이터가 할당되지 않았을 때
		// ArrayIndexOutOfBoundsException : 배열의 해당 범위에 데이터가 없음을 나타냄
//		System.out.println(args[0]);
//		System.out.println( args.length );
		
		// 배열 객체가 생성되지 않았을 경우 해당 내용을 호출하면 NullPointerException
//		String [] name03 = null;
//		System.out.println(name03[0]);
		
		/* String값의 주소와 문자열의 비교
		 1. String은 객체이다. 하지만 대입연산자에 의해서 직접적으로 문자열을 할당하면 
		 	문자열이 같은 것은 같은 주소에 할당이 된다. */
		String name05 = "호날두";
		String name06 = "호날두";
		System.out.println(name05==name06);
		
		/*
		 2. 객체를 원칙적으로는 String 참조변수 = new String(문자열)로
		 생성이 되면 일반적인 framework나 데이터 로딩에 의해서 처리되는 것은
		 내부적으로 이와 같은 방식으로 처리된다.
		 이렇게 될 떄는 객체의 문자열이 같더라도 다른 참조변수를 활용하기에 다른 주소로 할당되어 주소값 비교는 false값이 된다.
		 */
		String name07 = new String("루니");
		String name08 = new String("루니");
		System.out.println(name07==name08); // false가 나타남
		
		/* 문자열 객체에 대한 비교는 원칙적으로 문자열 객체에서 지원하는 메서드(.equals)를 활용해서 처리해야 한다. 
		문자열변수.equals("문자열") */
		System.out.println(name07.equals(name08));
		// 문자열이 같을 때, true값이 출력된다.


	}

}
