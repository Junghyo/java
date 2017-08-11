/*
 # 외부 데이터 값 입력
 1) 실행
 - java 클래스명[]data01[]data02
 - data01, data02는 문자열 배열로 입력되어
 - main(String[] args)에서  		
*/
package a03_operator;

public class A04_argument_0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("과일 1 : "+args[0]);
		System.out.println("과일 1의 개수 : "+args[1]);
		System.out.println("과일 2 : "+args[2]);
		System.out.println("과일 2의 개수 : "+args[3]);		
		// 연산처리를 위해서 변경처리
		// Integer.parseInt("정수형문자열")
		String fruit01 = args[0];
		String fruit02 = args[2];
		int fruitCnt01 = Integer.parseInt(args[1]);
		int fruitCnt02 = Integer.parseInt(args[3]);
		System.out.println("과일 구매내역");
		System.out.println( fruit01+"\t"+fruitCnt01+"\t"+(fruitCnt01*3000) );
		System.out.println( fruit02+"\t"+fruitCnt02+"\t"+(fruitCnt02*4000) );
		
		

	}

}
