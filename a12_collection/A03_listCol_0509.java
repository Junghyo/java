/*
 # List 컬렉션
 1) 객체를 일렬로 늘어놓은 구조
    ----------힙영역--------
    |       List 컬렉션     |
     0, 1, ....., n-1
 
 2) 기능 메서드
  - add(객체) : 객체를 맨 끝에 추가
  - add(index, 객체) : 주어진 인덱스에 객체를 추가
  - set(index, 객체) : 주어진 인덱스에 객체를 바꿈   
  - get(index) : 주어진 인덱스에 저장된 객체 가져옮
  - size() : 저장되어 있는 전체 객체 수를 리턴
  - contains(객체) : 주어진 객체가 저장되어 있는지 여부(boolean값)
  - isEmpty() : 컬렉션이 비어있는지 여부(boolean값)
  - clean() : 저장된 모든 객체를 삭제
  - remove(index) : 주어진 인덱스에 저장된 객체 삭제
  - remove(객체) : 주어진 객체를 삭제
*/

package a12_collection;

import java.util.ArrayList;

public class A03_listCol_0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> starWars = new ArrayList<String>();
//		.add() : 추가		
		starWars.add("Yoda");
		System.out.println("add");
		for(String name : starWars) System.out.println(name);
//		add(index, 객체) : 특정 위치에 추가		
		starWars.add(0, "Skywalker");
		System.out.println("add(idx,)");
		for(String name : starWars)  System.out.println(name);
		System.out.println("get(1)");
		System.out.println(starWars.get(1));
//		remove(index) : 삭제
		System.out.println("remove(0)");
		starWars.remove(0);
		System.out.println("삭제 후");
		for(String name : starWars)  System.out.println(name);
//		isEmpty() : 현재 컬렉션이 비어 있는지 여부 조사
		System.out.println("isEmpty()");
		System.out.println(starWars.isEmpty());
//		남은 객체 삭제 처리 후, 확인
		starWars.remove(0);
		System.out.println(starWars.isEmpty());
		starWars.add("Darth Vader");
		for(String name : starWars)  System.out.println(name);
//		set(index, 변경할 객체)
		System.out.println("변경");
		starWars.set(0, "R2-D2");
		for(String name : starWars) System.out.println(name);
		
	
	}

}
/*
 ArrayList 확인예제
 과일가게 ArrayList : sellList
 장보는 사람 ArrayList : buyList
 시나리오 
 - 사과, 바나나, 딸기, 오렌지, 수박을 팔고 있습니다. add처리
 - 장보는 사람이 사과와 딸기를 구매했습니다. remove, add처리
 - 과일가게에서 바나나를 사과로 변경헀습니다. set처리
 - 장보는 사람이 사과와 딸기를 다 먹었습니다. remove처리
 - 장보는 사람이 가지고 있는 과일이 없다면 과일가게에서 남은 과일 중 하나를 장보는 사람에게 사은품으로 주기로 했습니다.
 
*/
