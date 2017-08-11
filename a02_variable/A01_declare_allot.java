 /*
 # ������?
 1) Variable
 - ���α׷� �۾��� ó���ϱ� ���� �ϳ��� ���� ������ �� �ִ� �޸� ������ ���Ѵ�.
 - Java������ �پ��� Ÿ���� ������ �� ���� �Ѱ��� Ÿ�Ը� ������ ���� �� �� �ִ�.
 ex) int num01 = "�ȳ��ϼ���"; (X)
 	 int num02 = 25; (O)
 
 2) �ĺ���(Identifier)
 - �ڹ��ڵ忡�� ����, Ŭ������, �޼�������� �Է½�Ų �̸��� �ǹ��Ѵ�.
 ex) String name01="�ú���";
 	 Class Hello{}
 	 public void setName(){}
 
 # �ĺ��� �ۼ���Ģ
 1) ù���ڴ� �ݵ�� ������. ��, _, $ �� Ư���������� ��밡��.
 2) ��ҹ��ڸ� �����Ͽ� ���
 3) �������� ���� ���鹮�ڴ� ����� �� ����.
 ex) userName, $number(O), #age(X), introName(O), intro Age(X)
 
 4) �����
 - �⺻ ������ type : boolean, byte, short, int, long, float, double
 - ���������� : private, protected, public
 - Ŭ�������ó��� : class, abstract, interface, implements, extends
 - ��ü ���� ���� : new, instanceof, this, super, null
 
 # �������
 1) ������ ����ϴ� ���� ������ �����ϰ� ���� �����ϴ� ���� ���Ѵ�.
 2) ���� ����
 - ������type �ĺ���;
 ex) int age;  		-- ������ �����ͷ� age��� �ĺ��ڸ� ����.
*/
package a02_variable;

public class A01_declare_allot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		// �ڹٿ��� �������� : type �ĺ���
		age = 25;
		// ������ �Ҵ�
		double weight = 65.7;
		// ����+�Ҵ�(����)
		int after10Year=age+10;
		// ������ �о ���ο� �����Ϳ� �Ҵ�
		// age = 25.7;
		// ������ ���¿� ���� �ʴ� �Ҵ�. ������ type�� �Ǽ����� �����͸� �Ҵ�� �����߻�.
		// age = "����25��";
		// ������ type�� �������� �����͸� �Ҵ�� �����߻�.
		System.out.println("���̴� "+age+"���̸�, ");
		System.out.println("�����Դ� "+weight+"kg�Դϴ�.");
		System.out.println("10�� ���� ���̴� "+after10Year+"���Դϴ�.");
	}	

}
