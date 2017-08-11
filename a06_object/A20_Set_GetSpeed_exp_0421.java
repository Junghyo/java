/*
 확인예제.
 퀵보드 타고
 KickBoard(객체명)
 필드 : rider, curVelocity
 생성자 :  사람이름 설정
 메서드: speedUp(), speedDown()
 @@@가 퀵보드를 타서 속도를 올립니다. 제한속도
 속도를 내립니다. 멈취있네요0
*/
package a06_object;

class KickBoard{
	String rider;
	private int curVelocity;
	public KickBoard(String rider) {
		this.rider = rider;
	}
	public String getRider() {
		return rider;
	}
	public void setRider(String rider) {
		this.rider = rider;
	}
	public int getCurVelocity() {
		return curVelocity;
	}
	public void setCurVelocity(int curVelocity) {
		this.curVelocity = curVelocity;
	}
	void SpeedUp(){
		curVelocity+=5;
		if(curVelocity<30){
			System.out.println(rider+" SPEED +5 UP");
		}else if(curVelocity>=30){
			curVelocity=30;
			System.out.println("YOU CAN'T SPEED UP! SPEED LIMITED 30");
		}
		System.out.println("CURRENT SPEED : "+curVelocity);
	}
	void SpeedDown(){
		curVelocity-=5;
		if(curVelocity>0){
			System.out.println(rider+" SPEED -5 DOWN");
		}else if(curVelocity<=0){
			curVelocity=0;
			System.out.println("YOU CAN'T SPEED DOWN!. SPEED IS 0");
		}
		System.out.println("CURRENT SPEED : "+curVelocity);
	}


	
}	
public class A20_Set_GetSpeed_exp_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KickBoard r1 = new KickBoard("Ronaldo");
		System.out.println(r1.rider+" is riding KickBoard");
		r1.SpeedUp();
		r1.SpeedUp();
		r1.SpeedUp();
		r1.SpeedUp();
		r1.SpeedUp();
		r1.SpeedUp();
		r1.SpeedUp();
		r1.setCurVelocity(20);
		System.out.println("UPDATE SPEED: " +r1.getCurVelocity());
		r1.SpeedUp();
		r1.SpeedDown();
		r1.SpeedDown();
		r1.SpeedDown();
		r1.SpeedDown();
		r1.SpeedDown();
		r1.SpeedDown();
		r1.SpeedDown();
	}

}
/*
 정리 및 확인하기
 1. 객체와 클래스에 대한 설명으로 틀린 것은?
 	1) 클래스는 객체를 생성하기 위한 설계도와 같은 것이다.
 	2) new 연산자로 클래스의 생성자를 호출함으로써 객체가 생성한다.
 	3) 하나의 클래스로 하나의 객체만 생성할 수 있다.
 	4) 객체는 클래스의 인스턴스다.
 
 2. 클래스의 구성 멤버가 아닌 것은 무엇인가?
 	1) 필드(filed)
 	2) 생성자(constructor)
 	3) 메소드(method)
 	4) 로컬 변수(local variable)
 
 3. 필드에 대한 설명으로 틀린 것은 무엇인가?
 	1) 필드는 메소드에서 사용할 수 있다.
 	2) 인스턴스 필드 초기화는 생성자에서 할 수 있다.
 	3) 필드는 반드시 생성자 선언 전에 선언되어야 한다.
 	4) 필드는 초기값을 주지 않더라도 기본값으로 자동 초기화된다.
 
 4. 메소드 오버로딩에 대한 설명으로 틀린 것은?
 	1) 동일한 이름의 메소드를 여러 개 선언하는 것을 말한다.
 	2) 반드시 리턴 타입이 달라야 한다.
 	3) 매개 변수의 타입, 수, 순서를 다르게 선언해야 한다.
 	4) 매개값의 타입 및 수에 따라 호출될 메소드가 선택된다.
 
 5. final필드와 상수(static final)에 대한 설명으로 틀린 것은?
 	1) final필드와 상수는 초기값이 저장되면 값을 변경할 수 없다.
 	2) final필드와 상수는 생성자에서 초기화될 수 있다.
 	3) 상수의 이름은 대문자로 작성하는 것이 관례이다.
 	4) 상수는 객체 생성없이 클래스를 통해 사용할 수 있다. 
 	
 6. 접근 제한에 대한 설명으로 틀린 것은 무엇입니까?
 	1) 접근 제한자는 클래스, 필드, 생성자, 메소드 사용을 제한한다.
 	2) public 접근 제한은 아무런 제한없이 해당 요소를 사용할 수 있게 한다.
 	3) default 접근 제한은 해당 클래스 내부에서만 사용을 허가한다.
 	4) 외부에서 접근하지 못하도록 하려면 private 접근 제한을 해야한다.
 
 7. 다음 클래스에서 해당 멤버가 필드, 생성자, 메소드 중 어떤 것인지 빈칸을 채우세요.
 public class Member{
 	private String name 			(			)
 	public Member(String name)		(			)
 	public void setName				(			)
 }	
 
 8. 은행 계좌 객체인 Account 객체는 잔고필드를 가지고 있다. 잔고는 음수값이 될수없고
 최대 백만원까지 저장 가능. 외부에서 잔고필드를 맘대로 변경 못하게 하고
 0<=balance<=10000000 범위의 값만 가질 수 있도록 Account클래스를 작성하라.
 -setXXX와 getXXX이용
 -0과 1000000은 MIN_BALANCE, MAX_BALANCE 상수를 선언해서 사용
 -sexXXX 매개값이 음수이거나 백만원 초과시 현재 BALANCE값 유지
*/
