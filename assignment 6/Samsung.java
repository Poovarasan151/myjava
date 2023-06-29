package org.may;

public class Samsung extends FactoryDemo{
	
	static int price = 5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Samsung sam = new Samsung();
		sam.browse();
		System.out.println(sam.price);


	}

	@Override
	void verifyFingerPrint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void providePattern() {
		// TODO Auto-generated method stub
		
	}

	@Override
	int call(int seconds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub
		
	}

}
