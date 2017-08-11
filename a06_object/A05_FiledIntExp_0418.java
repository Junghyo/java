/*
 Ȯ�ο���.
 1) A05_FiledIntExp_0418.java main()Ŭ�������� ����
 
 2) BaseballTeam ��ü Ŭ���� ����
 
 3) �ʵ� : ���̸�, ��, ��, ��, �·�
 	- �ʵ� ���̸��� �ʱⰪ ���� "���̸� ����";
 	- �����ڸ� ���� �ʱⰪ ����
 	- �ʵ忡 �Է°� ó��
 
 4) ��¿���(��ü 2�� ����)
 	- @@@��, @@��, @@��, @@��, �·� @@@
 	- �Է°��� ���� �����ڸ� ���� ���
 	- filed���� ó���� �����ڸ� ���� �ʱ� ������ ����
 	- ���ó��
*/
package a06_object;
class BaseballTeam{
	String teamName="����";
	int win;
	int lost;
	int draw;
	double winRate;
	BaseballTeam(String teamName, int win, int lost, int draw){
		this.teamName=teamName;
		this.win=win;
		this.lost=lost;
		this.draw=draw;
		this.winRate=(double)win/(win+lost+draw);
	}
	BaseballTeam(){
		System.out.println(teamName+"\t"+win+"��\t"+lost+"��\t"+draw+"��\t"+winRate+"�·�");
	}
	void show(){
		System.out.println(teamName+"\t"+win+"��\t"+lost+"��\t"+draw+"��\t"+winRate+"�·�");
	}
}

class Player{
	Player(){}
	Player(int age){}  // �Է°��� ������ �ٸ��� ������ �����ϴ�.
	Player(int height, int age){}
	Player(String name){} // �Է°��� ������ ������ type�� �ٸ��� ������ ����
//	Person(int age, int height){} type�� ���� ������.
	Player(String name, int age){}
	Player( int age, String name){} // �Է°��� type�� ������ �ٸ��� ���𰡴�
	
}

public class A05_FiledIntExp_0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballTeam team00 = new BaseballTeam();
		BaseballTeam team01 = new BaseballTeam("LG", 8, 0, 6);
		BaseballTeam team02 = new BaseballTeam("�λ�", 6, 0, 8);
		team01.show();
		team02.show();
	}

}
/*
 # ������ �����ε�(overloading)
 1) �ܺο��� �ԷµǴ� ���� �پ��Ͽ� ��ü�� filed���� ���� ���·� ó���� ��, 
    ���� ������ �����ڸ� ������ �� �ִ�. �ڹٿ��� Ŭ������� ������ �����ڸ�
    2���� �̻� ������ �� �ִµ� �̸� �����ε��̶�� �Ѵ�.
  
 2) ������ �����Ģ(�̸��� �����ϴ���)
 	
 	- �Է°��� ������ �ٸ��� ������ �� �ִ�.
 	Person(){}, Person(int i){}, Person(int i, int j){}
 	
 	- �Է°��� ������ �����ϴ��� �ٸ� ������ type���� �����ϸ� �����ϴ�
 	Person(int i){}, Person(String n){}
 	
 	- �Է°��� ������ �����ϴ��� ������ �ٸ� ������ type���� �����ϸ� �����ϴ�
 	Person(String name, int age){}
 	Person(int age, String name){}
 
*/
