package org.learning;

public class For_task {

	public static void main(String[] args) {
	For_task ll=new For_task();
	//ll.find_common_divisor(100,120);
	//ll.find_lcm(3,9);
	//ll.find_fibbo();
	//ll.perfect_number(6);
	int result=ll.strong_number(145);
	
	if(145==result)
	{
		System.out.println("strong number");
	}
	else
	{
		System.out.println("it is not a strong number");
	}
		

	}

	private int strong_number(int no) 
	{
		int store=0;
		for(;no>0;)
		{
			int rem=no%10;
			int value1=find_strong(rem);
			no=no/10;
			store=store+value1;
		}
		return store;
		
	}

	private int find_strong(int rem) 
	{
		int value=1;
		for(;rem>0;)
		{
			value=value*rem;
			rem=rem-1;
		}
		return value;
		
	}

	private void perfect_number(int no) 
	{
		int sum=0;
		for(int div=1; div<=no/2; div++)
		{
			int rem=no%div;
			if(rem==0)
			{
				System.out.println(div);
				sum=sum+div;
			}
		}
		System.out.println("sum of "+sum);
		if(no==sum)
		{
			System.out.println("it is a perfect number");
		}
		else
		{
			System.out.println("it is not a perfect number");
		}
	
	}

	private void find_fibbo() 
	{
		for(int a=0,b=1;a<=13;)
		{
			int c=a+b;
			System.out.println(a+" ");
			a=b;
			b=c;
		}
				
	}

	private void find_lcm(int no1, int no2) 
	{
		int big=no1>no2? no1:no2;
		//int temp;
		System.out.println(big);
		for(int temp=big;true;big=big+temp)
		{
			if(big%no1==0 && big%no2==0)
			{
				System.out.println("lcm is "+big);
				break;
			}
		}
		
	}

	private void find_common_divisor(int no1, int no2)
	{
		int small=no1<no2?no1:no2;
		for(int div=2;div<=small;div++)
		{
			if(no1%div==0 && no2%div==0)
			{
				System.out.println(div);
			}
		}
		
	}

}
