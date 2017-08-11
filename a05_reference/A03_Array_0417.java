/*
 # ��ü �迭
 - ���� : �⺻�������� [] �̸� = new �⺻��������[ũ��];
 ex) int [] points = new int[5];
 
 - �Ҵ��̸�[index] = �Ҵ��� ������;
 ex) points[3] = 80; 
 
 - ����� �Ҵ� : �⺻��������[] �̸� = new �⺻��������[]{������1, ������2, ....}; 	-- new �⺻���������� ��������
 ex) double[] weights = new double[]{67.5, 61.3, 70}; 	-- new double[]�� ��������
 
*/

/*
 # �迭 ����
 - �迭�� �ڹ��� API�� ���� ����ó�� �޼��尡 �����ȴ�. 
 objArray = {1, 2, 3}; copyArray ={1, 2, 3, 0, 0};
 index       0  1  2               0  1  2  3  4
 ex) System.arraycopy(objArray, int ����������ġ, copyArray, int ���纻������ġ, int ��ü����);
*/


package a05_reference;

public class A03_Array_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �迭�� ����
		int [] points;
		
		// �⺻ ũ�Ⱑ ����� �迭��ü ����
		points = new int[5];
		
		// �迭 ��ü ������ �Ҵ�
		points[0]= 90;
		points[1]= 80;
		points[3]= 70;
		
		// �ش� ��ü ȣ��	�ش� �迭�� �����Ͱ� �Ҵ���� ������ 0���� �ڵ� �Ҵ�
		for(int idx=0; idx<points.length; idx++){
			System.out.println((idx+1)+"��° ���� : "+points[idx]);		
		}
		
		// �迭��ü ����, ������ �Ҵ�
		double [] weights = new double[]{67.5, 70.112, 10, 30.123};
		// double [] weights = {67.5, 70.112, 10, 30.123}; 		new double[] ��������
		
		// �ش� ��ü ȣ��
		for(int idx=0; idx<weights.length; idx++){
			System.out.println((idx+1)+"��° ������ : "+weights[idx]);
		}
		
		// �迭 ����. System.arraycopy(�����迭��ü, int ��������index, ���纻�迭��ü, int ���纻����index, int �����ұ���);
		int[] originArray={1, 3, 5};
		int[] copyArray= new int[5];
		System.arraycopy(originArray, 0, copyArray, 0, 3);
		System.out.println(copyArray[1]);
		System.out.println("����� �迭");
		for(int idx=0; idx<copyArray.length; idx++){
			System.out.println("copyArray["+idx+"] : "+copyArray[idx]);
		}
		
		String[] fruits = {"���", "�ٳ���", "����"};
		String[] copyFruits = new String[5];
		System.arraycopy(fruits, 1, copyFruits, 3, 2);
		
		for(int idx=0; idx<copyFruits.length; idx++){
			System.out.println("copyFruits["+idx+"] : "+copyFruits[idx]);
		}
		
		for(String fruit : copyFruits){
			System.out.println("����� ���� : "+fruit);
		}
		
		

	}

}
