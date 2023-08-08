package namakkal;

import java.util.Scanner;

public class Binary_Decimal {
	
	
	
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    
	    Binary_Decimal bd = new Binary_Decimal(); 
	    bd.divide();
	    System.out.println("Check Me");
	    
	  
	    
	  
	  }

	  private void divide() {
	    // TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	    System.out.println("Enter two numbers ");
	    int no1 = sc.nextInt();
	    int no2 = sc.nextInt();
	    try {
	    System.out.println(no1/no2);
	    }
	    catch(ArithmeticException ae)
	    {
	      System.out.println("Check no2. It should not be zero.");
	      no2 = sc.nextInt();
	      System.out.println(no1/no2);
	    }
	    
	    
	    
	  }

	  

	}


