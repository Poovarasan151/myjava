package p.loop;

import java.util.Scanner;

public class Array_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Array_example al  = new Array_example(); 
		    //al.lesson1(); 
//		    char[] name = {'h','a','r','i','s','h'};
//		    al.lesson2(name);
		    char[] name = {'a','b','c','d'};
		    //al.print_reverse(name);
		    //al.print_task();
		    //al.print_task1();
		    //al.print_total();
		    //al.find_expence();
		    //al.concatenate_array();
		    //al.add_array();
		    //al.find_hscore();
		    al.add();
		    
		  }
		  private void add() {
		// TODO Auto-generated method stub
			  int[] q= {90,87,100};
			  int[] h= {89,67};
			  
			  int small =q.length<h.length?q.length:h.length;
			  int big =q.length>h.length?q.length:h.length;
			  
			  int[] result = new int[big];
			  
//			  result==>{90+89 , 87+67, 100};
//			  result[0] = q[0]+h[0];
//			  result[1] = q[1]+h[1];
//			  result[2] = q[2];
			  
			  for(int i=0; i<result.length; i++)
			  {
				  if(i<small)
				  {
					  result[i] = q[i]+h[i];
					  System.out.println(result[i]);
				  }
				  else
				  {
					  result[i] = q[i];
					  System.out.println(result[i]);
				  }
			  }
		
	}
		private void find_hscore() {
		// TODO Auto-generated method stub
			  int[] first = {90, 76, 87};
			  int[] second = {56, 98, 45};
			  int count =0;
			  for(int i=0; i<first.length; i++)
			  {
				  if(second[i]>first[i])
				  {
					  count++;
				  }
					  
			  }
			  System.out.println(count);
			  System.out.println(first.length - count);
		
	}
		private void add_array() {
		// TODO Auto-generated method stub
			  int[] first = {90, 76, 87};
			  int[] second = {56, 98, 45};
			  int[] total = new int[first.length];
			  
			  for(int i=0; i<total.length; i++)
			  {
				  total[i] = first[i]+second[i];
				  System.out.println(total[i]);
			  }
		
	}
		private void concatenate_array() {
		// TODO Auto-generated method stub
			  int[] first = {90, 76, 87};
			  int[] second = {56, 98 ,45};
			  
			 // int j=0;
			  
			  int[] total = new int[first.length + second.length];
			  for(int i=0; i<total.length; i++)
			  {
				  if(i<first.length)
				  {
					  total[i] = first[i];
					  System.out.println(total[i]);
				  }
				  else
				  {
					  total[i] = second[i-first.length];// j // second[i-first.length]
					  //j++;
					  System.out.println(total[i]);
				  }
			  }
		
	}
		private void find_expence() {
		// TODO Auto-generated method stub
			  int[] tour = {1000,1500,300,450};
			  int[] trip = {343,400};
			  
			  int total =0;
			  
			  for(int i=0; i<tour.length; i++)
			  {
				  total = total + tour[i];
			  }
			  for(int i=0; i<trip.length; i++)
			  {
				  total = total + trip[i];
			  }
			  System.out.println("total expence:"+total);
		
	}
		private void print_total() {
		// TODO Auto-generated method stub
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter no. of subjects :");
			  int subject = sc.nextInt();
			  
			  int[] marks =new int[subject];
			  int big=0; int small=101;
			  int total=0;
			  
			  for(int i=0; i<marks.length; i++)
			  {
				  System.out.println("enter mark :");
				  marks[i]=sc.nextInt();
				  if(marks[i]>big)
				  {
					  big = marks[i];
				  }
				  if(marks[i]<small)
				  {
					  small=marks[i];
				  }
				  total = total+marks[i];
				  System.out.println(marks[i]);
			  }
		System.out.println("total :" + total);
		System.out.println("Highest mark:" +big);
		System.out.println("Smallest mark:" +small);
	}
		private void print_task1() {
		// TODO Auto-generated method stub
			  char[] name = new char[4];
			  name[0]='h';
			  name[1]='a';
			  name[2]='r';
			  name[3]='i';
			   
			  char name1;
			  
			  int i=0;
			  int j=name.length-1;
			  
			  while(i<=j )
			  {
				  name1= name[i];
				  name[i]=name[j];
				  name[j]=name1;
				  i++;
				  j--;
				 
			  }
			  System.out.println(name);
			  
			  
		
	}
		private void print_task() {
		// TODO Auto-generated method stub
			   char [] name = new char[4];
			   name[0]='h';
			   name[1]='a';
			   name[2]='r';
			   name[3]='i';
			   char name1;
			   
			   name1 = name[0];
			   name[0]=name[3];
			   name[3]=name1;
			   name1=name[1];
			   name[1]=name[2];
			   name[2]=name1;
			   System.out.println(name);
			   
			  
			  
			  
		
	}
		private void print_reverse(char[] name) {
		    // TODO Auto-generated method stub
		    char[] name2 = new char[name.length];
		    
//		    name2[0] = name[3]; 
//		    name2[1] = name[2];
//		    name2[2] = name[1]; 
//		    name2[3] = name[0]; 
		    int i =0, j = name.length - 1; 
		    while(i<name.length)
		    {
		      name2[i] = name[j];
		      i++; 
		      j--; 
		    }
		    System.out.println(name2);
		    
		  }
		  private void lesson2(char[] name) {
		    // TODO Auto-generated method stub
		    for(int i=name.length-1; i>=0; i--)
		    {
		      System.out.println(name[i]);
		    }
		    
		  }
		  

		  private void lesson1() {
		    // TODO Auto-generated method stub
		    char name[] = new char[6]; 
		    name[0] = 'h'; 
		    name[1] = 'a';
		    name[2] = 'r';
		    name[3] = 'i';
		    name[4] = 's';
		    name[5] = 'h'; 
//		    System.out.println(name[0]);
//		    System.out.println(name[1]);
//		    System.out.println(name[2]);
//		    System.out.println(name[3]);
//		    System.out.println(name[4]);
//		    System.out.println(name[5]);
		    int i = 0; 
		    while(i<name.length){
		    System.out.println(name[i]);
		    i++;
		    }
		    char first = name[0]; 
		    int len = name.length;
		    char last = name[len-1];
		    if(first == last)
		    {
		      System.out.println("Same");
		    }
		    else
		    {
		      System.out.println("Not Same");
		    }

		    
		    
		  }

		}



