package a04_statement;

public class A05_doubleFor_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �������� ���� 2�� for�� ó�� */
		for(int dan=2; dan<=9; dan++){
		// �ܺ� for���� �ܼ��� ���õ� ���� ó��	
			System.out.println("### "+dan+"�� ###");
			for(int cnt=1; cnt<=9; cnt++){
			// ���� for���� cnt 1~9 ���� ó��
				System.out.println(dan+" * "+cnt+"="+(dan*cnt));
			}
		}
		
		System.out.println("2��°");
		for(int dan=2; dan<=9; dan++){
			System.out.println("### "+dan+"�� ###");
			for(int cnt=1; cnt<=9; cnt++){
				System.out.print(dan+"*"+cnt+"="+(dan*cnt)+"\t");
				if(cnt==9){
					System.out.println();
				}
			}
		}
		
	}

}
