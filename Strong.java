package org.learning;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=145;
		Strong a=new Strong();
		int result=a.strong_number(no);
		if(no==result)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}

	}

	private int strong_number(int no) {
		// TODO Auto-generated method stub
		int store=0;
		while(no>0)
		{
		int rem=no%10;
		int value1=find_strong(rem);
		no=no/10;
		store=store+value1;
		}
		return store;
	}

	private int find_strong(int rem) {
		// TODO Auto-generated method stub
		int value=1;
		while(rem>0)
		{
			value=value*rem;
			rem=rem-1;
		}
		return value;
	}

}
