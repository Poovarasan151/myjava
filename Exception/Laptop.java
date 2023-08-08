package namakkal;

public class Laptop{

	 int price; 
	  public Laptop(int price)
	  {
	    this.price = price; 
	  }

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    Laptop lap1 = new Laptop(30000);
	    Laptop lap2 = new Laptop(30000);
	    
	    System.out.println(lap1.equals(lap2));
	    
	    System.out.println(lap1.hashCode());
	    System.out.println(lap2.hashCode());
	  }
	  public boolean equals(Object oo)
	  {
	    Laptop ll = (Laptop)oo;
	    if (this.price == ll.price)
	      return true; 
	    return false;
	  }
	    //ublic int hashCode()
	  {
	     //return -123;
	  }

	}



//compareTo


//String s1 = "abc";
//String s2 = "abcd";
//System.out.println(s1.compareTo(s2));
////result -1
//
//
//String s1 = "abcd";
//String s2 = "abc";
//                 //abcd --> abc 
//System.out.println(s1.compareTo(s2));
////result 1
//
//String s1 = "abcd";
//String s2 = "abcd";
//System.out.println(s1.compareTo(s2));
////result 0









