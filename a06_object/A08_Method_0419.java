/*
 # �޼���
 1) ��ü�� ���ۿ� �ش��ϴ� ������� {}�� �����ؼ� ó���Ѵ�.
 
 2) ����
 	- (����������) 
 	   ����type �޼ҵ��̸�(�Ű�����1, �Ű�����2, ...){
 			�Ű������� ó���� ���μ���(field�� �Ҵ�)
 			����, �ݺ��� �� ���ϴ� �����͸� ó��
 	   }
 ex) returnType �޼���� �Է°�
 	   int 		plus	 (int num1, int num02){
 	   			int sum=num01+num02;
 	   			return sum;
 	   }
 	   main() int tot=cal.plus(5,7);
 	   int sum;  ���� ������ �����ؾ� �Ѵ�.
 	   
 	   return�� ������ ���� ���� ���� void��� keyword�� return type�� �����ϴ� �κп� �ڵ��� ���ƾ� �Ѵ�.
*/
package a06_object;

class Calculator{
	int num01;
	int num02;
	int sum;
	char cal;	// ������
	
	// returntype �޼����(�Է°�1, �Է°�2)
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
	// ���ó�� �޼��� ����
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
