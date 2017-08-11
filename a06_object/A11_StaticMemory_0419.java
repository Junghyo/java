/*
 # 정적 멤버와 static
 static : '고정된'이라는 뜻으로 객체생성과 상관없이 사용할 수 있는
 		  필드와 메서드에 활용된다.
 		  
 static.int com_money;		  
 객체명.static변수 		ex) Person.com_money;
 Person p1 = new Person();
 p1.money; 		-- p1의 고유속성 1000
 p1.com_money=3000;
 Person p2 = new Person();
 p2.money; 		-- p2의 고유속성 p1의 money와 상관없이 데이터를 할당
 
 선언형식
 class Person{
 	 static int com_money;
 }
 객체 생성(new Person)을 하지 않더라도 사용가능	 
*/
package a06_object;

// Person이 같은 package안에 선언되어 있어 class를 Person으로 선언하지 못함
class Person01{
	int money;
	// static멤버는 static type 필드명; 선언
	static int comm_money;
	String name;
	Person01(String name){
		this.name=name;
	}
	void nowMoney(){
		System.out.println(name+"님의 현재 자산: "+money);
		System.out.println("공용 자산: "+comm_money);
	}
}
public class A11_StaticMemory_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person01 p1 = new Person01("설현");
		Person01 p2 = new Person01("쯔위");
		Person01 p3 = new Person01("하니");
		p1.money+=1000;
		p1.money+=1000;
		p1.comm_money+=1000;
		p1.comm_money+=1000;
		p2.money+=1000;
		p2.money+=1000;
		p2.comm_money+=1000;
		p2.comm_money+=1000;
		p3.money+=1000;
		p3.money+=1000;
		p3.comm_money+=1000;
		p3.comm_money+=1000;
		p1.nowMoney();
		p2.nowMoney();
		p3.nowMoney();
		// static 변수는 객체 생성 상관없이 독립적으로 활용되는 정적 멤버이다.
	}
}
