/*
 # �߻�Ŭ����
 1) �߻� : ���� ���� ����Ǵ� Ư���� �����ϴ� ���� ���Ѵ�.
 	- ��, ����, ����� : ���� -> ����Ư�� -> ����
 	- �Ｚ, ����, LG -> ȸ��
 	
 2) �߻�Ŭ������ ���� Ŭ������ �������� �κ��� �����ؼ� ����� ���� ���Ѵ�.
 	����Ŭ������ �ƴϱ⿡ ��ü ������ ���� ���ϴ� ���� ���Ѵ�.
 	
 3) �߻� Ŭ���� ���� ����
 	- ����޼���	ex) eat(){ �Դ� ó�� } -> ����
 	- �������̵�(������ �� �޼��� ����); 
 	- move(){ �پ��� ���·� �������� ó�� };
 		abstract void move();	<---- {}body�κ��� ����
 		�߻�޼���
 	- �߻�޼��尡 �ϳ��� �ִ� Ŭ������ �߻�Ŭ����
 
 4) �߻�Ŭ������ ���� ���� ��ü ����
 	- main()
 	- �߻�Ŭ���� ��ü���� = new ������ü();
*/
package a07_inheritance;

abstract class Animal01{
	String name;
	Animal01(String name){
		this.name=name;
	}
//	����޼���
	public void eat(){
		System.out.println(name+"�� ���ְ� �Դ�.");
	}
//	����Ŭ�������� �������� �޼���
//	�߻�޼��� �տ��� abstract modifier�� �ٰ�
//  �޼�����{}(body) �κ��� ����.
//	Ŭ���� �޼���  ��� �߻�޼���(abstract)�� �ϳ��� ������
//	�߻�Ŭ������ �ȴ�.(Ŭ������ abstract�� �������־�� ��)	
	public abstract void move();
}

class Bird extends Animal01{
//	�߻�Ŭ������ ��ӹ��� ����Ŭ������
//  �ݵ�� �߻�޼��带 ������ �Ͽ��� �Ѵ�.
//	��� �޼������ ���ϼ��� ������ �� �ִ�.	
	Bird(){
		super("��");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name+"�� �ϴ��� ����.");	
	}
	
}

class Insect extends Animal01{
	Insect(){
		super("����");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ���� ���ٴѴ�.");
	}
	
}

class Fish extends Animal01{
	Fish(){
		super("�����");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ������ ���ģ��.");
	}

}

public class A10_abstractClass_0425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal01[] a1 = {new Bird(), new Insect(), new Fish()};
		for(Animal01 kind : a1){
			kind.eat();
			kind.move();
		}
		Animal01 a2 = new Bird();
		a2.eat();
		a2.move();
	}

}
