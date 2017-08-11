/*
 # 메소드 오버로딩(AO5 생성자 오버로딩과 비교)
 
 클래스 내에서 생성자와 같이 같은 이름의 메소드를
 선언해서 사용할 수 있다. (다음 조건에 한해서)
 
 1) 매개변수 갯수가 다를 때
 	void buyProd(String prod)
 	void buyProd(String prod, String martName)
 	
 2) 매개변수 data Type이 다를 때
 	void buyProd(String prod)
 	void buyProd(int cnt)
 	
 3) 매개변수가 갯수가 같을지라도 순서 data Type이 다를 때
 	void buyProd(String prod, int cnt)
 	void buyProd(int cnt, String prod)
*/

package a06_object;

class ShoppingMall{
	String name;
	String prodName01;
	String prodName02;
	String prodName03;
	int price01;
	ShoppingMall(String name){
		System.out.println("온라인 쇼핑몰 "+name+"에 오신 것을 환엽합니다.");
	}
	// 매개변수 갯수가 다른 것도 선언 가능
	void buyProduct(String prodName01){
		this.prodName01=prodName01;
	}
	void buyProduct(String prodName01, String prodName02){
		this.prodName01=prodName01;
		this.prodName02=prodName02;
	}
	// 매개변수의 type이 다르면 동일한 이름의 메서드 선언 가능(매개변수 갯수가 같아도)
	void buyProduct(int price01){
		this.price01=price01;
	}
	// 매개변수의 type과 숫자가 동일하더라도 다른 type의 매개변수의 순서가 다르면 선언 가능
	void buyProduct(int price01, String prodName01){
		this.price01=price01;
		this.prodName01=prodName01;
	}
	void buyProduct(String prodName01, int price01){
		this.price01=price01;
		this.prodName01=prodName01;
	}

}
public class A10_MethodOverload_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

