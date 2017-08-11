/*
 1단계 : 음식점에가서(class 생성)
 1) orderFood(가변인자 처리)
 2) 주문하신 음식은 @@
 3) 주문하신 음식은 @@, @@ 가변적으로 처리
 
 2단계 :  가게 이름을 생성자로 입력 받게 처리
 1) orderFood를 통해 주문된 음식의 종류에 따라
 매핑되어 있는 가격을 계산해서 계산서까지 출력처리

*/
package a06_object;

class Restourant{

	public void orderFood(String...foods){
		int price = 0;
		int sum=0;
		for(String food:foods){
			switch(food){
			case "짜장" : price=3000; break;
			case "짬뽕" : price=4500; break;
			case "탕수육" : price=8000; break;
			}
			System.out.println("주문하신 음식은 "+food+", 가격은 "+price+"원 입니다.");
			sum+=price;
		}
		System.out.println("총 주문 가격은 "+sum+"원 입니다.\n");
	}
}

public class A16_Exp_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restourant order= new Restourant();
		System.out.println("중국집입니다. 메뉴는 짜장, 짬뽕, 탕수육 3가지입니다.");
		order.orderFood("짜장");
		System.out.println("중국집입니다. 메뉴는 짜장, 짬뽕, 탕수육 3가지입니다.");
		order.orderFood("짬뽕", "탕수육");
	}

}

