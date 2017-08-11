/*
 # 상속이란
 상속(Inheritance)
 개념 : 부모가 자식에게 물려주는 행위
 자바 : 클래스간 상속을 하면 자식클래스는 부모클래스의 멤버를 활용할 수 있다.(부모가 가진 멤버를 자식에게 물려줌)
 		부모클래스를 상위클래스(super)라고 부르고 자식클래스를 하위클래스, 파생클래스라고 한다.

   부모클래스    <---상속--- 자식클래스
 (필드1, 필드2)					상위필드와 메서드를 선언하지 않고도 사용 가능
 
 상속은 상위의 잘 개발된 멤버를 재사용하여 코드의 중복을 줄여준다. 개발시간 절약.
 단, 접근제어자 허용범위 안에서 사용가능.
 
 # 클래스 상속
 1) 부모 클래스를 선언하고 상속받을 크래스에 extends 키워드를 이용하여 상속을 받는다.
 2) 단, 기본 클래스는 단일 상속만 허용한다.
 class 부모클래스명{ 멤버..}
 class 자식클래스명 extends 부모클래스명{ 추가할 멤버... }
*/
package a07_inheritance;
// 부모 클래스
class Parent{
// 	부모 필드
	String name;
	int age;
	
//	메서드
	void setInfo(String name, int age){
		this.name=name;
		this.age=age;
	}
	void showInfo(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}

}

// 자식클래스 extends 부모클래스
class Child extends Parent{
//	추가 필드 할당
	String loc;
	void setInfo2(String name, int age, String loc){
		this.name=name;
		this.age=age;
		this.loc=loc;
		showInfo2();
	}
	void showInfo2(){
		showInfo();
		System.out.println("location: "+loc);
	}
	
}
public class a01_basic_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		c1.setInfo("Son", 3);
		c1.showInfo();
		Child c2 = new Child();
		c2.setInfo2("Daughter", 4, "New York");
	}
}


