package a07_inheritance.access.son2;

import a07_inheritance.access.woodhome.WoodCutter;

public class Son2 extends WoodCutter {
		void whatWoodCutterInfo(){
// 		public
		System.out.println(weddingAnn);
// 		default(���� package)(x) : ��Ӱ���� ���� package�� �ƴϱ� ������ ���� �Ұ�
//		System.out.println(savingMoney);
//		protected ����. ��Ӱ��Կ� ������ protected�̻��� ��������� 
//		������ �����ϴ�. �ٸ� package�� ���� ����		
		System.out.println(cacheInheri);
// 		private(x) : ��Ӱ��迡���� ������ �ȵȴ�.
//		System.out.println(privSect);
	}
}
