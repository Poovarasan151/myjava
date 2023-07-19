package p.loop;

public class Array_learning5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_learning5 al = new Array_learning5();
		//al.find_non_repeated();
		//al.split_array();
		//al.divide();
		//al.odd_index_even_no();
		al.even_index_odd_no();

	}

	private void even_index_odd_no() {
		// TODO Auto-generated method stub
		int[] ar = {10,21,30,35,47,60};
		for(int i=0; i<ar.length;i+=2)
		{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]);
			}
		
		}
		
		
	}

	private void odd_index_even_no() {
		// TODO Auto-generated method stub
		int[] ar = {10,21,30,35,47,60};
		for(int i=1; i<ar.length;i+=2)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		
		}
		
		
	}

	private void divide() {
		// TODO Auto-generated method stub
		int[] no= {4,6,7,10,2,5};
		for(int j=0; j<no.length-1; j++)
		{
		
		int number=no[j];
		for(int i=j+0; i<no.length; i++)
		{
			if(number*no[i]==20)
			{
				System.out.println(number+" "+no[i]);
			}
		}
		
		
	}
	}

	private void split_array() {
		// TODO Auto-generated method stub
		int[] no= {3,4,7,2,11,8,6,12};
		
		int count=0;
		for(int i=0; i<no.length; i++)
		{
			if(no[i]%2==0)
			{
				count++;
				//System.out.println(no[i]);
			}
			
		}
		
		int[] num=new int[count];
		int j=0;
		for(int i=0; i<no.length; i++)
		{
			if(no[i]%2==0)
			{
				num[j]=no[i];
				System.out.println("array j: "+num[j]);
				j++;
				
			}
		}
		int[] number =new int[no.length-count];
		int k=0;
		for(int i=0; i<no.length; i++)
		{
			if(no[i]%2!=0)
			{
				num[k]=no[i];
				System.out.println("array k: "+num[k]);
				k++;
				
			}
		}
		
	}

	

	private void find_non_repeated() {
		// TODO Auto-generated method stub
		char[] name = {'h','a','r','i','s','h'};
		
		for(int j = 0; j<name.length-1; j++) {
		    char ch = name[j]; 
		    boolean repeated = false; 
		    for(int i=j+1; i<name.length;i++)
		    {
		      if(ch !=name[i])
		      {
		        continue; 
		      }
		      else
		      {
		        repeated = true; 
		      }
		    }
		    if(repeated == false)
		    {
		      System.out.println("First Non-repeated character is "+ ch);
		      break; 
		    }
		}
		
		
	}

}
