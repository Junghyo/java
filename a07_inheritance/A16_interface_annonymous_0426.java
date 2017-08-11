/*
 # 익명 구현 객체 만들기(Anonymous Class)
 1) 인터페이스를 implements한 클래스는 주로 재사용을 하기 위해 구현을 한다.
 	하지만 재사용이 아닌 일회성으로만 사용하는 경우가 있다.
 	이 때, 일회성으로 구현 객체를 만들기 위해 호출과 동시에 만드는 것을
 	익명 구현 객체라고 한다.
 
 2) 형식 : 인터페이스 변수 = new 인터페이스(){
 				- 인터페이스에 선언한 추상메서드와 실제메서드 선언
 		   }
 
 3) example(main(), 호출하는 클래스)
 	- interface RemoteController{,,,}
 	  RemoteController r1 = RemoteController(){
 			public void turnOn(){...};
 			public void turnOff(){...};
 	  }
 	  r1.turnOn();
 	

*/ 
package a07_inheritance;

public class A16_interface_annonymous_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc =new RemoteControl(){

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("핸드폰을 키다.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("핸드폰을 끄다.");
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				System.out.println("핸드폰 볼륨을 "+volume+"으로 조정하다.");
				
			}
			
		};
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}

}
/*
 # 숙제
 자판기(인터페이스)
  - 추상메서드
  display(); @@@을 판매하는 자판기
  manu(); 1. @@: @@@원 2. @@: @@@원
  
  - 공통메서드
  insertCoin(입력값) @@@원이 투입되었습니다.
  choiceMenu(번호나 문자열)
  outProduct() @@@이 나옵니다. 잔액은 @@@입니다.

*/ 

