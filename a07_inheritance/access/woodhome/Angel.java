package a07_inheritance.access.woodhome;

public class Angel {
	void whatWoodCutterInfo(){
		WoodCutter w = new WoodCutter();
// 		public
		System.out.println(w.weddingAnn);
// 		default(���� package)
		System.out.println(w.savingMoney);
//		protected ����		
		System.out.println(w.cacheInheri);
// 		private(x)
//		System.out.println(w.privSect);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
