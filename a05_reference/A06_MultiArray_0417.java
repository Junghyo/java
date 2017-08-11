/*
 # 2차원 배열, n차원 배열
 2차원 배열 :  배열 안에 또 배열이 있는 것.	
 
 1. 선언 : String[][] 
 차원수만큼 [][]  ex) [][] 2차배열, [][][] 3차배열
 
 ex) String[][] products = new String [1차원 크기][2차원 크기];
 1차원 크기 : 가장 외부에 있는 데이터 크기
 2차원 크기 : 1차원의 1개 데이터 안에 있는 데이터 크기
 
 (0[사과][배], 1[연필][볼펜], 2[세탁기][TV])  (): 1차배열 []: 2차배열
 
 2. 할당
 products[0][0] = 사과
 
 3. 선언+할당
 String[][] prods = {{"사과","오렌지"},{"연필","볼펜"},{"세탁기","TV"}};
*/
package a05_reference;

import java.io.IOException;
import java.util.ArrayList;

public class A06_MultiArray_0417 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/* 다차원 배열 선언
  		데이터type [][][] 변수명 = new 데이터type[1차원크기][2차원크기][n차원크기];
		*/
		String[][] players = new String[5][3];
		players[0][0] = "호날두";
		players[0][1] = "25세";
		players[0][2] = "레알마드리드";
		players[1][0] = "메시";
		players[1][1] = "30세";
		players[1][2] = "바르셀로나";
		players[2][0] = "아자르";
		players[2][1] = "25세";
		players[2][2] = "첼시";
		players[3][0] = "루니";
		players[3][1] = "30세";
		players[3][2] = "맨유";
		players[4][0] = "리베리";
		players[4][1] = "37세";
		players[4][2] = "뮌헨";
		
		for(int i=0; i<players.length; i++){
		// players.length : 외부배열 크기
			System.out.println("외부배열 index : "+i);
			for(int j=0; j<players[i].length; j++){
			// players[i].length : 내부배열 크기
				System.out.println(players[i][j]);
			}	
		}
		
		int[][] score = new int[5][4];
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++){
				score[i][j]=(int)(Math.random()*101);
				System.out.println((i+1)+"반 "+(j+1)+"번 "+score[i][j]+"점");
			}
		}
		
		String[][] people = new String[3][2];
		String[][] name = {
				{"김", "이"},
				{"벽", "된"},
				{"다", "돌"},
				};
		for(int idx=0; idx<people.length; idx++){
			System.out.println("배열하나끝");
			for(int j=0; j<people[idx].length; j++){
				people[idx][j]=name[idx][j];
				System.out.println(people[idx][j]);
			}
		}
		
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
