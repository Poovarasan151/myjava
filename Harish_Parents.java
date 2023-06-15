package namakkal;

public class Harish_Parents 
  {
	int doorNo=100;
	private int age = 20;

	public static void main(String[] args) {
		Harish_Parents hp = new Harish_Parents();
		System.out.println(hp.doorNo);
		hp.hobby();
		hp.personal_details();
		System.out.println(hp.age);
		hp.give_invitation();
		hp.ChooseBride();
		
		
	}
	
	void hobby()
	{
		System.out.println("Going to ARRS theatre");
	}
	
   private void personal_details()
	{
		System.out.println("hi");
	}
   
   protected void give_invitation()
   {
	   System.out.println("harish marriage");
   }
   
   protected void ChooseBride() 
   {
	   System.out.println("status education");
   }

}
