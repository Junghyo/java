/*
 # 필드 초기화
 1) 클래스가 생성될 때 필드(전역변수)는 자동으로 초기값이 할당된다.
 - 객체는 null, 숫자는 0, boolean은 false
 
 2) 필드를 선언할 때, 초기값을 입력해서 처리할 수 있다.
 ex) class Product{
 		int price = 25;		// 선언할 경우 데이터 할당 X (권장하지 않음)
 	 }
 
 3) 필드 초기값이 필요한 경우 생성자를 통해 입력한다.
 ex) Product(int price){
 		this.price=price;	// 생성자의 입력값을 통해 초기값
 }
*/
package a06_object;

class Computer{
	String comp;
	int price;
	String memory="86";		// 권장하지 않음
	
	//생성자를 통해 초기값 설정 : 생성자명(dataType 지역변수명1, dataType 지역변수명2...)
	Computer(String comp, int price, String memory){
		// field와 지역변수 동일한 이름을 구분하기 위해 this. : (현재 class의).filed
		this.comp = comp;		// 생성자를 통해서 입력받은 데이터를 filed값을 사용
		this.price = price;
		this.memory = memory;
	}
	Computer(){}
}

public class A04_FieldInt_0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer com01 = new Computer();
		// 생성자를 통해 초기값 설정시 에러 발생.
		// 생성자가 사용자 정의로 구현되면 기존 default생성자는 없어지기에 default 생성자도 활용하려면 선언하여야 한다.
		
		System.out.println("객체의 문자형 comp field 초기값: "+com01.comp);
		System.out.println("객체의 숫자형 price field 초기값: "+com01.price);
		System.out.println("객체의 문자형 memory field 초기값: "+com01.memory);
		// Computer(String comp, int price, String memory)
		// 생성자를 통해서 초기값 할당
		Computer com02 = new Computer("삼성전자", 1500000, "16GB");
		System.out.println("com02의 comp : "+com02.comp);
		System.out.println("com02의 price : "+com02.price);
		System.out.println("com02의 memory : "+com02.memory);
	}

}
