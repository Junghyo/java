package a10_api;

public class A06_timecheck_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println("���۽ð�: "+start);
		for(int cnt=1; cnt<1000000; cnt++){
			System.out.println("ī��Ʈ: "+cnt);
		}
		long end = System.currentTimeMillis();
		System.out.println("����ð�: "+end);
		System.out.println("�ð���: "+(end-start));

	}

}
