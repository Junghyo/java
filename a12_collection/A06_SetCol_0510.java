/*
 # 기타 List 객체들
 1) Vector : ArrayList와 동일한 내부 구조를 가졌다.
 			 동기화 메소드 구성으로 속도 이슈가 있어서
 			 현재는 ArrayList를 주로 사용한다.
 		- Vector<E> vlist = new Vector<E>();
 		- vlsit.add(), vlist.remove(), vlist.get(index)
 		
 2) LinkedList : ArrayList와 사용방법은 동일. 내부 구조는 완전히 다르다.
 				 인접 참조를 링크해서 체인처럼 관리한다.
 				 끝에서 추가삭제는 ArrayList가 빠르나 중간의 특정index 추가삭제는
 				 LinkedList가 훨씬 빠르다. 검색 속도는 ArrayList에 비해 느리다.	
 		- LinkedList<E> lklist = new LinkedList<E>();
 		- .add(), remove(), get()		  				 
 		[		]ㅡ[		]ㅡ[		]ㅡ[		]	
 	
 		
 # Set 컬렉션
  ----힙영역----
  |	Set 컬렉션 |
  --------------
 1) 중복은 X(동일객체 2개를 넣을 수 없다.), 순서확보 X
 2) add(추가), contains(객체), isEmpty(), size()
 3) Iterator<E> iterator() : 지정된 객체를 한번씩 가져오는 처리, 한번 가져오면 없어짐
 
 # Iterator 인터페이스
 1) 메서드
 	- hasNext() : 가져올 객체가 있으면 true, 없으면 false
 	- next() : 컬렉션에서 하나의 객체를 가져오는 처리
 	
 # Set 컬렉션을 통해 데이터 처리
 1) Set은 인터페이스이기에 상속받은 하위 객체들을 이용해서 추가, 삭제할 수 있다.
 	- HashSet, LinkedHashSet, TreeSet
 ex) HashSet<String> set = new HashSet<String>();
 	 set.add("100$");
 	 set.add("500$");
 	 set.add("1000$");
 	 set.size() : 크기값 가져옮
 	 Iterator<String> iter = set.iterator() : 
 	 		while( iter.hasNext() )		-- 가진 객체수 만큼 loop
 	 		iter.next() : 실제 객체를 가져온다. 
*/
package a12_collection;

import java.util.HashSet;
import java.util.Iterator;

public class A06_SetCol_0510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set은 중복을 허용하지 않고 순서를 확보하지 못한다.
//		HashSet은 Set인터페이스의 대표적인 실제 클래스
		HashSet<String> set = new HashSet<String>();
//		add를 통해 주머니에 동전 삽입.
		set.add("30$");
		set.add("500$");
		set.add("100$");
		set.add("100$");
		set.add("500$");
		set.add("500$");
		set.add("500$");
		set.add("1000$");
		System.out.println("총 주머니에 있는 객체 수: "+set.size());
//		중복을 허용하지 않아 총 5개를 add했지만 객체 수는 100$, 500$, 1000$ 3개로 처리됨	
		
//		Set은 Iterator를 통해서 가져올 수 있다.
//		iterator() 메서드 활용
		Iterator<String> iter = set.iterator();
		String elem="";
		
//		객체 수 만큼 loop		
		while( iter.hasNext() ){
//			단위 객체를 가져옮
			elem=iter.next();
			System.out.println(elem);
		}
	}

}


