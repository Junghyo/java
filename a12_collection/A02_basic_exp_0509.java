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
			System.out.println("�޴�����");
			System.out.println("1)¥��, 2)«��, 3)������");
			choice=(char)System.in.read();
			System.in.read();
			System.in.read();
			switch(choice){
				case '1': 
					System.out.println(new Food("¥���",3000).getType()+" ����");
					foodList.add(new Food("¥���",3000));
					break;
				case '2': 
					System.out.println(new Food("«��",4000).getType()+" ����");
					foodList.add(new Food("«��",4000));
					break;	
				case '3': 
					System.out.println(new Food("������",8000).getType()+" ����");
					foodList.add(new Food("������",8000));
					break;	
				default : 
					System.out.println("�߸��� �Է��Դϴ�.");
					break;				
			}

		}while(choice!='Q');
		System.out.println("�ֹ��Ϸ�. �ֹ��� ������ �� "+foodList.size()+"�� �Դϴ�.");
		System.out.println("NO\t���ĸ�\t����");
		for(int idx=0; idx<foodList.size();idx++){
			System.out.println((idx+1)+"\t"+foodList.get(idx).getType()+"\t"+foodList.get(idx).getPrice());
			totPrice+=foodList.get(idx).getPrice();
		}
		System.out.println("�Ѱ����� "+totPrice+"�� �Դϴ�.");

	}
}
