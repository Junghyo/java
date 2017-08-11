/*
 # 다형성 확인예제
 <Vehicle>
 속성 : kind, maxSpeed, curSpeed
 메서드 : speedUp(),drver() : 탈것이 어떻게 운행되는가
 <Bus>
 <Ship>
*/
package a07_inheritance;

class Vehicles{
	String kind;
	int maxSpeed;
	int curSpeed;
	Vehicles(){
		kind="대중교통";
		maxSpeed=150;
		curSpeed=10;
	}
	public void speedUp(){
		int plusSpeed=5;
		curSpeed+=plusSpeed;
		if(curSpeed>maxSpeed){
			curSpeed+=0;
			System.out.println("제한 속도 "+maxSpeed+"km/h를 추가할 수 없습니다.");
		}else{
			System.out.println(kind+"의 속도가 "+plusSpeed+"km/h 증가합니다. 현재 속도는 "+curSpeed+"km/h입니다.");
		}
	}
	public void driver(){
		System.out.println(kind+"는 사람이 운전합니다.");
	}
}
class Bus extends Vehicles{
	Bus(){
		super.kind="버스";
		super.curSpeed=30;
		super.maxSpeed=120;
	}
	public void speedUp(){
		int plusSpeed=10;
		curSpeed+=plusSpeed;
		if(curSpeed>maxSpeed){
			curSpeed+=0;
			System.out.println("제한 속도 "+maxSpeed+"km/h를 추가할 수 없습니다.");
		}else{
			System.out.println(kind+"의 속도가 "+plusSpeed+"km/h 증가합니다. 현재 속도는 "+curSpeed+"km/h입니다.");
		}
	}
	public void driver(){
		System.out.println(kind+"는 보통 출퇴근 시간에 사람이 많이 탑니다.");
	}
}
class Ship extends Vehicles{
	Ship(){
		super.kind="배";
		super.curSpeed=50;
		super.maxSpeed=180;
	}
	public void speedUp(){
		int plusSpeed=20;
		curSpeed+=plusSpeed;
		if(curSpeed>maxSpeed){
			curSpeed+=0;
			System.out.println("제한 속도 "+maxSpeed+"km/h를 추가할 수 없습니다.");
		}else{
			System.out.println(kind+"의 속도가 "+plusSpeed+"km/h 증가합니다. 현재 속도는 "+curSpeed+"km/h입니다.");
		}
	}
	public void driver(){
		System.out.println(kind+"는 타면 멀미가 심합니다.");
	}
}
public class A08_polymor_exp_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles v1 = new Vehicles();

		Vehicles v2 = new Bus();
	
		Vehicles v3 = new Ship();

		// 상위 type [] 변수 = { 하위 객체1(), 하위 객체2(), 하위 객체3() }
		Vehicles [] vArray={ new Bus(), new Bus(), new Ship(), new Ship() };
		for(Vehicles v : vArray){
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.driver();
		}
	}

}
