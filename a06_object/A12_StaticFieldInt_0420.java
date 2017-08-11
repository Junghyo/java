package a06_object;

class Television{
	/* static�� ��ü���� �� ���Ǵ� �ʵ尡 �ƴϱ⿡
	Ŭ������ �ٷ� �ؿ��� �ʱ�ȭ�� ���ִ� ���� �����̴�. */
	static String company = "�Ｚ";
	static String model = "OLED";
	static String info;
	// static{}�� �ֿ��� ����� �ʱ��ʵ带 �ʱⵥ���ͷ� �Ҵ��� �� �ִ�.
	int price;
	static{
		info = company+" - "+model;
		// price=15000; static�� �ƴ� �ʵ�� static{}���� ����� �� ����.(������ ����)
		showAll();	// static{}������ static�޼��� ��� ����
		// show(); �Ϲ� �޼���� ����� �Ұ�.
	}
	
	void show(){
	}
	
	// static �޼��嵵 ��ü�������� ����� �� �ִ�.
	static void showAll(){
		System.out.println("���� TV�Դϴ�.");
// 		this.prrcie=20000;
// 		static�޼��� �ȿ��� ��ü���� �� ���簴ü(this)�ʵ忡 �����͸� �Ҵ����� ���Ѵ�.
// 		this.show(); static�޼��� �ȿ��� �Ϲݸ޼��带 ������� ���Ѵ�.
//		static����̳� �޼��忡�� static�ʵ峪 �޼��带 ����ϱ� ���ؼ��� ��ü������ �ؾ��Ѵ�.
		Television t = new Television();
		t.price=200000;
	}
}
public class A12_StaticFieldInt_0420 {
	int number;
	static int number01;
//	���θ޼���� static�޼����̱⿡ �Ϲ��ʵ带 ��ü�������� ��� �Ұ�	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		static �ʵ�� ��ü ������ ������� �޸𸮿� �ø��⿡
// 		Ŭ������.�ʵ�� ���ȴ�.
		System.out.println(Television.info);
		Television.showAll();
		/* API�� �ִ� staticŰ���尡 �ִ� �ʵ峪 �޼����
		Ŭ������.�޼���/�ʵ�� ����Ѵ�. */
// 		number=25; ���Ұ�
		number01=100; // static�ʵ��̱⿡ ��밡��
		
	}

}

