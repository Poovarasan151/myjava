package p.loop;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 ps = new Assignment2();
		//ps.printL();
		//ps.printE();
		//ps.printU();
		//ps.printD();
		//ps.printB();
		ps.printO();
	}

	private void printO() {
		// TODO Auto-generated method stub
		for(int row=1; row<=9; row++)
		{
			if(row==1 || row==9)
			{
			  for(int col=1; col<=9; col++)
			  {
				  if(col==1 || col==9)
				  {
				  System.out.print("  ");
			      }
				  else
				  {
					  System.out.print("* ");
				  }
			  }
			}
			
			else
			{
				System.out.print("*");
				for(int space=1; space<=15; space++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}	
	

	private void printB() {
		// TODO Auto-generated method stub
		for(int row=1; row<=9; row++)
		{
			if(row==1 || row==9)
			{
			  for(int col=1; col<=9; col++)
			  {
				  if(col==1 || col==9)
				  {
				  System.out.print("  ");
			      }
				  else
				  {
					  System.out.print("* ");
				  }
			  }
			}
			
			else
			{
				for(int space=1; space<=4; space++)
				{
				System.out.print(" ");
				}
				System.out.print("*");
				for(int space=1; space<=11; space++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=1; row<=9; row++)
		{
			if(row==9)
			{
			  for(int col=1; col<=9; col++)
			  {
				  if(col==1 || col==9)
				  {
				  System.out.print("  ");
			      }
				  else
				  {
					  System.out.print("* ");
				  }
			  }
			}	else
			{
				for(int space=1; space<=4; space++)
				{
				System.out.print(" ");
				}
				System.out.print("*");
				for(int space=1; space<=11; space++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
		
		
	

	private void printD() {
		// TODO Auto-generated method stub
		for(int row=1; row<=9; row++)
		{
			if(row==1 || row==9)
			{
			  for(int col=1; col<=9; col++)
			  {
				  if(col==1 || col==9)
				  {
				  System.out.print("  ");
			      }
				  else
				  {
					  System.out.print("* ");
				  }
			  }
			}
			
			else
			{
				for(int space=1; space<=4; space++)
				{
				System.out.print(" ");
				}
				System.out.print("*");
				for(int space=1; space<=11; space++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
		
		
	

	private void printU() {
		// TODO Auto-generated method stub
		for(int row=1; row<=9; row++)
		{
			if(row==9)
			{
			  for(int col=1; col<=7; col++)
			  {
				  if(col==1 || col==7)
				  {
				  System.out.print("  ");
			      }
				  else
				  {
					  System.out.print("* ");
				  }
			  }
			}
			
			else
			{
				System.out.print("*");
				for(int space=1; space<=11; space++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private void printE() {
		// TODO Auto-generated method stub
		for(int row=1; row<=6; row++)
		{
			System.out.print("* ");
		
		}
		System.out.println();
		for(int col=1; col<=8; col++)
		{
			if(col==4)
			{
				for(int star=1; star<=5; star++)
				{
					System.out.print("* ");
				}
				
			}
			else
			{
				System.out.println("* ");
			}
				if(col==8)
				{
					for(int star=1; star<=6; star++)
					{
						System.out.print("* ");
					}
				}
		
		}
		
	}

	private void printL() {
		// TODO Auto-generated method stub
		for(int star=1; star<=7; star++)
		{
			System.out.println("*");
		}
		for(int star=1; star<=7; star++)
		{
			System.out.print("* ");
		}
		
	}
	

}
