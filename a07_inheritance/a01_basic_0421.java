/*
 # ����̶�
 ���(Inheritance)
 ���� : �θ� �ڽĿ��� �����ִ� ����
 �ڹ� : Ŭ������ ����� �ϸ� �ڽ�Ŭ������ �θ�Ŭ������ ����� Ȱ���� �� �ִ�.(�θ� ���� ����� �ڽĿ��� ������)
 		�θ�Ŭ������ ����Ŭ����(super)��� �θ��� �ڽ�Ŭ������ ����Ŭ����, �Ļ�Ŭ������� �Ѵ�.

   �θ�Ŭ����    <---���--- �ڽ�Ŭ����
 (�ʵ�1, �ʵ�2)					�����ʵ�� �޼��带 �������� �ʰ� ��� ����
 
 ����� ������ �� ���ߵ� ����� �����Ͽ� �ڵ��� �ߺ��� �ٿ��ش�. ���߽ð� ����.
 ��, ���������� ������ �ȿ��� ��밡��.
 
 # Ŭ���� ���
 1) �θ� Ŭ������ �����ϰ� ��ӹ��� ũ������ extends Ű���带 �̿��Ͽ� ����� �޴´�.
 2) ��, �⺻ Ŭ������ ���� ��Ӹ� ����Ѵ�.
 class �θ�Ŭ������{ ���..}
 class �ڽ�Ŭ������ extends �θ�Ŭ������{ �߰��� ���... }
*/
package a07_inheritance;
// �θ� Ŭ����
class Parent{
// 	�θ� �ʵ�
	String name;
	int age;
	
//	�޼���
	void setInfo(String name, int age){
		this.name=name;
		this.age=age;
	}
	void showInfo(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}

}

// �ڽ�Ŭ���� extends �θ�Ŭ����
class Child extends Parent{
//	�߰� �ʵ� �Ҵ�
	String loc;
	void setInfo2(String name, int age, String loc){
		this.name=name;
		this.age=age;
		this.loc=loc;
		showInfo2();
	}
	void showInfo2(){
		showInfo();
		System.out.println("location: "+loc);
	}
	
}
public class a01_basic_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		c1.setInfo("Son", 3);
		c1.showInfo();
		Child c2 = new Child();
		c2.setInfo2("Daughter", 4, "New York");
	}
}


