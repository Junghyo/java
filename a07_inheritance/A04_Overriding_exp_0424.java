/*
 Ȯ�ο���
 <Worker>
 kind : ��������
 ������ : �ʵ� �ʱ�ȭ
 �޼��� : working()  -> @@@�� ���� �Ѵ�.
 
 <Engineer>
 ������ : �ʵ� �ʱ�ȭ
 �޼���: working() -> @@�� ���α׷��� �����Ѵ�.
 
 <PoliceMan>
 ������ : �ʵ� �ʱ�ȭ
 �޼��� : working() -> @@�� ������ ��´�.
 
*/
package a07_inheritance;

class Worker{
	String kind;
	Worker(String kind){
		this.kind=kind;
	}
	void ing(){
		System.out.println(kind+"�� ���� �Ѵ�.");
	}
}
class Engineer extends Worker{

	Engineer() {
		super("������");
		// TODO Auto-generated constructor stub
	}
	void ing(){
		System.out.println(kind+"�� ���α׷��� �����Ѵ�.");
	}
	
}

class Police extends Worker{
	Police(){
		super("������");
	}
	void ing(){
		System.out.println(kind+"�� ������ ��´�.");
	}
}

public class A04_Overriding_exp_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1 = new Worker("�뿹");
		Worker w2 = new Worker("ȣ����");
		w1.ing();
		Engineer e1 = new Engineer();
		e1.ing();
		Police p1 = new Police();
		p1.ing();
		w2.ing();

	}

}

