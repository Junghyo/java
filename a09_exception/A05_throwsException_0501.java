/*
 # 예외 떠넘기기
 1) 동일한 예외 처리가 여러 클래스에 분산되어
    있어서 try~catch문을 여러 번 반복해야 할 때
    분산된 예외 처리를 최종적으로 호출되는 곳에서만
    처리하는 경우 각 분산된 메서드에서 예외 떠넘기기를 해서
    한번에 try~catch문으로 처리 할 수 있다.
 
 2) return타입 메소드() throws 예외클래스1, 예외클래스2{
   		- 예외가 발생할만한 코드(try catch를 한꺼번에 
   		  처리하기 위해 메서드명 옆에 throws로 떠넘기기 처리)
   }
*/ 
package a09_exception;
// 여러 분산된 클래스의 동일한 예외처리는 떠넘기기로 처리해서
//	호출하는 클래스나 main()에서 한꺼번에 처리할 수 있다.
class MakeClass01{
//	예외 발생을 떠넘기기1
//	메서드명 throws 예외넘기기	
	public static void findClass() throws ClassNotFoundException{
		Class cass = Class.forName("java.lang.String");
	}
}

class MakeClass02{
//	예외 발생을 떠넘기기2
//	메서드명 throws 예외넘기기	
	public static void findClass() throws ClassNotFoundException{
		Class cass = Class.forName("java.lang.String");
	}
}

public class A05_throwsException_0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MakeClass01.findClass();
			MakeClass02.findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		main()에서도 예외를 위임할 수 있지만 결국은 JVM이 최종적으로
//		예외를 처리하여야 하기 떄문에 main()에서 throws Exception을
//		붙이는 것은 좋지 못한 예외처리 방법이다.
//		개발자가 예외처리를 최종적으로 관리하려면 main()에서 위임하기보다
//		try~catch로 처리하는 것이 일반적이다.		
	}

}
