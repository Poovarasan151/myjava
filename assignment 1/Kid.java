package org.may;

public class Kid extends Mother{
	
	String name = "suman";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kid kid = new Kid();
		kid.study();
		kid.work();
		
	}
	
	public void work()
	{
		System.out.println("hi");
		System.out.println(super.name);
	}
	
	public void study()
	{
		Kid kid1 = new Kid();
		System.out.println("kid study");
		kid1.work();
	}

}
