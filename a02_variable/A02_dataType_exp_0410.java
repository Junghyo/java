/*
 다음과 같은 정보들을 변수를 선언하고 아래 형식으로 출력하세요.
 - 하루 지출비용 list
 교통비 : @@@원
 식비 : @@@원
 다과비 : @@@원
 품목별 평균비용: @@@/3
 총비용: @@@원
 목표비용 초과 여부 : true/false(10000원 이하시)
*/

package a02_variable;

public class A02_dataType_exp_0410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("하루 지출비용 list");
		short transport = 30000;
		short food = 20000;
		short refresh = 10000;
		int total = transport+food+refresh;
		float avg = total/3.0F;
		System.out.println("교통비 : "+transport+"원");
		System.out.println("식비 : "+food+"원");
		System.out.println("다과비 : "+refresh+"원");
		System.out.println("품목별 평균비용 : "+avg+"원");
		System.out.println("총비용 : "+total+"원");
		boolean isOver=total>10000;
		if(isOver){
			System.out.println("초과");
		}else{
			System.out.println("미만");
		}
	}

}
