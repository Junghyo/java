/*
 # ������ Ÿ��
 1) ������ ������ Ÿ���� �ְ� Ÿ�Կ� ���� ������ �� �ִ� ���� ������ ũ�Ⱑ ��������.
 
 2) �⺻Ÿ��(primitive data type)
 - ����, �Ǽ�, ����, ������ ���� �����ϴ� Ÿ��
 - ����(int - default) : int(4byte), byte(1byte), char(2byte), short(2byte), long(8byte)
 - �Ǽ�(double - default) : float(4byte), double(8byte)
 - ��(true/false) : boolean(1byte)
 
 3) �̽�������(escape) ����
 - \n (���ο� ����), \t(�� �߰�), \'(����ǥ), \"(�ֵ���ǥ), \\(��������), \r(���ϰ���), \b(�齺���̽�)
*/

package a02_variable;

public class A02_dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) ������ data type
		byte age=25;
		// byte(1byte) : 128 ~ 127
		// age = 129;	-- byte������ ������ �Ѿ�� �Ҵ� �Ұ�
		// short, int, long, char
		char code=65;
		// char 2byte�� ������ �Ҵ�. 0~65535
		System.out.println("���̴� "+age);
		System.out.println("�ڵ尪 "+code);
		code='��';
		// char�� �ݵ�� ''�� �Ҵ�.
		System.out.println( code );		
		System.out.println( (int)code );
		
		// 2) �Ǽ��� data type
		// float degree=25.2; ����.
		float degree = 25.2F;
		// float ���� = ������F;
		// float(4byte) : ��ȣȭbit(1bit) + ����(8bits) + ����(23bits) = 32bits
		double height=175.2;
		// �Ǽ����� default���̱⿡ �Ҵ� ����
		// double(8byte) : ��ȣ(1bit) + ����(11bits) + ����(52bits) = 64bits
		System.out.println("�µ��� "+degree+"��");
		System.out.println("Ű�� "+height+"cm");
		
		// 3) ���� data type
		boolean isGo = true;
		// boolean 1byte(8bits) ǥ��. (true/false)
		if( isGo ){
			System.out.println(" ����! ");
		}else{
			System.out.println(" �Ȱ�! ");
		}
	}

}
