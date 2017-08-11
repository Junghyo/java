/*
 # 인터페이스의 멤버들
 interface 인터페이스명{
 	- 상수
 	[public static final] type 상수명 = 값;
 	ex) int MAX_VOLUME = 10;
 	
 	- 추상 메서드
 	type 메소드명(매개변수);
 	
 	- default 메서드(java8부터 지원)
 	default 타입 메소드명(매개변수){ 구현할 내용 }
 	ex) default void show(){
 			System.out.println("ㅎㅇㅎㅇ");
 		}
 	
 	- 정적 메서드
 	static 타입 메소드명(매개변수){ 구현할 내용 }
 	ex) static void staticShow(){ System.out.println("좋은아침"); }
 }
*/
package a07_inheritance;

// 인터페이스 선언
interface RemoteControl{
	
//	필드 -> 상수[public static final] 타입 상수명 = 값
//	상수는 일반적으로 대문자, _(언더바)로 구성
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

//	추상메서드 선언
	public void turnOn();
//	{} body가 없는 것은 상속(implements)받은 클래스에서
//	재정의(overriding)를 목적으로 하기 때문		
	public void turnOff();
	public void setVolume(int volume);
	
//	Java 8부터 지원
//	디폴트 메소드 : 상속받는 하위클래스에서 공통으로 사용
	default void setMute(boolean mute){
//		실제 내용을 구현		
		if(mute){
			System.out.println("무음 처리합니다.");
		}else{
			System.out.println("무음 해제합니다.");
		}
	}

//	정적메서드 [public] static 리턴타입 메소드명(매개변수)
	static void changeBattery(){
		System.out.println("건전지를 교환합니다.");
	}
	
}

// 실제 implements한 클래스 구현
// class 클래스명 implements 인터페이스명{}
class Television implements RemoteControl{
//	필드로 volume 선언
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켜다.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끄다.");
	}

	@Override
	public void setVolume(int sound) {
		// TODO Auto-generated method stub		
//		입력된 볼륨값이 최고치보다 크면
		if(sound>MAX_VOLUME){
			this.volume=MAX_VOLUME;
			System.out.println(volume);
		}
//		입력된 볼륨값이 최소치보다 작으면		
		else if(sound<MIN_VOLUME){
			this.volume=MIN_VOLUME;
			System.out.println(volume);
		}else{
//			범위에서 벗어나지 않으면 입력값으로 필드할당			
			this.volume=sound;
			System.out.println(volume);
		}
	}
	
}
class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켜다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끄다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>MAX_VOLUME){
			volume=MAX_VOLUME;
			System.out.println("최대 볼륨크기는 "+volume+"입니다.");
		}else if(volume<MIN_VOLUME){
			volume=MIN_VOLUME;
			System.out.println("최소 볼륨크기는 "+volume+"입니다.");
		}else{
			System.out.println("현재볼륨은 "+volume+"입니다.");
		}
	}
	
}
public class A14_InterfaceMembers_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		static이기에 객체 생성 없이도 활용 가능
		System.out.println("최대볼륨크기: "+RemoteControl.MAX_VOLUME);
//		static이기에 메서드 객체 생성 없이 사용 가능		
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
 확인예제
 Audio 클래스 구현
 main() 호출
 */
/*
 숙제
 인터페이스 AttackWay
 추상메서드 attack();
 RocketAttack : AttackWay를 상속받은 실제 클래스
 attack() : 로켓공격하다
 Robot클래스
 필드: AttackWay
 메서드 : showAttack(){ 
 -attack()
 메서드 setAttackWay(AttackWay attway)
*/


