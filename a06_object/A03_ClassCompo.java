/*
 # 클래스의 구성 멤버
 public class Person{
  
  	//필드(전역변수)
  	int fieldName;
  	
  	//생성자(클래스명과 동일한 메서드)
  	Person(){}
  	
  	//메서드
  	void show(){}
 }
 
 1. 필드
 - 객체의 고유 데이터, 정보를 저장하는 영역
 - 선언형태는 변수와 비슷하지만 전역변수라는 의미로 field로 사용되고 있다.
 - 메서드나 생성자에서 선언되는 지역변수와 구분
 
 2. 생성자
 - new 연산자로 호출되는 클래스명과 동일한 이름을 가진 메서드.
   객체 생성할 때 1번만 호출 됨
 - 메서드와 달리 return값이 없음.
 
 3. 메서드
 - 객체의 동작(기능처리)를 하는 것을 말한다.
  
*/


package a06_object;


// 객체의 구성요소 
class Movie{
	
	// field : 객체의 전역변수로 모든 생성자와 메서드에 영향을 미칠 수 있다.
	String title;
	
	// 생성자 : 선언하지 않으면 기본 생성자가 포함되어 있다.
	// main() Moive m = new Movie();
	// public Movie(){}
	public Movie(){
		System.out.println("생성자 호출");
	}
	
// 생성자는 객체 생성시 한번만 호출하여 사용된다.
// 생성자는 입력값이 다르면, 여러 생성자를 선언하여 사용할 수 있다.
	public Movie(String name){
		title=name;		// 생성자로 들어오는 데이터를 전역변수에 할당
		System.out.println("입력값이 있는 생성자");
	}
/* 메서드
 - 메서드는 객체의 기능처리를 한다.
 - 1. 접근제어자 2. return값 type(없으면 void) 3. 메서드명 4. 입력값
 붙지않으면 default 	
*/
	void show(){
		System.out.println("제목은 "+title+"입니다.");
	}
}
public class A03_ClassCompo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m = new Movie();
		// 호출이 가능한 이유는 생성자를 구현하지 않으면 default 생성자가 내부적으로 구현되어 있기 때문이다.
		
		Movie m2 = new Movie("노잼 영화");
		Movie m3 = new Movie("꿀잼 영화");
		System.out.println("m2객체의 속성title값: "+m2.title);
		System.out.println("m3객체의 속성title값: "+m3.title);
		m2.show();
		m3.show();
	}

}
