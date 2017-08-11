/*
 # DB�� java�� ������ �ʿ��� ���
 1) �����ϴ� �ٸ�
 	- �޸�(driver) jdbc
 	- Class.forName("����̹�")
 
 2) ��� DB sever��ü ����
 	- ip, port, sid, ����, ��й�ȣ
 	- Connection ��ü
 	- DriverManager.getConnection("ip", "id", "password")
 	
 3) sql�� ����. server�� ����
 	- ���ᰴü.createStatement()
 	- Statement�� executeQuery("select * from emp");
 
 4) select�� ��� ������� �޾ƾ� ��
  	- ResultSet���� Statement�� executeQuery("select * from emp");
  	- while( rs.next() )
  		rs.getString("�÷���")
 
*/

package a00_basic;

//java.sql package ������ �ִ� ������ ��� ���ڽ��ϴ�.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A12_Database_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		//����
		
		Statement stmt=null;
		//��ȭ
		
		ResultSet rs = null;
		//��ȭ�� ���� �����. select * from emp
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ip : localcast
			// port : 1521
			// sid : xe
			// id : scott
			// password : tiger
			
			// String url="jdbc:oracle:thin:@localhost:1521:xe";
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			// driver ���� @ ip:poert:sid
			// con = DriverManager.getConnection("", user, password);
			con = DriverManager.getConnection(url, "scott", "tiger");
			stmt = con.createStatement();
			String sql = "SELECT * FROM EMP";
			rs = stmt.executeQuery(sql);
			
			while( rs.next() ){
			// �����Ͱ� ���� ������
				System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
			rs.close();
			stmt.close();
			con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("���Ἲ��");
	}

}
