/*
 숙제
 1) 부모
 클래스 Vehicle
 필드 : 종류, 최고속도
 메서드 : showInfo()
 @@@인데 최고 속도가 @@@다
 2) 자식
 클래스 Car
 메서드 driverCar()
 @@@@인데 최고속도가 @@@다
 타는 사람은 @@@@명이다.
*/
package a07_inheritance;
class Vehicle{
	String kind;
	int maxSpeed;
	Vehicle(String kind, int maxSpeed){
		this.kind=kind;
		this.maxSpeed=maxSpeed;
	}
	void ShowInfo(){
		System.out.println(kind+"인데 최고속도는 "+maxSpeed+"km이다.");
	}
}
class Car extends Vehicle{
	int personCnt;
//	super : 상속관계의 상위클래스의 멤버(생성자, 필드, 메서드)를 지칭
//	1) 생성자 :  super();
//  2) 필드, 메서드 : super.XXX	
	Car(String kind, int maxSpeed, int personCnt){
//		상위클래스의 생성자를 호출
		super(kind, maxSpeed);
		this.personCnt=personCnt;

	}
	void CarInfo(){
		ShowInfo();
		System.out.println("타는 사람은 "+personCnt+"명이다.");
	}
}
public class A02_basicExp_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle("자동차", 300);
		v1.ShowInfo();
		Car c1 = new Car("아우디", 270, 2);
		c1.CarInfo();

	}

}

