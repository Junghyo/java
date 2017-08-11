/*
 # 접근제어자(Access Modifier)
 1) Main() 메서드를 가지지 않는 클래스는 외부 클래스를 사용할 목적으로 설계된 라이버러리 클래스이다.
    이런 클래스는 상호간의 필드, 생성자, 메소드에 대한 적절한 접근제어가 필요하다.
    아래 내용은 접근제어자를 통해서 처리가 가능하다.
    - 특정한 필드는 클래스 내에서만 사용되어야 하고
    - 특정한 메서드는 같은 package에서만 사용되어야 한다.
    - 특정한 메서드는 모든 클래스에서 사용 가능해야 한다.
 
 2) 접근제어자들
 
  [접근제어자]				    [적용대상]							[접근범위]
     public				클래스, 필드, 생성자, 메소드			  모두 접근 가능
   protected				필드, 생성자, 메소드				       상속
 default(입력X)			클래스, 필드, 생성자, 메소드			  같은 패키지끼리
 	private					필드, 생성자, 메소드				클래스 내에서만 사용
 
 # 접근제어자 선언	
 1) 클래스 명에 선언
 public class Person{}
 
 2) 메서드에 선언
 protected void show(){}
 
 3) 생성자에 선언
 public Person(){}
 
 4) 필드에 활용
 private String name;
 
 # 클래스 선언 접근 제어자
 1. 클래스를 선언할 때 접근 제어자가 영향을 미치는 범위를 설정
 	1) [public] class 클래스명{}
 	2) main(), 외부 클래스에서 접근 범위로 영향
 		- public일 때는 어떤 클래스이든지 선언가능
 			public class Person{}
 			main() : Person p; 외부패키지에서 선언이 가능
 			class Woman{}
 			main() : Woman p; 패키지내에서만 선언 가능
*/


package a06_object;

public class A17_AccessModifier_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
