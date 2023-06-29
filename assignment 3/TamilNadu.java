package org.may;

public class TamilNadu extends SouthIndia{
	
	static String capital = "chennai";

	public TamilNadu(String primeMinister) {
		super(primeMinister);
		// TODO Auto-generated constructor stub
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(India.capital);
		System.out.println(TamilNadu.capital);
		
		SouthIndia si = new TamilNadu("poovarasan");
		si.speakLanguage();
		si.eat();
		si.dress();
		si.cultivate();
		si.livingStyle();
		System.out.println(si.capital);
	}

	@Override
	void speakLanguage() {
		// TODO Auto-generated method stub
		System.out.println("speak language");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat");
	}

	@Override
	void dress() {
		// TODO Auto-generated method stub
		System.out.println("dress");
		
	}
	void cultivate()
	{
		System.out.println("rice and sugar");
	}
	
	void livingStyle()
	{
		System.out.println("above average development");
	}

}
