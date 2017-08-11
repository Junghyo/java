/*
 # 다중 catch
 1) 예외는 동시 다발적으로 여러 예외를 발생할 수 있지만
 	여러 예외를 하나의 try{}catch(예외1){}catch(예외2){}
 	구문으로 처리할 수 있다.
 2) 형식
 	try{
 		발생할만한 코드1
 		발생할만한 코드1(예외1의 경우)
 		발생할만한 코드1(예외2의 경우)
 		
 	}catch(예외1 - 최하위클래스){
 	
 	}catch(예외2 - 같은 레벨이면 예외클래스){
 	
 	}catch(예외3 - 상위레벨의 예외클래스){
 	
 	}catch(최상위 레벨 예외 클래스){
 	
 	}
 
 # finally
 예외가 발생하는 경우나 발생하지 않고 정상적으로 처리하는 경우,
 모두 다 처리할 프로세스나 프로그램이 있을 때는 try catch문 마지막 블럭으로
 finally{} 구문을 포함시킨다.	
 ex)
 	파일입출력 클래스 선언
  	try{
		참조 = 파일입출력 객체 생성
		예외
 	}catch(예외){
 	
 	}finally{
 		파일입출력 객체 자원해제 .close();
 	}
 	
*/

/*
 # 예외 클래스에서 활용되는 메서드
 catch(예외클래스 참조){
 	참조.메서드();
 }
 e.getMessage() : 예외를 가지고 있는 메시지를 문자열로 return
 e.printStackTrace() : 예외의 발생 경로를 추적내용을 출력
*/
package a09_exception;

public class A04_multiCatch_0427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayIndexOutOfBoundsException, NumberFormatException 	
//		두 예외가 함께 발생하는 예외 처리
		try{
			String data01 = args[0];
			System.out.println(data01.toString());
			int num01 = Integer.parseInt(data01);
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println(aie.getMessage());
			aie.printStackTrace();
			System.out.println("args의 해당 인덱스에 값이 입력되지 않았습니다.");
		}catch(NumberFormatException nfe){
//			에러관련메세지			
			System.out.println("메세지 : "+nfe.getMessage());
			System.out.println("정수형 문자열을 입력해야 합니다.");
//			에러 경로 추적			
			nfe.printStackTrace();
//		XXXXException의 상위 Exception 클래스					
		}catch(Exception e){
			System.out.println("기타 예외 발생");
		}finally{
			System.out.println("예외가 있거나 정상적으로 처리되도 진행하는 프로세스 내용");
		}

	}

}

