package trichy;

import namakkal.Harish_Parents;

public class Harish extends Harish_Parents {

	public static void main(String[] args) {
		
		Harish harish = new Harish();
		harish.give_invitation();
		harish.ChooseBride();
		
	}
	
	protected void ChooseBride()  // method overriding
	{
		System.out.println("my life my bride");
	}

}
