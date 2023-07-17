package p.loop;

public class Array_learning_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_learning_3 ps = new Array_learning_3();
		//ps.method();
		//ps.method1();
		//ps.method3();
		//ps.find_negative_values();
		ps.negative_array();

	}

	private void negative_array() {
		// TODO Auto-generated method stub
		int[]a = {10,-20,-30,40,50};
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
		
			if(a[i]<0)
			{
				count++;
				
			}
		}
			int[]b = new int[count];
			int j=0;
			
			for(int i=0; i<a.length; i++)
			{
				if(a[i]<0)
				{
					b[j]=a[i];
					System.out.println("negative numbers:"+b[j]);
					j++;
				}
			}
		}
		
		
		
	

	private void find_negative_values() {
		// TODO Auto-generated method stub
		int[]a = {10,-20,-30,40,50};
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);
				count++;
			}
		}
		System.out.println("values"+count);
		
	}

	private void method3() {
		// TODO Auto-generated method stub
		int[] a = {10,20,30, 15, 25, 35}; //FIND ODD ELEMENTS AND 
		                                  //STORE THEM IN ANOTHER ARRAY 
		int count = 0; 
		for(int i =0; i<a.length; i++)
		    {
		    if(a[i]%2!=0)
		        count++; 
		    }
		int[] b = new int[count]; 

		int j = 0; 

		for(int i =0; i<a.length; i++)
		    {
		    if(a[i]%2!=0)
		        {
		        b[j] = a[i]; 
		        System.out.println(b[j]); 
		        j++; 
		        }
		    }
		
	}

	private void method1() {
		// TODO Auto-generated method stub
		int[] ar = {5, 4, 5, 4, 5,4, 5,4}; 
		int no = 4; 
		int count = 0; 
		for(int i = 0; i<ar.length; i++)
		{
		    if(no == ar[i])
		        {   
		       // System.out.println("Yes, We got the number in index " + i); 
		        count++; 
		        }
		}
		System.out.println("Given element is present + count + "+" times"+count);
	}

	private void method() {
		// TODO Auto-generated method stub
		int[] ar = {5, 8, 3,4};              //linear search
	    //      0  1  2 3
	int no =8; 
	boolean present = false;
	for(int i = 0; i<ar.length; i++)
	{
	    if(no == ar[i])
	        {   
	        System.out.println("Yes, We got the number in index " + i);
	        present = true; 
	        break;
	        }
	}
	  if(present==false)
	  {
	System.out.println("number is not present");
	  }
		
	}

}
