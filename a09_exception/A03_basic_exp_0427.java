/*
 ���� Ȯ�� ����.
 1�ܰ�.
 - id�� �Է��ϼ���.
 - id=null; �Է��� �ȵ� ���, id="himan";
 �Էµ� id : @@@
 - catch : ���̵� �Էµ��� �ʾҽ��ϴ�.
 
 2�ܰ� id, pass
 id�� apssword�� ��ȿ�� �� @@�� ȯ���մϴ�.
 catch : id �Ǵ� password�� �Էµ��� �ʾҽ��ϴ�.
*/
package a09_exception;

public class A03_basic_exp_0427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ID�� �Է��ϼ���.");

		try{
			String id = null;
			System.out.println("�Էµ� ID : "+id.toString());
			System.out.println(id+"�� ȯ���մϴ�.");
		}catch(Exception e){
			System.out.println("ID�� �Էµ��� �ʾҽ��ϴ�.");
		}
		
		System.out.println("ID�� Password�� �Է��ϼ���.");
		try{
			String id2 = args[0];
			String password = args[1];
			if(id2.equals("future") && password.equals("7777")){
				System.out.println(id2+"�� ȯ���մϴ�.");
			}else{
				System.out.println("ID �Ǵ� Password�� ��ġ���� �ʽ��ϴ�.");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ID�Ǵ� Password�� �Էµ��� �ʾҽ��ϴ�.");
		}
	}

}

