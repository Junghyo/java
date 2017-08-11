/*
 # �͸� ���� ��ü �����(Anonymous Class)
 1) �������̽��� implements�� Ŭ������ �ַ� ������ �ϱ� ���� ������ �Ѵ�.
 	������ ������ �ƴ� ��ȸ�����θ� ����ϴ� ��찡 �ִ�.
 	�� ��, ��ȸ������ ���� ��ü�� ����� ���� ȣ��� ���ÿ� ����� ����
 	�͸� ���� ��ü��� �Ѵ�.
 
 2) ���� : �������̽� ���� = new �������̽�(){
 				- �������̽��� ������ �߻�޼���� �����޼��� ����
 		   }
 
 3) example(main(), ȣ���ϴ� Ŭ����)
 	- interface RemoteController{,,,}
 	  RemoteController r1 = RemoteController(){
 			public void turnOn(){...};
 			public void turnOff(){...};
 	  }
 	  r1.turnOn();
 	

*/ 
package a07_inheritance;

public class A16_interface_annonymous_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc =new RemoteControl(){

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("�ڵ����� Ű��.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("�ڵ����� ����.");
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				System.out.println("�ڵ��� ������ "+volume+"���� �����ϴ�.");
				
			}
			
		};
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}

}
/*
 # ����
 ���Ǳ�(�������̽�)
  - �߻�޼���
  display(); @@@�� �Ǹ��ϴ� ���Ǳ�
  manu(); 1. @@: @@@�� 2. @@: @@@��
  
  - ����޼���
  insertCoin(�Է°�) @@@���� ���ԵǾ����ϴ�.
  choiceMenu(��ȣ�� ���ڿ�)
  outProduct() @@@�� ���ɴϴ�. �ܾ��� @@@�Դϴ�.

*/ 

