package a07_inheritance.access.woodhome;

public class Angel {
	void whatWoodCutterInfo(){
		WoodCutter w = new WoodCutter();
// 		public
		System.out.println(w.weddingAnn);
// 		default(같은 package)
		System.out.println(w.savingMoney);
//		protected 가능		
		System.out.println(w.cacheInheri);
// 		private(x)
//		System.out.println(w.privSect);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
