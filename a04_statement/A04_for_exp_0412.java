package a04_statement;

public class A04_for_exp_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] players={"박용택", "오지환", "유강남"};
		Double[] batAvgs={0.321, 0.375, 0.251};
		for(String player : players){
			System.out.println("선수이름 : "+player);
		}
		for(Double batAvg : batAvgs){
			System.out.println("타율 : "+batAvg);
		}
		System.out.println("선수이름\t  타율");
		for(int idx=0; idx<players.length; idx++){
			System.out.println(players[idx]+"\t  "+batAvgs[idx]);
		}

	}

}

