/*
 # 객체와 ArrayList
 
 empno		ename		sal			deptno
 7001		이름1		3000		10	
 7002		이름2		4000		20	
 7003		이름3		5000		30
 	
 1) class Emp	-> Value Object(VO)
  	- private int empno;
  	- private String ename;
  	- private int sal;
  	- private int deptno;
  	
 2) 여러 row를 담을 수 있는 ArrayList Type선언
 	단위 객체 생성 및 ArrayList에 담기
 	- ArrayList<Emp> elist = new ArrayList<Emp>();
 	  Emp p = new Emp(7001, 이름1, 3000, 10);
 	  elist.add(p);
 	  elist.add( new Emp(7002, 이름2, 4000, 20);
 	  elist.add( new Emp(7003, 이름3, 5000, 30);
  		
*/
package a12_collection;

import java.util.ArrayList;

class Emp{
	private int empno;
	private String ename;
	private int sal;
	private int deptno;
	public Emp(){
		
	}
	public Emp(int empno, String ename, int sal, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.deptno = deptno;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}

public class A04_listObject_0510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Emp의 여러 객체를 담을 수 있는 ArrayList 생성
//		ctrl + shift + o : import 자동 처리		
		ArrayList<Emp> elist = new ArrayList<Emp>();
		
//		단위 객체 생성과 list에 데이터 담기
// 		DB처리시, 가장 많이 활용되는 방법
//		1) 객체 생성과 set메서드를 통해서 데이터 담기		
		Emp p1 = new Emp();
		p1.setEmpno(7001);
		p1.setEname("Ronaldo");
		p1.setSal(3000);
		p1.setDeptno(10);
		elist.add(p1);
		
//		2) 생성자를 통해서 생성과 동시에 데이터 담기
		Emp p2 = new Emp(7002, "Messi", 4000, 20);
		elist.add(p2);

//		3) 참조변수 없이 객체를 바로 생성과 함께 할당
		elist.add( new Emp(7003, "Rooney", 5000, 30) );

//		할당된 객체 가져오기
//		elist.get(index) --> 할당된 위치에 있는 객체(Emp)
//		두번째 Emp 객체의 ename값을 가져온다.
		System.out.println( elist.get(1).getEname() );
//		첫번째 Emp 객체의 sal값을 가져온다.
		System.out.println( elist.get(0).getSal() );
		
//		전체 데이터를 list하는 방법
//		1) for(단위객체:list형배열명)
		System.out.println("empno\tename\tsal\tdeptno");
		for(Emp emp: elist){
			System.out.println(emp.getEmpno()+"\t"+emp.getEname()+"\t"+emp.getSal()+"\t"+emp.getDeptno() );
		}
		
//		2) for(int idx=0; idx<크기; idx++)
//		크기: elist.size(), elist.get()		
		System.out.println("\nNO\tempno\tename\tsal\tdeptno");
		for(int idx=0; idx<elist.size(); idx++){
			System.out.print((idx+1)+"\t");
			System.out.print(elist.get(idx).getEmpno()+"\t");
			System.out.print(elist.get(idx).getEname()+"\t");
			System.out.print(elist.get(idx).getSal()+"\t");
			System.out.print(elist.get(idx).getDeptno()+"\n");
		}

	}

}
