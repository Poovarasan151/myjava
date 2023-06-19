package trichy;

import namakkal.Harish_Parents;

public class Harish extends Harish_Parents{
	final int doorNo =15;
	static boolean indian = true;

	public static void main(String[] args) {
		
		Harish harish = new Harish();
		System.out.println(harish.doorNo);
		System.out.println(harish.indian);
		
		
		
//		harish.give_invitation();
		harish.ChooseBride();
		
	}
	
	protected void ChooseBride()  // method overriding
	{
		super.income();
		System.out.println("my life my bride");
	}

}
