/* 확인예제.
 1) class명 지정(좋아하는 연예인)
 2) field명 : 이름, 성별, 분야
 3) 생성자(),생성자(1),생성자(2),생성자(3)
 4) main메서드에서 객체생성 4개
 5) == 내가 좋아하는 연예인 ==
 
*/
package a06_object;

class Entertain{
	String name;
	String gender;
	String job;
	
	Entertain(){
		
	}
	Entertain(String name){
		this(name, "여자", "가수");
	}
	Entertain(String name, String gender){
		this(name, gender, "가수");
	}
	Entertain(String name, String gender, String job){
		this.name=name;
		this.gender=gender;
		this.job=job;
	}
	void show(){
		System.out.println("이름: "+name+"\t성별: "+gender+"\t분야: "+job);
	}
}
public class A07_Constructor_exp_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entertain p1 = new Entertain();
		Entertain p2 = new Entertain("설현");
		Entertain p3 = new Entertain("쥐디","남자");
		Entertain p4 = new Entertain("박보영", "여자", "배우");
		System.out.println("=== 내가 좋아하는 연예인 ===");
		p1.show();
		p2.show();
		p3.show();
		p4.show();
	}

}
