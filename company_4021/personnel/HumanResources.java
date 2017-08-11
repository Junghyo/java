package company_4021.personnel;

import company_4021.manager.HeadManager;
import company_4021.manager.StaffMember;


public class HumanResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		company_4021.manager.ChiefMember c1 = new company_4021.manager.ChiefMember();
		c1.ChiefInfo();
		HeadManager h1 =new HeadManager();
		h1.HeadInfo();
		StaffMember s1 = new StaffMember();
		System.out.println(s1.WeddingDate);

	}

}
