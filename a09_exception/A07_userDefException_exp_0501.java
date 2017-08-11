/*
 확인예제.
 1) 사용예외 클래스 처리
 - XXXException	 ex)ShoppingException
   	super를 통해 예외내용을 입력하여 getMessage()가져올 수 있도록 처리
   
 2) 프로그램 throw XXXException  	
 - Market
    goShopping(쇼핑할 때 보유할 현금)
    buyProduct(쇼핑시, 물건을 구매후 지불금액)
    	- 보유할 현금과 지불금액을 비교해서 금액이 적을 때 사용자 정의 예외 클래스 호출
 
 3) Main에서 호출처리
*/
package a09_exception;

class UserException02 extends Exception{
	
	public UserException02() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserException02(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사용자 정의 클래스: "+super.toString();
	}
	
}

class Market{
	double haveMoney;
	double bringMoney;
	Market(double haveMoney){
		this.haveMoney = haveMoney;
	}
	void goShopping(double bringMoney) throws UserException02{
		this.bringMoney=bringMoney;
		if(haveMoney<bringMoney){
			throw new UserException02("잔고 부족 : "+(bringMoney-haveMoney)+"원 모자람");
		}
		System.out.println("잔고 : "+haveMoney+"원");
		System.out.println("들고간 금액: "+bringMoney+"원");
		haveMoney-=bringMoney;
		System.out.println("현재 잔고: "+haveMoney+"원");
	}
	void buyProduct(double payMoney) throws UserException02{
		if(this.bringMoney<payMoney){
			throw new UserException02("금액 부족 : "+(payMoney-bringMoney)+"원 모자람");
		}
		System.out.println("들고간 금액: "+bringMoney+"원");
		System.out.println("물건 가격: "+payMoney+"원");
		bringMoney-=payMoney;
		System.out.println("남아있는 금액: "+bringMoney+"원");
	}
}
public class A07_userDefException_exp_0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Market m1 = new Market(50000);
	
		try {
			m1.goShopping(20000);
			m1.buyProduct(10000);
			m1.buyProduct(10000);
			m1.buyProduct(10000);
		} catch (UserException02 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


