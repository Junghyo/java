/*
 # 객체 생성
 1) 클래스를 선언한 다음, main()메서드가 있는 클래스에서
    객체를 아래의 형식으로 생성할 수 있다.
 - public class Product{}
   main(){
   		stack(주소) = heap(실제객체)
    	Product p1 = new Product();   -- class가 선언된 것을 객체로 생성함.
    	
    	stack : p1(주소)			heap : p1이 가르키는 주소에 new Product()가 생성됨
*/


package a06_object;

// 클래스 선언
class Student{}
class Teacher{}


public class A02_MainClass_0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*main()메서드가 있는 클래스에서 main()부분은 외부클래스가 선언된 것도
 		접근제어자가 허용하는 범위 안에서 수행이 가능하다 */
		
		// 선언된 class를 객체로 생성해서 메모리에 올림
		A01_Object_0418 obj01 = new A01_Object_0418();
		
		// class(설계)된 내용을 호출하는 순간 구체적인 객체가 만들어짐
		Student stu01 = new Student();
		Student stu02 = new Student();
		
		// 설계는 같지만 여기에 다른 데이터를 넣으면서 다른 객체가 됨
		// heap영역에 다른 주소를 참조하는 객체임
		System.out.println("stu01 주소: "+stu01);
		System.out.println("stu01 주소: "+stu02);
	}

}

