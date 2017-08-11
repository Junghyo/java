/*
 Ȯ�ο���.
 ������ Ÿ��
 KickBoard(��ü��)
 �ʵ� : rider, curVelocity
 ������ :  ����̸� ����
 �޼���: speedUp(), speedDown()
 @@@�� �����带 Ÿ�� �ӵ��� �ø��ϴ�. ���Ѽӵ�
 �ӵ��� �����ϴ�. �����ֳ׿�0
*/
package a06_object;

class KickBoard{
	String rider;
	private int curVelocity;
	public KickBoard(String rider) {
		this.rider = rider;
	}
	public String getRider() {
		return rider;
	}
	public void setRider(String rider) {
		this.rider = rider;
	}
	public int getCurVelocity() {
		return curVelocity;
	}
	public void setCurVelocity(int curVelocity) {
		this.curVelocity = curVelocity;
	}
	void SpeedUp(){
		curVelocity+=5;
		if(curVelocity<30){
			System.out.println(rider+" SPEED +5 UP");
		}else if(curVelocity>=30){
			curVelocity=30;
			System.out.println("YOU CAN'T SPEED UP! SPEED LIMITED 30");
		}
		System.out.println("CURRENT SPEED : "+curVelocity);
	}
	void SpeedDown(){
		curVelocity-=5;
		if(curVelocity>0){
			System.out.println(rider+" SPEED -5 DOWN");
		}else if(curVelocity<=0){
			curVelocity=0;
			System.out.println("YOU CAN'T SPEED DOWN!. SPEED IS 0");
		}
		System.out.println("CURRENT SPEED : "+curVelocity);
	}


	
}	
public class A20_Set_GetSpeed_exp_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KickBoard r1 = new KickBoard("Ronaldo");
		System.out.println(r1.rider+" is riding KickBoard");
		r1.SpeedUp();
		r1.SpeedUp();
		r1.SpeedUp();
		r1.SpeedUp();
		r1.SpeedUp();
		r1.SpeedUp();
		r1.SpeedUp();
		r1.setCurVelocity(20);
		System.out.println("UPDATE SPEED: " +r1.getCurVelocity());
		r1.SpeedUp();
		r1.SpeedDown();
		r1.SpeedDown();
		r1.SpeedDown();
		r1.SpeedDown();
		r1.SpeedDown();
		r1.SpeedDown();
		r1.SpeedDown();
	}

}
/*
 ���� �� Ȯ���ϱ�
 1. ��ü�� Ŭ������ ���� �������� Ʋ�� ����?
 	1) Ŭ������ ��ü�� �����ϱ� ���� ���赵�� ���� ���̴�.
 	2) new �����ڷ� Ŭ������ �����ڸ� ȣ�������ν� ��ü�� �����Ѵ�.
 	3) �ϳ��� Ŭ������ �ϳ��� ��ü�� ������ �� �ִ�.
 	4) ��ü�� Ŭ������ �ν��Ͻ���.
 
 2. Ŭ������ ���� ����� �ƴ� ���� �����ΰ�?
 	1) �ʵ�(filed)
 	2) ������(constructor)
 	3) �޼ҵ�(method)
 	4) ���� ����(local variable)
 
 3. �ʵ忡 ���� �������� Ʋ�� ���� �����ΰ�?
 	1) �ʵ�� �޼ҵ忡�� ����� �� �ִ�.
 	2) �ν��Ͻ� �ʵ� �ʱ�ȭ�� �����ڿ��� �� �� �ִ�.
 	3) �ʵ�� �ݵ�� ������ ���� ���� ����Ǿ�� �Ѵ�.
 	4) �ʵ�� �ʱⰪ�� ���� �ʴ��� �⺻������ �ڵ� �ʱ�ȭ�ȴ�.
 
 4. �޼ҵ� �����ε��� ���� �������� Ʋ�� ����?
 	1) ������ �̸��� �޼ҵ带 ���� �� �����ϴ� ���� ���Ѵ�.
 	2) �ݵ�� ���� Ÿ���� �޶�� �Ѵ�.
 	3) �Ű� ������ Ÿ��, ��, ������ �ٸ��� �����ؾ� �Ѵ�.
 	4) �Ű����� Ÿ�� �� ���� ���� ȣ��� �޼ҵ尡 ���õȴ�.
 
 5. final�ʵ�� ���(static final)�� ���� �������� Ʋ�� ����?
 	1) final�ʵ�� ����� �ʱⰪ�� ����Ǹ� ���� ������ �� ����.
 	2) final�ʵ�� ����� �����ڿ��� �ʱ�ȭ�� �� �ִ�.
 	3) ����� �̸��� �빮�ڷ� �ۼ��ϴ� ���� �����̴�.
 	4) ����� ��ü �������� Ŭ������ ���� ����� �� �ִ�. 
 	
 6. ���� ���ѿ� ���� �������� Ʋ�� ���� �����Դϱ�?
 	1) ���� �����ڴ� Ŭ����, �ʵ�, ������, �޼ҵ� ����� �����Ѵ�.
 	2) public ���� ������ �ƹ��� ���Ѿ��� �ش� ��Ҹ� ����� �� �ְ� �Ѵ�.
 	3) default ���� ������ �ش� Ŭ���� ���ο����� ����� �㰡�Ѵ�.
 	4) �ܺο��� �������� ���ϵ��� �Ϸ��� private ���� ������ �ؾ��Ѵ�.
 
 7. ���� Ŭ�������� �ش� ����� �ʵ�, ������, �޼ҵ� �� � ������ ��ĭ�� ä�켼��.
 public class Member{
 	private String name 			(			)
 	public Member(String name)		(			)
 	public void setName				(			)
 }	
 
 8. ���� ���� ��ü�� Account ��ü�� �ܰ��ʵ带 ������ �ִ�. �ܰ�� �������� �ɼ�����
 �ִ� �鸸������ ���� ����. �ܺο��� �ܰ��ʵ带 ����� ���� ���ϰ� �ϰ�
 0<=balance<=10000000 ������ ���� ���� �� �ֵ��� AccountŬ������ �ۼ��϶�.
 -setXXX�� getXXX�̿�
 -0�� 1000000�� MIN_BALANCE, MAX_BALANCE ����� �����ؼ� ���
 -sexXXX �Ű����� �����̰ų� �鸸�� �ʰ��� ���� BALANCE�� ����
*/
