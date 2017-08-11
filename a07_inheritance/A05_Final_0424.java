/*
 # 상속에서 final
 1. 클래스명 앞에 final
 	1) 상속할 수 없는 클래스 선언
 	2) public final class 클래스명{}
 		- 하위 클래스에서 상속을 할 수 없게 처리
 2. 메서드명 앞에 final
 	1) overriding할 수 없는 메서드 선언
 		- 하위 클래스에서 상위 클래스의 메서드를 재정의 할 수 없게 처리
 	2) public class 상위클래스{
 	   		public final void show(){}
 	   }
 	   public class 하위클래스 extends 상위클래스{
 	   		public void show(){} -- 불가
 	   }
 	
*/
/*
 # 접근제어자 protected
 public > protected > [default] > private
 전체    부분적 전체  패키지만    클래스내
 접근제어범위는 상속관계에 있는 멤버만 패키지 상관없이 접근 가능.
*/
package a07_inheritance;

class Animal{
	int speed;
	public void running(){
		speed+=5;
		System.out.println("뛰는 중 !");
		System.out.println("현재 속도: "+speed);
	}
//	하위클래스에서 재정의를 하지 못하게 처리	
	public final void stop(){
		speed=0;
		System.out.println("속도를 멈춤");
	}
}
class Tiger extends Animal{
	public void running(){
		speed+=20;
		super.running();
	}
//	상위클래스에서 final을 메서드에 부여했기 때문에 
// 	하위클래스에서 메서드를 재정의하지 못 한다.	
//	public void stop(){	}
}
class Rabbit extends Animal{
// Animal의 또 다른 자식클래스(Animal 상속)
}
class RabbitKind extends Rabbit{
// 자식클래스에서 또 상속이 가능하다(Rabiit 상속)	
}
final class Turtle extends Animal{}
/* 부모클래스명 앞에 final을 붙이면
하위 클래스에서 final이 붙은 부모클래스를 상속하지 못한다.
class TurtleKind extends Turtle{}
*/

public class A05_Final_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
