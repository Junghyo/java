/*
 # �޼ҵ� �����ε�(AO5 ������ �����ε��� ��)
 
 Ŭ���� ������ �����ڿ� ���� ���� �̸��� �޼ҵ带
 �����ؼ� ����� �� �ִ�. (���� ���ǿ� ���ؼ�)
 
 1) �Ű����� ������ �ٸ� ��
 	void buyProd(String prod)
 	void buyProd(String prod, String martName)
 	
 2) �Ű����� data Type�� �ٸ� ��
 	void buyProd(String prod)
 	void buyProd(int cnt)
 	
 3) �Ű������� ������ �������� ���� data Type�� �ٸ� ��
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
		System.out.println("�¶��� ���θ� "+name+"�� ���� ���� ȯ���մϴ�.");
	}
	// �Ű����� ������ �ٸ� �͵� ���� ����
	void buyProduct(String prodName01){
		this.prodName01=prodName01;
	}
	void buyProduct(String prodName01, String prodName02){
		this.prodName01=prodName01;
		this.prodName02=prodName02;
	}
	// �Ű������� type�� �ٸ��� ������ �̸��� �޼��� ���� ����(�Ű����� ������ ���Ƶ�)
	void buyProduct(int price01){
		this.price01=price01;
	}
	// �Ű������� type�� ���ڰ� �����ϴ��� �ٸ� type�� �Ű������� ������ �ٸ��� ���� ����
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

