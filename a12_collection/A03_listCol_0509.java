/*
 # List �÷���
 1) ��ü�� �Ϸķ� �þ���� ����
    ----------������--------
    |       List �÷���     |
     0, 1, ....., n-1
 
 2) ��� �޼���
  - add(��ü) : ��ü�� �� ���� �߰�
  - add(index, ��ü) : �־��� �ε����� ��ü�� �߰�
  - set(index, ��ü) : �־��� �ε����� ��ü�� �ٲ�   
  - get(index) : �־��� �ε����� ����� ��ü ������
  - size() : ����Ǿ� �ִ� ��ü ��ü ���� ����
  - contains(��ü) : �־��� ��ü�� ����Ǿ� �ִ��� ����(boolean��)
  - isEmpty() : �÷����� ����ִ��� ����(boolean��)
  - clean() : ����� ��� ��ü�� ����
  - remove(index) : �־��� �ε����� ����� ��ü ����
  - remove(��ü) : �־��� ��ü�� ����
*/

package a12_collection;

import java.util.ArrayList;

public class A03_listCol_0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> starWars = new ArrayList<String>();
//		.add() : �߰�		
		starWars.add("Yoda");
		System.out.println("add");
		for(String name : starWars) System.out.println(name);
//		add(index, ��ü) : Ư�� ��ġ�� �߰�		
		starWars.add(0, "Skywalker");
		System.out.println("add(idx,)");
		for(String name : starWars)  System.out.println(name);
		System.out.println("get(1)");
		System.out.println(starWars.get(1));
//		remove(index) : ����
		System.out.println("remove(0)");
		starWars.remove(0);
		System.out.println("���� ��");
		for(String name : starWars)  System.out.println(name);
//		isEmpty() : ���� �÷����� ��� �ִ��� ���� ����
		System.out.println("isEmpty()");
		System.out.println(starWars.isEmpty());
//		���� ��ü ���� ó�� ��, Ȯ��
		starWars.remove(0);
		System.out.println(starWars.isEmpty());
		starWars.add("Darth Vader");
		for(String name : starWars)  System.out.println(name);
//		set(index, ������ ��ü)
		System.out.println("����");
		starWars.set(0, "R2-D2");
		for(String name : starWars) System.out.println(name);
		
	
	}

}
/*
 ArrayList Ȯ�ο���
 ���ϰ��� ArrayList : sellList
 �庸�� ��� ArrayList : buyList
 �ó����� 
 - ���, �ٳ���, ����, ������, ������ �Ȱ� �ֽ��ϴ�. addó��
 - �庸�� ����� ����� ���⸦ �����߽��ϴ�. remove, addó��
 - ���ϰ��Կ��� �ٳ����� ����� ���������ϴ�. setó��
 - �庸�� ����� ����� ���⸦ �� �Ծ����ϴ�. removeó��
 - �庸�� ����� ������ �ִ� ������ ���ٸ� ���ϰ��Կ��� ���� ���� �� �ϳ��� �庸�� ������� ����ǰ���� �ֱ�� �߽��ϴ�.
 
*/
