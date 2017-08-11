/* 
 # Map 컬렉션
  -----------힙영역--------------
  |			Map 컬렉션 			|
  |	  [키:값] [키:값] [키:값]   |		
  -------------------------------
  
  1) 키(key)와 값(value)으로 구성된 Entry 객체를 저장하는 구조.
  	 키는 중복할 수 없지만 값(객체)은 중복이 가능. 
  	 같은 키에 여러값을 입력하면 마지막으로 입력된 값을 가지게 된다.
  	
  	
  # Map 컬렉션의 공통 메서드
  - put(key, value) : 주어진 키와 값을 추가, 저장되는 처리
  - containsKey(key) : 주어진 키가 있는지 여부
  - containsValue(vlaue) : 주어진 값이 있는지 여부
  - entrySet() : 키와 값이 있는 Mapentry객체를 set에 담아 리턴
  - keySet() : 키값을 Set객체에 담아 리턴
  - values() : 모든 값을 Collections에 담아 리턴
  
  # Map의 객체들
  1) HashMap, Hashtable, LinkedHashMap, Properties, TreeMap
   	- HashMap<K,V>() : Map대표 객체
  	ex) HashMap<String, Integer> map = new HashMap<String Integer>();
  		map.put("Ronaldo", 80);		-- put을 통해 저장
  		map.put("Marcelo", 90);
  		map.put("Ronaldo", 100); 	-- key값은 중복을 허용하지 않는다. key 중복 시에는 마지막에 저장된 value(100)로 저장.
  		map.get("Ronaldo") -> value값을 가져옴(100)		
  		
  
  # Map객체의 전체 데이터 가져오기
  1) 활용메서드
  		- keySet() : Set형태로 map에 있는 모든 key값을 가져옮
  			ex)	set.iterator()
  				while(.hasNext())
  					next() : key값을 가져옮
  				map.get(key) : 해당 value값을 가져옮
  	 
  	 	- entrySet() : Map.Entry 형태로 key와 value값을 가져옮
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

//		Map 컬렉션 생성 <key, value>
//		일반적으로 key, value는 다음과 같은 type으로 설정한다.
//		key : 문자열		
//		value : 객체		
		HashMap<String, Integer> map = new HashMap<String, Integer>();

//		map.put(key, value) : 객체 저장
		String name = "Yoda";
		Integer num = 100;
		map.put("Yoda", 100);
		map.put("Darth Vader", 70);
		map.put("Skywalker", 60);
//		동일한 key값은 마지막 value값이 할당된다.		
		map.put("Darth Vader", 90);
		System.out.println("현재 map entry의 개수 : "+map.size());
		
//		get(key) : 특정한 key로 값가져오기 
		System.out.println("Yoda(key)의 value값 가져오기 : "+map.get("Yoda"));
		
//		전체 데이터 가져오기
//		1. key.set() : key를 통해서 처리하기. 전체 key값을 Set형태로 가져오기
		System.out.println("1. key.set() : key를 통해서 처리하기. 전체 key값을 Set형태로 가져오기");
		Set<String> keyset = map.keySet();
//		Set은 iterator를 통해서 데이터를 가져온다.
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()){
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key +":"+value);
		}

//		2. Map.Entry를 통해 key, value를 동시에 가져와서 처리
		System.out.println("2. Map.Entry를 통해 key, value를 동시에 가져와서 처리");
//		entrySet() : Set형태의 Map.Entry 가져옮
		Set< Map.Entry<String, Integer> > entrySet = map.entrySet();
//		Set형태이기에 iterator를 통해 데이터 처리 가능
		Iterator< Map.Entry<String, Integer> > entryIter = entrySet.iterator();
//		hasNext() : 반복처리. next() : 값 가져오기
//		getKey() : key가져오기. getValue() : value 가져오기
		Map.Entry<String, Integer> entry = null;
		String inkey= "";
		Integer invalue = 0;
		while(entryIter.hasNext()){
//			단위객체를 가져옴			
			entry = entryIter.next();
//			key값 할당			
			inkey = entry.getKey();
//			value 할당			
			invalue = entry.getValue();
			System.out.println(inkey+":"+invalue);
		}
		
//		remove(key) : 객체 삭제		
		map.remove("Yoda");
		System.out.println("삭제후 map entry의 개수 : "+map.size());

//		clear() : 포함된 map 객체 삭제 처리
		map.clear();
		System.out.println("전체 삭제후 map entry의 개수 : "+map.size());
	}

}
