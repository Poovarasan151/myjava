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
		//ps.printO();
		//ps.printV();
		//ps.printR();
		//ps.printI();
		//ps.printC();
		//ps.printS();
		//ps.printp();
		//ps.ass1();
		//ps.ass2();
		//ps.ass3();
		//ps.ass4();
		//ps.ass5();
	}

	private void ass5() {
		// TODO Auto-generated method stub
		for(int val=1; val<=5; val++)
		{
		for(int no=1; no<=val; no++)
		{
			System.out.print(no+" ");
		}
		System.out.print("*");
		System.out.println();
	}
}

	

	private void ass4() {
		// TODO Auto-generated method stub
		for(int val=5; val>=1; val--)
		{
	      for(int no=1; no<=val; no++)
	    {
		System.out.print(no+" ");
	  }
	System.out.print("1");
	System.out.println();
	}
	}
		
	

	private void ass3() {
		// TODO Auto-generated method stub
		for(int val=5; val>=1; val--)
		{
		for(int no=5; no>=val; no--)
		{
			System.out.print(val+" ");
		}
		System.out.println();
	}
	}
	

	private void ass2() {
		// TODO Auto-generated method stub
		for(int val=1; val<=6; val++)
		{
		for(int no=1; no<=val; no++)
		{
			System.out.print(val+" ");
		}
		System.out.println();
	}
	}
	
	

	private void ass1() {
		// TODO Auto-generated method stub
		for(int val=5; val>=1; val--)
		{
		for(int no=5; no>=val; no--)
		{
			System.out.print(no+" ");
		}
		System.out.println();
		}
	}
		
	

	private void printS() {
		// TODO Auto-generated method stub
		for(int line=1; line<=13; line++)
		{
			if(line==1 || line==7 || line==13)
			{
			for(int star=1; star<=9; star++)
			{
				if(star==1 || star==9 )
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			}
			else
			{
				if(line<=6)
				{
			System.out.print("*");
				}
				else
				{
					for(int space=1; space<=14; space++)
					{
					System.out.print(" ");
			
					}
					if(line<=12)
					{
					System.out.print("*");
					}
					else
					{
						if(line==13)
						{
							System.out.print("*");
						}
					}
				}
				
				
			}
		System.out.println();
	}
	}
	

	private void printC() {
		// TODO Auto-generated method stub
		for(int row = 1; row<=9; row++)
	       {
	        if(row==1 || row==9)
	        {
	            for(int col = 1; col<=9; col++)
	            {
	                System.out.print("* "); 
	            }
	        }
	        else
	        {
	            System.out.print("* "); 
	        }
	        System.out.println(); 
	      }
	    
	  }


	private void printI() {
		// TODO Auto-generated method stub
		 for(int row = 1; row<=9; row++)
	       {
	        if(row==1 || row==9)
	        {
	            for(int col = 1; col<=7; col++)
	            {
	                System.out.print("* "); 
	            }
	        }
	        else
	        {
	        	for(int space=1; space<=6; space++)
	        	{
	        		System.out.print(" ");
	        	}
	            System.out.print("* "); 
	        }
	        System.out.println(); 
	      }
	    
	  }


	private void printR() {
		// TODO Auto-generated method stub
		for(int row=1; row<=16; row++)
		{
			if(row==1 || row==9)
			{
			  for(int col=1; col<=9; col++)
			  {
				  if(/*col==1 ||*/ col==9)
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


	private void printV() {
		// TODO Auto-generated method stub
		for(int line = 1; line<=5;line++)
	    {
	        for(int star = 1; star<=7; star++)
	        {
	          if(line<=4)
	          {
	            if(star==line || star==8-line)
	            {
	              System.out.print("* ");
	            }
	            else
	            {
	                System.out.print("  "); 
	            }
	          }        
	      
	        }
	        System.out.println(); 
	    } 
	  }

	

	private void printp() {
		// TODO Auto-generated method stub
		for(int line=1; line<=15; line++)
		{
			if(line==1 || line==8)
			{
			for(int star=1; star<=9; star++)
			{
				if(star==9)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			}
			else
			{
				
				System.out.print("* ");
				if(line<=7)
				{
		
				for(int space=1; space<=13; space++)
				{
					
					System.out.print(" ");
				}
				System.out.print("*");
			}
		}			
			System.out.println();	
	}			
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
