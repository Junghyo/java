package a07_inheritance;
/*
# Polymorphism(다형성)
1) 상속관계에서 부모타입에서 모든 지식 객체가 대입될 수 있다.
2) 상속관계 클래스 정의
	- class Father{}
	  class Son extends Father{}
	  class Daughter extends Father{}
3) main이나 다른 클래스에서 객체 생성시, 타입 대입 가능
	- Father f1 = new Son();
	- Father f2 = new Daughter();
	- 부모클래스 변수 = 자식클래스타입() : 자동 타입 변환
*/

/*
 Zerggling : 파충류
 
 Larva(초기) : 상위클래스
 attack() 정의
 상속받은  하위 객체
 Drone	attack() 재정의. 다른 공격방법
 Hydralisk	attack() 재정의. 다른 공격방법
 Mutalisk attack() 재정의. 다른 공격방법
 Larva L01 = new Drone();	L01.attack();
 Larva L02 = new Hydralisk();	L02.attack();
 Larva L03 = new Mutalisk();	L03.attack();
*/
class Larva{
	String unitKind;
	Larva(){
		unitKind="라바";
	}
	public Larva(String unitKind){
		this.unitKind=unitKind;
	}
	public void attack(){
		System.out.println(unitKind+"는 공격을 못한다");
	}
}
class Drone extends Larva{
	Drone(){
		super("드론");
	}
//	attack 재정의
	public void attack(){
		System.out.println(unitKind+"이 공격력 5로 공격한다.");
	}
}
class Zergling extends Larva{
	Zergling(){
		super("저글링");
	}
//	attack 재정의
	public void attack(){
		System.out.println(unitKind+"이 공격력 5로 빠르게 공격한다.");
	}
}
class Hydralisk extends Larva{
	Hydralisk(){
		super("히드라");
	}
//	attack 재정의
	public void attack(){
		System.out.println(unitKind+"가 공격력 10으로 공격한다.");
	}	
}
public class A07_star_world_polymor_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Larva l01 = new Larva();
		l01.attack();
		// 다형성이 일어나 부모타입에 모든 자식 객체 대입 가능
		Larva l02 = new Drone();
		l02.attack();
		Larva l03 = new Zergling();
		l03.attack();
		Larva l04 = new Hydralisk();
		l04.attack();

	}

}
/*
 # 다형성 확인예제
 <Vehicle>
 속성 : kind, maxSpeed, curSpeed
 메서드 : speedUp(),dirver() : 탈것이 어떻게 운행되는가
 <Bus>
 
*/