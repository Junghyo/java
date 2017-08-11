/*
 # 증가와 대입연산자
 1) 증감연산자
 - 프로그램 작성시 특정한 연산자를 통해서 증가하거나 감소시키는 연산자(1씩 증가 감소)
 - 주로 반목문에서 데이터 증감이 필요할 때 많이 활용된다.
 ex) ++num, num++, --num, num--
 	 for(int num=0; num<=15; num++) loop문에 활용
 
 2) 대입연산자
 - 변수에 새로운 데이터 값을 할당 처리하는 것을 말한다.
 - 변수 = 할당한 데이터;(오른쪽에서 왼쪽 프로세스 흘러감)
 
  # 3항 연산자
 1) 3개의 피연산자를 통하여 결과값을 바로 처리하는 연산 형태를 말한다.
 - 조건식(boolean) ? 조건이 true일 때 값 : false일 때 값
   [ 피연산자 1 ]	  [ 피연산자 2 ] 	    [ 피연산자 3 ]
 
 ex) 나이가 65 이상일 때 "경로우대", 그 외일 때 "일반"
 int age=67;
 System.out.println( "경로우대여부:" +(age>=65) ? "경로우대":"일반" );
 */
package a03_operator;

public class A03_restore_change_0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감 연산자.
		int no=1;
		System.out.println("no(번호) 증가 : "+(no++));
		System.out.println("no(번호) 증가 : "+(no++));
		System.out.println("no(번호) 증가 : "+(no++));
		System.out.println("no(번호) 증가 : "+(no++));
		System.out.println("no(번호) 증가 : "+(no++));
		System.out.println("no(번호) 감소 : "+(--no));
		System.out.println("no(번호) 감소 : "+(--no));
		System.out.println("no(번호) 감소 : "+(--no));
		System.out.println("no(번호) 감소 : "+(--no));
		System.out.println("no(번호) 감소 : "+(--no));
		// 대입 연산자 : 변수에 새로운 값을 저장하는 경우에 사용되는 연산자
		int initSaveMoney = 10;
		// 재귀적 대입연산 : 해당 변수에 덧붙여 데이터를 할당하는 것을 말한다.
		// 변수 += 덧붙여 할당할 데이터, 변수-=데이터;
		System.out.println("저축 매월 10만원");
		int monthCnt = 1;
		System.out.println( "현재 금액 : "+initSaveMoney+"만원");
		System.out.println( (monthCnt++)+"번째 달의 총 저축금액 : "+(initSaveMoney+=10)+"만원");
		System.out.println( (monthCnt++)+"번째 달의 총 저축금액 : "+(initSaveMoney+=10)+"만원");
		System.out.println( (monthCnt++)+"번째 달의 총 저축금액 : "+(initSaveMoney+=10)+"만원");
		System.out.println( (monthCnt++)+"번째 달의 총 저축금액 : "+(initSaveMoney+=10)+"만원");
		
		// 3항 연산자 : 조건식 ? true 처리값 : false 처리값
		int age=67;
		System.out.println("경로우대 여부 : "+( ( age>=65 ) ? "경로우대" : "일반" ));
		

		
	}

}
