package p.loop;

public class Array_learning4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_learning4 a = new Array_learning4();
		//a.adjacent();
		//a.method1();
		//a.method1_1();
		//a.first_repeated_char();
		//a.repeated_char();
		//a.repeated_char1();
		//a.divide_element();
		a.divide_store();

	}

	private void divide_store() {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		
		for(int i=0;i<a.length-1;i++)
		{
			
		int start =a[i];
		int end =a[i+1];
		
		for(int no=start; no<end; no++)
		{
			int s=start*end;
			System.out.println(s);
			if(s==20)
			{
				System.out.println(start);
				System.out.println(end);
			}
		}
		}
		
		
		
	}

	private void divide_element() {
		// TODO Auto-generated method stub
		//int[] ar = {3, 12, 9, 15, 18};

//		ar[0] = ar[0]/3; 
//		ar[1] = ar[1]/3; 
//		ar[2] = ar[2]/3;
//		ar[3] = ar[3]/3;

		int[] ar = {3, 12, 9, 15, 18};
		for(int i =0; i<ar.length; i++)
		{
		    ar[i] = ar[i]/3;
		System.out.println(ar[i]);
		}
		
		
	}

	private void repeated_char1() {
		// TODO Auto-generated method stub
		char[] name = {'b','h','a','r','a','n','i','d','a','r','a','n'}; 
	    boolean repeated = false; 
	    for(int j = 0; j<name.length-1;j++)
	    {
	    char ch = name[j]; 
	    for(int i=j+1; i<name.length;i++)
	        {
	          if(ch == name[i])
	          {
	            System.out.println("First repeated character is "+ ch);
	            repeated = true; 
	            break; 
	          }
	        }
	    if(repeated == true)
	      break;
	    }

	    
	  }
		
	

	private void repeated_char() {
		// TODO Auto-generated method stub
	    char[] name = {'s','h','r','i','r','a','m'}; 
	    int j = 0; 
	    while(j<name.length-1)
	    {
	    char ch = name[j]; 
	    for(int i=j+1; i<name.length;i++)
	        {
	          if(ch == name[i])
	          {
	            System.out.println("First repeated character is "+ ch);
	            break; 
	          }
	        }
	    j++;
	    }

	    
	  }
		
	

	private void first_repeated_char() {
		// TODO Auto-generated method stub
	    char[] name = {'s','r','i','v','a','r','s','h','a','n'};
	    char ch = name[0]; 
	    for(int i=1; i<name.length;i++){
	      if(ch == name[i])
	      {
	        System.out.println("yes, first repeated character is "+ ch);
	        break; 
	      }
	    }
	    
	  }
		
	

	private void method1_1() {
		// TODO Auto-generated method stub
		int[] a = {3, 8, 5, 13}; 
		int i =0; 
	      //         0  1  2   3
	    while(i<a.length-1)
	      {
	    int start = a[i]<a[i+1]? a[i]:a[i+1];
	    int end = a[i]>a[i+1]? a[i]:a[i+1];
	    
	    for(int no = start+1; no<end; no++)
	        System.out.print(no+" "); 
	    System.out.println();
	    i++;
	      
	      }
	  }
		
	

	private void method1() {
		// TODO Auto-generated method stub
		 int[] a = {3, 8, 5, 13};  
		 int i =0; 
	      //         0  1  2   3
	    while(i<a.length-1)
	      {
	    int start = a[i]; 
	    int end = a[i+1]; 
	    if(start<end) 
	    {
	    for(int no = start+1; no<end; no++)
	        System.out.print(no+" "); 
	    System.out.println();
	    i++;
	    }
	    else
	    {
	      for(int no = start-1; no>end; no--)
	          System.out.print(no+" "); 
	      System.out.println();
	      i++;
	    }
	    
	      }
	    
	    
	  }
		
	

	private void adjcent() {
		// TODO Auto-generated method stub
		int[] a = {3, 5, 8, 13};  // in between numbers 3-5 //5-8 //8-13
		int i =0; 
		  //         0  1  2   3
		while(i<a.length-1)
		  {
		int start = a[i]; 
		int end = a[i+1]; 

		for(int no = start+1; no<end; no++)
		{
			System.out.print(no+" ");
		   
		}
		 System.out.println(); 

		i++;
		}
		
	}

}
