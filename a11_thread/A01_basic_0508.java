/*
 # 멀티 쓰레드
 1) 운영체제
 	- 프로그램(어플리케이션) 실행 시 프로세스가 진행된다.
 	- 하나의 프로그램은 여러 다중 프로세스 사용 가능 (익스플로러를 두개 실행시, 두개의 프로세스가 생성)
 
 2) 멀티 태스킹(multi tasking)
 	- 두 가지 이상의 작업을 동시에 처리
 	- 하나의 프로세스(프로그램)에서 두가지 이상 작업.
 	  예를 들어 미디어 플레이어와 메신저 실행 -> multi thread로 가능
 
 # 멀티 프로세서와 멀티 쓰레드	  
 
 				 멀티 프로세스
 프로세스1	프로세스2	프로세스3	프로세스4		
 - 쓰레드1
 - 쓰레드2
 - 쓰레드3
 
 1) 멀티 프로세스 : 운영체제에서 할당받은 메모리를 가지고 있기에 서로 독립적으로 처리
 	ex) 엑셀, 메신저

 2) 멀티 쓰레드 : 하나의 프로세스에서 실행되기에 오류에 영향을 미친다.
 	ex) 메신저에서 파일업로드 시, 채팅에 영향을 미친다.
 	
 # 자바 코드를 통해 쓰레드 처리
 1) main()안에서 실행되는 내용은 실행흐름이 thread로 처리.
 	- 싱글 쓰레드 애플리케이션
 	ex) 프로세스(1) : 코드1 -> 코드2 -> 코드3 -> 코드4
 	
 	- 멀티 쓰레드 애플리케이션
 	ex) 프로세스(1)
 			메인쓰레드
 			코드1
 			코드2 -> 코드2-1 -> 코드2-2
 			코드3 						-> 코드3-1 -> 코드3-2
 			코드4
 			
 # Thread 생성과 실행
 1) Thread 클래스로부터 직접 생성
 	- Runnable 인터페이스를 implements한 클래스를 Thread의 생성자 매개값으로 전달
 		ex) class Task implements Runnable{}
 			Thread t1 = new Thread( new Task() );
 			
 2) Thread 하위 클래스로부터 생성
 	- Thread 클래스를 상속해서 바로 run()을 구현해서 실행
 	ex) class Task2 extends Thread{}
 		Task2 t2 = new Task2();
*/
package a11_thread;

/* 
 쓰레드 프로그램은 하나의 프로세스에서 여러 멀티 태스킹할 수 있는 쓰레드를 만들어서
 효과적이고 빠르게 처리할 수 있게 도와 준다.
 ex) 은행에 가서 한사람이 절차가 끝날때까지 다른 사람의 절차를 진행하지 못한다면 비효율적이고 시간도 많이 허비하게 된다.
 	 이 경우, thread라는 단위 절차가 있어 각각의 단께별로 여러 업무담당자가 처리할 수 있다면
 	 많은 사람이 동시다발저긍로 업무를 처리할 수 있게 된다.
*/
class Person{}
// 1. implements로 thread 처리
// class Account extends Person implements Runnable{ <--- Person 클래스 상속받을 수 있다.
class Account implements Runnable{
	private String name;

	public Account(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int work=1; work<=10; work++){
			System.out.println(name+"님이 "+work+"번째 절차를 처리합니다.");
		}
	}
	
}

// 2. extends Thread를 쓰는 경우
// 		1) 클래스가 Thread에 상속되었기에
//		2) 클래스와 객체를 바로 활용할 수 있다.

// class Traveler extends Person extends Thread  <---- 자바에서는 단일 상속만 가능.(추가 상속이 불가)
// 추가 상속이 필요한 경우에는 Runnable interface를 implements 해야 한다.
class Traveler extends Thread{
	private String name;
	
	public Traveler(String name) {
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		String [] locs={"New York", "Chicago", "Vancouver", "Los Angeles", "Seoul", "Tokyo", "Paris"};
		for(int idx=0; idx<locs.length; idx++){
			System.out.println(name+" is going to "+locs[idx]+"!");
		}
	}
	
}

public class A01_basic_0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Runnable을 implements한 Thread 처리 단계
//			1) 객체 생성
//			2) Thread의 생성자로 해당 객체전달		
		Account a1 = new Account("호날두");
		Thread t1 = new Thread(a1);
//			3) start()로 run()을 호출
		t1.start();
		Thread t2 = new Thread(new Account("메시"));
		t2.start();
		new Thread(new Account("루니")).start();
		
//		2. Thread 상속은 바로 활용 가능
		Traveler [] list = {new Traveler("Ronaldo"), new Traveler("Messi"), new Traveler("Rooney")};
		for(Traveler name : list){
			name.start();
		}
	}

}
