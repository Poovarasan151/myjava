package org.may;

public class Branch extends Branch_Plan {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Branch branch = new Branch();
		branch.check_accounts(1000);
		int balance = branch.pay_tax(2000);
		System.out.println(balance);
		branch.do_interview();

	}

	@Override
	public void receive_customer() {
		// TODO Auto-generated method stub
		
	}

}
