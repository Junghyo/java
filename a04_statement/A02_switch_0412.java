/*
 # switch문
 ex) switch(변수){
  		case변수가 값 1일때 : 처리할 내용; break;  
  		case변수가 값 1일때 : 처리할 내용; break;
  		default 위 case문 이외에 처리할 내용;  
  	 }
  
 - switch(변수)에 들어갈 데이터 type
 1) 정수형
 ex) int choiceBtn=5; switch(choiceBtn)
 2) 문자형
 ex) char grade='B'; switch(grade){}	  
 3) 문자열형
 ex) String pos="부장"; switch(pos){}	  
*/ 
package a04_statement;

public class A02_switch_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)( Math.random()*101 );
		// 점수 1~100점 사이 랜덤 발생
		char ptGrade;
		switch(score/10){
			case 10:
			case 9: ptGrade = 'A'; break;
			case 8: ptGrade = 'B'; break;
			case 7: ptGrade = 'C'; break;
			case 6: ptGrade = 'D'; break;
			default: ptGrade = 'F';		
		}
		System.out.println("점수는 "+score+", 학점등급은 "+ptGrade);
		// println은 자동 줄바꿈 처리
		System.out.print("점수는 "+score+", 학점등급은 "+ptGrade);
		// print는 줄바꿈 처리 안됨
		System.out.println("점수는 "+score+", 학점등급은 "+ptGrade);
		
		/* 문자열 처리 switch */
		// String [] pos = new String[]{"", "", ""};
		String [] pos = {"사원", "대리", "과장", "차장", "부장"};
		int posIdx = (int)( Math.random()*pos.length );
		// pos의 배열길이 만큼만 처리 되게
		String chPos = pos[ posIdx ];
		switch(posIdx){
			case  0: System.out.println("직책: "+chPos+"\n연봉: 200~300만원"); break; 
			case  1: System.out.println("직책: "+chPos+"\n연봉: 240~350만원"); break; 
			case  2: System.out.println("직책: "+chPos+"\n연봉: 300~650만원"); break; 
			case  3: System.out.println("직책: "+chPos+"\n연봉: 400~700만원"); break; 
			case  4: System.out.println("직책: "+chPos+"\n연봉: 700만원~"); break; 
		}
	}

}

