package a04_statement;

import java.io.IOException;

public class A07_while_0412 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char inputChar;
		int KeyCode;
		while(true){
			inputChar=(char)System.in.read();
			KeyCode=System.in.read();		
			System.out.println("�Էµ� ���� : "+inputChar+"\nŰ�ڵ�: "+KeyCode);
			System.in.read();
			System.in.read();	
			if(inputChar=='Q'){
				System.out.println("�ߴ�");
				break;
			}
		}
		while(true){
			char text = (char)System.in.read();
			System.in.read();
			System.in.read();
			System.out.println(text+"+"+(int)text);
			if(text=='Q'){
				System.out.println("�ߴ�");
				break;
			}
		}
	}

}
