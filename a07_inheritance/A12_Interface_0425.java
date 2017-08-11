/*
+ # �������̽�
 1) ��ü�� ��� ����� ������ type�� ���Ѵ�.
 ���� �ڵ� <--> �������̽�	<--> ��ü
 
 2) ���� �ڵ� ���鿡�� �ڵ� ���� ���� ����
 ����� ���ϰ��� �پ�ȭ�� �� �ִ� ������ ����
 
 # �������̽� Story
 ��¡����Ʈ	<---�Է�, ��� interface ---> ����1ȣ fly(), ����2ȣ fly()
 
 - interface�� ���������� overriding�� �� �ִ� �߻�޼��常 �����ϰ� 
   ����Ŭ�������� ���Ŀ� �����ϰ� �ϴ� Ȯ�强�� �����ϰ� ���� �� �ִ�. 
*/ 

package a07_inheritance;

class Mz01{
	Flyway f;
	void attack(){
		System.out.println("������ �ϸ鼭 ������ ��Ű��.");
	}
	void setFlying(Flyway wing){
		this.f=wing;
	}
	void flyToTheSky(){
		System.out.print("��¡��");
		if(f!=null){
			f.fly();
		}else{
			System.out.println(" ������ �������� ����.");
		}
	}

}

interface Flyway{
	void fly();
}

// �������̽��� ��� ���� ����Ŭ���� ����
// �������̽��� implements�� ���ؼ� ��� �޴´�.
// Flyway f01 = new Wing01();
// f01.fly();
class Wing01 implements Flyway{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(" ���׸� ����ٳ������.");
		
	}
	
}
class Wing02 implements Flyway{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(" ���ָ� ����ٳ������.");
		
	}
	
}
public class A12_Interface_0425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mz01 m1 = new Mz01();
		Wing01 w1 = new Wing01();
//		������ �������� ����		
		m1.flyToTheSky();
//		���� ����
//		void setFlying(Flyway wing){
//		Flyway wing = w01; Flyway wing = new Wing01();
		m1.setFlying(w1);
		m1.flyToTheSky();
		m1.setFlying(new Wing02());
		m1.flyToTheSky();

	}

}
