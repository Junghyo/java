/*
 # Runnable 인터페이스 활용 확인
 1) ShoppingMall에 접속하는 고객(Customer) 
 	- Runnable interface를 상속(implements)해서 다음 단계를 처리하는 내용을 구현
 	- @@@님 @@단계 처리했습니다.(1단계)
 	- 단계 : 로그인, 계정확인, 물건구매, 장바구니확인, 결제,  배송처리, 로그아웃(2단계)
 	- @@@님 로그인 단계입니다.
 
 2) Customer 3명정도 접속시, Thread로 처리.
*/
package a11_thread;

class Customer implements Runnable{
	String name;

	public Customer(String name) {
			this.name=name;
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String [] phase = {"로그인", "계정확인", "물건구매", "장바구니확인", "결제", "배송처리", "로그아웃"};
		for(int step=0; step<phase.length; step++){
			System.out.println(name+"님. "+(step+1)+"번째 절차 "+phase[step]+" 단계 진행합니다.");
		}
	}
	
}
public class A02_basic_exp_05058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer [] list = {new Customer("호날두"), new Customer("메시"), new Customer("루니")};
		for(Customer name : list){
			new Thread(name).start();
		}
	}

}
/*
 # Thread 우선순위
 1) 멀티 쓰레드는 동시성 또는 병렬성으로 실행한다.
 	- 동시성 : 멀티 작업을 위해서 cpu(하나의 코어)에 멀티 쓰레드가 번갈아가며 실행
 	- 병렬성 : 멀티 작업을 cpu(멀티의 코어)에서 개별 쓰레드를 동시에 실행
 
 2) 특정한 경우에 우선 순위를 지정해서 처리해야할 필요가 있는 경우
 	- thread.setPriority(1~10)  -> 
 	- 우선 순위가 높은 Thread는 실행할 기회를 더 많이 가지게 처리.
*/