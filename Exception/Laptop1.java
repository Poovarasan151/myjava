package namakkal;

public class Laptop1 implements Comparable{

	  int price; 
	  Laptop1(int price)
	  {
		  System.out.println(price);
	    this.price=price;
	    //System.out.println(this.price);
	  }
	  public static void main(String[] args) {
	    
	    
	    Laptop1 l1 = new Laptop1(25000);
	    Laptop1 l2 = new Laptop1(35000);
	    
	  // l2.display();
	    
	    int result = l1.compareTo(l2);
	    
	    
	    
	    System.out.println("Result is " + result);
	    if(result>0)
	    {
	      System.out.println("First Laptop is expensive");
	    }
	    else if(result<0)
	    {
	      System.out.println("Second Laptop is expensive");
	    }
	    else
	    {
	      System.out.println("Both laptops have same price");
	    }
	    System.out.println(l1.equals(l2));
	  }
	  private void display() {
		// TODO Auto-generated method stub
		  System.out.println(this.price);
		
	}
	public boolean equals(Object obj) {
	        int price1 = this.price;
	        Laptop1 ll = (Laptop1) obj;
	        int price2 = ll.price;
	        if(price1 == price2)
	        {
	          return true; 
	        }
	        else
	          return false;
	    }
	  @Override
	  public int compareTo(Object o) {
	    // TODO Auto-generated method stub
	    int price1 = this.price;
	        Laptop1 ll = (Laptop1) o;
	        int price2 = ll.price;
	        if(price1>price2)
	          return +1000;
	        else if(price1 < price2)
	          return -9999;
	    return 0;
	  }

	

	}








//public class Laptop 
//int price; 
//Laptop(int price)
//{
//  this.price = price; 
//}
//public static void main(String[] args) {
//  Laptop l1 = new Laptop(25000);
//  Laptop l2 = new Laptop(25000);
//
//  System.out.println(l1.equals(l2));
//  
//}
//public boolean equals(Object ob)
//{
//  int h1 = this.hashCode();
//  int h2 = ob.hashCode();
//  System.out.println(h1);
//  System.out.println(h2);
//  if(h1==h2)
//  {
//  return true; 
//  }
//  else
//  {
//	  return false;
//  }
//}
//public int hashCode()
//{
//  return -123; 
//}
//  
//  
//}


