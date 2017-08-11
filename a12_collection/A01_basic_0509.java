/*
 # �迭
 1) �迭 ��ü�� �Ѱ�
 	- String[] names={"ȣ����", "���"};
 	- �迭 �������� ũ�Ⱑ ���ϴ� ������ ���� �迭�� �ڹ��� �⺻ �迭type������ �������� ����

 2) �����͸� ������ �� � �ڷᱸ���� ���°� �ʿ�� �ϴ°�?
 	- ����, �ߺ�, key-value, index, ��������
 
 # �÷����̶�?
 1) �������� ������ ��ü�� �̿��Ͽ� ȿ�������� �߰�, ����, �˻�

 2) �ڹ� �÷����� ��ü�� �����ؼ� �����ϴ� ������ �ϰ� �ִ�.
 
 			  	 Collection
 	1) List					2) Set				3) Map
	(����, �ߺ� ���)		(����X, �ߺ�X)		(key, value)
 	- ArrayList				- HashSet			- HashMap
 	- Vector				- TreeSet			- HashTable
 	- LinkedList								- TreeMap
 												- Properties
 												
 # ���׸�(Generic)
 1. �÷��� ������ Ư�� Ŭ���� type�� ���� ������ ���� ������
    �߸��� Ÿ���� ���� �� �ִ� ������ ������ �������� ���� �� �ֱ⿡
    java5���� �����ϰ� �ִ�.
  
 2. ������ �� ���� type checking�� �� �� �ִ�.
 
 3. �÷����� Ȱ��
 	1) ArrayList li = new ArrayList();
    	- ��� ��ü�� �ֻ��� Ŭ������ Object�� ���� �� �ִ� �����迭�� list������
    	  ArrayList�� ��ü ����
    	  ex) li.add("ȫ�浿");		<--- Object o = "ȫ�浿";
    	  	  li.add(new Person()); <--- Object o = new Person();
    	  	  (Person)li.get(1);    <--- Person��ü�� ����� ����Ϸ��� typecasting�� �ʿ�

 4. ArrayList(�÷���)���� ���� ��üType�� �� �� �ִ� ? 
 	-> ���� �߻�
 	   1) � ��ü Type�̶� �� �� �ִ�.
 	   2) �ش� ������ ������ ��� �� ��üType���� casting�ؼ� ����ؾ� �Ѵ�.
 	  
 5. �ϳ��� ��üType�� �����Բ� ó�� : Generic
 	- �÷���Ŭ����<�����Ѱ�ütype> li = new �÷���Ŭ����<�����Ѱ�ütype>();
 	- �ٸ� type�� �Է½� �����߻�(������ type�� �߰� ����)
 	- ������ ��, type casting�� �ʿ䰡 ����.
 	
 # �÷��� ��ü�� ���� �޼���
 	- add(�߰��� ��ü) : �⺻���� �߰� ó��
 	- get(index) : �ش� index��ġ�� �ִ� ��ü ��������
 	- ArrayList<String>fruits = new ArrayList<String>();
 	- fruits.add("���");
 	- fruits.add("�ٳ���");
 	- fruits.get(0); -> ���
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
//		���ʸ��� ������� �ʾ��� ���
		ArrayList list = new ArrayList();
//		�پ��� ��ü���� �Ҵ� ����		
		list.add("Ronaldo");
		list.add(new Person());
		System.out.println(list.get(0));
//		�ش� ��ü�� ����� ������� ���� -> ����� ���� ��ü�̱� ������
//		System.out.println(list.get(1));
//		����ϱ� ���ؼ� type casting �ʿ�
		Person p = (Person)(list.get(1));
		System.out.println(p.name);
//		������ ��ütype���� ArrayList�� ����� �ʿ䰡 �ִ�.
//		�� �� �����ϴ� ���� ���ʸ��̴�.

//		1) String ���ʸ� ����
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("���");
		fruits.add("�ٳ���");
//		fruits.add(new Person());	String�� �ƴ� �ٸ� ��ü�� �Ҵ����� ���Ѵ�.
		fruits.add(p.name);
		fruits.add((String) list.get(0));
		System.out.println(fruits.size());
		System.out.println(fruits.get(2));

//		2) Woman ���ʸ� ����
		ArrayList<Woman> ladies = new ArrayList<Woman>();
//		ladies.add("���"); Woman��ü�� ������ �ٸ� ��ü�� �Ҵ� �Ұ�
		ladies.add(new Woman("Beyonce"));
		ladies.add(new Woman("Amanda Seyfried"));
		ladies.add(new Woman("Natalie Portman"));
//		���ʸ��� �����߱� ������ type casting ���̵� �ش� ��� ��� ����
		System.out.println(ladies);
		System.out.println(ladies.get(0));
		System.out.println(ladies.get(0).getName());
		System.out.println(ladies.get(1).getName());
		System.out.println(ladies.get(2).getName());
		
	}

}
