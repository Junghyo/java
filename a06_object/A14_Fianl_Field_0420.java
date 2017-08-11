/*
 final : 최종이라는 의미로 필드 앞에 붙이면 데이털르 변경하지 못하게 하는 것을 말한다.
 초기값 할당 후, 데이터가 변경되지 못하게 처리된다.
 - final 타입 필드명 = 초기값;
*/
package a06_object;

class Man{
	static final double PI=3.1415920;
	final String nation = "korean";
	final String ssn;
	String name;
	Man(String ssn, String name){
		this.ssn=ssn;
		this.name=name;
	}
	void showInfo(){
		System.out.println("국적: "+nation);
		System.out.println("ssn: "+ssn);
		System.out.println("이름: "+name);
	}
}
public class A14_Fianl_Field_0420 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m1 = new Man("990412-1234255", "호날두");
		m1.showInfo();
		m1.name="메시";
//		m1.ssn="880412-1234521";  final이기에 필드의 데이터 변경 불가
//		final만 붙으면 객체단위 변경은 불가능
//		참조객체가 달라지면 다른 데이터를 할당할 수 있다.
		Man m2 = new Man("660222-1234512","루니");
		m2.showInfo();
//		객체 상관없이 변경할 수 없는 상수는 어떻게?
// 		static final이 붙으면 객체에 종속되지 않는 상수를 설정할 수 있다.
		System.out.println("파이값: "+Man.PI);
//		Man.PI=2.2221; 	할당 불가.		

	}

}

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
