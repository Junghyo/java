/*
 # 강제타입변환(Casting)
 1) 상위type 참조변수 = 하위객체(); [promote]
 2) 하위type 참조변수 = (하위type)상위객체(); [casting]
 class Parent{}
 class Child extends Parent{}
 main()
 	- Parent p = new Child();
 	- Child c = p; <----- 캐스팅이 필요
 	--> Child c = (Child) p;
 	
 이렇게 하는 이유?
 class Parent{
 	void getInfo();
 }
 class Child extends Parent{
 	void childInfo();		<--- 자식클래스에서 추가적으로 구현
 } 
  main()
  Parent p = new Child();
  p.childInfo(); <------- 불가. 다형성에서 추가적인 메서드는 활용(X)
  Child c = (Child) p; <------- 캐스팅.
  c.childInfo(); <---- 하위객체의 특정 메서드를 활용(O)
*/

/*
 # 객체 타입 확인(instanceof)
 - 상속의 게층구조로 여러가지 하위객체들을 만들어 갈 수 있다.
   이 때, 특정한 객체에 해당상위 객체의 소속일 경우에만 다형성이나
   casting을 처리할 수 있다. 이런 구조에서 해당 객체의 상위클래스를 상속받은
   하위 클래스를 확인하려면 instanceof  
*/

package a07_inheritance;

class Parents{
	void getInfo(){
		System.out.println("부모클래스[공통메서드]");
	}
}

class Childs extends Parents{
	void childInfo(){
		System.out.println("자식클래스[추가메서드]");
	}
}

public class A09_TypeCasting_0425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		다형성 처리		
		Parents p1 = new Childs();
//		Parents p2 = new Parents();
//		상위에 있는 메서드 재정의는 하위에서 재정의 된 내용으로 활용이 가능		
		p1.getInfo();
//		p2.getInfo();		
//		다형성은 하위에서 추가되는 메서드는 처리하지 못한다.		
//		p1.childInfo();
// 		p2.childInfo();

// 		하위에 추가되는 멤버를 처리하고자 할 경우
		Childs c1 = (Childs) p1;
		c1.childInfo();
		((Childs) p1).childInfo();

//		# instanceof (객체타입확인)		
//		1. 참조관계에 있는 객체 여부
		Parents p2 = new Parents();
		System.out.println("p2는 Parents의 객체변수인가? "+(p2 instanceof Parents));	//true	
		System.out.println("p2는 Childs의 객체변수인가? "+(p2 instanceof Childs));		//false

//		2. 상속관계에 있는 상위/하위 객체를 확인하는 방법	
//		Parents p1 = new Childs(); 과 같이 다형성이 일어나면 p1은 Childs를 참조한다.		
		System.out.println("p1는 Childs의 객체변수인가? "+(p1 instanceof Childs));		//true
		System.out.println("p1는 Parents의 객체변수인가? "+(p1 instanceof Parents));	//false
		
		Childs c2 = new Childs();
		c2.getInfo();
		c2.childInfo();
//		불가
//		Childs c3 = new Parents();
//		Childs c3 = (Childs) new Parents();
//		c3.getInfo();
//		c3.childInfo();
	}
}



