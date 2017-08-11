package a06_object;

class Television{
	/* static은 객체생성 후 사용되는 필드가 아니기에
	클래스명 바로 밑에서 초기화를 해주는 것이 보통이다. */
	static String company = "삼성";
	static String model = "OLED";
	static String info;
	// static{}을 주에서 선언된 초기필드를 초기데이터로 할당할 수 있다.
	int price;
	static{
		info = company+" - "+model;
		// price=15000; static이 아닌 필드는 static{}에서 사용할 수 없다.(컴파일 에러)
		showAll();	// static{}에서는 static메서드 사용 가능
		// show(); 일반 메서드는 사용이 불가.
	}
	
	void show(){
	}
	
	// static 메서드도 객체생성없이 사용할 수 있다.
	static void showAll(){
		System.out.println("좋은 TV입니다.");
// 		this.prrcie=20000;
// 		static메서드 안에서 객체생성 후 현재객체(this)필드에 데이터를 할당하지 못한다.
// 		this.show(); static메서드 안에서 일반메서드를 사용하지 못한다.
//		static블록이나 메서드에서 static필드나 메서드를 사용하기 위해서는 객체생성을 해야한다.
		Television t = new Television();
		t.price=200000;
	}
}
public class A12_StaticFieldInt_0420 {
	int number;
	static int number01;
//	메인메서드는 static메서드이기에 일반필드를 객체생성없이 사용 불가	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		static 필드는 객체 생성과 상관없이 메모리에 올리기에
// 		클래스명.필드로 사용된다.
		System.out.println(Television.info);
		Television.showAll();
		/* API에 있는 static키워드가 있는 필드나 메서드는
		클래스명.메서드/필드로 사용한다. */
// 		number=25; 사용불가
		number01=100; // static필드이기에 사용가능
		
	}

}

