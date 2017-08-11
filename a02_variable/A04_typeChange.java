/*
 # TYPE 전환
 1) 데이터 타입을 다른 데이터 형태로 변환하는 것을 말한다.
 byte, short, char, int, float <-> 문자형
 
 2) 자동 타입변환
 - 큰데이터 타입 = 작은데이터
 ex) short num01 = 5;
 	 int num02 = num01;
 - 큰데이터type 변수명 = 작은 데이터; promote
 
 3) 강제 타입변환(축소 변환 - 데이터 손실 있음)
 - 작은데이터 type 변수 = (작은dataType)큰데이터;
 ex) double num01 = 25.7;
 	 int num02 = (int)num01;
 - ?��?��?�� ?��?�� �??��?��. casting 처리(?��???��?��?��)
   ?��???��?��?�� type �??�� = (?��??dataType)?��?��?��?��;

4) 상수
  – 초기에 데이터를 할당하면 변경되지 않는 것을 말한다.
  – final 데이터type 상수명(대문자) = 초기값할당
ex) final int CODE_VAL = 25;
    CODE_VAL=27; 다른 데이터할당 시, 에러발생
 
 5) 리터럴(literal)
 – 소스코드내에서 직접 입력되는 값을 말한다.
 – 데이터type 변수(상수)명 = 데이터(리터럴);
 ex) int age =27; 	-- 27을 정수리터럴이라고 함.
 – 상수과 같은 개념으로 활용되지만, 상수는 할당되면 변경되지 않는 것이기에
   구분하여 리터럴 개념을 활용된다.
*/
package a02_variable;

public class A04_typeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight = 67;
		double weightDbl = weight;
		// 1. 자동 type  변환 : 작은데이터type ==> 큰데이터type
		System.out.println("몸무게는(int)? "+weightDbl);
		System.out.println("몸무게는(double로 변환)? "+weightDbl);
		
		// 2. 강제 type 변환 : 큰데이터type  => 작은 데이터 type
		// 1) short + short 연산을 하는 순간 데이터type은 int로 변환
		short num01 = 27;
		short num02 = 25;
		// short sum = num01+num02;		<-- 에러 발생. casting 처리
		short sum = (short)(num01+num02);
		// 2) 실수형을 정수형 데이터 type으로 할당할 때, 정수형으로 casting
		double height = 175.4;
		// int heightInt = height;	에러 발생. casting 처리
		int heightInt = (int)height;
		// 3. 문자형 type -> 숫자
		// 1) 정수형문자를 -> 정수로 변환할 때, Integer.parseInt("정수형문자");
		int inputInt = Integer.parseInt("26");
		System.out.println( "?��?��?�� ?��?��?��?��?��?��?�� ?��?��"+(inputInt+10) );
		// // 전환하지 않으면 연산 결과 "2610"
		// 2) 실수형문자를 ==> 실수로 변활할 때, Double.parseDouble("실수형문자");
		double inputDbl = Double.parseDouble("3.14");
		System.out.println("?��?��?�� ?��?��?��?��?��?��?�� +12.5 : "+(inputDbl+12.5));
		// final 데이터type 상수명(대문자) = 초기값할당.
		final int CODE_VAL = 25;
		// CODE_VAL = 27;  다른 데이터할당 시, 에러발생
		System.out.println(CODE_VAL);
		int age = 27; //  27을 정수리터럴이라고 함.
		System.out.println(age);
		String name="하이맨"; // "하이맨" 문자열리터럴
		System.out.println(name);
		// 상수과 같은 개념으로 활용되지만, 상수는 할당되면 변경되지 않는 것이기에 구분하여 리터럴 개념을 활용된다.
		String num = "25";
		// 문자형 데이터 25
		System.out.println(num+10);
		// 2510출력
		int numInt = Integer.parseInt(num);
		// 문자형을 숫자형(정수)으로 변환
		System.out.println(numInt+10);
		// 35 출력
		Double numDouble = Double.parseDouble(num);
		// 문자형을 숫자형(실수)으로 변환
		System.out.println(numDouble+10);
		// 35.0 출력

/*
 확인예제.
 1. 변수 이름으로 사용 가능 것을 선택하세요
 ?? modelName, class, 6hour, $value, _age, int
 
 2. 기본 data type(primitive data)을 8개를 적어보세요.
 크기type	1byte	2byte	4byte	8byte
  정수
  실수
  논리
 
 3. 다음 코드에서 타입, 변수이름, 리터럴에 해당하는 것을 적어보세요
 age = 10;
 double price=3.14;
 
 -> 타입: 숫자형 int(정수), double(실수)
    변수이름 : age, price
    리터럴: 10, 3.14
 
 4. 자동 타입 변환에 대한 내용으로 컴파일 에러가 발생하는 것은?
 byte byteValue = 10;
 char charValue = 'A';
 
 1) int intValue = byteValue;
 2) int intValue = charValue;
 3) short shortVlue = charValue;
 4) double doubleValue = byteValue;
*/	



		


	}

}
