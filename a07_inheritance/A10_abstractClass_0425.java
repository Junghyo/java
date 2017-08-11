/*
 # 추상클래스
 1) 추상 : 실제 간의 공통되는 특성을 추출하는 것을 말한다.
 	- 새, 곤충, 물고기 : 실제 -> 공통특성 -> 동물
 	- 삼성, 현대, LG -> 회사
 	
 2) 추상클래스란 실제 클래스의 공통적인 부분을 추출해서 만드는 것을 말한다.
 	실제클래스가 아니기에 객체 생성을 하지 못하는 것을 말한다.
 	
 3) 추상 클래스 구성 내용
 	- 공통메서드	ex) eat(){ 먹는 처리 } -> 동일
 	- 오버라이딩(재정의 할 메서드 선언); 
 	- move(){ 다양한 형태로 하위에서 처리 };
 		abstract void move();	<---- {}body부분이 없음
 		추상메서드
 	- 추상메서드가 하나라도 있는 클래스는 추상클래스
 
 4) 추상클래스를 통한 하위 객체 생성
 	- main()
 	- 추상클래스 객체변수 = new 실제객체();
*/
package a07_inheritance;

abstract class Animal01{
	String name;
	Animal01(String name){
		this.name=name;
	}
//	공통메서드
	public void eat(){
		System.out.println(name+"이 맛있게 먹다.");
	}
//	하위클래스에서 재정의할 메서드
//	추상메서드 앞에는 abstract modifier가 붙고
//  메서드의{}(body) 부분이 없다.
//	클래스 메서드  가운데 추상메서드(abstract)가 하나라도 있으면
//	추상클래스가 된다.(클래스도 abstract로 지정해주어야 함)	
	public abstract void move();
}

class Bird extends Animal01{
//	추상클래스를 상속받은 하위클래스는
//  반드시 추상메서드를 재정의 하여야 한다.
//	기능 메서드명의 통일성을 유지할 수 있다.	
	Bird(){
		super("새");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name+"가 하늘을 난다.");	
	}
	
}

class Insect extends Animal01{
	Insect(){
		super("곤충");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name+"이 땅을 기어다닌다.");
	}
	
}

class Fish extends Animal01{
	Fish(){
		super("물고기");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name+"가 물에서 헤엄친다.");
	}

}

public class A10_abstractClass_0425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal01[] a1 = {new Bird(), new Insect(), new Fish()};
		for(Animal01 kind : a1){
			kind.eat();
			kind.move();
		}
		Animal01 a2 = new Bird();
		a2.eat();
		a2.move();
	}

}
