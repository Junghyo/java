package a05_reference;

public class A02_basicArgs_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Ȯ�ο���.
		 args ������ id password
		 args[0] => id��
		 args[1] => password��
		 id�� himan, password�� 7777�� �Է¹����� ��������		
		*/		
//				args[0]="aaaa";
				String id = new String(args[0]);
				String password = new String(args[1]);
//				id="himan";
				System.out.println("id: "+id);
				System.out.println("args[0]: "+args[0]);
				System.out.println("password: "+password);
				System.out.println("args[1]: "+args[1]);
				System.out.println("args: "+args);
				if(id.equals("himan") && password.equals("7777")){
					System.out.println("��������");
				}else{
					System.out.println("��������");
				}
	}

}
