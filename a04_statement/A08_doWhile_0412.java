package a04_statement;

import java.io.IOException;
import java.util.ArrayList;

public class A08_doWhile_0412 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* do{ ù��° �Ǵ� �ݺ��� ���� ó��} while(�ݺ�����); */
		char choiceMenu=' ';
		do{
			System.out.println("�޴��� �����ϼ���!(��ȣ�Է�)");
			System.out.println("1) ¥���");
			System.out.println("2) «��");
			System.out.println("3) ������");
			System.out.println("4) ��ǳ��");
			System.out.println("�����Ͻ÷��� Q�� �Է�!");
			choiceMenu=(char)System.in.read();
			System.in.read();
			System.in.read();
			// ����Ű ���� 
			if(choiceMenu=='1') System.out.println("¥��� ����!");
			if(choiceMenu=='2') System.out.println("«�� ����!");
			if(choiceMenu=='3') System.out.println("������ ����!");
			if(choiceMenu=='4') System.out.println("��ǳ�� ����!");
		}while(choiceMenu!='Q');
		System.out.println("�ֹ� �Ϸ�");
		
		/* ����� ���		
		char choieMenu='Q';
		String choMenu="";
		System.out.println("�޴��� �����ϼ���!(��ȣ�Է�)");
		System.out.println("1) ¥���");
		System.out.println("2) «��");
		System.out.println("3) ������");
		System.out.println("�����ϽǷ��� Q�� �Է�!!");		
		do{
			choieMenu=(char)System.in.read();
			if(choieMenu=='1') choMenu+="¥��� ����!!\n";
			if(choieMenu=='2') choMenu+="«�� ����!!\n";
			if(choieMenu=='3') choMenu+="������ ����!!\n";;
			
		}while(choieMenu!='Q');
			System.out.println("�ֹ��� ����");
			System.out.println(choMenu);
			System.out.println("�ֹ� �Ϸ�!!!");
		*/	
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
