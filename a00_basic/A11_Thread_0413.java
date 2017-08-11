/*
 �ϳ��� ���μ��� ������ ���� ���α׷��� ȿ�������� ó���� ����
 ���α׷������� ���� �߻��Ѵ�.
 �̰��� Thread��� �ϴµ� ����
 1) Server vs Client���α׷�
 2) ���������� ���� ������ ó���ؾ� �ϴ� ���α׷�
 3) ��Ʈ��ũ ���α׷�
 �� ���� Ȱ��ǰ� �ִ�. 
 ����Ȯ���� ��Ȯ�ϰ� ������ ������ time slicing ������� ������ ȿ�������� ó���� �� �ʿ��� ���α׷��̴�.
*/
package a00_basic;

class Come extends Thread{
// ������ ó�� : class Ŭ������ extends Thread{}
	public void run(){
	// �����带 ó���ϴ� run()�� ������	
		for(int i=0; i<10; i++){
			System.out.println("WELCOME");
		}
	}
	
}
class Go extends Thread{
		public void run(){
			for(int j=0; j<10; j++){
				System.out.println("Good-Bye");
			}
		}
		
	}


class Bank extends Thread{
	String account;
	Bank(String account){
		this.account = account;
	}
	public void run(){
		for(int cnt=1; cnt<100; cnt++){
			System.out.println(account+"��. "+cnt+"�� ������ �����մϴ�.");
		}
	}
}
public class A11_Thread_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Come c = new Come();
		Go g = new Go();
		// Thread ��ü�� run�� start()�� ȣ��ȴ�.
		c.start();
		g.start();
		
		Bank b1 = new Bank("�ڿ���");
		Bank b2 = new Bank("���߱�");
		Bank b3 = new Bank("����ȯ");
		b1.start();
		b2.start();
		b3.start();
	}

}
