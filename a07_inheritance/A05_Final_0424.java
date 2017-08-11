/*
 # ��ӿ��� final
 1. Ŭ������ �տ� final
 	1) ����� �� ���� Ŭ���� ����
 	2) public final class Ŭ������{}
 		- ���� Ŭ�������� ����� �� �� ���� ó��
 2. �޼���� �տ� final
 	1) overriding�� �� ���� �޼��� ����
 		- ���� Ŭ�������� ���� Ŭ������ �޼��带 ������ �� �� ���� ó��
 	2) public class ����Ŭ����{
 	   		public final void show(){}
 	   }
 	   public class ����Ŭ���� extends ����Ŭ����{
 	   		public void show(){} -- �Ұ�
 	   }
 	
*/
/*
 # ���������� protected
 public > protected > [default] > private
 ��ü    �κ��� ��ü  ��Ű����    Ŭ������
 ������������� ��Ӱ��迡 �ִ� ����� ��Ű�� ������� ���� ����.
*/
package a07_inheritance;

class Animal{
	int speed;
	public void running(){
		speed+=5;
		System.out.println("�ٴ� �� !");
		System.out.println("���� �ӵ�: "+speed);
	}
//	����Ŭ�������� �����Ǹ� ���� ���ϰ� ó��	
	public final void stop(){
		speed=0;
		System.out.println("�ӵ��� ����");
	}
}
class Tiger extends Animal{
	public void running(){
		speed+=20;
		super.running();
	}
//	����Ŭ�������� final�� �޼��忡 �ο��߱� ������ 
// 	����Ŭ�������� �޼��带 ���������� �� �Ѵ�.	
//	public void stop(){	}
}
class Rabbit extends Animal{
// Animal�� �� �ٸ� �ڽ�Ŭ����(Animal ���)
}
class RabbitKind extends Rabbit{
// �ڽ�Ŭ�������� �� ����� �����ϴ�(Rabiit ���)	
}
final class Turtle extends Animal{}
/* �θ�Ŭ������ �տ� final�� ���̸�
���� Ŭ�������� final�� ���� �θ�Ŭ������ ������� ���Ѵ�.
class TurtleKind extends Turtle{}
*/

public class A05_Final_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
