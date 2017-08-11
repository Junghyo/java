/* 
 # 숙제 - A16_0426
 자판기(인터페이스)
  - 추상메서드
  display(); @@@을 판매하는 자판기
  manu(); 1. @@: @@@원 2. @@: @@@원
  
  - 공통메서드
  insertCoin(입력값) @@@원이 투입되었습니다.
  choiceMenu(번호나 문자열)
  outProduct() @@@이 나옵니다. 잔액은 @@@입니다.

*/ 
package homework;

interface VandingMachine{
	String [] product={"커피", "쌍화차", "게토레이"};
	int [] price={1500,2000,1000};
	void display();
	void menu();
	default int insertCoin(int money){
		System.out.println(money+"원 투입되었습니다.");
		money++;
		return money;
	}
}
public class a04_homework_vendingMachine_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
