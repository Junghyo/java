/*
 # 2���� �迭, n���� �迭
 2���� �迭 :  �迭 �ȿ� �� �迭�� �ִ� ��.	
 
 1. ���� : String[][] 
 ��������ŭ [][]  ex) [][] 2���迭, [][][] 3���迭
 
 ex) String[][] products = new String [1���� ũ��][2���� ũ��];
 1���� ũ�� : ���� �ܺο� �ִ� ������ ũ��
 2���� ũ�� : 1������ 1�� ������ �ȿ� �ִ� ������ ũ��
 
 (0[���][��], 1[����][����], 2[��Ź��][TV])  (): 1���迭 []: 2���迭
 
 2. �Ҵ�
 products[0][0] = ���
 
 3. ����+�Ҵ�
 String[][] prods = {{"���","������"},{"����","����"},{"��Ź��","TV"}};
*/
package a05_reference;

import java.io.IOException;
import java.util.ArrayList;

public class A06_MultiArray_0417 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/* ������ �迭 ����
  		������type [][][] ������ = new ������type[1����ũ��][2����ũ��][n����ũ��];
		*/
		String[][] players = new String[5][3];
		players[0][0] = "ȣ����";
		players[0][1] = "25��";
		players[0][2] = "���˸��帮��";
		players[1][0] = "�޽�";
		players[1][1] = "30��";
		players[1][2] = "�ٸ����γ�";
		players[2][0] = "���ڸ�";
		players[2][1] = "25��";
		players[2][2] = "ÿ��";
		players[3][0] = "���";
		players[3][1] = "30��";
		players[3][2] = "����";
		players[4][0] = "������";
		players[4][1] = "37��";
		players[4][2] = "����";
		
		for(int i=0; i<players.length; i++){
		// players.length : �ܺι迭 ũ��
			System.out.println("�ܺι迭 index : "+i);
			for(int j=0; j<players[i].length; j++){
			// players[i].length : ���ι迭 ũ��
				System.out.println(players[i][j]);
			}	
		}
		
		int[][] score = new int[5][4];
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++){
				score[i][j]=(int)(Math.random()*101);
				System.out.println((i+1)+"�� "+(j+1)+"�� "+score[i][j]+"��");
			}
		}
		
		String[][] people = new String[3][2];
		String[][] name = {
				{"��", "��"},
				{"��", "��"},
				{"��", "��"},
				};
		for(int idx=0; idx<people.length; idx++){
			System.out.println("�迭�ϳ���");
			for(int j=0; j<people[idx].length; j++){
				people[idx][j]=name[idx][j];
				System.out.println(people[idx][j]);
			}
		}
		
		char choice;
		ArrayList<String> food = new ArrayList<String>();
		
		do{
			System.out.println("�޴�����");
			System.out.println("1)¥��, 2)«��, 3)������");
			choice=(char)System.in.read();
			System.in.read();
			System.in.read();
			if(choice=='1'){
				System.out.println("¥��� ����!");
				food.add("¥���");
			}
			if(choice=='2'){
				System.out.println("«�� ����!");
				food.add("«��");
			}
			if(choice=='3'){
				System.out.println("������ ����!");
				food.add("������");
			}
			
		}while(choice!='Q');
		System.out.println("�ֹ��Ϸ�! �ֹ��� ������ �� "+food.size()+"�Դϴ�.");
		for(int idx=0; idx<food.size(); idx++){
			System.out.print(food.get(idx)+", ");
		}

	}

}
