/*
 # ��Ÿ List ��ü��
 1) Vector : ArrayList�� ������ ���� ������ ������.
 			 ����ȭ �޼ҵ� �������� �ӵ� �̽��� �־
 			 ����� ArrayList�� �ַ� ����Ѵ�.
 		- Vector<E> vlist = new Vector<E>();
 		- vlsit.add(), vlist.remove(), vlist.get(index)
 		
 2) LinkedList : ArrayList�� ������� ����. ���� ������ ������ �ٸ���.
 				 ���� ������ ��ũ�ؼ� ü��ó�� �����Ѵ�.
 				 ������ �߰������� ArrayList�� ������ �߰��� Ư��index �߰�������
 				 LinkedList�� �ξ� ������. �˻� �ӵ��� ArrayList�� ���� ������.	
 		- LinkedList<E> lklist = new LinkedList<E>();
 		- .add(), remove(), get()		  				 
 		[		]��[		]��[		]��[		]	
 	
 		
 # Set �÷���
  ----������----
  |	Set �÷��� |
  --------------
 1) �ߺ��� X(���ϰ�ü 2���� ���� �� ����.), ����Ȯ�� X
 2) add(�߰�), contains(��ü), isEmpty(), size()
 3) Iterator<E> iterator() : ������ ��ü�� �ѹ��� �������� ó��, �ѹ� �������� ������
 
 # Iterator �������̽�
 1) �޼���
 	- hasNext() : ������ ��ü�� ������ true, ������ false
 	- next() : �÷��ǿ��� �ϳ��� ��ü�� �������� ó��
 	
 # Set �÷����� ���� ������ ó��
 1) Set�� �������̽��̱⿡ ��ӹ��� ���� ��ü���� �̿��ؼ� �߰�, ������ �� �ִ�.
 	- HashSet, LinkedHashSet, TreeSet
 ex) HashSet<String> set = new HashSet<String>();
 	 set.add("100$");
 	 set.add("500$");
 	 set.add("1000$");
 	 set.size() : ũ�Ⱚ ������
 	 Iterator<String> iter = set.iterator() : 
 	 		while( iter.hasNext() )		-- ���� ��ü�� ��ŭ loop
 	 		iter.next() : ���� ��ü�� �����´�. 
*/
package a12_collection;

import java.util.HashSet;
import java.util.Iterator;

public class A06_SetCol_0510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set�� �ߺ��� ������� �ʰ� ������ Ȯ������ ���Ѵ�.
//		HashSet�� Set�������̽��� ��ǥ���� ���� Ŭ����
		HashSet<String> set = new HashSet<String>();
//		add�� ���� �ָӴϿ� ���� ����.
		set.add("30$");
		set.add("500$");
		set.add("100$");
		set.add("100$");
		set.add("500$");
		set.add("500$");
		set.add("500$");
		set.add("1000$");
		System.out.println("�� �ָӴϿ� �ִ� ��ü ��: "+set.size());
//		�ߺ��� ������� �ʾ� �� 5���� add������ ��ü ���� 100$, 500$, 1000$ 3���� ó����	
		
//		Set�� Iterator�� ���ؼ� ������ �� �ִ�.
//		iterator() �޼��� Ȱ��
		Iterator<String> iter = set.iterator();
		String elem="";
		
//		��ü �� ��ŭ loop		
		while( iter.hasNext() ){
//			���� ��ü�� ������
			elem=iter.next();
			System.out.println(elem);
		}
	}

}


