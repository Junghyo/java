package a04_statement;

import java.io.IOException;

public class A06_while_0412 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// System.in : java에서 지원하는 표준 입력 System
		// 입력관련된 내용은 반드시 예외 처리를 해 주어야 한다(throws IOException)
		int keyCode;
		// 0 : 48~~~~, A : 65~~~~~, a:97, <-(37, 38, 39, 40)
		while(true){
			keyCode=System.in.read();
			System.out.println(keyCode);
			if(keyCode==81){
				System.out.println("중단");
				break;
				// 반복문에서 프로세를 중단처리
			}
		}
	}

}

