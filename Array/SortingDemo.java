package p.loop;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortingDemo sd = new SortingDemo();
//		int[] ar = {10,13,16,17,3,8,5,7,1};
//		sd.bubble_sort(ar);
//		int[] ar = {10,13,16,17,3,8,5,7,1};
//		sd.find_biggest(ar);
		//sd.binary_search();
		sd.bubble();

	}

	private void find_biggest(int[] ar) {
		// TODO Auto-generated method stub
		for(int i=0; i<ar.length-1; i++)
	    {
	      if(ar[i]>ar[i+1])
	      {
	        int temp = ar[i];
	        ar[i] = ar[i+1];
	        ar[i+1] = temp;
	      }
	    }
	    System.out.println("Biggest is "+ ar[ar.length-1]);
	  }
		
	

	private void bubble() {
		// TODO Auto-generated method stub
		int[] no= {1,6,12,8,4};
		
		for(int j=1; j<no.length; j++)
		{
		
		for(int i=0; i<no.length-j;i++)
		{
			if(no[i]>no[i+1])
			{
				int temp =no[i];
				no[i]=no[i+1];
				no[i+1]=temp;
			}
			
		}
		}
		System.out.println("fourth biggest"+no[no.length-1]);
		for(int i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
		
	}
	

	private void binary_search() {
		// TODO Auto-generated method stub
		 int[] ar = {10,8, 5,1};
		    int key = 5;
		    int start = 0, end = ar.length-1; // start = 0 end = 3
		      //mid = 1
		    while(true)
		    {
		      int mid = (start+end)/2;
		      if(key == ar[mid])  // 5 == 8 
		      {
		        System.out.println("Yes, present at position: "+ mid );
		        break;
		      }
		      else if(key>ar[mid])
		      {
		        end = mid - 1; 
		      }
		      else {
		        start = mid + 1; 
		      }
		    }
		  }
		
	

	private void bubble_sort(int[] ar) {
		// TODO Auto-generated method stub
		 //int n 
		  for(int j = 1; j<ar.length; j++)
		    {
		    for(int i=0; i<ar.length-j; i++)
		      {
		        if(ar[i]>ar[i+1])
		        {
		          int temp = ar[i];
		          ar[i] = ar[i+1];
		          ar[i+1] = temp;
		        }
		      }
		    } //return ar;
		  System.out.print("[ ");
		  for(int i=0; i<ar.length;i++)
		  {
		    System.out.print(ar[i]+ " | ");
		  }
		  System.out.print(" ] ");
		  }
}



