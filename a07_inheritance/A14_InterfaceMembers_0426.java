/*
 # �������̽��� �����
 interface �������̽���{
 	- ���
 	[public static final] type ����� = ��;
 	ex) int MAX_VOLUME = 10;
 	
 	- �߻� �޼���
 	type �޼ҵ��(�Ű�����);
 	
 	- default �޼���(java8���� ����)
 	default Ÿ�� �޼ҵ��(�Ű�����){ ������ ���� }
 	ex) default void show(){
 			System.out.println("��������");
 		}
 	
 	- ���� �޼���
 	static Ÿ�� �޼ҵ��(�Ű�����){ ������ ���� }
 	ex) static void staticShow(){ System.out.println("������ħ"); }
 }
*/
package a07_inheritance;

// �������̽� ����
interface RemoteControl{
	
//	�ʵ� -> ���[public static final] Ÿ�� ����� = ��
//	����� �Ϲ������� �빮��, _(�����)�� ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

//	�߻�޼��� ����
	public void turnOn();
//	{} body�� ���� ���� ���(implements)���� Ŭ��������
//	������(overriding)�� �������� �ϱ� ����		
	public void turnOff();
	public void setVolume(int volume);
	
//	Java 8���� ����
//	����Ʈ �޼ҵ� : ��ӹ޴� ����Ŭ�������� �������� ���
	default void setMute(boolean mute){
//		���� ������ ����		
		if(mute){
			System.out.println("���� ó���մϴ�.");
		}else{
			System.out.println("���� �����մϴ�.");
		}
	}

//	�����޼��� [public] static ����Ÿ�� �޼ҵ��(�Ű�����)
	static void changeBattery(){
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
}

// ���� implements�� Ŭ���� ����
// class Ŭ������ implements �������̽���{}
class Television implements RemoteControl{
//	�ʵ�� volume ����
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �Ѵ�.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ����.");
	}

	@Override
	public void setVolume(int sound) {
		// TODO Auto-generated method stub		
//		�Էµ� �������� �ְ�ġ���� ũ��
		if(sound>MAX_VOLUME){
			this.volume=MAX_VOLUME;
			System.out.println(volume);
		}
//		�Էµ� �������� �ּ�ġ���� ������		
		else if(sound<MIN_VOLUME){
			this.volume=MIN_VOLUME;
			System.out.println(volume);
		}else{
//			�������� ����� ������ �Է°����� �ʵ��Ҵ�			
			this.volume=sound;
			System.out.println(volume);
		}
	}
	
}
class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("������� �Ѵ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("������� ����.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>MAX_VOLUME){
			volume=MAX_VOLUME;
			System.out.println("�ִ� ����ũ��� "+volume+"�Դϴ�.");
		}else if(volume<MIN_VOLUME){
			volume=MIN_VOLUME;
			System.out.println("�ּ� ����ũ��� "+volume+"�Դϴ�.");
		}else{
			System.out.println("���纼���� "+volume+"�Դϴ�.");
		}
	}
	
}
public class A14_InterfaceMembers_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		static�̱⿡ ��ü ���� ���̵� Ȱ�� ����
		System.out.println("�ִ뺼��ũ��: "+RemoteControl.MAX_VOLUME);
//		static�̱⿡ �޼��� ��ü ���� ���� ��� ����		
		RemoteControl.changeBattery();
		Television t1 = new Television();
		t1.turnOn();
		t1.setVolume(80);
		t1.setMute(false);
		Audio a1 = new Audio();
		a1.turnOn();
		a1.setVolume(2);

	}

}
/*
 Ȯ�ο���
 Audio Ŭ���� ����
 main() ȣ��
 */
/*
 ����
 �������̽� AttackWay
 �߻�޼��� attack();
 RocketAttack : AttackWay�� ��ӹ��� ���� Ŭ����
 attack() : ���ϰ����ϴ�
 RobotŬ����
 �ʵ�: AttackWay
 �޼��� : showAttack(){ 
 -attack()
 �޼��� setAttackWay(AttackWay attway)
*/


