/*
 # 메소드 오버라이딩(Method Overriding)
 1) 부모 클래스에 정의된 메서드를 그대로 사용하는 경우도 있지만
 자식클래스가 부모클래스의 메서드를 변형하여 각 자식클래스의 용도에 맞게
 사용하는 경우가 많다.
 
 2) 이떄, 부모클래스의 동일 메서드를 수정하여 사용하는 것을 메서드 오버라이딩이라고 한다.
 
 3) 기본 코드 형태
 class 상위클래스{
 	void 오버라이딩할메서드(){}
 }
 class 자식클래스{
 	void 오버라이딩할메서드(){}
 }
*/ 	
package a07_inheritance;

class Member{
	String name;
	int sal;
	public Member(String name, int sal) {
		this.name = name;
		this.sal = sal;
	}
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public void showInfo(){
		System.out.println("이름: "+name);
		System.out.println("급여: "+sal+"원");
	}
}

class Deputy extends Member{
	String depart;
	public Deputy(String name, int sal, String depart){
		super(name, sal);
		this.depart=depart;
	}
//  메서드 재정의(overriding)
	public void showInfo(){
//		상위의 메서드 내용을 활용		
		super.showInfo();
//		상위의 메서드에서 추가할 내용을 처리
		System.out.println("부서: "+depart);
	}
}

public class A03_Overriding_0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("호날두", 200000);
		Deputy d1 = new Deputy("메시", 2000, "바르샤");
		m1.showInfo();
		d1.showInfo();

	}

}
