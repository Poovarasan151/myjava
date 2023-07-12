package p.loop;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern2 pp = new Pattern2();
		//pp.print_star();
		//pp.print_no();
		//pp.print_Number();
		//pp.print_decrement();
		//pp.print_decrement2();
		//pp.print_decrement3();
		pp.print_increment();
		//pp.print_five1();
		//pp.print1();
		//pp.print2();
		//pp.print3();
		//pp.print4();
		//pp.print5();
		//pp.print_Alpha();
		//pp.print_Star1();
		pp.print_Alpha1();
	
	}

	
	private void print_Alpha1() {
		// TODO Auto-generated method stub
		for(int line=1; line<=5; line++)
		{
			for(int num=1; num<=6-line; num++)
			{
				System.out.print((char)(line+64)+ " ");
			}
			System.out.println();
		}
		
	}


	private void print_Star1() {
		// TODO Auto-generated method stub
		for(int row=1; row<=10; row++)
		{
			if(row<=5)
			for(int col=5; col>row; col--)
			{
			System.out.print("  ");
			}
			if(row>5)
			{
				for(int no=1; no<=row-5; no++)
				{
					System.out.print("  ");
				}
				for(int row1=1; row1<=10-row; row1++)
				{
					System.out.print("* ");
				}
			}
			if(row<=5)
			{
			for(int no=1; no<=row; no++  )
			{
			
			System.out.print("* ");
			}
			}
			System.out.println();
		}
	}
		
	


	private void print_Alpha() {
		// TODO Auto-generated method stub
		for(char line='E'; line>='A'; line--)
		{
			for(char val ='A'; val<=line; val++)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
	}


	private void print5() {
		// TODO Auto-generated method stub
		for(int line=1;line<=5; line++)
		{
		   for(int space=1; space<=5-line; space++)
		    {
		    System.out.print("h");
		    }
		    for(int star = 1; star<=line; star++)
		    {
		    System.out.print("* "); 
		    }
		System.out.println(); 
		}
	}
		
		
	

	private void print4() {
		// TODO Auto-generated method stub
		for(int line = 5; line>=1; line--)
	    {
	        for(int no=1; no<=line; no++)
	        {
	        System.out.print(" "); //give single space
	        }
	        for(int no=1; no<=6-line; no++)
	            System.out.print("* ");
	       
	    System.out.println(); 
	    }
		
	}

	private void print3() {
		// TODO Auto-generated method stub
		for(int line = 5; line>=1; line--)
	    {
	        for(int no=1; no<line; no++)
	        {
	        System.out.print("  "); //give single space
	        }
	        for(int no=1; no<=6-line; no++)
	            System.out.print(6-no+" ");
	       
	    System.out.println(); 
	    }
		
	}

	private void print2() {
		// TODO Auto-generated method stub
		for(int line = 5; line>=1; line--)
	    {
	        for(int no=1; no<line; no++)
	        {
	        System.out.print("*"+" ");
	        }
	        for(int no=1; no<=6-line; no++)
	            System.out.print(6-no+" ");
	       
	    System.out.println(); 
	    }
	}
	
		
	

	private void print1() {
		// TODO Auto-generated method stub
		for(int line = 5; line>=1; line--)
	    {
	        for(int no=1; no<=line; no++)
	        {
	        System.out.print(no+" ");
	        }
	        for(int no=1; no<=6-line; no++)
	            System.out.print(6-no+" ");
	       
	    System.out.println(); 
	    }
	}
		
	

	private void print_five1() {
		// TODO Auto-generated method stub
		for(int line = 5; line>=1; line--)
	    {
	        for(int no=1; no<=line; no++)
	        {
	        System.out.print(no+" ");
	        }
	        for(int no=1; no<=6-line; no++)
	          System.out.print(no+" "); // give no or 1
	       
	    System.out.println(); 
	    }
	}
	

	
	private void print_increment() {
		// TODO Auto-generated method stub
		for(int limit = 1; limit<=5; limit++) 
		{
		    for(int no=1; no<=limit; no++)
		    System.out.print(no+" "); 
		    System.out.println(); 
		}
		
	}

	private void print_decrement3() {
		// TODO Auto-generated method stub
		for(int no2 = 9; no2>=7; no2--)
		{
		    for(int no=no2; no>=1; no-=3)
		        System.out.print(no + " ");
		    System.out.println(); 
		}
		
	}

	private void print_decrement2() {
		// TODO Auto-generated method stub
		for(int limit = 7; limit>=1; limit-=2)
	    {
	        for(int no = 1; no<=limit; no++)
	            System.out.print(no+" "); //1   2   3   4   5
	        System.out.println(); 
	    }
		
	}

	private void print_decrement() {
		// TODO Auto-generated method stub
		for(int limit = 5; limit>=1; limit--)
		{
		    for(int no = 1; no<=limit; no++)
		        System.out.print(no+" "); //1   2   3   4   5
		    System.out.println(); 
		}
		
	}

	private void print_Number() {
		// TODO Auto-generated method stub
		for(int val=1; val<=5; val++)
		{
		for(int no=1; no<=5; no++)
		    System.out.print(val +" "); //1 1   1   1   1 
		System.out.println(); 
		}
		
	}

	private void print_no() {
		// TODO Auto-generated method stub
		for(int line=1;line<=5; line++)
		{
		for(int no = 1; no<=5; no++)
		{
		    System.out.print(no + " "); 
		}
		System.out.println(); 
		}
		
	}

	private void print_star() {
		// TODO Auto-generated method stub
		for(int line=1; line<=5; line++)
		{
		    for(int star = 1; star<=5; star++)
		    {
		    System.out.print("* "); 
		    }
		    System.out.println(); 
		}
	}
}