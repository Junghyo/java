/* Ȯ�ο���.
 1) Mart Ŭ����
 - ���Ǹ�, �ܰ�, ����
 -cart(���Ǹ�, �ܰ�, ����) : 
 	������ �Ҵ�, return �Ѿ�
 - calcu() : ���
 - ���Ǹ�, ����, ����	
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
		System.out.println("���Ǹ�: "+name+"\t����: "+price+"��\t����: "+count+"��\t"+name+"�Ѿ�: "+sum+"��");
	}
	
	void show2(String name){
		System.out.println("���Ǹ�: "+name+"\t����: "+price+"��\t����: "+count+"��\t"+name+"�Ѿ�: "+sum+"��");
	}
}

public class A09_Method_exp_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mart prod = new Mart();
		int tot = prod.cart("���", 1000, 500);
		prod.show();
		tot += prod.cart("����", 750, 175);
		prod.show();
		tot += prod.cart("����", 1700, 74);
		prod.show();
		tot += prod.cart("�ڸ�", 2000, 56);
		prod.show();
		System.out.println("�ѱݾ�: "+tot+"��");
		
		System.out.println("void()�� name�ְ� ���� �Է�");
		Mart prod2 = new Mart();
		int tot2 = prod2.cart2(1000, 500);
		prod2.show2("���");
		tot2 += prod2.cart2(750, 175);
		prod2.show2("����");
		tot2 += prod2.cart2(1700, 74);
		prod2.show2("����");
		tot2 += prod2.cart2(2000, 56);
		prod2.show2("�ڸ�");
		System.out.println("�ѱݾ�: "+tot2+"��");
	}

}
