/*
 # switch��
 ex) switch(����){
  		case������ �� 1�϶� : ó���� ����; break;  
  		case������ �� 1�϶� : ó���� ����; break;
  		default �� case�� �̿ܿ� ó���� ����;  
  	 }
  
 - switch(����)�� �� ������ type
 1) ������
 ex) int choiceBtn=5; switch(choiceBtn)
 2) ������
 ex) char grade='B'; switch(grade){}	  
 3) ���ڿ���
 ex) String pos="����"; switch(pos){}	  
*/ 
package a04_statement;

public class A02_switch_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)( Math.random()*101 );
		// ���� 1~100�� ���� ���� �߻�
		char ptGrade;
		switch(score/10){
			case 10:
			case 9: ptGrade = 'A'; break;
			case 8: ptGrade = 'B'; break;
			case 7: ptGrade = 'C'; break;
			case 6: ptGrade = 'D'; break;
			default: ptGrade = 'F';		
		}
		System.out.println("������ "+score+", ��������� "+ptGrade);
		// println�� �ڵ� �ٹٲ� ó��
		System.out.print("������ "+score+", ��������� "+ptGrade);
		// print�� �ٹٲ� ó�� �ȵ�
		System.out.println("������ "+score+", ��������� "+ptGrade);
		
		/* ���ڿ� ó�� switch */
		// String [] pos = new String[]{"", "", ""};
		String [] pos = {"���", "�븮", "����", "����", "����"};
		int posIdx = (int)( Math.random()*pos.length );
		// pos�� �迭���� ��ŭ�� ó�� �ǰ�
		String chPos = pos[ posIdx ];
		switch(posIdx){
			case  0: System.out.println("��å: "+chPos+"\n����: 200~300����"); break; 
			case  1: System.out.println("��å: "+chPos+"\n����: 240~350����"); break; 
			case  2: System.out.println("��å: "+chPos+"\n����: 300~650����"); break; 
			case  3: System.out.println("��å: "+chPos+"\n����: 400~700����"); break; 
			case  4: System.out.println("��å: "+chPos+"\n����: 700����~"); break; 
		}
	}

}

