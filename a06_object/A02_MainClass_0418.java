/*
 # ��ü ����
 1) Ŭ������ ������ ����, main()�޼��尡 �ִ� Ŭ��������
    ��ü�� �Ʒ��� �������� ������ �� �ִ�.
 - public class Product{}
   main(){
   		stack(�ּ�) = heap(������ü)
    	Product p1 = new Product();   -- class�� ����� ���� ��ü�� ������.
    	
    	stack : p1(�ּ�)			heap : p1�� ����Ű�� �ּҿ� new Product()�� ������
*/


package a06_object;

// Ŭ���� ����
class Student{}
class Teacher{}


public class A02_MainClass_0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*main()�޼��尡 �ִ� Ŭ�������� main()�κ��� �ܺ�Ŭ������ ����� �͵�
 		���������ڰ� ����ϴ� ���� �ȿ��� ������ �����ϴ� */
		
		// ����� class�� ��ü�� �����ؼ� �޸𸮿� �ø�
		A01_Object_0418 obj01 = new A01_Object_0418();
		
		// class(����)�� ������ ȣ���ϴ� ���� ��ü���� ��ü�� �������
		Student stu01 = new Student();
		Student stu02 = new Student();
		
		// ����� ������ ���⿡ �ٸ� �����͸� �����鼭 �ٸ� ��ü�� ��
		// heap������ �ٸ� �ּҸ� �����ϴ� ��ü��
		System.out.println("stu01 �ּ�: "+stu01);
		System.out.println("stu01 �ּ�: "+stu02);
	}

}

