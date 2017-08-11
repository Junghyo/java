package a10_api;

public class A06_timecheck_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println("시작시간: "+start);
		for(int cnt=1; cnt<1000000; cnt++){
			System.out.println("카운트: "+cnt);
		}
		long end = System.currentTimeMillis();
		System.out.println("종료시간: "+end);
		System.out.println("시간차: "+(end-start));

	}

}
