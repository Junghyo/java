/*
 # Getter와 Setter 메서드
 접근 제어자를 만들어 둔 이유 중 하나는 필드의 내용이
 직접 접근하는 것을 막기 위한 것이다.
 보통 필드의 접근제어자는 private을 설정해서
 이를 제한 해준다. 아래와 같이 메서드를 통해서
 데이터 무결성을 확보할 수 있다.
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
 main(), 외부 클래스 호출 
 	c.curVelocity--;
 
 1) setXXX : 데이터 저장
 2) getXXX : 데이터 호출
*/

package a06_object;

class Car01{
	private String kind;
	private int carSpeed;
//  생성자 자동 생성
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
		System.out.println("스피드 올림");
		carSpeed+=10;
		if(carSpeed>=120){
			System.out.println("제한속도");
			carSpeed=120;
		}
		System.out.println("현재속도는 "+carSpeed);
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
		System.out.println("등록된 속도값: " +c.getCarSpeed());
		c.speedUp();
		c.speedUp();
		c.speedUp();
	}
}
/*
 확인예제.
 퀵보드 타고
 KickBoard(객체명)
 필드 : rider, curVelocity
 생성자 :  사람이름 설정
 메서드: speedUp(), speedDown()
 @@@가 퀵보드를 타서 속도를 올립니다. 제한속도
 속도를 내립니다. 멈취있네요0
*/
