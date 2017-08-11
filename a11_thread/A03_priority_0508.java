/*
 # Thread �켱����
 1) ��Ƽ ������� ���ü� �Ǵ� ���ļ����� �����Ѵ�.
 	- ���ü� : ��Ƽ �۾��� ���ؼ� cpu(�ϳ��� �ھ�)�� ��Ƽ �����尡 �����ư��� ����
 	- ���ļ� : ��Ƽ �۾��� cpu(��Ƽ�� �ھ�)���� ���� �����带 ���ÿ� ����
 
 2) Ư���� ��쿡 �켱 ������ �����ؼ� ó���ؾ��� �ʿ䰡 �ִ� ���
 	- thread.setPriority(1~10)  -> 
 	- �켱 ������ ���� Thread�� ������ ��ȸ�� �� ���� ������ ó��.
*/
package a11_thread;

class Patient extends Thread{
	private String kind;

	public Patient(String kind) {
		this.kind = kind;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int step=1; step<=10; step++){
			System.out.println(kind+"�� �������� "+step+"�ܰ� ��ġ�� �Ͽ����ϴ�.");
		}
	}
}
public class A03_priority_0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient [] arr = {new Patient("ġ��ȯ��"), new Patient("�Ϲ�ȯ��"), new Patient("����ȯ��")};
//		�ش� �����忡 ���� �켱������ ���� ó��
		arr[2].setPriority(10);
		for(Patient p:arr){
			p.start();
		}

	}

}
