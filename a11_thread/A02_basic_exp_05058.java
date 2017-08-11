/*
 # Runnable �������̽� Ȱ�� Ȯ��
 1) ShoppingMall�� �����ϴ� ��(Customer) 
 	- Runnable interface�� ���(implements)�ؼ� ���� �ܰ踦 ó���ϴ� ������ ����
 	- @@@�� @@�ܰ� ó���߽��ϴ�.(1�ܰ�)
 	- �ܰ� : �α���, ����Ȯ��, ���Ǳ���, ��ٱ���Ȯ��, ����,  ���ó��, �α׾ƿ�(2�ܰ�)
 	- @@@�� �α��� �ܰ��Դϴ�.
 
 2) Customer 3������ ���ӽ�, Thread�� ó��.
*/
package a11_thread;

class Customer implements Runnable{
	String name;

	public Customer(String name) {
			this.name=name;
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String [] phase = {"�α���", "����Ȯ��", "���Ǳ���", "��ٱ���Ȯ��", "����", "���ó��", "�α׾ƿ�"};
		for(int step=0; step<phase.length; step++){
			System.out.println(name+"��. "+(step+1)+"��° ���� "+phase[step]+" �ܰ� �����մϴ�.");
		}
	}
	
}
public class A02_basic_exp_05058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer [] list = {new Customer("ȣ����"), new Customer("�޽�"), new Customer("���")};
		for(Customer name : list){
			new Thread(name).start();
		}
	}

}
/*
 # Thread �켱����
 1) ��Ƽ ������� ���ü� �Ǵ� ���ļ����� �����Ѵ�.
 	- ���ü� : ��Ƽ �۾��� ���ؼ� cpu(�ϳ��� �ھ�)�� ��Ƽ �����尡 �����ư��� ����
 	- ���ļ� : ��Ƽ �۾��� cpu(��Ƽ�� �ھ�)���� ���� �����带 ���ÿ� ����
 
 2) Ư���� ��쿡 �켱 ������ �����ؼ� ó���ؾ��� �ʿ䰡 �ִ� ���
 	- thread.setPriority(1~10)  -> 
 	- �켱 ������ ���� Thread�� ������ ��ȸ�� �� ���� ������ ó��.
*/