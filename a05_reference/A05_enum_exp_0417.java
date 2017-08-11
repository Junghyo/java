/*
 enum을 활용한 예제.
 현재 날짜 관련 객체: Calendar
 Calendar cal = Calendar.getInstance();
 Calendar.YEAR(연도), Calendar.MONTH(월0~11), Calendar.DAY_OF_MONTH(일), Calendar.DAY_OF_WEEK(요일1~7)
 
 ca.get(Calendar.DAY_OF_WEEK): 요일정보
 1~7 Week.SUNDAY~SATURDAY
 switch case문을 통해서 현재 날짜 정보 출력
 오늘 요일 관련된 정보로 일요일이면 등산을 가는 것으로 처리
*/		


package a05_reference;

import java.util.Calendar;

public class A05_enum_exp_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 오늘 요일 관련 enum 선언 */
		
		Week today=null;
		// 결정 되지 않은 Week enum
		Calendar cal = Calendar.getInstance();
		/* 오늘 날짜와 요일 관련 index값 가져오기
		Calendar.getInstance(); */
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// Calendar.DAY_OF_WEEK : 현재 요일에 관련된 정보(1~7 일~토)
		
		System.out.println("전체요일 갯수 : "+Calendar.DAY_OF_WEEK);
		System.out.println("오늘 요일 index값 : "+week);
		
		switch(week){
			case 1: today=Week.SUNDAY; break;
			case 2: today=Week.MONDAY; break;
			case 3: today=Week.TUESDAY; break;
			case 4: today=Week.WEDNESDAY; break;
			case 5: today=Week.THURSDAY; break;
			case 6: today=Week.FRIDAY; break;
			case 7: today=Week.SATURDAY; break;
		}
		System.out.println("오늘의 요일은? "+today);
		if(week==1){
			System.out.println("숨진듯이 잔다.");
		}else{
			System.out.println("기계처럼 공부한다.");
		}
		if(today==Week.SUNDAY){
			System.out.println("숨진듯이 잔다.");
		}else{
			System.out.println("기계처럼 공부한다.");
		}
	}

}
