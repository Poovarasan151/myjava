package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")

public class Laptop {
	
	private int price;
	private int ram;
	
	
	@Autowired
	Internet net;
	
	public void on()
	{
		System.out.println("Switching on laptop");
		net.provide_internet();
		
	}
	
	public Laptop()
	{
		System.out.println("laptop");
		
	}
	
	
	 public int getPrice() {
		    return price;
		  }
		  public void setPrice(int price) {
		    this.price = price;
		  }
		  public int getRam() {
		    return ram;
		  }
		  public void setRam(int ram) {
		    this.ram = ram;
		  }
}
