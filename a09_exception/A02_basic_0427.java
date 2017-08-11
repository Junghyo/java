/*
 # 예외처리 코드
 try{
 	1. 예외가 발생할만한 코드
 	2. 예외가 발생할만한 코드 <--- 여기서 예외발생시, catch 쪽에 정의된 예외클래스로 던짐
 	ex) String name=null;
 		System.out.println(name.length());
 		NullpointException 발생. 이 객체를 catch에 던짐.
 	3. 예외가 발생할만한 코드 <--- 2번 코드(상위라인)에서 예외발생하면 3, 4번은 실행되지 않음
 	4. 예외가 발생할만한 코드
 }catch(예외클래스 참조){
 	NullpointException 이상의 상위클래스가 정의되어 있다.
 }
*/
package a09_exception;

public class A02_basic_0427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
//		예외가 발생할 가능성이 있는 코드			
			System.out.println("예외가 발생할만한 코드 1");
			System.out.println("예외가 발생할만한 코드 2");
			String name="홍길동";
			System.out.println(name.toString());
//			throw 예외 객체 NullPointerException()			
			System.out.println("예외가 발생할만한 코드 3");
			System.out.println("예외가 발생할만한 코드 4");
			System.out.println("예외가 발생할만한 코드 5");
			System.out.println("예외가 발생할만한 코드 6");
		}catch(NullPointerException e){
//		예외가 발생했을 때 처리할 코드
//		NullPointerException클래스 이상의 상위클래스 선언			
			System.out.println("예외 발생. ~~~게 처리한다.");
		}
		System.out.println("프로그램 수행 종료.");

	}

}

