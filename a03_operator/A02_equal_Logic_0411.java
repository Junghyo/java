/*
 # 비교 연산자
 1) 비교연산 : 두 개의 값의 크기를 비교하는 연산자로 데이터형은 boolean으로 저장된다.
 
 2) a==b, a>b, a<b, a>=b, a<=b, a!=b
 - 주로 if(비교연산), while(비교연산), for(초기:비교연산:증감)에서 활용된다
 ex) if(point>=80),  while(breakChar !='S')
 ps) 문자열은 equals를 메서드로 활용  - if( inputID.equals("himan") )
 
 3) 논리연산자 : boolean(true/false)을 이용하여 논리곱(&& - and), 노리합(|| - or), 
 				 배타적 논리합(^-xor), 논리부정(!)로 연산을 수행한다.
 - if(point >= 80 && point < 90)	두 조건 전부 만족(80~90)			 
 - if(point < 0 || point > 100)		두 조건 중 하나만 만족
*/ 		
package a03_operator;

public class A02_equal_Logic_0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int point = 75;
		int passTarget = 60;
		System.out.println(point + "=="+passTarget+"?"+(point==passTarget));
		System.out.println(point + ">"+passTarget+"?"+(point>passTarget));
		System.out.println(point + "<"+passTarget+"?"+(point<passTarget));
		System.out.println(point + ">="+passTarget+"?"+(point>=passTarget));
		System.out.println(point + "<="+passTarget+"?"+(point<=passTarget));
		System.out.println(point + "!="+passTarget+"?"+(point!=passTarget));
		// 논리 연산자
		// &&(and) : 두가지 논리조건을 모두 만족할 경우 true
		// ||(or)  : 두가지 논리조건 중 하나만 만족해도 true
		int getPoint = 85;
		System.out.println( "획득한 점수가 80이상 90미만 "+( (getPoint >= 80) && (getPoint < 90) ) );
		System.out.println( "점수가 유효하지 않을 조건(0 미만, 100 초과)? "+( (getPoint < 0) || (getPoint > 100) ) );

	}

}
