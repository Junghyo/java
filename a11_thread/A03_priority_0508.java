/*
 # Thread 우선순위
 1) 멀티 쓰레드는 동시성 또는 병렬성으로 실행한다.
 	- 동시성 : 멀티 작업을 위해서 cpu(하나의 코어)에 멀티 쓰레드가 번갈아가며 실행
 	- 병렬성 : 멀티 작업을 cpu(멀티의 코어)에서 개별 쓰레드를 동시에 실행
 
 2) 특정한 경우에 우선 순위를 지정해서 처리해야할 필요가 있는 경우
 	- thread.setPriority(1~10)  -> 
 	- 우선 순위가 높은 Thread는 실행할 기회를 더 많이 가지게 처리.
*/
package a11_thread;

class Patient extends Thread{
	private String kind;

	public Patient(String kind) {
		this.kind = kind;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int step=1; step<=10; step++){
			System.out.println(kind+"를 병원에서 "+step+"단계 조치를 하였습니다.");
		}
	}
}
public class A03_priority_0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient [] arr = {new Patient("치과환자"), new Patient("일반환자"), new Patient("응급환자")};
//		해당 쓰레드에 대한 우선순위를 높이 처리
		arr[2].setPriority(10);
		for(Patient p:arr){
			p.start();
		}

	}

}
