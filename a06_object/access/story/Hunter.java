package a06_object.access.story;

import a06_object.access.story.friendship.WoodCutter;

public class Hunter {
	void askWhereDeer(){
		WoodCutter w; // public ���𰡴�
		w = new WoodCutter(); // ������ ���ٵ� ����
//		System.out.println(w.casheDeer);
//		casheDeer�� �ʵ��� ���ٹ����� default�̱� ����
//		WoodCutter���� public�� ���̸� �����ϴ�.

//		System.out.pirintln(w.cacheClothe);
// 		cacheClothe�� �ʵ��� ���ٹ����� private�̱� ����
		
// 		public�� ������ ���� ���� ������ �ܺ� package Ŭ������
//		import�� �ϸ� ��� �����ϴ�.
		System.out.println(w.weddingAnnounce);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
