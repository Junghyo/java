/*
 # 배열
 1) 배열 객체의 한게
 	- String[] names={"호날두", "루니"};
 	- 배열 데이터의 크기가 변하는 내용인 동적 배열은 자바의 기본 배열type에서는 지원하지 않음

 2) 데이터를 저장할 때 어떤 자료구조의 형태가 필요로 하는가?
 	- 순번, 중복, key-value, index, 계층구조
 
 # 컬렉션이란?
 1) 데이터의 저장을 객체를 이용하여 효율적으로 추가, 삭제, 검색

 2) 자바 컬렉션은 객체를 수집해서 저장하는 역할을 하고 있다.
 
 			  	 Collection
 	1) List					2) Set				3) Map
	(순서, 중복 허용)		(순서X, 중복X)		(key, value)
 	- ArrayList				- HashSet			- HashMap
 	- Vector				- TreeSet			- HashTable
 	- LinkedList								- TreeMap
 												- Properties
 												
 # 제네릭(Generic)
 1. 컬렉션 구조의 특정 클래스 type에 대한 선언을 하지 않으면
    잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 나올 수 있기에
    java5부터 지원하고 있다.
  
 2. 컴파일 시 강한 type checking을 할 수 있다.
 
 3. 컬렉션의 활용
 	1) ArrayList li = new ArrayList();
    	- 모든 객체의 최상위 클래스인 Object를 넣을 수 있는 동적배열인 list형태의
    	  ArrayList를 객체 생성
    	  ex) li.add("홍길동");		<--- Object o = "홍길동";
    	  	  li.add(new Person()); <--- Object o = new Person();
    	  	  (Person)li.get(1);    <--- Person객체의 멤버를 사용하려면 typecasting이 필요

 4. ArrayList(컬렉션)에는 여러 객체Type이 들어갈 수 있다 ? 
 	-> 문제 발생
 	   1) 어떤 객체 Type이라도 들어갈 수 있다.
 	   2) 해당 내용을 가져올 경우 들어간 객체Type으로 casting해서 사용해야 한다.
 	  
 5. 하나의 객체Type만 들어오게끔 처리 : Generic
 	- 컬렉션클래스<지정한객체type> li = new 컬렉션클래스<지정한객체type>();
 	- 다른 type을 입력시 에러발생(지정한 type만 추가 가능)
 	- 가져올 때, type casting할 필요가 없다.
 	
 # 컬렉션 객체의 공통 메서드
 	- add(추가할 객체) : 기본적인 추가 처리
 	- get(index) : 해당 index위치에 있는 객체 가져오기
 	- ArrayList<String>fruits = new ArrayList<String>();
 	- fruits.add("사과");
 	- fruits.add("바나나");
 	- fruits.get(0); -> 사과
*/			
package a12_collection;

import java.util.ArrayList;

class Person{
	String name="Basic";
}
class Woman{
	private String name;

	public Woman(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class A01_basic_0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		제너릭을 사용하지 않았을 경우
		ArrayList list = new ArrayList();
//		다양한 객체들을 할당 가능		
		list.add("Ronaldo");
		list.add(new Person());
		System.out.println(list.get(0));
//		해당 객체의 멤버를 사용하지 못함 -> 상속한 상위 객체이기 떄문에
//		System.out.println(list.get(1));
//		사용하기 위해선 type casting 필요
		Person p = (Person)(list.get(1));
		System.out.println(p.name);
//		동일한 객체type으로 ArrayList를 사용할 필요가 있다.
//		이 때 선언하는 것이 제너릭이다.

//		1) String 제너릭 선언
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("사과");
		fruits.add("바나나");
//		fruits.add(new Person());	String이 아닌 다른 객체는 할당하지 못한다.
		fruits.add(p.name);
		fruits.add((String) list.get(0));
		System.out.println(fruits.size());
		System.out.println(fruits.get(2));

//		2) Woman 제너릭 선언
		ArrayList<Woman> ladies = new ArrayList<Woman>();
//		ladies.add("사과"); Woman객체를 제외한 다른 객체는 할당 불가
		ladies.add(new Woman("Beyonce"));
		ladies.add(new Woman("Amanda Seyfried"));
		ladies.add(new Woman("Natalie Portman"));
//		제너릭을 선언했기 때문에 type casting 없이도 해당 멤버 사용 가능
		System.out.println(ladies);
		System.out.println(ladies.get(0));
		System.out.println(ladies.get(0).getName());
		System.out.println(ladies.get(1).getName());
		System.out.println(ladies.get(2).getName());
		
	}

}
