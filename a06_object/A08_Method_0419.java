/*
 # 메서드
 1) 객체의 동작에 해당하는 기능으로 {}을 포함해서 처리한다.
 
 2) 선언
 	- (접근제어자) 
 	   리턴type 메소드이름(매개변수1, 매개변수2, ...){
 			매개변수로 처리할 프로세스(field명에 할당)
 			조건, 반복문 등 원하는 데이터를 처리
 	   }
 ex) returnType 메서드명 입력값
 	   int 		plus	 (int num1, int num02){
 	   			int sum=num01+num02;
 	   			return sum;
 	   }
 	   main() int tot=cal.plus(5,7);
 	   int sum;  으로 선언이 가능해야 한다.
 	   
 	   return할 데이터 값이 없을 때는 void라는 keyword를 return type을 설정하는 부분에 코딩해 놓아야 한다.
*/
package a06_object;

class Calculator{
	int num01;
	int num02;
	int sum;
	char cal;	// 연산자
	
	// returntype 메서드명(입력값1, 입력값2)
	int plus(int num01, int num02){
		this.num01=num01;
		this.num02=num02;
		cal='+';
		sum=num01+num02;
		return sum;
	}
	int minus(int num01, int num02){
		this.num01=num01;
		this.num02=num02;
		cal='-';
		sum=num01-num02;
		return sum;
	}
	int multi(int num01, int num02){
		this.num01=num01;
		this.num02=num02;
		cal='*';
		sum=num01*num02;
		return sum;
	}
	int div(int num01, int num02){
		this.num01=num01;
		this.num02=num02;
		cal='/';
		sum=num01/num02;
		return sum;
	}
	int mod(int num01, int num02){
		this.num01=num01;
		this.num02=num02;
		cal='%';
		sum=num01%num02;
		return sum;
	}
	// 출력처리 메서드 구현
	void print(){
		if(sum<=0) 
		return;
		
		System.out.println(num01+" "+cal+" "+num02+"="+sum);
	}
}
public class A08_Method_0419 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calculator c1 = new Calculator();
			int tot=c1.plus(5,5);
			c1.print();
			tot+=c1.minus(10, 3);
			c1.print();
			tot+=c1.mod(10, 2);
			c1.print();
			tot+=c1.mod(20, 3);
			c1.print();
			System.out.println(tot);
			
	}

}
