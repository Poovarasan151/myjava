package org.may;

public abstract class SmartPhone {
	
	abstract int call(int seconds);
	abstract void sendMessage();
	abstract void receiveCall();
	void browse()
	{
		System.out.println("smartPhone browsing");
	}

	public SmartPhone()
	{
		System.out.println("SmartPhone under development");
	}
}
