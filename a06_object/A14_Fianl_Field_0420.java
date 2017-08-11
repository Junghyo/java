/*
 final : �����̶�� �ǹ̷� �ʵ� �տ� ���̸� �����и� �������� ���ϰ� �ϴ� ���� ���Ѵ�.
 �ʱⰪ �Ҵ� ��, �����Ͱ� ������� ���ϰ� ó���ȴ�.
 - final Ÿ�� �ʵ�� = �ʱⰪ;
*/
package a06_object;

class Man{
	static final double PI=3.1415920;
	final String nation = "korean";
	final String ssn;
	String name;
	Man(String ssn, String name){
		this.ssn=ssn;
		this.name=name;
	}
	void showInfo(){
		System.out.println("����: "+nation);
		System.out.println("ssn: "+ssn);
		System.out.println("�̸�: "+name);
	}
}
public class A14_Fianl_Field_0420 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m1 = new Man("990412-1234255", "ȣ����");
		m1.showInfo();
		m1.name="�޽�";
//		m1.ssn="880412-1234521";  final�̱⿡ �ʵ��� ������ ���� �Ұ�
//		final�� ������ ��ü���� ������ �Ұ���
//		������ü�� �޶����� �ٸ� �����͸� �Ҵ��� �� �ִ�.
		Man m2 = new Man("660222-1234512","���");
		m2.showInfo();
//		��ü ������� ������ �� ���� ����� ���?
// 		static final�� ������ ��ü�� ���ӵ��� �ʴ� ����� ������ �� �ִ�.
		System.out.println("���̰�: "+Man.PI);
//		Man.PI=2.2221; 	�Ҵ� �Ұ�.		

	}

}

/*
 # ����������(Access Modifier)
 1) Main() �޼��带 ������ �ʴ� Ŭ������ �ܺ� Ŭ������ ����� �������� ����� ���̹����� Ŭ�����̴�.
    �̷� Ŭ������ ��ȣ���� �ʵ�, ������, �޼ҵ忡 ���� ������ ������� �ʿ��ϴ�.
    �Ʒ� ������ ���������ڸ� ���ؼ� ó���� �����ϴ�.
    - Ư���� �ʵ�� Ŭ���� �������� ���Ǿ�� �ϰ�
    - Ư���� �޼���� ���� package������ ���Ǿ�� �Ѵ�.
    - Ư���� �޼���� ��� Ŭ�������� ��� �����ؾ� �Ѵ�.
 
 2) ���������ڵ�
 
  [����������]				    [������]							[���ٹ���]
     public				Ŭ����, �ʵ�, ������, �޼ҵ�			  ��� ���� ����
   protected				�ʵ�, ������, �޼ҵ�				       ���
 default(�Է�X)			Ŭ����, �ʵ�, ������, �޼ҵ�			  ���� ��Ű������
 	private					�ʵ�, ������, �޼ҵ�				Ŭ���� �������� ���
 
 # ���������� ����	
 1) Ŭ���� �� ����
 public class Person{}
 
 2) �޼��忡 ����
 protected void show(){}
 
 3) �����ڿ� ����
 public Person(){}
 
 4) �ʵ忡 Ȱ��
 private String name;
 
 # Ŭ���� ���� ���� ������
 1. Ŭ������ ������ �� ���� �����ڰ� ������ ��ġ�� ������ ����
 	1) [public] class Ŭ������{}
 	2) main(), �ܺ� Ŭ�������� ���� ������ ����
 		- public�� ���� � Ŭ�����̵��� ���𰡴�
 			public class Person{}
 			main() : Person p; �ܺ���Ű������ ������ ����
 			class Woman{}
 			main() : Woman p; ��Ű���������� ���� ����
*/
