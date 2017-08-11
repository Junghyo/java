/*
 # ������ Ȯ�ο���
 <Vehicle>
 �Ӽ� : kind, maxSpeed, curSpeed
 �޼��� : speedUp(),drver() : Ż���� ��� ����Ǵ°�
 <Bus>
 <Ship>
*/
package a07_inheritance;

class Vehicles{
	String kind;
	int maxSpeed;
	int curSpeed;
	Vehicles(){
		kind="���߱���";
		maxSpeed=150;
		curSpeed=10;
	}
	public void speedUp(){
		int plusSpeed=5;
		curSpeed+=plusSpeed;
		if(curSpeed>maxSpeed){
			curSpeed+=0;
			System.out.println("���� �ӵ� "+maxSpeed+"km/h�� �߰��� �� �����ϴ�.");
		}else{
			System.out.println(kind+"�� �ӵ��� "+plusSpeed+"km/h �����մϴ�. ���� �ӵ��� "+curSpeed+"km/h�Դϴ�.");
		}
	}
	public void driver(){
		System.out.println(kind+"�� ����� �����մϴ�.");
	}
}
class Bus extends Vehicles{
	Bus(){
		super.kind="����";
		super.curSpeed=30;
		super.maxSpeed=120;
	}
	public void speedUp(){
		int plusSpeed=10;
		curSpeed+=plusSpeed;
		if(curSpeed>maxSpeed){
			curSpeed+=0;
			System.out.println("���� �ӵ� "+maxSpeed+"km/h�� �߰��� �� �����ϴ�.");
		}else{
			System.out.println(kind+"�� �ӵ��� "+plusSpeed+"km/h �����մϴ�. ���� �ӵ��� "+curSpeed+"km/h�Դϴ�.");
		}
	}
	public void driver(){
		System.out.println(kind+"�� ���� ����� �ð��� ����� ���� ž�ϴ�.");
	}
}
class Ship extends Vehicles{
	Ship(){
		super.kind="��";
		super.curSpeed=50;
		super.maxSpeed=180;
	}
	public void speedUp(){
		int plusSpeed=20;
		curSpeed+=plusSpeed;
		if(curSpeed>maxSpeed){
			curSpeed+=0;
			System.out.println("���� �ӵ� "+maxSpeed+"km/h�� �߰��� �� �����ϴ�.");
		}else{
			System.out.println(kind+"�� �ӵ��� "+plusSpeed+"km/h �����մϴ�. ���� �ӵ��� "+curSpeed+"km/h�Դϴ�.");
		}
	}
	public void driver(){
		System.out.println(kind+"�� Ÿ�� �ֹ̰� ���մϴ�.");
	}
}
public class A08_polymor_exp_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles v1 = new Vehicles();

		Vehicles v2 = new Bus();
	
		Vehicles v3 = new Ship();

		// ���� type [] ���� = { ���� ��ü1(), ���� ��ü2(), ���� ��ü3() }
		Vehicles [] vArray={ new Bus(), new Bus(), new Ship(), new Ship() };
		for(Vehicles v : vArray){
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.driver();
		}
	}

}
