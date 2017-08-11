package a12_collection;

import java.io.IOException;
import java.util.ArrayList;



class Food{
	private String type;
	private int price;
	public Food(String type, int price) {
		this.type = type;
		this.price = price;
	}
	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

}
public class A02_basic_exp_0509 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char choice;
		int totPrice=0;
		ArrayList<Food>foodList=new ArrayList<Food>();
		do{
			System.out.println("메뉴선택");
			System.out.println("1)짜장, 2)짬뽕, 3)탕수육");
			choice=(char)System.in.read();
			System.in.read();
			System.in.read();
			switch(choice){
				case '1': 
					System.out.println(new Food("짜장면",3000).getType()+" 선택");
					foodList.add(new Food("짜장면",3000));
					break;
				case '2': 
					System.out.println(new Food("짬뽕",4000).getType()+" 선택");
					foodList.add(new Food("짬뽕",4000));
					break;	
				case '3': 
					System.out.println(new Food("탕수육",8000).getType()+" 선택");
					foodList.add(new Food("탕수육",8000));
					break;	
				default : 
					System.out.println("잘못된 입력입니다.");
					break;				
			}

		}while(choice!='Q');
		System.out.println("주문완료. 주문한 음식은 총 "+foodList.size()+"개 입니다.");
		System.out.println("NO\t음식명\t가격");
		for(int idx=0; idx<foodList.size();idx++){
			System.out.println((idx+1)+"\t"+foodList.get(idx).getType()+"\t"+foodList.get(idx).getPrice());
			totPrice+=foodList.get(idx).getPrice();
		}
		System.out.println("총가격은 "+totPrice+"원 입니다.");

	}
}
