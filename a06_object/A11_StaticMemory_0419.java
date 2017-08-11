/*
 # ���� ����� static
 static : '������'�̶�� ������ ��ü������ ������� ����� �� �ִ�
 		  �ʵ�� �޼��忡 Ȱ��ȴ�.
 		  
 static.int com_money;		  
 ��ü��.static���� 		ex) Person.com_money;
 Person p1 = new Person();
 p1.money; 		-- p1�� �����Ӽ� 1000
 p1.com_money=3000;
 Person p2 = new Person();
 p2.money; 		-- p2�� �����Ӽ� p1�� money�� ������� �����͸� �Ҵ�
 
 ��������
 class Person{
 	 static int com_money;
 }
 ��ü ����(new Person)�� ���� �ʴ��� ��밡��	 
*/
package a06_object;

// Person�� ���� package�ȿ� ����Ǿ� �־� class�� Person���� �������� ����
class Person01{
	int money;
	// static����� static type �ʵ��; ����
	static int comm_money;
	String name;
	Person01(String name){
		this.name=name;
	}
	void nowMoney(){
		System.out.println(name+"���� ���� �ڻ�: "+money);
		System.out.println("���� �ڻ�: "+comm_money);
	}
}
public class A11_StaticMemory_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person01 p1 = new Person01("����");
		Person01 p2 = new Person01("����");
		Person01 p3 = new Person01("�ϴ�");
		p1.money+=1000;
		p1.money+=1000;
		p1.comm_money+=1000;
		p1.comm_money+=1000;
		p2.money+=1000;
		p2.money+=1000;
		p2.comm_money+=1000;
		p2.comm_money+=1000;
		p3.money+=1000;
		p3.money+=1000;
		p3.comm_money+=1000;
		p3.comm_money+=1000;
		p1.nowMoney();
		p2.nowMoney();
		p3.nowMoney();
		// static ������ ��ü ���� ������� ���������� Ȱ��Ǵ� ���� ����̴�.
	}
}
