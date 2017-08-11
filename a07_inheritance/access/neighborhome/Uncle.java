package a07_inheritance.access.neighborhome;

import a07_inheritance.access.woodhome.WoodCutter;

public class Uncle {
	void whatWoodCutterInfo(){
	WoodCutter w = new WoodCutter();
//	public
	System.out.println(w.weddingAnn);
//	default : 다른 package라 접근 불가.
//	System.out.println(w.savingMoney);
//	protected(x) : 상속관계가 아니라면 접근 불가	
//	System.out.println(w.cacheInheri);
//		private(x)
//	System.out.println(w.privSect);
}
}
