package p.loop;

public class Array_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Array_example al  = new Array_example(); 
		    //al.lesson1(); 
//		    char[] name = {'h','a','r','i','s','h'};
//		    al.lesson2(name);
		    char[] name = {'a','b','c','d'};
		    //al.print_reverse(name);
		    al.print_task();
		    
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


