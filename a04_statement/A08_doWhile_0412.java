package a04_statement;

import java.io.IOException;
import java.util.ArrayList;

public class A08_doWhile_0412 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* do{ 첫번째 또는 반복할 구문 처리} while(반복조건); */
		char choiceMenu=' ';
		do{
			System.out.println("메뉴를 선택하세요!(번호입력)");
			System.out.println("1) 짜장면");
			System.out.println("2) 짬뽕");
			System.out.println("3) 탕수육");
			System.out.println("4) 깐풍기");
			System.out.println("종료하시려면 Q를 입력!");
			choiceMenu=(char)System.in.read();
			System.in.read();
			System.in.read();
			// 엔터키 삭제 
			if(choiceMenu=='1') System.out.println("짜장면 선택!");
			if(choiceMenu=='2') System.out.println("짬뽕 선택!");
			if(choiceMenu=='3') System.out.println("탕수육 선택!");
			if(choiceMenu=='4') System.out.println("깐풍기 선택!");
		}while(choiceMenu!='Q');
		System.out.println("주문 완료");
		
		/* 강사님 방법		
		char choieMenu='Q';
		String choMenu="";
		System.out.println("메뉴를 선택하세요!(번호입력)");
		System.out.println("1) 짜장면");
		System.out.println("2) 짬뽕");
		System.out.println("3) 탕수육");
		System.out.println("종료하실려면 Q를 입력!!");		
		do{
			choieMenu=(char)System.in.read();
			if(choieMenu=='1') choMenu+="짜장면 선택!!\n";
			if(choieMenu=='2') choMenu+="짬뽕 선택!!\n";
			if(choieMenu=='3') choMenu+="탕수육 선택!!\n";;
			
		}while(choieMenu!='Q');
			System.out.println("주문된 내용");
			System.out.println(choMenu);
			System.out.println("주문 완료!!!");
		*/	
		char choice;
		ArrayList<String> food = new ArrayList<String>();
		
		do{
			System.out.println("메뉴선택");
			System.out.println("1)짜장, 2)짬뽕, 3)탕수육");
			choice=(char)System.in.read();
			System.in.read();
			System.in.read();
			if(choice=='1'){
				System.out.println("짜장면 선택!");
				food.add("짜장면");
			}
			if(choice=='2'){
				System.out.println("짬뽕 선택!");
				food.add("짬뽕");
			}
			if(choice=='3'){
				System.out.println("탕수육 선택!");
				food.add("탕수육");
			}
			
		}while(choice!='Q');
		System.out.println("주문완료! 주문한 음식은 총 "+food.size()+"입니다.");
		for(int idx=0; idx<food.size(); idx++){
			System.out.print(food.get(idx)+", ");
		}
		
	}

}
