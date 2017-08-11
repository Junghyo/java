/*
 확인예제.
 1) A05_FiledIntExp_0418.java main()클래스에서 선언
 
 2) BaseballTeam 객체 클래스 선언
 
 3) 필드 : 팀이름, 승, 무, 패, 승률
 	- 필드 팀이름만 초기값 설정 "팀이름 없음";
 	- 생성자를 통한 초기값 선언
 	- 필드에 입력값 처리
 
 4) 출력예제(객체 2개 생성)
 	- @@@팀, @@승, @@무, @@패, 승률 @@@
 	- 입력값이 없는 생성자를 통해 출력
 	- filed값을 처리한 생성자를 통해 초기 데이터 설정
 	- 출력처리
*/
package a06_object;
class BaseballTeam{
	String teamName="없음";
	int win;
	int lost;
	int draw;
	double winRate;
	BaseballTeam(String teamName, int win, int lost, int draw){
		this.teamName=teamName;
		this.win=win;
		this.lost=lost;
		this.draw=draw;
		this.winRate=(double)win/(win+lost+draw);
	}
	BaseballTeam(){
		System.out.println(teamName+"\t"+win+"승\t"+lost+"패\t"+draw+"무\t"+winRate+"승률");
	}
	void show(){
		System.out.println(teamName+"\t"+win+"승\t"+lost+"패\t"+draw+"무\t"+winRate+"승률");
	}
}

class Player{
	Player(){}
	Player(int age){}  // 입력값의 갯수가 다르면 선언이 가능하다.
	Player(int height, int age){}
	Player(String name){} // 입력값의 갯수가 같더라도 type이 다르면 선언이 가능
//	Person(int age, int height){} type이 같기 때문에.
	Player(String name, int age){}
	Player( int age, String name){} // 입력값의 type의 순서가 다르면 선언가능
	
}

public class A05_FiledIntExp_0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballTeam team00 = new BaseballTeam();
		BaseballTeam team01 = new BaseballTeam("LG", 8, 0, 6);
		BaseballTeam team02 = new BaseballTeam("두산", 6, 0, 8);
		team01.show();
		team02.show();
	}

}
/*
 # 생성자 오버로딩(overloading)
 1) 외부에서 입력되는 값이 다양하여 객체의 filed값을 여러 형태로 처리할 때, 
    여러 형태의 생성자를 선언할 수 있다. 자바에서 클래스명과 동일한 생성자를
    2가지 이상 선언할 수 있는데 이를 오버로딩이라고 한다.
  
 2) 생성자 선언규칙(이름이 동일하더라도)
 	
 	- 입력값의 갯수가 다르면 선언할 수 있다.
 	Person(){}, Person(int i){}, Person(int i, int j){}
 	
 	- 입력값의 갯수가 동일하더라도 다른 데이터 type으로 선언하면 가능하다
 	Person(int i){}, Person(String n){}
 	
 	- 입력값의 갯수가 동일하더라도 순서가 다른 데이터 type으로 선언하면 가능하다
 	Person(String name, int age){}
 	Person(int age, String name){}
 
*/
