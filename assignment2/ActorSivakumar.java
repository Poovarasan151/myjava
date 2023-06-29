package org.may;

public class ActorSivakumar implements Actor {
	
	String address = "coimbatore";
	int no;
	String name;

	public ActorSivakumar(int i, String string) {
		this.no=i;
		this.name=string;
		
		
	}

	public ActorSivakumar() {
		// TODO Auto-generated constructor stub
		System.out.println("i am zero argument constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
		as.act();
		as.dance();
		as.sing();
		as.speaking();
		System.out.println(as.address);
		
		Actor ac = new ActorSivakumar();
		System.out.println(ac.address);

	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("act");
		System.out.println(name);
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("dance");
		System.out.println(no);
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("sing");
		
	}
	
	void speaking()
	{
		System.out.println("speaking");
	}

}
