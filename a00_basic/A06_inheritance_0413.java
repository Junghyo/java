/*
 ��� : ��ü�� ����� ���� �پ��� ��ü�� ����� �� �ְ� ����� 
 		�ڹٿ����� oop(��ü�������α׷�)�� �մ��� ������ ���Ѵ�.
*/
package a00_basic;

class Father{
	String name;
	void intro(){
		System.out.println("�̸��� "+name+"�Դϴ�.");
	}
}
class Son extends Father{
// Father Ŭ������ ��ӹ��� Son Ŭ����
// class Ŭ������ extends ����Ŭ������	
	int age;
	void intro2(){
		System.out.println("���̴� "+age+"�Դϴ�");
	}
}
/*
 ����� �ϰ� �Ǹ� ���� Ŭ������ ����Ŭ������ ����� ������
 �������� �ʴ��� ����� �� �ְ� �ȴ�. 
*/
public class A06_inheritance_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		f.name="ȫ�Ǽ�";
		f.intro();
		Son s = new Son();
		s.name = "ȫ�浿";
		// ������ �޼��带 �������� �ʴ��� ����� �ϸ� Ȱ���� �� �ִ�.(name�� Father Ŭ�������� ����Ǿ����� ��� ����)
		s.age = 25;
		s.intro();
		s.intro2();
	}

}

/* Ȯ�ο���
 Wokrman
 	�Ӽ��� kind (������ ����)
 	�޼��� work() @@@�� ���� �ϴ�.
 
 FireMan
 	�Ӽ��� wkLoc (���� �ϴ� ���)
 	�޼��� turnoff() @@@�� @@@���� ���� ����.
*/
