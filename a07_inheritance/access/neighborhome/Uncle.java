package a07_inheritance.access.neighborhome;

import a07_inheritance.access.woodhome.WoodCutter;

public class Uncle {
	void whatWoodCutterInfo(){
	WoodCutter w = new WoodCutter();
//	public
	System.out.println(w.weddingAnn);
//	default : �ٸ� package�� ���� �Ұ�.
//	System.out.println(w.savingMoney);
//	protected(x) : ��Ӱ��谡 �ƴ϶�� ���� �Ұ�	
//	System.out.println(w.cacheInheri);
//		private(x)
//	System.out.println(w.privSect);
}
}
