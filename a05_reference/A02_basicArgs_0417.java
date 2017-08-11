package a05_reference;

public class A02_basicArgs_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 확인예제.
		 args 값으로 id password
		 args[0] => id값
		 args[1] => password값
		 id는 himan, password는 7777을 입력받으면 인증성공		
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
					System.out.println("인증성공");
				}else{
					System.out.println("인증실패");
				}
	}

}
