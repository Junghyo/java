/*
 # breaK와 continue
 1. break
 -loop문, switch문에서 해당 block({})을 중단처리해서 빠져나오게끔 처리하는 것을 말한다.
 -더이상 해당 block에서 프로세스가 처리되지 않음
 while(){
	 if(조건)
	 break;	 
 }
 
 2. continue
 -loop문에서 조건에 의한 continue가 나타날 때 해당 프로세스가 다음 loop단위로 넘어가는 것을 말한다.
 -넘버 5인 경우는 출력하지 않고 다음 6번부터 다시 출력 처리
 for( int cnt=1; cnt<=10; cnt++){
	 if(cnt==5) continue;
	 System.out.println("넘버:"+cnt);
 }
 */
package a04_statement;

public class A09_break_continue_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break
		for(int cnt=1; cnt<=10; cnt++){
			System.out.println("곰돌이가 사과를 "+cnt+"개 먹었다.");
			if(cnt==5){
				System.out.println(cnt+"개 먹었으니까 그만 먹어");
				break;
				// 해당 프로세스 자체를 중단시키는 것
			}
		}
		// continue
		for(int cnt=1; cnt<=10; cnt++){
			if(cnt==6){
				System.out.println(cnt+"번째 떡은 공중분해");
				continue;
			}
			System.out.println("호랭이 "+cnt+"번째 떡을 먹다!");
		}
		// 2. for문을 이용하여 10~150까지 정수 중에 5의 배수의 총합을 구하는 코드를 작성하세요.
		int sum=0;
		for(int i=10; i<=150; i++){
			if(i%5==0){
				sum+=i;
				System.out.println("+"+i+"="+sum);
			}
		}
		// while문, Math.random()을 이용하여 주사위 숫자 두개가 나오게 하고 주사위 합이 5가 아니면 계속, 합이 5면 중단 처리되게 하세요.
		int dice01 = (int)Math.random()*6+1;
		int dice02 = (int)Math.random()*6+1;

	}

}
/* 확인예제
 1. 조건문과 반복문의 종류를 괄호 속에 넣어보세요.
 	1) 조건문: (	), (	) 	-- if, switch
 	2) 반복문: (	), (	), (	)	-- for, while, do while
 
 2. for문을 이용하여 10~150까지 정수 중에 5의 배수의 총합을 구하는 코드를 작성하세요.
 
 3. while문, Math.random()을 이용하여 주사위 숫자 두개가 나오게 하고 주사위 합이 5가 아니면 계속, 합이 5면 중단 처리되게 하세요.
 	1) 출력형식 : @@@, @@@ 합 @@@
 
 4. 이중 for문을 이용하여 방정식 4x+5y=60인 모든 해를 구하세요. x,y는 10이하 정수
 	1) 출력형식 : x:@@, y:@@
*/
