/*
 1�ܰ� : ������������(class ����)
 1) orderFood(�������� ó��)
 2) �ֹ��Ͻ� ������ @@
 3) �ֹ��Ͻ� ������ @@, @@ ���������� ó��
 
 2�ܰ� :  ���� �̸��� �����ڷ� �Է� �ް� ó��
 1) orderFood�� ���� �ֹ��� ������ ������ ����
 ���εǾ� �ִ� ������ ����ؼ� ��꼭���� ���ó��

*/
package a06_object;

class Restourant{

	public void orderFood(String...foods){
		int price = 0;
		int sum=0;
		for(String food:foods){
			switch(food){
			case "¥��" : price=3000; break;
			case "«��" : price=4500; break;
			case "������" : price=8000; break;
			}
			System.out.println("�ֹ��Ͻ� ������ "+food+", ������ "+price+"�� �Դϴ�.");
			sum+=price;
		}
		System.out.println("�� �ֹ� ������ "+sum+"�� �Դϴ�.\n");
	}
}

public class A16_Exp_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restourant order= new Restourant();
		System.out.println("�߱����Դϴ�. �޴��� ¥��, «��, ������ 3�����Դϴ�.");
		order.orderFood("¥��");
		System.out.println("�߱����Դϴ�. �޴��� ¥��, «��, ������ 3�����Դϴ�.");
		order.orderFood("«��", "������");
	}

}

