/*
 Ȯ�ο���.
 1) ��뿹�� Ŭ���� ó��
 - XXXException	 ex)ShoppingException
   	super�� ���� ���ܳ����� �Է��Ͽ� getMessage()������ �� �ֵ��� ó��
   
 2) ���α׷� throw XXXException  	
 - Market
    goShopping(������ �� ������ ����)
    buyProduct(���ν�, ������ ������ ���ұݾ�)
    	- ������ ���ݰ� ���ұݾ��� ���ؼ� �ݾ��� ���� �� ����� ���� ���� Ŭ���� ȣ��
 
 3) Main���� ȣ��ó��
*/
package a09_exception;

class UserException02 extends Exception{
	
	public UserException02() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserException02(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "����� ���� Ŭ����: "+super.toString();
	}
	
}

class Market{
	double haveMoney;
	double bringMoney;
	Market(double haveMoney){
		this.haveMoney = haveMoney;
	}
	void goShopping(double bringMoney) throws UserException02{
		this.bringMoney=bringMoney;
		if(haveMoney<bringMoney){
			throw new UserException02("�ܰ� ���� : "+(bringMoney-haveMoney)+"�� ���ڶ�");
		}
		System.out.println("�ܰ� : "+haveMoney+"��");
		System.out.println("��� �ݾ�: "+bringMoney+"��");
		haveMoney-=bringMoney;
		System.out.println("���� �ܰ�: "+haveMoney+"��");
	}
	void buyProduct(double payMoney) throws UserException02{
		if(this.bringMoney<payMoney){
			throw new UserException02("�ݾ� ���� : "+(payMoney-bringMoney)+"�� ���ڶ�");
		}
		System.out.println("��� �ݾ�: "+bringMoney+"��");
		System.out.println("���� ����: "+payMoney+"��");
		bringMoney-=payMoney;
		System.out.println("�����ִ� �ݾ�: "+bringMoney+"��");
	}
}
public class A07_userDefException_exp_0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Market m1 = new Market(50000);
	
		try {
			m1.goShopping(20000);
			m1.buyProduct(10000);
			m1.buyProduct(10000);
			m1.buyProduct(10000);
		} catch (UserException02 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


