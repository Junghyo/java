/*
 # Statement의 종류
 - 자바 소스코드로 활용되는 것을 statement(문)라고 하는데 문의 종류는 다음같이 분류할 수 있다.
	 
		 					순차문
		 		실행문					분기문(조건), 반복문
		 					제어문
 문(Stamement)
	 			
	 			비실행문	주석

 # 실행문
 ex) int num01=25; 	데이터type 변수명 = 할당데이터;
 
 # 조건문
  - if else
  ex) if( 조건 boolean ){
  		true일 경우 처리할 내용
  	  }else{
  	  	false일 경우 처리할 내용
  	  }
  
 */
package a04_statement;

public class A01_ifelse_04112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위 바위 보 출력. 0~2
		int gameIdx = (int)(Math.random()*3);
		// (int)casting
		if(gameIdx==0){
			System.out.println("가위");
		}else if(gameIdx==1){
			System.out.println("바위");
		}else{
			System.out.println("보");
		}
	}

}
