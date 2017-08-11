/*
 # 열거 타입(enum)
 1. 데이터 중에서 몇가지 한정된 값을 처리하는 경우 사용되는 형태
 - 요일의 경우 월~일
 
 2. 선언
 	1) 파일지정. 지정할 enum이름.java 파일생성
 	2) public enum 열거타입이름{}
 	3) 상수선언
 		- public enum 열거타입이름{상수명1, 상수명2, 상수명3,....};
 	ex) public enum Week{Monday, Tuesday, Wednesday, Thursday,....., Sunday}	
 
 3. 활용 : enum객체 변수 = enum객체명.상수
 	- Week week01 = Week.Sunday;
 	
*/
package a05_reference;

public class A04_enum_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week week01 = Week.MONDAY;
		Week today = Week.MONDAY;
		System.out.println("enum데이터 동일여부 : "+(week01==today));
		System.out.println(week01.valueOf("MONDAY"));

		/*
		 # enum의 지원 메서드
		 - name() : 열거 객체의 문자열
		 - ordinal() : 열거 객체의 순번(0부터)
		 - values() : 모든 열거 객체들을 배열로 리턴
		 - compareTo() : 순번 차이를 가져옴
		 - valueOf(열거형문자) : 문자에 해당하는 열거객체.
		*/
		
		String name = today.name();
		System.out.println("name() 호출 : "+name);
		// name() : 해당 문자열을 가져온다
		
		today = Week.SUNDAY;
		int ordinal = today.ordinal();
		System.out.println("ordinal() 호출 : "+ordinal);
		// ordinal() : index값을 가져온다. enum(Week)에 선언한 순서대로 가져온다.
		
		System.out.println("valueOf : "+Week.valueOf("SATURDAY"));
		Week tomorrow = Week.valueOf("TUESDAY");
		System.out.println("valueOf : "+tomorrow.name());
		// valueOf("문자열로 지정한 값")
		
		Week[] days = Week.values();
		for(Week day : days){
			System.out.println(day);
		}
		// value() : 열거 타임의 모든 데이터를 배열객체로 가져옴
		
	}

}

/*
 # 확인 및 정리
 1. 참조 타입에 대한 설명 중 틀린 것은?
 	1) 참조 타입은 배열, 열거, 클래스, 인터페이스가 있다.
 	2) 참조 타입 변수의 메모리 생성 위치는 스택이다.
 	3) 참조 타입에서 ==, != 연산자는 객체 번지를 비교한다.
 	4) 참조 타입은 null값으로 초기화할 수 없다.
 
 2. String 타입에 대한 설명으로 틀린 것은 무엇인가?
  	1) String은 클래스이므로 참조 타입이다.
  	2) String은 타입의 문자열 비교는 ==를 사용해야 한다.
  	3) 동일한 문자열 리터럴을 저장하는 변수는 동일한 String객체를 참조한다.
  	4) new String("문자열")은 문자열이 동일하더라도 다른 String 객체를 생성한다.
  	
 3. 주어진 배열을 for문을 이용해서 최대값을 산출하는 프로그램을 만들어 보세요
 	int max=0;
 	int[] dataList={1, 7, 3, 10, 6, 9};
 	for문 처리
 	System.out.println("최대값:"+max);
*/ 
