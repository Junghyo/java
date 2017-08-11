/*
 # 가변 입력값
  메서드나 생성자를 통해서 같은 데이터 타입의
  입력값의 갯수가 정해지지 않고 여러 개로 입력될 수 있을 때
  가변인자로 등록할 수 있게 한다.
  
  형식 : [return Type] 메서드명(데이터type,....입력변수);
  	- 입력변수는 배열(입력변수.length)for문을 활용해서 입력값을
  	  받아들인다.
  	- 호출하는 곳( main(), 다른 클래스의 메서드..)
  	 	* 참조변수.가변인자메서드(데이터1);
  	 	* 참조변수.가변인자메서드(데이터1, 데이터2);
  	 	* 참조변수.가변인자메서드(데이터1, 데이터2, 데이터3);
*/
package a06_object;

class GoMountain{
//  String...names 가변 입력값 선언
//  호출하는 곳에서 여러개의 입력값을 
//	가변적으로 입력이 가능하도록 처리
	public void callName(String...names){
		// names는 배열
		for(String name:names){
			// 부른이름
			System.out.println(name+" 짱짱맨~~~");
		}
	}
}

public class A16_variableMethod_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoMountain m1 = new GoMountain();
		System.out.println("산에가서 널 부른다.");
		m1.callName("홍길동!");
		System.out.println("산에가서 널 부른다.");
		m1.callName("홍길동!", "호날두!");
		System.out.println("산에가서 널 부른다.");
		m1.callName("홍길동!", "메시!", "루니!", "네이마르!");

	}

}

