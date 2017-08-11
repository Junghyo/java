package a06_object.access.story.friendship;

public class Deer {
	void askWhereClothe(){
		WoodCutter w = new WoodCutter();

// 		casheClothe는 접근제어자가 private이기에
//		같은 package이더라도 접근이 불가능하다.		
//		System.out.println(w.cacheClothe);
		
//		public을 선언한 필드 접근 가능
		System.out.println(w.weddingAnnounce);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
