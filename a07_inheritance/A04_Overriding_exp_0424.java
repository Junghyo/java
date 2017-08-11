/*
 확인예제
 <Worker>
 kind : 직업종류
 생성자 : 필드 초기화
 메서드 : working()  -> @@@가 일을 한다.
 
 <Engineer>
 생성자 : 필드 초기화
 메서드: working() -> @@가 프로그램을 개발한다.
 
 <PoliceMan>
 생성자 : 필드 초기화
 메서드 : working() -> @@가 도둑을 잡는다.
 
*/
package a07_inheritance;

class Worker{
	String kind;
	Worker(String kind){
		this.kind=kind;
	}
	void ing(){
		System.out.println(kind+"가 일을 한다.");
	}
}
class Engineer extends Worker{

	Engineer() {
		super("개발자");
		// TODO Auto-generated constructor stub
	}
	void ing(){
		System.out.println(kind+"가 프로그램을 개발한다.");
	}
	
}

class Police extends Worker{
	Police(){
		super("경찰관");
	}
	void ing(){
		System.out.println(kind+"이 도둑을 잡는다.");
	}
}

public class A04_Overriding_exp_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1 = new Worker("노예");
		Worker w2 = new Worker("호날두");
		w1.ing();
		Engineer e1 = new Engineer();
		e1.ing();
		Police p1 = new Police();
		p1.ing();
		w2.ing();

	}

}

