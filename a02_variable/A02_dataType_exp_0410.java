/*
 ������ ���� �������� ������ �����ϰ� �Ʒ� �������� ����ϼ���.
 - �Ϸ� ������ list
 ����� : @@@��
 �ĺ� : @@@��
 �ٰ��� : @@@��
 ǰ�� ��պ��: @@@/3
 �Ѻ��: @@@��
 ��ǥ��� �ʰ� ���� : true/false(10000�� ���Ͻ�)
*/

package a02_variable;

public class A02_dataType_exp_0410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ϸ� ������ list");
		short transport = 30000;
		short food = 20000;
		short refresh = 10000;
		int total = transport+food+refresh;
		float avg = total/3.0F;
		System.out.println("����� : "+transport+"��");
		System.out.println("�ĺ� : "+food+"��");
		System.out.println("�ٰ��� : "+refresh+"��");
		System.out.println("ǰ�� ��պ�� : "+avg+"��");
		System.out.println("�Ѻ�� : "+total+"��");
		boolean isOver=total>10000;
		if(isOver){
			System.out.println("�ʰ�");
		}else{
			System.out.println("�̸�");
		}
	}

}
