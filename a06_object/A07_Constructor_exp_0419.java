/* Ȯ�ο���.
 1) class�� ����(�����ϴ� ������)
 2) field�� : �̸�, ����, �о�
 3) ������(),������(1),������(2),������(3)
 4) main�޼��忡�� ��ü���� 4��
 5) == ���� �����ϴ� ������ ==
 
*/
package a06_object;

class Entertain{
	String name;
	String gender;
	String job;
	
	Entertain(){
		
	}
	Entertain(String name){
		this(name, "����", "����");
	}
	Entertain(String name, String gender){
		this(name, gender, "����");
	}
	Entertain(String name, String gender, String job){
		this.name=name;
		this.gender=gender;
		this.job=job;
	}
	void show(){
		System.out.println("�̸�: "+name+"\t����: "+gender+"\t�о�: "+job);
	}
}
public class A07_Constructor_exp_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entertain p1 = new Entertain();
		Entertain p2 = new Entertain("����");
		Entertain p3 = new Entertain("���","����");
		Entertain p4 = new Entertain("�ں���", "����", "���");
		System.out.println("=== ���� �����ϴ� ������ ===");
		p1.show();
		p2.show();
		p3.show();
		p4.show();
	}

}
