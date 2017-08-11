/*
 확인예제.
 Favorite Movie
 args --> 영화명1, 상영년도, 영화명2, 상영년도
 내가 좋아하는 영화
 영화명 상영 지금으로부터
 영화명 @@@ 2017-@@@
 영화명 @@@ 2017-@@@
*/
package a03_operator;

public class A05_argumentExp_0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movie01 = args[0];
		String movie02 = args[2];
		int year01 = Integer.parseInt(args[1]);
		int year02 = Integer.parseInt(args[3]);
		System.out.println("내가 좋아하는 영화");
		System.out.println("영화명\t상영\t지금으로부터");
		System.out.println(movie01+"\t"+year01+"\t"+(2017-year01)+"\n"+movie02+"\t"+year02+"\t"+(2017-year02));
		
		int fromYear;
		// 배열객체 length/단위갯수 --> 그룹별 데이터 건수
		System.out.println(args.length/2);
		for(int idx=0; idx<args.length/2; idx++){
			fromYear=2017-Integer.parseInt(args[idx*2+1]);
			System.out.println(args[idx*2]+"\t"+args[idx*2+1]+"\t"+fromYear);
		}	
		// # 배열과 list 처리
		// - 데이터 건수 : 배열.length/묶음단위 데이터 갯수
	
	}

}
