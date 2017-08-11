/*
 하나의 프로세스 내에서 여러 프로그램을 효과적으로 처리할 때가
 프로그램에서는 많이 발생한다.
 이것을 Thread라고 하는데 보통
 1) Server vs Client프로그램
 2) 동시적으로 많은 내용을 처리해야 하는 프로그램
 3) 네트워크 프로그램
 등 에서 활용되고 있다. 
 순차확보가 정확하게 되지는 않으나 time slicing 방식으로 빠르고 효과적으로 처리할 때 필요한 프로그램이다.
*/
package a00_basic;

class Come extends Thread{
// 쓰레드 처리 : class 클래스명 extends Thread{}
	public void run(){
	// 쓰레드를 처리하는 run()을 재정의	
		for(int i=0; i<10; i++){
			System.out.println("WELCOME");
		}
	}
	
}
class Go extends Thread{
		public void run(){
			for(int j=0; j<10; j++){
				System.out.println("Good-Bye");
			}
		}
		
	}


class Bank extends Thread{
	String account;
	Bank(String account){
		this.account = account;
	}
	public void run(){
		for(int cnt=1; cnt<100; cnt++){
			System.out.println(account+"님. "+cnt+"번 절차를 진행합니다.");
		}
	}
}
public class A11_Thread_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Come c = new Come();
		Go g = new Go();
		// Thread 객체의 run은 start()로 호출된다.
		c.start();
		g.start();
		
		Bank b1 = new Bank("박용택");
		Bank b2 = new Bank("봉중근");
		Bank b3 = new Bank("오지환");
		b1.start();
		b2.start();
		b3.start();
	}

}
