/*
 Collection : �ڹٿ����� ���� �޸� ������ ���� ������ ��ü�� ���� �����ȴ�. 
*/
package a00_basic;

import java.util.ArrayList;

public class A09_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"ȣ����", "�޽�", "���"};
		// �迭�� �ѹ� ��������� �� �迭�� ���ο� ��ü�� ������ �߰��Ϸ��� ���
		// ���ο� �迭�� �����ؾ� �ϴ� �������� Ư���� �ִ�.
		// �����迭�� ���Ͽ� ��ü�� �����ȴ�.
		// 1). ArrayList<Type>	import �߰��ؾ� ��.
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("������");
		list.add("����");
		list.add("���ź");
		// .add(�߰���ü)
		// .size() : ��ü�� ũ��
		// .get(index) : �ش� ��ü�� ������
		for(int idx=0; idx<list.size(); idx++){
			System.out.println( list.get(idx) );
		}
		list.remove(0);
		// .remove(index) : �ش� �ε����� ��ü�� ������Ŵ
		list.set(1,"���̸���");
		// .set(index, ��ü) : �ش� �ε����� ��ü�� ������
		System.out.println("remove �� set ���");
		for(int idx=0; idx<list.size(); idx++){
			System.out.println( list.get(idx) ); 
		}

	}

}
