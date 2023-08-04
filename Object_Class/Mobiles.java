package namakkal;

public class Mobiles {
	
	
	String brand; 
	  int price, ram; 
	  float screenSize; 
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		    Mobiles m1 = new Mobiles("Samsung",15000, 2, 5.5f);
		    Mobiles m2 = new Mobiles("Samsung",15000, 2, 5.5f);
		System.out.println(m1.equals(m2));
		  }

		  public boolean equals(Object ob)
		  {
		    Mobiles m = (Mobiles)ob; 
		    
		    if(this.price == m.price)
		      if(this.ram == m.ram)
		        if(this.screenSize == m.screenSize)
		          return true;
		  return false;
		  }

		  public Mobiles(String brand, int price, int ram, float screenSize) {
//		    super();
		    this.brand = brand;
		    this.price = price;
		    this.ram = ram;
		    this.screenSize = screenSize;
		  }

	}

