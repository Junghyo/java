/*
 # 데이터 타입
 1) 변수는 데이터 타입이 있고 타입에 따라서 저장할 수 있는 값의 종류와 크기가 정해진다.
 
 2) 기본타입(primitive data type)
 - 정수, 실수, 문자, 논리형을 직접 저장하는 타입
 - 정수(int - default) : int(4byte), byte(1byte), char(2byte), short(2byte), long(8byte)
 - 실수(double - default) : float(4byte), double(8byte)
 - 논리(true/false) : boolean(1byte)
 
 3) 이스케이프(escape) 문자
 - \n (새로운 라인), \t(탭 추가), \'(따옴표), \"(쌍따옴표), \\(역슬래시), \r(리턴가능), \b(백스페이스)
*/

package a02_variable;

public class A02_dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) 정수형 data type
		byte age=25;
		// byte(1byte) : 128 ~ 127
		// age = 129;	-- byte데이터 범위를 넘어서는 할당 불가
		// short, int, long, char
		char code=65;
		// char 2byte로 데이터 할당. 0~65535
		System.out.println("나이는 "+age);
		System.out.println("코드값 "+code);
		code='가';
		// char는 반드시 ''로 할당.
		System.out.println( code );		
		System.out.println( (int)code );
		
		// 2) 실수형 data type
		// float degree=25.2; 에러.
		float degree = 25.2F;
		// float 변수 = 데이터F;
		// float(4byte) : 부호화bit(1bit) + 지수(8bits) + 가수(23bits) = 32bits
		double height=175.2;
		// 실수형의 default값이기에 할당 가능
		// double(8byte) : 부호(1bit) + 지수(11bits) + 가수(52bits) = 64bits
		System.out.println("온도는 "+degree+"도");
		System.out.println("키는 "+height+"cm");
		
		// 3) 논리형 data type
		boolean isGo = true;
		// boolean 1byte(8bits) 표현. (true/false)
		if( isGo ){
			System.out.println(" 가자! ");
		}else{
			System.out.println(" 안가! ");
		}
	}

}
