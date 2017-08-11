/*
 # Thread life Cycle
 1) ��ü���� : NEW
  - ������ ��ü�� ����, start()�޼��尡 ȣ����� ���� ����.
  ex) Thread t1 = new Thread();
  
 2) ������ : RUNNABLE
  - ���� ���·� �������� �� �� �ִ� ����
  - ����� runnable�� ������ �ݺ������� ó���ȴ�.
  ex) t1.start();
  	  ���� ��� ���¿� �ִ� ������ �߿� ������ �����ٸ��� ���õ� �����尡 ��μ� CPU�� �����ϰ� 
      run()�޼ҵ带 �����Ѵ�.
     
 3) ��������
  - WAITING : �ٸ� �����尡 ������ ������ ��ٸ��� ����
  - TIMED_WAITING : �־��� �ð����� ��ٸ��� ����
  - BLOCKED : ����ϰ��� �ϴ� ��ü�� ���� Ǯ�� ������ ��ٸ��� ����
  
 4) ���� : TERMINATED
  - ������ ��ģ ���� 
      
*/
package a11_thread;

// �������� ���¸� ����ϴ� Ŭ����
class StatePrintThread extends Thread{
	private Thread targetThread;

//	�����ڸ� ���ؼ� �ʵ��Ҵ� : Thread ���°� Ȯ��
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
//		NEW -> RUNNABLE -> TIMED_WAITING -> RUNNABLE -> TERMINATED	
//		ó�� ���μ����� ���� loop
		while(true){
//			���°��� �޾Ƽ� �Ҵ� �� ���			
			Thread.State state=targetThread.getState();
			System.out.println("targetThred�� ����: "+state);
//			���� Thread�� ������ ���� ���
			if(state==Thread.State.NEW){
//				start()�� ���ؼ� runnable�� ����.
				targetThread.start();
			}
//			life cycle�� ������ �Ǹ� breakó��
			if(state==Thread.State.TERMINATED){
//				�ݺ��� ����ó��
				break;
			}
//			�Ͻ� ���� ���� ó��. 0.5��
			try {
//				Thread.State.TIME_WAITING ���� ����				
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
//		loop���� ���ؼ� ���Ƿ� ���α׷� ����
		for(long cnt=0; cnt<1000000000; cnt++){}
//			thread ���� ���¸� �߻�. 1.5�ʰ� ����. thread.sleep()�� �ݵ�� ����ó���� ����� ��
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			�ٽ� �����ϴ� ����
			for(long cnt=0; cnt<1000000000;cnt++){}	
	}
}
public class A04_state_0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� NEW		
		StatePrintThread spt = new StatePrintThread(new TargetThread());
//		RUNNABLE ����
		spt.start();

	}

}
/*
 # ������ ���� ����
 
  interrupt()		
  notify()			------>		������
  notifyAll()
  resume() 						   ���  yield()
  	��
    ��
 �Ͻ����� <----   sleep()	<---- ����	----> stop() ----> ����
 				  join()
 				  wait()
 				  suspend()
 				  
 # ���� ���� �޼���
 1) interrupt() : �Ͻ� ���� ������ �����忡�� ���ܸ� �߻����� ������ ���·� ���ų� ����
 
 2) notify(), notifyAll() : wait()�� �߻��� �Ͻ����� ������ �����带 ������ ���·� ����.
 
 3) resume() : suspend()�� ���� �Ͻ����� ���¿� �ִ� �����带 ������ ���·� ����
 
 4) sleep(1/1000) : �־��� �ð����� �Ͻ�����, �ð��� ������ �ڵ����� ������
 
 5) join() : ȣ���� ������ �Ͻ�����. join()�޼��带 ����� ������ �����尡 ����ǰų�
 			 �ð��� ������ ������
 
 6) yield()	: �ٸ� �����忡 ������ �纸. ���� ��� ����
 
 7) stop() : ������ ��� ����
 
*/
