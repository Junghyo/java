package a04_statement;

public class A05_doubleFor_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 구구단을 통한 2중 for문 처리 */
		for(int dan=2; dan<=9; dan++){
		// 외부 for문은 단수에 관련된 내용 처리	
			System.out.println("### "+dan+"단 ###");
			for(int cnt=1; cnt<=9; cnt++){
			// 내부 for문은 cnt 1~9 연산 처리
				System.out.println(dan+" * "+cnt+"="+(dan*cnt));
			}
		}
		
		System.out.println("2번째");
		for(int dan=2; dan<=9; dan++){
			System.out.println("### "+dan+"단 ###");
			for(int cnt=1; cnt<=9; cnt++){
				System.out.print(dan+"*"+cnt+"="+(dan*cnt)+"\t");
				if(cnt==9){
					System.out.println();
				}
			}
		}
		
	}

}
