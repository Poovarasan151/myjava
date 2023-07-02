package bank.madurai;

import bank.chennai.SBI;

public class AccountHolderMadurai extends SBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolderMadurai ac = new AccountHolderMadurai();
		ac.get_loan(0);
		ac.create_account();
		System.out.println(ac.branch_name);
	}

}
