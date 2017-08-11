/*
 # Thread life Cycle
 1) 객체생성 : NEW
  - 스레드 객체가 생성, start()메서드가 호출되지 않은 상태.
  ex) Thread t1 = new Thread();
  
 2) 실행대기 : RUNNABLE
  - 실행 상태로 언제든지 갈 수 있는 상태
  - 실행과 runnable한 내용이 반복적으로 처리된다.
  ex) t1.start();
  	  실행 대기 상태에 있는 스레드 중에 스레드 스케줄링에 선택된 스레드가 비로서 CPU를 점유하고 
      run()메소드를 실행한다.
     
 3) 일지정지
  - WAITING : 다른 쓰레드가 통지할 때까지 기다리는 상태
  - TIMED_WAITING : 주어진 시간동안 기다리는 상태
  - BLOCKED : 사용하고자 하는 객체의 락이 풀릴 떄까지 기다리는 상태
  
 4) 종료 : TERMINATED
  - 실행을 마친 상태 
      
*/
package a11_thread;

// 쓰레드의 상태를 출력하는 클래스
class StatePrintThread extends Thread{
	private Thread targetThread;

//	생성자를 통해서 필드할당 : Thread 상태값 확인
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
//		NEW -> RUNNABLE -> TIMED_WAITING -> RUNNABLE -> TERMINATED	
//		처리 프로세스를 무한 loop
		while(true){
//			상태값을 받아서 할당 및 출력			
			Thread.State state=targetThread.getState();
			System.out.println("targetThred의 상태: "+state);
//			만일 Thread가 생성만 했을 경우
			if(state==Thread.State.NEW){
//				start()를 통해서 runnable로 진입.
				targetThread.start();
			}
//			life cycle이 끝나게 되면 break처리
			if(state==Thread.State.TERMINATED){
//				반복문 종료처리
				break;
			}
//			일시 정지 상태 처리. 0.5초
			try {
//				Thread.State.TIME_WAITING 상태 유발				
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class TargetThread extends Thread{

	@Override
	public void run() {
//		loop문을 통해서 임의로 프로그램 실행
		for(long cnt=0; cnt<1000000000; cnt++){}
//			thread 중지 상태를 발생. 1.5초가 중지. thread.sleep()은 반드시 예외처리를 해줘야 함
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			다시 실행하는 내용
			for(long cnt=0; cnt<1000000000;cnt++){}	
	}
}
public class A04_state_0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		현재 NEW		
		StatePrintThread spt = new StatePrintThread(new TargetThread());
//		RUNNABLE 상태
		spt.start();

	}

}
/*
 # 스레드 상태 제어
 
  interrupt()		
  notify()			------>		실행대기
  notifyAll()
  resume() 						   ↑↓  yield()
  	↑
    ↑
 일시정지 <----   sleep()	<---- 실행	----> stop() ----> 종료
 				  join()
 				  wait()
 				  suspend()
 				  
 # 상태 제어 메서드
 1) interrupt() : 일시 정지 상태의 스레드에서 예외를 발생시켜 실행대기 상태로 가거나 종료
 
 2) notify(), notifyAll() : wait()이 발생된 일시정지 상태의 스레드를 실행대기 상태로 만듦.
 
 3) resume() : suspend()에 의해 일시정지 상태에 있는 스레드를 실행대기 상태로 만듦
 
 4) sleep(1/1000) : 주어진 시간동안 일시정지, 시간이 지나면 자동으로 실행대기
 
 5) join() : 호출한 스레드 일시정지. join()메서드를 멤버로 가지는 스레드가 종료되거나
 			 시간이 지날때 실행대기
 
 6) yield()	: 다른 스레드에 실행을 양보. 실행 대기 상태
 
 7) stop() : 스레드 즉시 종료
 
*/
