
/*
 # 다중 인터페이스 구현
 1) 구현클래스는 다중 인터페이스 구현을 할 수 있다.
 인터페이스1	<---	
 인터페이스2	<---		실제 구현 객체
 인터페이스3	<---
 
 2) public class 구현클래스명 implements 인터페이스1, 인터페이스2, 인터페이스3{
 		- 추상메서드 재정의 처리
 	}
 
 3) SoundWay 인터페이스
 	- sound();
 	FlyWay 인터페이스
 	- flying();
 	ShowColor 인터페이스
 	- paint();
 	실제 구현클래스 Duck을 implement했을때 처리할 내용 구현

*/ 

package a07_inheritance;

interface SoundWay{
	void sound();
}
interface FlyWay1{
	void flying();
}
interface ShowColor{
	void color();
}
class Duck_Model implements SoundWay, FlyWay1, ShowColor{
	private String modelType;
	Duck_Model(){
		modelType="오리 초기 모델";
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println(modelType+"의 색상은 흰색");
	}

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		System.out.println(modelType+"은 날지 못한다.");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println(modelType+"은 꽥꽥거린다.");
		
	}
	
}
public class A17_multi_interface_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck_Model d1 = new Duck_Model();
		d1.color();
		d1.flying();
		d1.sound();

	}

}


