/*
 # ��Ƽ ������
 1) �ü��
 	- ���α׷�(���ø����̼�) ���� �� ���μ����� ����ȴ�.
 	- �ϳ��� ���α׷��� ���� ���� ���μ��� ��� ���� (�ͽ��÷η��� �ΰ� �����, �ΰ��� ���μ����� ����)
 
 2) ��Ƽ �½�ŷ(multi tasking)
 	- �� ���� �̻��� �۾��� ���ÿ� ó��
 	- �ϳ��� ���μ���(���α׷�)���� �ΰ��� �̻� �۾�.
 	  ���� ��� �̵�� �÷��̾�� �޽��� ���� -> multi thread�� ����
 
 # ��Ƽ ���μ����� ��Ƽ ������	  
 
 				 ��Ƽ ���μ���
 ���μ���1	���μ���2	���μ���3	���μ���4		
 - ������1
 - ������2
 - ������3
 
 1) ��Ƽ ���μ��� : �ü������ �Ҵ���� �޸𸮸� ������ �ֱ⿡ ���� ���������� ó��
 	ex) ����, �޽���

 2) ��Ƽ ������ : �ϳ��� ���μ������� ����Ǳ⿡ ������ ������ ��ģ��.
 	ex) �޽������� ���Ͼ��ε� ��, ä�ÿ� ������ ��ģ��.
 	
 # �ڹ� �ڵ带 ���� ������ ó��
 1) main()�ȿ��� ����Ǵ� ������ �����帧�� thread�� ó��.
 	- �̱� ������ ���ø����̼�
 	ex) ���μ���(1) : �ڵ�1 -> �ڵ�2 -> �ڵ�3 -> �ڵ�4
 	
 	- ��Ƽ ������ ���ø����̼�
 	ex) ���μ���(1)
 			���ξ�����
 			�ڵ�1
 			�ڵ�2 -> �ڵ�2-1 -> �ڵ�2-2
 			�ڵ�3 						-> �ڵ�3-1 -> �ڵ�3-2
 			�ڵ�4
 			
 # Thread ������ ����
 1) Thread Ŭ�����κ��� ���� ����
 	- Runnable �������̽��� implements�� Ŭ������ Thread�� ������ �Ű������� ����
 		ex) class Task implements Runnable{}
 			Thread t1 = new Thread( new Task() );
 			
 2) Thread ���� Ŭ�����κ��� ����
 	- Thread Ŭ������ ����ؼ� �ٷ� run()�� �����ؼ� ����
 	ex) class Task2 extends Thread{}
 		Task2 t2 = new Task2();
*/
package a11_thread;

/* 
 ������ ���α׷��� �ϳ��� ���μ������� ���� ��Ƽ �½�ŷ�� �� �ִ� �����带 ����
 ȿ�����̰� ������ ó���� �� �ְ� ���� �ش�.
 ex) ���࿡ ���� �ѻ���� ������ ���������� �ٸ� ����� ������ �������� ���Ѵٸ� ��ȿ�����̰� �ð��� ���� ����ϰ� �ȴ�.
 	 �� ���, thread��� ���� ������ �־� ������ �ܲ����� ���� ��������ڰ� ó���� �� �ִٸ�
 	 ���� ����� ���ôٹ������ ������ ó���� �� �ְ� �ȴ�.
*/
class Person{}
// 1. implements�� thread ó��
// class Account extends Person implements Runnable{ <--- Person Ŭ���� ��ӹ��� �� �ִ�.
class Account implements Runnable{
	private String name;

	public Account(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int work=1; work<=10; work++){
			System.out.println(name+"���� "+work+"��° ������ ó���մϴ�.");
		}
	}
	
}

// 2. extends Thread�� ���� ���
// 		1) Ŭ������ Thread�� ��ӵǾ��⿡
//		2) Ŭ������ ��ü�� �ٷ� Ȱ���� �� �ִ�.

// class Traveler extends Person extends Thread  <---- �ڹٿ����� ���� ��Ӹ� ����.(�߰� ����� �Ұ�)
// �߰� ����� �ʿ��� ��쿡�� Runnable interface�� implements �ؾ� �Ѵ�.
class Traveler extends Thread{
	private String name;
	
	public Traveler(String name) {
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		String [] locs={"New York", "Chicago", "Vancouver", "Los Angeles", "Seoul", "Tokyo", "Paris"};
		for(int idx=0; idx<locs.length; idx++){
			System.out.println(name+" is going to "+locs[idx]+"!");
		}
	}
	
}

public class A01_basic_0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Runnable�� implements�� Thread ó�� �ܰ�
//			1) ��ü ����
//			2) Thread�� �����ڷ� �ش� ��ü����		
		Account a1 = new Account("ȣ����");
		Thread t1 = new Thread(a1);
//			3) start()�� run()�� ȣ��
		t1.start();
		Thread t2 = new Thread(new Account("�޽�"));
		t2.start();
		new Thread(new Account("���")).start();
		
//		2. Thread ����� �ٷ� Ȱ�� ����
		Traveler [] list = {new Traveler("Ronaldo"), new Traveler("Messi"), new Traveler("Rooney")};
		for(Traveler name : list){
			name.start();
		}
	}

}
