/*
 # for문(반복문)
 - 반복처리에서 특정한 변수가 필요로 하고 제어처리를 할 때 가장 많이 활용되는 문.
 - for( 초기값; 반복할 조건; 한계(증감식 );{
 		반복할 구문(선언한 변수-초기값 활용)
   }
 - 초기값 : int count=1; int idx=0; cnt=100;
 - 반복할 조건 : count < 100(증가);, cnt > 0(감소);, idx < 배열.length;
 - 증감식 : count++, cnt--, count+=2, cnt-=5 
 
  # 배열에 효과적으로 활용되는 for문 2번째 형식
  - 일반 primitive data 배열, 객체 배열
  
  - String 
  names={"호날두", "메시", "루니"};
  names[0] : "호날두"라는 데이터가 들어가있는 단위 객체		-- String name=names[0];
  for( 단위 객체 선언 : 배열객체 ){
  		배열의 단위객체를 활용해서 처리 가능
  }
  ex) for(String name : names){
  			System.out.println("이름"+name);
  	  }
*/
package a04_statement;

public class A03_for_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 15~50까지 출력.
		for(int count=15; count<=50; count++){
			System.out.println("번호 : "+count);
		}
		
		// 5개 단위로 tab 및 줄바꿈 처리
		for(int count=15; count<=50; count++){
			System.out.print(count);
			// print 줄바꿈 없음
			if(count%5==0){
				System.out.println();
				// 번호 5로 나눈 나머지가 0이면 줄바꿈
			}else{
				System.out.print("\t");
				// 그렇지 않으면 번호당 tab간격
			}
		}
		// 1~100까지 데이터를 합산하세요
		int sum=0;
		for(int cnt=1; cnt<=100; cnt++){
			System.out.print(cnt);
			if(cnt!=100){
				System.out.print(" + ");
			}
			if(cnt%10==0){
				System.out.println();
			}
			sum+=cnt;
			// 데이터 누적처리
			
		}
		System.out.println("= "+sum);
		
		/* 배열 처리 */
		String[] foods={"사과", "짜장면", "김치찌개"};
		// 배열 선언 데이터타입[] 변수명 = {데이터1, 데이터2, 데이터3,...}
		for(int idx=0; idx<foods.length; idx++){
		// 배열명.length : 배열의 크기 = index마지막번호+1	
			System.out.println((idx+1)+"번째 음식 : "+foods[idx]);
		}
		
		// for(단위변수/객체 : 배열객체){ 해당 배열객체가 있을 때까지 단위 변수나 객체 할당}
		String[] names={"호날두", "메시", "루니"};
		for(String name : names){
			System.out.println("이름 "+name);
		}
	}

}

