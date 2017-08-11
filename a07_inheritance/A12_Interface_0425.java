/*
+ # 인터페이스
 1) 객체의 사용 방법을 정의한 type을 말한다.
 개발 코드 <--> 인터페이스	<--> 객체
 
 2) 개발 코드 측면에서 코드 변경 없이 실행
 내용과 리턴값을 다양화할 수 있는 장점을 가짐
 
 # 인터페이스 Story
 마징가제트	<---입력, 출력 interface ---> 날개1호 fly(), 날개2호 fly()
 
 - interface는 실제내용을 overriding할 수 있는 추상메서드만 구현하고 
   실제클래스들을 차후에 구현하게 하는 확장성을 강력하게 만들 수 있다. 
*/ 

package a07_inheritance;

class Mz01{
	Flyway f;
	void attack(){
		System.out.println("공격을 하면서 지구를 지키다.");
	}
	void setFlying(Flyway wing){
		this.f=wing;
	}
	void flyToTheSky(){
		System.out.print("마징가");
		if(f!=null){
			f.fly();
		}else{
			System.out.println(" 날개가 장착되지 않음.");
		}
	}

}

interface Flyway{
	void fly();
}

// 인터페이스를 상속 받은 실제클래스 정의
// 인터페이스는 implements를 통해서 상속 받는다.
// Flyway f01 = new Wing01();
// f01.fly();
class Wing01 implements Flyway{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(" 동네를 날라다녀버린다.");
		
	}
	
}
class Wing02 implements Flyway{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(" 우주를 날라다녀버린다.");
		
	}
	
}
public class A12_Interface_0425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mz01 m1 = new Mz01();
		Wing01 w1 = new Wing01();
//		날개가 장착되지 않음		
		m1.flyToTheSky();
//		날개 장착
//		void setFlying(Flyway wing){
//		Flyway wing = w01; Flyway wing = new Wing01();
		m1.setFlying(w1);
		m1.flyToTheSky();
		m1.setFlying(new Wing02());
		m1.flyToTheSky();

	}

}
