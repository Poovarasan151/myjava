package input.output;

import java.util.ArrayList;
import java.util.Scanner;

public class Real {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Real r = new Real();
		
		ArrayList marksList = new ArrayList(); 
	    Scanner sc = new Scanner(System.in);
	    

	    while(true)
	    {
	      System.out.println("Enter Mark: ");
	      String mark = sc.next(); 
	      try {
	      Integer i = Integer.parseInt(mark);
	      marksList.add(mark);
	      }
	      catch(ClassCastException | NumberFormatException cce)
	      {
	        break; 
	      }
	      
	    }
	    System.out.println(marksList);
		
		
		
		
		
		
		
		
		
//
//		ArrayList marksList = new ArrayList(); 
//	    Scanner sc = new Scanner(System.in);
//	    
//
//	    while(true)
//	    {
//	      System.out.println("Enter Mark: ");
//	      int mark = sc.nextInt();
//	      marksList.add(mark);
//	      System.out.println("Do You want to proceed? If not, say Stop");
//	      String input = sc.next();
//	      if(input.equals("Stop"))
//	        break; 
//	    }
//	    System.out.println(marksList);
//		
//		
		
//		ArrayList kapil = new ArrayList(); 
//	    kapil.add(173);
//	    kapil.add(45);
//	    kapil.add(78);
//	    kapil.add(45);
//	    kapil.add(50);
//	  
//	    System.out.println(kapil);
//	    
//
//	    
//	    for(Object score: kapil)
//	    {
//	      Integer sc = (Integer)score; 
//	      if(sc>=50)
//	      {
//	        System.out.println(score);
//	      }
//	      
//	    }
		
		
		
		
		
		
		
		
		
//		ArrayList al = new ArrayList(); 
//	    al.add("KapilDev");
//	    al.add(150);
//	    al.add(23);
//	    al.add(45.4f);
//	    al.add(50);
//	    al.add(true);
//	    al.add(true);
//	    al.add(false);
//	    System.out.println(al);
//	    
////	    int[] ar = {10,20,30}; 
////	    for(int aa:ar)
////	    {
////	      
////	    }
//	    
//	    
//	    for(Object elem: al)
//	    {
//	      try 
//	      {
//	      Integer i = (Integer) elem; 
//	      System.out.println(i);
//	     // System.out.println((Integer) elem);
//	      }
//	      catch(ClassCastException cce)
//	      {
//	        
//	      }
//	    }

}

}
