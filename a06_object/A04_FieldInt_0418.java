/*
 # �ʵ� �ʱ�ȭ
 1) Ŭ������ ������ �� �ʵ�(��������)�� �ڵ����� �ʱⰪ�� �Ҵ�ȴ�.
 - ��ü�� null, ���ڴ� 0, boolean�� false
 
 2) �ʵ带 ������ ��, �ʱⰪ�� �Է��ؼ� ó���� �� �ִ�.
 ex) class Product{
 		int price = 25;		// ������ ��� ������ �Ҵ� X (�������� ����)
 	 }
 
 3) �ʵ� �ʱⰪ�� �ʿ��� ��� �����ڸ� ���� �Է��Ѵ�.
 ex) Product(int price){
 		this.price=price;	// �������� �Է°��� ���� �ʱⰪ
 }
*/
package a06_object;

class Computer{
	String comp;
	int price;
	String memory="86";		// �������� ����
	
	//�����ڸ� ���� �ʱⰪ ���� : �����ڸ�(dataType ����������1, dataType ����������2...)
	Computer(String comp, int price, String memory){
		// field�� �������� ������ �̸��� �����ϱ� ���� this. : (���� class��).filed
		this.comp = comp;		// �����ڸ� ���ؼ� �Է¹��� �����͸� filed���� ���
		this.price = price;
		this.memory = memory;
	}
	Computer(){}
}

public class A04_FieldInt_0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer com01 = new Computer();
		// �����ڸ� ���� �ʱⰪ ������ ���� �߻�.
		// �����ڰ� ����� ���Ƿ� �����Ǹ� ���� default�����ڴ� �������⿡ default �����ڵ� Ȱ���Ϸ��� �����Ͽ��� �Ѵ�.
		
		System.out.println("��ü�� ������ comp field �ʱⰪ: "+com01.comp);
		System.out.println("��ü�� ������ price field �ʱⰪ: "+com01.price);
		System.out.println("��ü�� ������ memory field �ʱⰪ: "+com01.memory);
		// Computer(String comp, int price, String memory)
		// �����ڸ� ���ؼ� �ʱⰪ �Ҵ�
		Computer com02 = new Computer("�Ｚ����", 1500000, "16GB");
		System.out.println("com02�� comp : "+com02.comp);
		System.out.println("com02�� price : "+com02.price);
		System.out.println("com02�� memory : "+com02.memory);
	}

}
