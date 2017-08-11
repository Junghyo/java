package a07_inheritance;
/*
# Polymorphism(������)
1) ��Ӱ��迡�� �θ�Ÿ�Կ��� ��� ���� ��ü�� ���Ե� �� �ִ�.
2) ��Ӱ��� Ŭ���� ����
	- class Father{}
	  class Son extends Father{}
	  class Daughter extends Father{}
3) main�̳� �ٸ� Ŭ�������� ��ü ������, Ÿ�� ���� ����
	- Father f1 = new Son();
	- Father f2 = new Daughter();
	- �θ�Ŭ���� ���� = �ڽ�Ŭ����Ÿ��() : �ڵ� Ÿ�� ��ȯ
*/

/*
 Zerggling : �����
 
 Larva(�ʱ�) : ����Ŭ����
 attack() ����
 ��ӹ���  ���� ��ü
 Drone	attack() ������. �ٸ� ���ݹ��
 Hydralisk	attack() ������. �ٸ� ���ݹ��
 Mutalisk attack() ������. �ٸ� ���ݹ��
 Larva L01 = new Drone();	L01.attack();
 Larva L02 = new Hydralisk();	L02.attack();
 Larva L03 = new Mutalisk();	L03.attack();
*/
class Larva{
	String unitKind;
	Larva(){
		unitKind="���";
	}
	public Larva(String unitKind){
		this.unitKind=unitKind;
	}
	public void attack(){
		System.out.println(unitKind+"�� ������ ���Ѵ�");
	}
}
class Drone extends Larva{
	Drone(){
		super("���");
	}
//	attack ������
	public void attack(){
		System.out.println(unitKind+"�� ���ݷ� 5�� �����Ѵ�.");
	}
}
class Zergling extends Larva{
	Zergling(){
		super("���۸�");
	}
//	attack ������
	public void attack(){
		System.out.println(unitKind+"�� ���ݷ� 5�� ������ �����Ѵ�.");
	}
}
class Hydralisk extends Larva{
	Hydralisk(){
		super("�����");
	}
//	attack ������
	public void attack(){
		System.out.println(unitKind+"�� ���ݷ� 10���� �����Ѵ�.");
	}	
}
public class A07_star_world_polymor_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Larva l01 = new Larva();
		l01.attack();
		// �������� �Ͼ �θ�Ÿ�Կ� ��� �ڽ� ��ü ���� ����
		Larva l02 = new Drone();
		l02.attack();
		Larva l03 = new Zergling();
		l03.attack();
		Larva l04 = new Hydralisk();
		l04.attack();

	}

}
/*
 # ������ Ȯ�ο���
 <Vehicle>
 �Ӽ� : kind, maxSpeed, curSpeed
 �޼��� : speedUp(),dirver() : Ż���� ��� ����Ǵ°�
 <Bus>
 
*/