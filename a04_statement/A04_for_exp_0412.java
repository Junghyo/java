package a04_statement;

public class A04_for_exp_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] players={"�ڿ���", "����ȯ", "������"};
		Double[] batAvgs={0.321, 0.375, 0.251};
		for(String player : players){
			System.out.println("�����̸� : "+player);
		}
		for(Double batAvg : batAvgs){
			System.out.println("Ÿ�� : "+batAvg);
		}
		System.out.println("�����̸�\t  Ÿ��");
		for(int idx=0; idx<players.length; idx++){
			System.out.println(players[idx]+"\t  "+batAvgs[idx]);
		}

	}

}

