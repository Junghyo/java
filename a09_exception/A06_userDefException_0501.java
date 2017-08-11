/*
 # ����� ���� ���ܿ� ���� �߻�
 1) ���α׷��� ���� ��, �ڹ� ǥ�� API���� �����ϴ�
    ���� Ŭ�������� �� �߰����� ���� Ŭ������ ������ �� ���� �ִ�.
    �̸� ����� ���� ���� Ŭ������� �Ѵ�.
    ���� -> ���� �߻��� ���ܰ�ü ������ -> ������ ���ܸ� try~catch���� ���� ó��.
 
 2) class XXXException extends Exception{
 		- public XXXException(){}
 		- public XXXException(message){
 		  		super(message);
 		  }
 	}

 3) ���� �߻� : throw new Exception(); ������ ��ø� ���� �ʴ���
 	���������� �߻������� ����� ���� ���ܴ� ����ؾ� �Ѵ�.
 	- throw new XXXException();
 
 ex)
 	public void method() throws XXXException{
 		throws new XXXException();
 		-> ��������� ȣ�� ó��
 	}
 	
 	- ȣ���ϴ� ������ ����ó��(try~catch ó��)
 	try{
 		method();
 	}catch(XXXException e){
 		- ����� ���� ���� ��ü�� �޾ƾ� ��.
 		- ���ܰ� �߻��� �� ó���� ����
 	}
*/
package a09_exception;

//	1) ����� ���� ���� Ŭ���� �����
// class Ŭ������Exception extends Exception
class UserException01 extends Exception{

	public UserException01() {
		super("�⺻ ���� �޼���");
		// TODO Auto-generated constructor stub
	}

	public UserException01(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "����� ���� ���� �޼���: "+super.getMessage();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "����� ���� ���� Ŭ����: "+super.toString();
	}
	
}
// 2) ���� �߻��� ���ܰ�ü ������
class Account{
	private long balance;
	public Account(){
		
	}
	public long getBalance() {
		return balance;
	}
	// �Ա�
	public void deposit(int money) {
		balance+=money;
	}
	// ���
	public void withdraw(int money) throws UserException01{
//		����ݾ��� ���� �ܰ��� ���ٸ� ����� ���� ���� �߻�		
		if(balance < money){
//			����� ���� ���� ��ü ������ ���������� throw(���ǰ�ü) ó���� �ؾ� �Ѵ�.
// 			http://palpit.tistory.com/914 ����			
			throw new UserException01("�ܰ���� : "+(money-balance)+"�� ���ڶ�");
		}
		balance-=money;
	}
		
	
}

public class A06_userDefException_0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		try {
			a1.deposit(100000);
			a1.deposit(100000);
			a1.withdraw(50000);
//			���ܰ� ������			
			a1.withdraw(200000);
		} catch (UserException01 e) {
			// TODO Auto-generated catch block
//			���ǵ� ����� �޼��� ���
//			getMessage()�� ���ǵ� �޼����� ȣ���ϴµ� �����ڸ� ���ؼ� �Ѱ���
//			���ڿ��� �����´�.			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
//			e.printStackTrace();
		}

	}

}
/*
 # ���� Ŭ���� �޽��� ����
 1) ���ܰ� �߻����� ��
 - if�� ����������
 - throw new XXXException("�Ѱ����� �޼���"):
 - ���ǵ� ������ super( msg );

 2) Exception
  - message = 
 
*/

