/*
 Scanner 클래스
  - 콘솔로부터 문자열을 읽을 수 있음
  - java.util.Scanner
  - 입력 : Scanner scan = new Scanner(System.in);
  - 메서드
  		1) nextXXX() : 메서드를 통해서 해당 데이터 type에 맞게 처리
  		2) nextInt() : int값으로 읽는다.
  		3) nextDouble() : double값으로 읽는다 
  		4) nextLine() : 문자열값을 읽는다.
*/
package a13_stream;

import java.util.Scanner;

public class A09_Scanner_0517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner 클래스는 생성자에 System.in을 통해서 입력 처리한다.		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scan.nextLine();
		System.out.println("입력한 이름: "+name);
		System.out.println("점수를 입력하세요");
		int point = scan.nextInt();
		System.out.println("획득한 점수: "+point);
		System.out.println("몸무게를 입력하세요");
		double weight = scan.nextDouble();
		System.out.println("입력한 몸무게: "+weight);		


	}

}
