 /*
 # 변수란?
 1) Variable
 - 프로그램 작업을 처리하기 위해 하나의 값을 저장할 수 있는 메모리 공간을 말한다.
 - Java에서는 다양한 타입을 저장할 수 없고 한가지 타입만 값으로 저장 될 수 있다.
 ex) int num01 = "안녕하세요"; (X)
 	 int num02 = 25; (O)
 
 2) 식별자(Identifier)
 - 자바코드에서 변수, 클래스명, 메서드명으로 입력시킨 이름을 의미한다.
 ex) String name01="시빠빠";
 	 Class Hello{}
 	 public void setName(){}
 
 # 식별자 작성규칙
 1) 첫문자는 반드시 영문자. 단, _, $ 는 특수문자지만 사용가능.
 2) 대소문자를 구별하여 사용
 3) 길이제한 없고 공백문자는 사용할 수 없다.
 ex) userName, $number(O), #age(X), introName(O), intro Age(X)
 
 4) 예약어
 - 기본 데이터 type : boolean, byte, short, int, long, float, double
 - 접근제어자 : private, protected, public
 - 클래스관련내용 : class, abstract, interface, implements, extends
 - 객체 관련 내용 : new, instanceof, this, super, null
 
 # 변수사용
 1) 변수를 사용하는 것은 변수를 선언하고 값을 저장하는 것을 말한다.
 2) 변수 선언
 - 데이터type 식별자;
 ex) int age;  		-- 정수형 데이터로 age라는 식별자를 선언.
*/
package a02_variable;

public class A01_declare_allot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		// 자바에서 변수선언 : type 식별자
		age = 25;
		// 데이터 할당
		double weight = 65.7;
		// 선언+할당(저장)
		int after10Year=age+10;
		// 변수값 읽어서 새로운 데이터에 할당
		// age = 25.7;
		// 데이터 형태에 맞지 않는 할당. 정수형 type에 실수형의 데이터를 할당시 에러발생.
		// age = "나이25세";
		// 정수형 type에 문자형의 데이터를 할당시 에러발생.
		System.out.println("나이는 "+age+"살이며, ");
		System.out.println("몸무게는 "+weight+"kg입니다.");
		System.out.println("10년 후의 나이는 "+after10Year+"살입니다.");
	}	

}
