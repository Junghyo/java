/*
 # 다른 생성자 호출 처리
 
 호출예제
 class Person{
 	String name;
 	int age;
 	Person(String name){
 		this.name=name;
 	}
 	Person(String name, int age){
 		this(name);						--	this(매개변수1)	 Person(String name)호출
 		this.age=age;
 	}	
 }
 
 ...main(){
 		Person p1 = new Person("홍길동", 25);
 }
 여러 생성자를 통해서 생성자 재활용을 할 수 있다.
 파라미터 = 매개변수	
*/
package a06_object;

class Car{
	//field 선언
	String model;
	String color;
	int maxSpeed;

/* this 키워드는 field명과 지역변수가 동일할 때
 구분해주는 역할을 할 뿐만 아니라 선언되어 있는 
 생성자를 재활용할 때도 활용된다.
 ps) super. : 상속이 일어날 경우 동일한 역할로 상위 클래스의 field명, 생성자, 메서드를 호출할 때, 
 			  현재클래스와 구분하기 위하여 활용된다.
*/
	Car(String model){		//String model <--- 파라미터(매개변수)
		// this.field명 : 로컬변수와 field명이 동일할 경우 구분하기 위하여 사용
		// 중복코드가 발생하는 것을 막기위해 기존에 구현된 생성자를 활용
		this(model, "은색", 250);
		//this.model=model;
		// color="은색";
		// maxSpeed=250;
	}
	
	Car(String model, String color){
		this(model, color, 250);
		//this.model=model;
		//this.color=color;
		//maxSpeed=250;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void show(){
		System.out.println("차종 : "+model+"\n색상 : "+color+"\n최고속도 : "+maxSpeed);
	}
}
public class A06_Constructor_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("포르쉐");
		Car c2 = new Car("BMW","흰색");
		Car c3 = new Car("재규어","블루메탈",280);
		c1.show();
		c2.show();
		c3.show();
	}
}
/* 확인예제.
 1) class명 지정(좋아하는 연예인)
 2) field명 : 이름, 성별, 분야
 3) 생성자(),생성자(1),생성자(2),생성자(3)
 4) main메서드에서 객체생성 4개
 5) == 내가 좋아하는 연예인 ==
 
*/
