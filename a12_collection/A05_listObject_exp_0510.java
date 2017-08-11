package a12_collection;

import java.util.ArrayList;

class Real{
	private int unitno;
	private String pos;
	private String loc;
	public Real(int unitno, String pos, String loc) {
		this.unitno = unitno;
		this.pos = pos;
		this.loc = loc;
	}
	public int getUnitno() {
		return unitno;
	}
	public void setUnitno(int unitno) {
		this.unitno = unitno;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
public class A05_listObject_exp_0510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Real> squad = new ArrayList<Real>();
		squad.add( new Real(7, "Forward", "        Portugal" ) );
		squad.add( new Real(1, "Keeper", "        Costarica" ) );
		squad.add( new Real(12, "Defender", "Brazil" ) );
		System.out.println("unitno\tpos\t        loc");
		for(int idx=0; idx<squad.size(); idx++){
			System.out.print( squad.get(idx).getUnitno()+"\t" );
			System.out.print( squad.get(idx).getPos()+"\t" );
			System.out.print( squad.get(idx).getLoc()+"\n" );
		}
	}

}

