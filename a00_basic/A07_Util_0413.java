package a00_basic;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class A07_Util_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greet="Hello";
		System.out.println(greet.replace('o','i'));
		// 문자열 바꿈 처리 replace
		
		System.out.println(greet.substring(1, 4)); 
		// substring(인덱스, 순서) : 부분출력. 인덱스번호 1~3을 출력하겠다.
		
		System.out.println(greet.length());
		// length() : 문자열 길이 출력
		
		
		/* Wrapper 클래스 
		primitive data의 객체화 여러 기능 처리를 할 수 있게 도와줌
		1) int -> Integer
			ex) Integer int01 = new Integer("25");
		
		2) double -> Double
			ex) Double dbl01 = new Double("27.5");
			
		3) char -> Character
			ex) Character c01 = new Character('c');  */
		
		Integer int01 = new Integer("25");
		Double dbl01 = new Double("27.5");
		Character c01 = new Character('c'); 
		System.out.println(int01.toString());
		System.out.println(dbl01.doubleValue());
		System.out.println(c01.toString());
		
		/* Random 클래스
		임의의 값을 나타냄
		nextInt(100) : 1부터 100까지 임의 정수값 출력
		
		import XXX : 특정한 기능 클래스가 기본적으로 지원되지 않을 때 활용.
		- class명 위에 선언 : import java.util.Random;
		 */
		Random ran = new Random();
		int num = ran.nextInt(100);
		System.out.println("1~100사이의 임의의 값: "+num);
		float f = ran.nextFloat();
		System.out.println("0.0부터 1.0까지 임의의 값: "+f);
		boolean b = ran.nextBoolean();
		System.out.println("true/false 임의의 값: "+b);
		
		/* SimpleDataFormat : 날짜를 원하는 형식으로 출력할때 활용된다.
		 SimpleDataFormat("yyyy년 MM월 dd일 hh:mm:ss a")
		 yyyy: 년도, 	MM: 월, 	dd: 일, 	HH: 시간, 	mm: 분, 	ss: 초, 	a: am/pm 처리
		 */
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
		
		String date = sdf.format( new Date() );
		System.out.println(date);
		
	}

}
