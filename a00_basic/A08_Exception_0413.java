/*
 java에서는 프로그래밍상 내/외부적 오류에 대한 처리를 하고 있다.
 일반적으로 데이터가 input, output이 일어나는 곳에는 반드시 예외처리를 해야 한다.
 형식 예외 가망성이 있는 code
 try{
 	형식 예외 가망성이 있는 code
 }catch(Exception e){
 	예외 발생시 처리할 내용
  
*/
package a00_basic;

public class A08_Exception_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("프로그램 START!");
			int num = 3/0;
			// 예외가 발생하면 하단의 내용을 수행하지 않고
			System.out.println("프로그램 END!");
		}catch(Exception e){
			// 예외가 발생하면 catch문(Exception)으로 Jump하여 처리가 됨.
			System.out.println("예외 발생!");
			System.out.println("예외내용 : "+e.getMessage());
		}finally{
			System.out.println("예외 상관 업이 처리될 내용!");
		}

	}

}
