package a06_object.com.util.prog;

import a06_object.com.util.Pen;

public class Computer {
//		�ٸ� package�� �ִ� Ŭ������ ȣ���� ��..
//		1) package��.Ŭ���������� �����ؾ� �Ѵ�.
		a06_object.com.util.Note note01 = new a06_object.com.util.Note();
//		2) ����ϰ��� �ϴ� package��.Ŭ������ import�Ͽ� Ȱ���� �� �ִ�.
		Pen p = new Pen();
//		** ��Ű������ ������ �����ҷ��� class����ÿ�
//		@@@ class Ŭ������
//		1) ���� package�� ��� : @@@�� �����ڰ� ���ų� public
//		2) �ٸ� package�� ��� : @@@�� public�� ����Ǿ�� �Ѵ�.
}
/* Ȯ�ο���
 package a06_object ��Ű�� ������
 1) ourhome ��Ű�� ����
 - Father, Mother, Mine
 2) cousinhome ��Ű�� ����
 - Aunt, Uncle, Cousin  
 
 import�� ����ϴ� ���
 - Cousin Ŭ�������� Mine Ŭ���� ȣ���ϱ�
 import ������ ȣ���ϴ� ������� ��ü ����
 - Mine Ŭ�������� FatherŬ���� ȣ���ϱ�
 - Mother Ŭ�������� Aunt Ŭ���� ȣ���ϱ�
*/