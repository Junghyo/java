package a09_exception;
class ShoppingException extends Exception{

	public ShoppingException() {
	    super("�⺻ ���ο��� ��ü ȣ��");
	}

	public ShoppingException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		// �޼��� + �����ڸ� ���ؼ� �޾Ҵ� ���� 
		return "����, ��Ÿ��� �����̱���!! "+super.getMessage();
	}	
}
class Mart{
	private String martName;
	private int curMoney;
	public Mart(String ... names ){
		martName=names.length==0?"�ູ��Ʈ":names[0];
	}
	public void goShopping(int money){
		curMoney=money;
		System.out.println(martName+"���� ��ſ� ������ ���� "
				+curMoney+"���� ������~~");
	}
	public void buyProduct(int spmoney) throws ShoppingException{
		if(curMoney<spmoney){
			throw new ShoppingException("���� ���� ����:"
					+(spmoney-curMoney)+"�� �ʿ�" );
		}
		curMoney-=spmoney;
		System.out.println(spmoney+"�� ����, ���ܾ�"+curMoney);
	}
	
}
public class A07_userDefException_teacher_0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Mart m1 = new Mart();
			m1.goShopping(100000);			
			m1.buyProduct(30000);
			m1.buyProduct(20000);
			m1.buyProduct(50000);
			Mart m2 = new Mart("��ġ��Ʈ");
			m2.goShopping(1000000);			
			m2.buyProduct(300000);
			m2.buyProduct(200000);
			m2.buyProduct(500000);
			m2.buyProduct(600000);				
		} catch (ShoppingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
		
	}

}
