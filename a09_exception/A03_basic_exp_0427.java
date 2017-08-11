/*
 예외 확인 예제.
 1단계.
 - id를 입력하세요.
 - id=null; 입력이 안된 경우, id="himan";
 입력된 id : @@@
 - catch : 아이디가 입력되지 않았습니다.
 
 2단계 id, pass
 id와 apssword가 유효할 때 @@님 환영합니다.
 catch : id 또는 password가 입력되지 않았습니다.
*/
package a09_exception;

public class A03_basic_exp_0427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ID를 입력하세요.");

		try{
			String id = null;
			System.out.println("입력된 ID : "+id.toString());
			System.out.println(id+"님 환영합니다.");
		}catch(Exception e){
			System.out.println("ID가 입력되지 않았습니다.");
		}
		
		System.out.println("ID와 Password를 입력하세요.");
		try{
			String id2 = args[0];
			String password = args[1];
			if(id2.equals("future") && password.equals("7777")){
				System.out.println(id2+"님 환영합니다.");
			}else{
				System.out.println("ID 또는 Password가 일치하지 않습니다.");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ID또는 Password가 입력되지 않았습니다.");
		}
	}

}

