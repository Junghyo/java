/* 확인예제.
 1) Mart 클래스
 - 물건명, 단가, 갯수
 -cart(물건명, 단가, 갯수) : 
 	데이터 할당, return 총액
 - calcu() : 출력
 - 물건명, 가격, 갯수	
*/
package a06_object;

class Mart{
	String name;
	int price;
	int count;
	int sum;
	int cart(String name, int price, int count){
		this.name=name;
		this.price=price;
		this.count=count;
		sum=price*count;
		return sum;
	}
	
	int cart2(int price, int count){
		this.price=price;
		this.count=count;
		sum=price*count;
		return sum;
	}
	
	void show(){
		System.out.println("물건명: "+name+"\t가격: "+price+"원\t갯수: "+count+"개\t"+name+"총액: "+sum+"원");
	}
	
	void show2(String name){
		System.out.println("물건명: "+name+"\t가격: "+price+"원\t갯수: "+count+"개\t"+name+"총액: "+sum+"원");
	}
}

public class A09_Method_exp_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mart prod = new Mart();
		int tot = prod.cart("사과", 1000, 500);
		prod.show();
		tot += prod.cart("딸기", 750, 175);
		prod.show();
		tot += prod.cart("포도", 1700, 74);
		prod.show();
		tot += prod.cart("자몽", 2000, 56);
		prod.show();
		System.out.println("총금액: "+tot+"원");
		
		System.out.println("void()에 name넣고 과일 입력");
		Mart prod2 = new Mart();
		int tot2 = prod2.cart2(1000, 500);
		prod2.show2("사과");
		tot2 += prod2.cart2(750, 175);
		prod2.show2("딸기");
		tot2 += prod2.cart2(1700, 74);
		prod2.show2("포도");
		tot2 += prod2.cart2(2000, 56);
		prod2.show2("자몽");
		System.out.println("총금액: "+tot2+"원");
	}

}
