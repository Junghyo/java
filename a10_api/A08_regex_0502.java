/*
 # 정규 표현식
 1) Regular Expression(정규표현식) 
 	- 필요로 하는 문자열 형식을 지정해서 그 내용으로만
 	  데이터가 입력되는 것을 check하기 위해 만들어 놓은 것을
 	  졍규표현식이라고 한다.
 	  
 	- API : java.util.regex.Pattern 클래스를 찾아 참조
 	
 2) 주요 기호와 내용
 	- [] : 해당 한 개의 문자만 들어오게
 	ex) [abc] : a,b,c 중 하나의 문자
 		[^abc] : a,b,c 이외 하나의 문자
 		[a-zA-Z] : a~z, A~Z 중 하나의 문자
 		[0-9] : 0부터 9까지 하나의 문자
 		
 3)
 	\d : 한개의 숫자[0-9]와 동일
 	\s : 공백 처리 필요
 	\w : 한개의 알파벳 또는 한개의 숫자. [a-zA-Z 0-9]와 동일
 	? : 없음 또는 한개
 	* : 없음 또는 한개이상
 	+ : 한개 이상
 	{n} : 정확히 n개
 	{n.} : 최소한 n개
 	{n,m} :최소n개, 최대m개
 	() : 그룹핑
 	
 # 정규식 연습 예제
 1) 전화번호 : 02-223-2222, 0102433-4333
 - 02 또는 010이 나와야 한다.
   (02|010) - 포함

 - 숫자로 \d 3자린 내지 4자리{3,4}
 	\d{3,4} - 포함
 	
 - 숫자로 \d 4자리{4}
 
 - 전화번호에 대한 정규식 표현
	(02|010)-\d{3,4}-\d{4}
	
 2) 이메일 : white@naver.com
 - 한 개 이상의 알파벳 또는 숫자
 	\w+
 	
 - @
 
 - 한 개 이상의 알파벳 또는 숫자
 	\w+
 	
 - \. : \.은 문자의 점(.)이고 .범위가 모든 문자 중에 한개의 문자
 
 - 한개 이상의 알파벳 또는 숫자
 	\w+
 	
 # 정규식 처리 클래스
 1) java.util.regex.Pattern 클래스의 정적 메소드 matches() 활용
 	- boolan result = Pattern.matches("지정한 정규식", "검증된 문자열");
 		
 	
*/
package a10_api;

import java.util.regex.Pattern;

public class A08_regex_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		전화번호 정규식 pattern 정의
//		(01|010)-\d(3.4)-\d(4)		
		String regExp = "(01|010)-\\d{3,4}-\\d{4}";
		String data1 = "010-123-4578";
		String data2 = "070-123-4578";
		String data3 = "010-1234-45784";
		boolean ch01 = Pattern.matches(regExp,data1);
		boolean ch02 = Pattern.matches(regExp,data2);
		boolean ch03 = Pattern.matches(regExp,data3);
		System.out.println("data1의 정규표현식 성공여부: "+ch01);
		System.out.println("data2의 정규표현식 성공여부: "+ch02);
		System.out.println("data3의 정규표현식 성공여부: "+ch03);

	}

}
