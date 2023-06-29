package org.may;

public abstract class HeadOffice {

	public void check_accounts(int amount)
	{
		System.out.println("1000");
	}
	
	public int pay_tax(int amount)
	{
		return amount;
	}
	
	public abstract void receive_customer();
	
}
