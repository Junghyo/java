/*
 # ��ü�� ArrayList
 
 empno		ename		sal			deptno
 7001		�̸�1		3000		10	
 7002		�̸�2		4000		20	
 7003		�̸�3		5000		30
 	
 1) class Emp	-> Value Object(VO)
  	- private int empno;
  	- private String ename;
  	- private int sal;
  	- private int deptno;
  	
 2) ���� row�� ���� �� �ִ� ArrayList Type����
 	���� ��ü ���� �� ArrayList�� ���
 	- ArrayList<Emp> elist = new ArrayList<Emp>();
 	  Emp p = new Emp(7001, �̸�1, 3000, 10);
 	  elist.add(p);
 	  elist.add( new Emp(7002, �̸�2, 4000, 20);
 	  elist.add( new Emp(7003, �̸�3, 5000, 30);
  		
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
//		Emp�� ���� ��ü�� ���� �� �ִ� ArrayList ����
//		ctrl + shift + o : import �ڵ� ó��		
		ArrayList<Emp> elist = new ArrayList<Emp>();
		
//		���� ��ü ������ list�� ������ ���
// 		DBó����, ���� ���� Ȱ��Ǵ� ���
//		1) ��ü ������ set�޼��带 ���ؼ� ������ ���		
		Emp p1 = new Emp();
		p1.setEmpno(7001);
		p1.setEname("Ronaldo");
		p1.setSal(3000);
		p1.setDeptno(10);
		elist.add(p1);
		
//		2) �����ڸ� ���ؼ� ������ ���ÿ� ������ ���
		Emp p2 = new Emp(7002, "Messi", 4000, 20);
		elist.add(p2);

//		3) �������� ���� ��ü�� �ٷ� ������ �Բ� �Ҵ�
		elist.add( new Emp(7003, "Rooney", 5000, 30) );

//		�Ҵ�� ��ü ��������
//		elist.get(index) --> �Ҵ�� ��ġ�� �ִ� ��ü(Emp)
//		�ι�° Emp ��ü�� ename���� �����´�.
		System.out.println( elist.get(1).getEname() );
//		ù��° Emp ��ü�� sal���� �����´�.
		System.out.println( elist.get(0).getSal() );
		
//		��ü �����͸� list�ϴ� ���
//		1) for(������ü:list���迭��)
		System.out.println("empno\tename\tsal\tdeptno");
		for(Emp emp: elist){
			System.out.println(emp.getEmpno()+"\t"+emp.getEname()+"\t"+emp.getSal()+"\t"+emp.getDeptno() );
		}
		
//		2) for(int idx=0; idx<ũ��; idx++)
//		ũ��: elist.size(), elist.get()		
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
