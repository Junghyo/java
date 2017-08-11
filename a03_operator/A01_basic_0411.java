/*
 # 연산
 1) 연산이란 프로그램에서 데이터를 처리하여 결과를 산출하는 것을 말하고 이런 연산에 사용되는 표시나 기호를 연산자(operator)라고 한다.
 2) 산술 연산자 : +, -, /, *, %	
  
 */	
package a03_operator;

public class A01_basic_0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num01=25;
		int num02=75;
		System.out.println(num01+" + "+num02+" = "+(num01+num02));
		System.out.println(num01+" + "+num02+" = "+parseInt(num01+num02));
		System.out.println(num01+" + "+num02+" = "+parseDouble(num01+num02));
		System.out.println(num01+" + "+num02+" = "+num01+num02);
		System.out.println(num01+" + "+num02+" = "+parseDouble(num01)+parseDouble(num02));
		System.out.println(num01+" + "+num02+" = "+parseInt(num01)+parseInt(num02));
		System.out.println(num01+" - "+num02+" = "+(num01-num02));
		System.out.println(num01+" * "+num02+" = "+(num01*num02));
		System.out.println(num01+" * "+num02+" = "+num01*num02);
		// 정수/정수 -> 정수값으로
		// 정수/실수 -> 연산하는 데이터 값중 하나가 실수값이어야 실수 처리가 됨. (실수형)으로 데이터를 cast하여 형변환으로 처리가 가능하다.
		System.out.println(num01+" / "+num02+" = "+(num01/num02));
		System.out.println(num01+" / "+num02+" = "+num01/num02);

		System.out.println(num01+" / "+num02+" = "+(num01/(double)num02));
		System.out.println(num01+" / "+num02+" = "+((double)num01/num02));
		
	}

	private static int parseDouble(int num01) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int parseInt(int num01) {
		// TODO Auto-generated method stub
		return 0;
	}

}
