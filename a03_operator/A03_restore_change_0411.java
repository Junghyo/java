/*
 # ������ ���Կ�����
 1) ����������
 - ���α׷� �ۼ��� Ư���� �����ڸ� ���ؼ� �����ϰų� ���ҽ�Ű�� ������(1�� ���� ����)
 - �ַ� �ݸ񹮿��� ������ ������ �ʿ��� �� ���� Ȱ��ȴ�.
 ex) ++num, num++, --num, num--
 	 for(int num=0; num<=15; num++) loop���� Ȱ��
 
 2) ���Կ�����
 - ������ ���ο� ������ ���� �Ҵ� ó���ϴ� ���� ���Ѵ�.
 - ���� = �Ҵ��� ������;(�����ʿ��� ���� ���μ��� �귯��)
 
  # 3�� ������
 1) 3���� �ǿ����ڸ� ���Ͽ� ������� �ٷ� ó���ϴ� ���� ���¸� ���Ѵ�.
 - ���ǽ�(boolean) ? ������ true�� �� �� : false�� �� ��
   [ �ǿ����� 1 ]	  [ �ǿ����� 2 ] 	    [ �ǿ����� 3 ]
 
 ex) ���̰� 65 �̻��� �� "��ο��", �� ���� �� "�Ϲ�"
 int age=67;
 System.out.println( "��ο�뿩��:" +(age>=65) ? "��ο��":"�Ϲ�" );
 */
package a03_operator;

public class A03_restore_change_0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������.
		int no=1;
		System.out.println("no(��ȣ) ���� : "+(no++));
		System.out.println("no(��ȣ) ���� : "+(no++));
		System.out.println("no(��ȣ) ���� : "+(no++));
		System.out.println("no(��ȣ) ���� : "+(no++));
		System.out.println("no(��ȣ) ���� : "+(no++));
		System.out.println("no(��ȣ) ���� : "+(--no));
		System.out.println("no(��ȣ) ���� : "+(--no));
		System.out.println("no(��ȣ) ���� : "+(--no));
		System.out.println("no(��ȣ) ���� : "+(--no));
		System.out.println("no(��ȣ) ���� : "+(--no));
		// ���� ������ : ������ ���ο� ���� �����ϴ� ��쿡 ���Ǵ� ������
		int initSaveMoney = 10;
		// ����� ���Կ��� : �ش� ������ ���ٿ� �����͸� �Ҵ��ϴ� ���� ���Ѵ�.
		// ���� += ���ٿ� �Ҵ��� ������, ����-=������;
		System.out.println("���� �ſ� 10����");
		int monthCnt = 1;
		System.out.println( "���� �ݾ� : "+initSaveMoney+"����");
		System.out.println( (monthCnt++)+"��° ���� �� ����ݾ� : "+(initSaveMoney+=10)+"����");
		System.out.println( (monthCnt++)+"��° ���� �� ����ݾ� : "+(initSaveMoney+=10)+"����");
		System.out.println( (monthCnt++)+"��° ���� �� ����ݾ� : "+(initSaveMoney+=10)+"����");
		System.out.println( (monthCnt++)+"��° ���� �� ����ݾ� : "+(initSaveMoney+=10)+"����");
		
		// 3�� ������ : ���ǽ� ? true ó���� : false ó����
		int age=67;
		System.out.println("��ο�� ���� : "+( ( age>=65 ) ? "��ο��" : "�Ϲ�" ));
		

		
	}

}
