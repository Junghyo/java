/* 
 # Map �÷���
  -----------������--------------
  |			Map �÷��� 			|
  |	  [Ű:��] [Ű:��] [Ű:��]   |		
  -------------------------------
  
  1) Ű(key)�� ��(value)���� ������ Entry ��ü�� �����ϴ� ����.
  	 Ű�� �ߺ��� �� ������ ��(��ü)�� �ߺ��� ����. 
  	 ���� Ű�� �������� �Է��ϸ� ���������� �Էµ� ���� ������ �ȴ�.
  	
  	
  # Map �÷����� ���� �޼���
  - put(key, value) : �־��� Ű�� ���� �߰�, ����Ǵ� ó��
  - containsKey(key) : �־��� Ű�� �ִ��� ����
  - containsValue(vlaue) : �־��� ���� �ִ��� ����
  - entrySet() : Ű�� ���� �ִ� Mapentry��ü�� set�� ��� ����
  - keySet() : Ű���� Set��ü�� ��� ����
  - values() : ��� ���� Collections�� ��� ����
  
  # Map�� ��ü��
  1) HashMap, Hashtable, LinkedHashMap, Properties, TreeMap
   	- HashMap<K,V>() : Map��ǥ ��ü
  	ex) HashMap<String, Integer> map = new HashMap<String Integer>();
  		map.put("Ronaldo", 80);		-- put�� ���� ����
  		map.put("Marcelo", 90);
  		map.put("Ronaldo", 100); 	-- key���� �ߺ��� ������� �ʴ´�. key �ߺ� �ÿ��� �������� ����� value(100)�� ����.
  		map.get("Ronaldo") -> value���� ������(100)		
  		
  
  # Map��ü�� ��ü ������ ��������
  1) Ȱ��޼���
  		- keySet() : Set���·� map�� �ִ� ��� key���� ������
  			ex)	set.iterator()
  				while(.hasNext())
  					next() : key���� ������
  				map.get(key) : �ش� value���� ������
  	 
  	 	- entrySet() : Map.Entry ���·� key�� value���� ������
  	 		ex) Set< Map.Entry<String, Integer> > entrySet = map.entrySet();
  	 			entry.getKey();
  	 			entry.getValue();
  
*/

package a12_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A07_mapCol_0510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map �÷��� ���� <key, value>
//		�Ϲ������� key, value�� ������ ���� type���� �����Ѵ�.
//		key : ���ڿ�		
//		value : ��ü		
		HashMap<String, Integer> map = new HashMap<String, Integer>();

//		map.put(key, value) : ��ü ����
		String name = "Yoda";
		Integer num = 100;
		map.put("Yoda", 100);
		map.put("Darth Vader", 70);
		map.put("Skywalker", 60);
//		������ key���� ������ value���� �Ҵ�ȴ�.		
		map.put("Darth Vader", 90);
		System.out.println("���� map entry�� ���� : "+map.size());
		
//		get(key) : Ư���� key�� ���������� 
		System.out.println("Yoda(key)�� value�� �������� : "+map.get("Yoda"));
		
//		��ü ������ ��������
//		1. key.set() : key�� ���ؼ� ó���ϱ�. ��ü key���� Set���·� ��������
		System.out.println("1. key.set() : key�� ���ؼ� ó���ϱ�. ��ü key���� Set���·� ��������");
		Set<String> keyset = map.keySet();
//		Set�� iterator�� ���ؼ� �����͸� �����´�.
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()){
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key +":"+value);
		}

//		2. Map.Entry�� ���� key, value�� ���ÿ� �����ͼ� ó��
		System.out.println("2. Map.Entry�� ���� key, value�� ���ÿ� �����ͼ� ó��");
//		entrySet() : Set������ Map.Entry ������
		Set< Map.Entry<String, Integer> > entrySet = map.entrySet();
//		Set�����̱⿡ iterator�� ���� ������ ó�� ����
		Iterator< Map.Entry<String, Integer> > entryIter = entrySet.iterator();
//		hasNext() : �ݺ�ó��. next() : �� ��������
//		getKey() : key��������. getValue() : value ��������
		Map.Entry<String, Integer> entry = null;
		String inkey= "";
		Integer invalue = 0;
		while(entryIter.hasNext()){
//			������ü�� ������			
			entry = entryIter.next();
//			key�� �Ҵ�			
			inkey = entry.getKey();
//			value �Ҵ�			
			invalue = entry.getValue();
			System.out.println(inkey+":"+invalue);
		}
		
//		remove(key) : ��ü ����		
		map.remove("Yoda");
		System.out.println("������ map entry�� ���� : "+map.size());

//		clear() : ���Ե� map ��ü ���� ó��
		map.clear();
		System.out.println("��ü ������ map entry�� ���� : "+map.size());
	}

}
