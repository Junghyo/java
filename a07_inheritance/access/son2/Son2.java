package a07_inheritance.access.son2;

import a07_inheritance.access.woodhome.WoodCutter;

public class Son2 extends WoodCutter {
		void whatWoodCutterInfo(){
// 		public
		System.out.println(weddingAnn);
// 		default(같은 package)(x) : 상속관계라도 같은 package가 아니기 때문에 접근 불가
//		System.out.println(savingMoney);
//		protected 가능. 상속관게에 있으면 protected이상의 접근제어는 
//		접근이 가능하다. 다른 package라도 접근 가능		
		System.out.println(cacheInheri);
// 		private(x) : 상속관계에서도 접근이 안된다.
//		System.out.println(privSect);
	}
}
