package p.loop;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_3 a= new Array_3();
		//a.find_next_big();
		//a.find_second_biggest();
//		char[] name = {'v','a','r','a','d','h','a','n'};
//		a.find_a(name);
		//a.find_palindrome();
		a.find_palindrome1();

	}

	private void find_palindrome1() {
		// TODO Auto-generated method stub
		 char[] name = {'a','m','p','d'}; 
		    int count = 0; 
		    int len = name.length-1; int i=0; 
		    while(i<len){
		      char first = name[i]; // a
		      char last = name[len]; //a
		      if(first == last)
		        {
		        count++; 
		        }
		      else
		      {
		        System.out.println("Not Palindrome");
		        break; 
		      }
		      i++;
		      len--; 
		    }
		    if(count == name.length/2)
		    {
		      System.out.println("Palindrome");
		    }
		    
		    
		  }
		
	

	private void find_palindrome() {
		// TODO Auto-generated method stub
		 char[] name = {'a','p','p','a'}; 
		    int count = 0; 
		    int len = name.length-1; 
		    int i=0; 
		    while(i<len) //0=a,3=a //1=p,2=p
		    {
		      char first = name[i]; // a  //p
		      char last = name[len]; //a  //p
		      if(first == last)
		        {
		        count++; 
		        }
		      i++;
		      len--; 
		    }
		    System.out.println(count);
		    if(count == name.length/2)
		    {
		      System.out.println("Palindrome");
		    }
		    else
		    {
		      System.out.println("Not Palindrome");
		    }
		    
		  }
		
	

	private void find_a(char[] name) {
		// TODO Auto-generated method stub
		  char ch = 'a'; //name[0];
		    int count = 0; 
		for(int i=0; i<name.length;i++)
		{
		    
		    if(ch==name[i])
		      count++; 
		    
		  }
		System.out.println("Count of a is: "+ count);
		  }
		
	

	private void find_second_biggest() {
		// TODO Auto-generated method stub
		int[] ar = {5, 8, 30, 11};
	    int big = 5;
	    int second_big = 5;
	for(int i=1;i<ar.length;i++ )
	{
	    if(ar[i]>big)
	    {
	      second_big = big; // if ar[i] is greater then big 
	      big = ar[i];      //you should store big value to second big
	    }					// and ar[i] value store to big
	    else 
	    	{
	    	if(ar[i]>second_big)
	    {
	      second_big = ar[i]; 
	    }
	}
	}
	System.out.println("Biggest is :"+ big);
	System.out.println("Second Biggest is :"+ second_big);

	  }
	
		
	

	private void find_next_big() {
		// TODO Auto-generated method stub
		  int[] ar = {4, 8, 6, 9}; 
		    
		    //4
		for(int j=0; j<ar.length;j++)
		{
		    int no = ar[0];
		    int big=100; 
		    for(int i =0; i<ar.length; i++)
		    {
		    
		    if(ar[i]>no)   //it allow greater value 4>4,8>4,6>4,9>4
		    {               //4>6f,8>6,6>6f,9>6
		     if(ar[i]<big) // it decrease, minimum value 8<100,6<8;9<6f
		       {           //8<100, 8
		       big = ar[i];
		       }
		    }
		    }
		    if(big==100)
		    {
		    	System.out.println(no +"-->"+no);
		    }
		    else
		    System.out.println(no + " --> " + big); 
		}
		  }
}

