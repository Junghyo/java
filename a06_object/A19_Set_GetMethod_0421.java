/*
 # Getter�� Setter �޼���
 ���� �����ڸ� ����� �� ���� �� �ϳ��� �ʵ��� ������
 ���� �����ϴ� ���� ���� ���� ���̴�.
 ���� �ʵ��� ���������ڴ� private�� �����ؼ�
 �̸� ���� ���ش�. �Ʒ��� ���� �޼��带 ���ؼ�
 ������ ���Ἲ�� Ȯ���� �� �ִ�.
 class Car{
  	private int curVelocity;
  	int SpeedDown(){
  		curVelocity--;
  		if(curVelocity<0){
  		curVelocity=0;
  		}
  		return curVelocity;
  	}
 }
 main(), �ܺ� Ŭ���� ȣ�� 
 	c.curVelocity--;
 
 1) setXXX : ������ ����
 2) getXXX : ������ ȣ��
*/

package a06_object;

class Car01{
	private String kind;
	private int carSpeed;
//  ������ �ڵ� ����
	public Car01(String kind) {
		super();
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getCarSpeed() {
		return carSpeed;
	}
	public void setCarSpeed(int carSpeed) {
		this.carSpeed = carSpeed;
	}
	public void speedUp(){
		System.out.println("���ǵ� �ø�");
		carSpeed+=10;
		if(carSpeed>=120){
			System.out.println("���Ѽӵ�");
			carSpeed=120;
		}
		System.out.println("����ӵ��� "+carSpeed);
	}


}	
public class A19_Set_GetMethod_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car01 c = new Car01("BMW");
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.setCarSpeed(200);
		System.out.println("��ϵ� �ӵ���: " +c.getCarSpeed());
		c.speedUp();
		c.speedUp();
		c.speedUp();
	}
}
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
