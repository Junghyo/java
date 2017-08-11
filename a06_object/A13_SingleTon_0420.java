/*
 # 싱글톤(Singleton)
 1) 프로그래밍에 있어서 하나의 객체만 활용할 때가 있다.
 
 2) 하나의 객체만 활용 : class code로 클래명을 지정하는 설계를 위한 것이다.
 - 실제 main에서 호출하는 여러 객체를 생성할 수 있게 프로그래밍이 되어 있다.
 
 3) 이것이 기본적인 객체생성 구조인데 일 사전에 하나만 생성되게 프로그래밍 또는
 	설계한 클래스에서 생성된 것을 싱글톤 객체라고 한다.
 	
 # 싱글톤 구조
 1) public class 클래스명{
 		- 정적 필드 생성	**** 클래스명.XXX --- 불가
 		private static 클래스 참조변수 = new 클래스();
 		- 생성자	**** main() 클래스 ob = new 클래스() --- 불가
 		private 클래스(){}
 		- 선언 클래스에서 단일 객체만 생성되게 하는 목적
 		- 유일하게 객체를 접근해서 return;
 		- 정적 메서드를 선언
 		static 클래스 getInstance(){
 			return 참조변수;
 		}
 	}	
 
 private : 외부 객체에서 접근하지 못하게 하는 제어자
 
 2) main()이나 다른 클래스에서 호출
 	- 클래스 참조변수1 = 클래스.getInstance();
*/
package a06_object;

class SingleWoman{
	private int num;
// 	싱글톤을 하기위해 필드로 객체 생성
	private static SingleWoman girl = new SingleWoman();
	
// 	외부에서 객체생성을 차단 : private 붙음
//  public SingleWoman(){} : private을 선언하지 않으면 자동으로 public이 붙음	
	private SingleWoman(){	
	}
//  static으로 싱글톤 객체를 접근하게 처리
	static SingleWoman getInstance(){
		return girl;
	}
	public int getCount() {
		// TODO Auto-generated method stub
		num++;
		return num;
	}
}
public class A13_SingleTon_0420 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingleWoman w1 = new SingleWoman();   에러발생. 생성자 접근 불가. private이기에
		SingleWoman woman1 = SingleWoman.getInstance();
		SingleWoman woman2 = SingleWoman.getInstance();
		SingleWoman woman3 = SingleWoman.getInstance();
// 		woman1, woman2는 같은 heap영역에 객체를 바라보고 있는 것
		if( woman1 == woman2){
			System.out.println("w1,w2는 같은 객체");
		}else{
			System.out.println("w1,w2는 다른 객체");
		}
		System.out.println(woman1.getCount());
		System.out.println(woman2.getCount());
		System.out.println(woman3.getCount());

	}

}
