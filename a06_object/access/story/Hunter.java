package a06_object.access.story;

import a06_object.access.story.friendship.WoodCutter;

public class Hunter {
	void askWhereDeer(){
		WoodCutter w; // public 선언가능
		w = new WoodCutter(); // 생성자 접근도 가능
//		System.out.println(w.casheDeer);
//		casheDeer의 필드의 접근범위가 default이기 때문
//		WoodCutter에서 public을 붙이면 가능하다.

//		System.out.pirintln(w.cacheClothe);
// 		cacheClothe의 필드의 접근범위가 private이기 때문
		
// 		public은 범위가 가장 넓은 것으로 외부 package 클래스도
//		import만 하면 사용 가능하다.
		System.out.println(w.weddingAnnounce);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
