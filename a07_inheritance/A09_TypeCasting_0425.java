/*
 # ����Ÿ�Ժ�ȯ(Casting)
 1) ����type �������� = ������ü(); [promote]
 2) ����type �������� = (����type)������ü(); [casting]
 class Parent{}
 class Child extends Parent{}
 main()
 	- Parent p = new Child();
 	- Child c = p; <----- ĳ������ �ʿ�
 	--> Child c = (Child) p;
 	
 �̷��� �ϴ� ����?
 class Parent{
 	void getInfo();
 }
 class Child extends Parent{
 	void childInfo();		<--- �ڽ�Ŭ�������� �߰������� ����
 } 
  main()
  Parent p = new Child();
  p.childInfo(); <------- �Ұ�. ���������� �߰����� �޼���� Ȱ��(X)
  Child c = (Child) p; <------- ĳ����.
  c.childInfo(); <---- ������ü�� Ư�� �޼��带 Ȱ��(O)
*/

/*
 # ��ü Ÿ�� Ȯ��(instanceof)
 - ����� ���������� �������� ������ü���� ����� �� �� �ִ�.
   �� ��, Ư���� ��ü�� �ش���� ��ü�� �Ҽ��� ��쿡�� �������̳�
   casting�� ó���� �� �ִ�. �̷� �������� �ش� ��ü�� ����Ŭ������ ��ӹ���
   ���� Ŭ������ Ȯ���Ϸ��� instanceof  
*/

package a07_inheritance;

class Parents{
	void getInfo(){
		System.out.println("�θ�Ŭ����[����޼���]");
	}
}

class Childs extends Parents{
	void childInfo(){
		System.out.println("�ڽ�Ŭ����[�߰��޼���]");
	}
}

public class A09_TypeCasting_0425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		������ ó��		
		Parents p1 = new Childs();
//		Parents p2 = new Parents();
//		������ �ִ� �޼��� �����Ǵ� �������� ������ �� �������� Ȱ���� ����		
		p1.getInfo();
//		p2.getInfo();		
//		�������� �������� �߰��Ǵ� �޼���� ó������ ���Ѵ�.		
//		p1.childInfo();
// 		p2.childInfo();

// 		������ �߰��Ǵ� ����� ó���ϰ��� �� ���
		Childs c1 = (Childs) p1;
		c1.childInfo();
		((Childs) p1).childInfo();

//		# instanceof (��üŸ��Ȯ��)		
//		1. �������迡 �ִ� ��ü ����
		Parents p2 = new Parents();
		System.out.println("p2�� Parents�� ��ü�����ΰ�? "+(p2 instanceof Parents));	//true	
		System.out.println("p2�� Childs�� ��ü�����ΰ�? "+(p2 instanceof Childs));		//false

//		2. ��Ӱ��迡 �ִ� ����/���� ��ü�� Ȯ���ϴ� ���	
//		Parents p1 = new Childs(); �� ���� �������� �Ͼ�� p1�� Childs�� �����Ѵ�.		
		System.out.println("p1�� Childs�� ��ü�����ΰ�? "+(p1 instanceof Childs));		//true
		System.out.println("p1�� Parents�� ��ü�����ΰ�? "+(p1 instanceof Parents));	//false
		
		Childs c2 = new Childs();
		c2.getInfo();
		c2.childInfo();
//		�Ұ�
//		Childs c3 = new Parents();
//		Childs c3 = (Childs) new Parents();
//		c3.getInfo();
//		c3.childInfo();
	}
}



