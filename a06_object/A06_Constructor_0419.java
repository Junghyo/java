/*
 # �ٸ� ������ ȣ�� ó��
 
 ȣ�⿹��
 class Person{
 	String name;
 	int age;
 	Person(String name){
 		this.name=name;
 	}
 	Person(String name, int age){
 		this(name);						--	this(�Ű�����1)	 Person(String name)ȣ��
 		this.age=age;
 	}	
 }
 
 ...main(){
 		Person p1 = new Person("ȫ�浿", 25);
 }
 ���� �����ڸ� ���ؼ� ������ ��Ȱ���� �� �� �ִ�.
 �Ķ���� = �Ű�����	
*/
package a06_object;

class Car{
	//field ����
	String model;
	String color;
	int maxSpeed;

/* this Ű����� field��� ���������� ������ ��
 �������ִ� ������ �� �Ӹ� �ƴ϶� ����Ǿ� �ִ� 
 �����ڸ� ��Ȱ���� ���� Ȱ��ȴ�.
 ps) super. : ����� �Ͼ ��� ������ ���ҷ� ���� Ŭ������ field��, ������, �޼��带 ȣ���� ��, 
 			  ����Ŭ������ �����ϱ� ���Ͽ� Ȱ��ȴ�.
*/
	Car(String model){		//String model <--- �Ķ����(�Ű�����)
		// this.field�� : ���ú����� field���� ������ ��� �����ϱ� ���Ͽ� ���
		// �ߺ��ڵ尡 �߻��ϴ� ���� �������� ������ ������ �����ڸ� Ȱ��
		this(model, "����", 250);
		//this.model=model;
		// color="����";
		// maxSpeed=250;
	}
	
	Car(String model, String color){
		this(model, color, 250);
		//this.model=model;
		//this.color=color;
		//maxSpeed=250;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void show(){
		System.out.println("���� : "+model+"\n���� : "+color+"\n�ְ�ӵ� : "+maxSpeed);
	}
}
public class A06_Constructor_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("������");
		Car c2 = new Car("BMW","���");
		Car c3 = new Car("��Ծ�","����Ż",280);
		c1.show();
		c2.show();
		c3.show();
	}
}
/* Ȯ�ο���.
 1) class�� ����(�����ϴ� ������)
 2) field�� : �̸�, ����, �о�
 3) ������(),������(1),������(2),������(3)
 4) main�޼��忡�� ��ü���� 4��
 5) == ���� �����ϴ� ������ ==
 
*/
