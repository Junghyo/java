/*
 # String 메소드
 - charAt(index) : 특정 위치 문자 리턴
 - equals() : 문자열 비교
 - getBytes("인코딩") : byte[]로 리턴
 - indexOf(검색문자열) : 문자열이 있는 위치리턴
 - length() : 총 문자의 수
 - replace('변경할 대상 문자', '변경될 문자')
 - substring(시작 index, 마지막 index) : 특정문자열 범위를 추출
 - toLowerCase(), toUpperCase()
 - trim() : 앞뒤 공백을 제거
*/
package a10_api;

import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class A07_string_Method_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eng = "ABCDEFGHIJKLMN";
		String kr= "가나다라마바사";
		System.out.println("charAt(index): "+eng.charAt(5));
		System.out.println("charAt(index): "+kr.charAt(5));
		
//		.getBytes() : 문자열을 단위 byte[]로 변환. keycode하고 같다???
		for(byte bt : eng.getBytes()){
			System.out.println(bt+":"+(char)bt);
		}
		
		try {
			for(byte bt : kr.getBytes("utf-8")){
				System.out.println(bt+":"+(char)bt);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		.indexOf("찾는 문자열")
		System.out.println("indexOf(GHI): "+eng.indexOf("GHI"));
		System.out.println("indexOf(다라마): "+kr.indexOf("다라마"));

//		.length() : 문자열의 길이
		System.out.println("length(): "+eng.length());
		System.out.println("length(): "+kr.length());

//		replace : json --> 변경시, \, +, ''
		System.out.println("replace(): "+eng.replace("ABC","XYZ"));
		System.out.println("replace(): "+kr.replace("라마바","호날두"));
		
//		.substring() : 특정 문자열 추출
		System.out.println("substring(): "+eng.substring(3, 5));
		System.out.println("substring(): "+kr.substring(4, 7));
		
//		StringTokenizer
//		split("구분자") 문자열을 해당구분자로 구분해서 배열화 시킴
		String data="호날두&4번타자&에이스&짱짱맨";
		String names[]=data.split("&");
		for(String name:names){
			System.out.println(name);
		}
	
//		StringTokenizer(문자열, 구분자)
		StringTokenizer st = new StringTokenizer("레알/바르샤/뮌헨/첼시","/");
//		countTokens() : 구분자를 통해서 나타난 데이터 건수

//		nextToeken() : 구분자를 통해 나타난 각 데이터
		String data01="";
//		nextToken()에 의해 countTokens()도 변경되기에 초기에 미리 뽑아서 고정시킨다.		
		int totCnt = st.countTokens();		
		for(int cnt=1; cnt<=totCnt; cnt++){
			data01 = st.nextToken();
			System.out.println(cnt+". "+data01);
		}

/*		StringBuffer, StringBuilder 클래스
		자바에서 저장되는 String은 내부적으로 문자열을 수정할 수 없다.
		String data = "사과";
		data+=",바나나"; 메모리 2개 생성
		String 문자열을 loop문이나 +로 쓰면 메모리에 문제가 발생하기 때문에
		효과적으로 동적 문자열을 처리할 때 사용한다.
		
		쓰레드에 동기화 적용 여부에 따라 StringBuffer활용
		StringBuilder 단일 스레드 환경에만 사용되도록 설계
		append("추가문자열");
		toString() : 현재 추가된 문자열을 처리
*/
		StringBuffer sbf = new StringBuffer();
		for(int cnt=0; cnt<10; cnt++){
			sbf.append("문자추가");
		}
		System.out.println("현재 문자열: "+sbf.toString());
	}

}

