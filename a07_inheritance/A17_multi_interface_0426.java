
/*
 # ���� �������̽� ����
 1) ����Ŭ������ ���� �������̽� ������ �� �� �ִ�.
 �������̽�1	<---	
 �������̽�2	<---		���� ���� ��ü
 �������̽�3	<---
 
 2) public class ����Ŭ������ implements �������̽�1, �������̽�2, �������̽�3{
 		- �߻�޼��� ������ ó��
 	}
 
 3) SoundWay �������̽�
 	- sound();
 	FlyWay �������̽�
 	- flying();
 	ShowColor �������̽�
 	- paint();
 	���� ����Ŭ���� Duck�� implement������ ó���� ���� ����

*/ 

package a07_inheritance;

interface SoundWay{
	void sound();
}
interface FlyWay1{
	void flying();
}
interface ShowColor{
	void color();
}
class Duck_Model implements SoundWay, FlyWay1, ShowColor{
	private String modelType;
	Duck_Model(){
		modelType="���� �ʱ� ��";
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println(modelType+"�� ������ ���");
	}

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		System.out.println(modelType+"�� ���� ���Ѵ�.");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println(modelType+"�� �ваŸ���.");
		
	}
	
}
public class A17_multi_interface_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck_Model d1 = new Duck_Model();
		d1.color();
		d1.flying();
		d1.sound();

	}

}


