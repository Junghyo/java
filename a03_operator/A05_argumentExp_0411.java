/*
 Ȯ�ο���.
 Favorite Movie
 args --> ��ȭ��1, �󿵳⵵, ��ȭ��2, �󿵳⵵
 ���� �����ϴ� ��ȭ
 ��ȭ�� �� �������κ���
 ��ȭ�� @@@ 2017-@@@
 ��ȭ�� @@@ 2017-@@@
*/
package a03_operator;

public class A05_argumentExp_0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movie01 = args[0];
		String movie02 = args[2];
		int year01 = Integer.parseInt(args[1]);
		int year02 = Integer.parseInt(args[3]);
		System.out.println("���� �����ϴ� ��ȭ");
		System.out.println("��ȭ��\t��\t�������κ���");
		System.out.println(movie01+"\t"+year01+"\t"+(2017-year01)+"\n"+movie02+"\t"+year02+"\t"+(2017-year02));
		
		int fromYear;
		// �迭��ü length/�������� --> �׷캰 ������ �Ǽ�
		System.out.println(args.length/2);
		for(int idx=0; idx<args.length/2; idx++){
			fromYear=2017-Integer.parseInt(args[idx*2+1]);
			System.out.println(args[idx*2]+"\t"+args[idx*2+1]+"\t"+fromYear);
		}	
		// # �迭�� list ó��
		// - ������ �Ǽ� : �迭.length/�������� ������ ����
	
	}

}
