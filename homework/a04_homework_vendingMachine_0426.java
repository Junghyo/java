/* 
 # ���� - A16_0426
 ���Ǳ�(�������̽�)
  - �߻�޼���
  display(); @@@�� �Ǹ��ϴ� ���Ǳ�
  manu(); 1. @@: @@@�� 2. @@: @@@��
  
  - ����޼���
  insertCoin(�Է°�) @@@���� ���ԵǾ����ϴ�.
  choiceMenu(��ȣ�� ���ڿ�)
  outProduct() @@@�� ���ɴϴ�. �ܾ��� @@@�Դϴ�.

*/ 
package homework;

interface VandingMachine{
	String [] product={"Ŀ��", "��ȭ��", "���䷹��"};
	int [] price={1500,2000,1000};
	void display();
	void menu();
	default int insertCoin(int money){
		System.out.println(money+"�� ���ԵǾ����ϴ�.");
		money++;
		return money;
	}
}
public class a04_homework_vendingMachine_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
