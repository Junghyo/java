/*
 ����
 1) �θ�
 Ŭ���� Vehicle
 �ʵ� : ����, �ְ�ӵ�
 �޼��� : showInfo()
 @@@�ε� �ְ� �ӵ��� @@@��
 2) �ڽ�
 Ŭ���� Car
 �޼��� driverCar()
 @@@@�ε� �ְ�ӵ��� @@@��
 Ÿ�� ����� @@@@���̴�.
*/
package a07_inheritance;
class Vehicle{
	String kind;
	int maxSpeed;
	Vehicle(String kind, int maxSpeed){
		this.kind=kind;
		this.maxSpeed=maxSpeed;
	}
	void ShowInfo(){
		System.out.println(kind+"�ε� �ְ�ӵ��� "+maxSpeed+"km�̴�.");
	}
}
class Car extends Vehicle{
	int personCnt;
//	super : ��Ӱ����� ����Ŭ������ ���(������, �ʵ�, �޼���)�� ��Ī
//	1) ������ :  super();
//  2) �ʵ�, �޼��� : super.XXX	
	Car(String kind, int maxSpeed, int personCnt){
//		����Ŭ������ �����ڸ� ȣ��
		super(kind, maxSpeed);
		this.personCnt=personCnt;

	}
	void CarInfo(){
		ShowInfo();
		System.out.println("Ÿ�� ����� "+personCnt+"���̴�.");
	}
}
public class A02_basicExp_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle("�ڵ���", 300);
		v1.ShowInfo();
		Car c1 = new Car("�ƿ��", 270, 2);
		c1.CarInfo();

	}

}

