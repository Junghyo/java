/*
 # �̱���(Singleton)
 1) ���α׷��ֿ� �־ �ϳ��� ��ü�� Ȱ���� ���� �ִ�.
 
 2) �ϳ��� ��ü�� Ȱ�� : class code�� Ŭ������ �����ϴ� ���踦 ���� ���̴�.
 - ���� main���� ȣ���ϴ� ���� ��ü�� ������ �� �ְ� ���α׷����� �Ǿ� �ִ�.
 
 3) �̰��� �⺻���� ��ü���� �����ε� �� ������ �ϳ��� �����ǰ� ���α׷��� �Ǵ�
 	������ Ŭ�������� ������ ���� �̱��� ��ü��� �Ѵ�.
 	
 # �̱��� ����
 1) public class Ŭ������{
 		- ���� �ʵ� ����	**** Ŭ������.XXX --- �Ұ�
 		private static Ŭ���� �������� = new Ŭ����();
 		- ������	**** main() Ŭ���� ob = new Ŭ����() --- �Ұ�
 		private Ŭ����(){}
 		- ���� Ŭ�������� ���� ��ü�� �����ǰ� �ϴ� ����
 		- �����ϰ� ��ü�� �����ؼ� return;
 		- ���� �޼��带 ����
 		static Ŭ���� getInstance(){
 			return ��������;
 		}
 	}	
 
 private : �ܺ� ��ü���� �������� ���ϰ� �ϴ� ������
 
 2) main()�̳� �ٸ� Ŭ�������� ȣ��
 	- Ŭ���� ��������1 = Ŭ����.getInstance();
*/
package a06_object;

class SingleWoman{
	private int num;
// 	�̱����� �ϱ����� �ʵ�� ��ü ����
	private static SingleWoman girl = new SingleWoman();
	
// 	�ܺο��� ��ü������ ���� : private ����
//  public SingleWoman(){} : private�� �������� ������ �ڵ����� public�� ����	
	private SingleWoman(){	
	}
//  static���� �̱��� ��ü�� �����ϰ� ó��
	static SingleWoman getInstance(){
		return girl;
	}
	public int getCount() {
		// TODO Auto-generated method stub
		num++;
		return num;
	}
}
public class A13_SingleTon_0420 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingleWoman w1 = new SingleWoman();   �����߻�. ������ ���� �Ұ�. private�̱⿡
		SingleWoman woman1 = SingleWoman.getInstance();
		SingleWoman woman2 = SingleWoman.getInstance();
		SingleWoman woman3 = SingleWoman.getInstance();
// 		woman1, woman2�� ���� heap������ ��ü�� �ٶ󺸰� �ִ� ��
		if( woman1 == woman2){
			System.out.println("w1,w2�� ���� ��ü");
		}else{
			System.out.println("w1,w2�� �ٸ� ��ü");
		}
		System.out.println(woman1.getCount());
		System.out.println(woman2.getCount());
		System.out.println(woman3.getCount());

	}

}
