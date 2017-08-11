/*
 # 사용자 정의 예외와 예외 발생
 1) 프로그램을 개발 시, 자바 표준 API에서 제공하는
    예외 클래스에서 더 추가적인 예외 클래스를 만들어야 할 때가 있다.
    이를 사용자 정의 예외 클래스라고 한다.
    정의 -> 예외 발생시 예외객체 던지기 -> 던져진 예외를 try~catch문에 의해 처리.
 
 2) class XXXException extends Exception{
 		- public XXXException(){}
 		- public XXXException(message){
 		  		super(message);
 		  }
 	}

 3) 예외 발생 : throw new Exception(); 식으로 명시를 하지 않더라도
 	내부적으로 발생하지만 사용자 정의 예외는 명시해야 한다.
 	- throw new XXXException();
 
 ex)
 	public void method() throws XXXException{
 		throws new XXXException();
 		-> 명시적으로 호출 처리
 	}
 	
 	- 호출하는 곳에서 예외처리(try~catch 처리)
 	try{
 		method();
 	}catch(XXXException e){
 		- 사용자 정의 예외 객체로 받아야 함.
 		- 예외가 발생할 시 처리할 내용
 	}
*/
package a09_exception;

//	1) 사용자 정의 예외 클래스 만들기
// class 클래스명Exception extends Exception
class UserException01 extends Exception{

	public UserException01() {
		super("기본 에러 메세지");
		// TODO Auto-generated constructor stub
	}

	public UserException01(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "사용자 정의 예외 메세지: "+super.getMessage();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사용자 정의 예외 클래스: "+super.toString();
	}
	
}
// 2) 예외 발생시 예외객체 던지기
class Account{
	private long balance;
	public Account(){
		
	}
	public long getBalance() {
		return balance;
	}
	// 입금
	public void deposit(int money) {
		balance+=money;
	}
	// 출금
	public void withdraw(int money) throws UserException01{
//		인출금액이 현재 잔고보다 많다면 사용자 정의 예외 발생		
		if(balance < money){
//			사용자 정의 예외 객체 생성은 강제적으로 throw(정의객체) 처리를 해야 한다.
// 			http://palpit.tistory.com/914 참고			
			throw new UserException01("잔고부족 : "+(money-balance)+"원 모자람");
		}
		balance-=money;
	}
		
	
}

public class A06_userDefException_0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		try {
			a1.deposit(100000);
			a1.deposit(100000);
			a1.withdraw(50000);
//			예외가 던져짐			
			a1.withdraw(200000);
		} catch (UserException01 e) {
			// TODO Auto-generated catch block
//			정의된 사용자 메서드 사용
//			getMessage()는 정의된 메세지를 호출하는데 생성자를 통해서 넘겨진
//			문자열을 가져온다.			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
//			e.printStackTrace();
		}

	}

}
/*
 # 예외 클래스 메시지 전송
 1) 예외가 발생했을 때
 - if나 강제적으로
 - throw new XXXException("넘겨지는 메세지"):
 - 정의된 곳에서 super( msg );

 2) Exception
  - message = 
 
*/

