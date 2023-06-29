package org.may;

public abstract class India {
	static String capital = "new delhi";
	
	abstract void speakLanguage();
	abstract void eat();
	abstract void dress();
	
	public India(String primeMinister)
	{
		System.out.println("our prime minister is:"+primeMinister);
	}
	

}
