/*
 Collection : 자바에서는 여러 메모리 구조에 의해 동적인 객체가 따로 지원된다. 
*/
package a00_basic;

import java.util.ArrayList;

public class A09_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"호날두", "메시", "루니"};
		// 배열이 한번 만들어지고 이 배열에 새로운 객체나 변수를 추가하려는 경우
		// 새로운 배열을 선언해야 하는 고정적인 특성이 있다.
		// 동적배열을 위하여 객체가 지원된다.
		// 1). ArrayList<Type>	import 추가해야 함.
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("벤제마");
		list.add("베일");
		list.add("즐라탄");
		// .add(추가객체)
		// .size() : 객체의 크기
		// .get(index) : 해당 객체를 가져옴
		for(int idx=0; idx<list.size(); idx++){
			System.out.println( list.get(idx) );
		}
		list.remove(0);
		// .remove(index) : 해당 인덱스의 객체를 삭제시킴
		list.set(1,"네이마르");
		// .set(index, 객체) : 해당 인덱싀의 객체를 변경함
		System.out.println("remove 및 set 결과");
		for(int idx=0; idx<list.size(); idx++){
			System.out.println( list.get(idx) ); 
		}

	}

}
