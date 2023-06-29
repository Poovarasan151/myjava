package org.may;

public class Theatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre raja = new Theatre();
		int result = raja.bookTicket(200);
		System.out.println("booking ticket:" + result);

	}

	private int bookTicket(int no) {
		// TODO Auto-generated method stub
		int balance;
		int ticket_price = 120;
		balance = no - ticket_price;
		return balance;
		
	}

}
