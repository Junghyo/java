/*
 # �޼ҵ� �������̵�(Method Overriding)
 1) �θ� Ŭ������ ���ǵ� �޼��带 �״�� ����ϴ� ��쵵 ������
 �ڽ�Ŭ������ �θ�Ŭ������ �޼��带 �����Ͽ� �� �ڽ�Ŭ������ �뵵�� �°�
 ����ϴ� ��찡 ����.
 
 2) �̋�, �θ�Ŭ������ ���� �޼��带 �����Ͽ� ����ϴ� ���� �޼��� �������̵��̶�� �Ѵ�.
 
 3) �⺻ �ڵ� ����
 class ����Ŭ����{
 	void �������̵��Ҹ޼���(){}
 }
 class �ڽ�Ŭ����{
 	void �������̵��Ҹ޼���(){}
 }
*/ 	
package a07_inheritance;

class Member{
	String name;
	int sal;
	public Member(String name, int sal) {
		this.name = name;
		this.sal = sal;
	}
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public void showInfo(){
		System.out.println("�̸�: "+name);
		System.out.println("�޿�: "+sal+"��");
	}
}

class Deputy extends Member{
	String depart;
	public Deputy(String name, int sal, String depart){
		super(name, sal);
		this.depart=depart;
	}
//  �޼��� ������(overriding)
	public void showInfo(){
//		������ �޼��� ������ Ȱ��		
		super.showInfo();
//		������ �޼��忡�� �߰��� ������ ó��
		System.out.println("�μ�: "+depart);
	}
}

public class A03_Overriding_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("ȣ����", 200000);
		Deputy d1 = new Deputy("�޽�", 2000, "�ٸ���");
		m1.showInfo();
		d1.showInfo();

	}

}
