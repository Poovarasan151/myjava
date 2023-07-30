package namakkal;

public class StringContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringContain sc = new StringContain();
//		sc.contain();
//		sc.non_repeated();
		sc.contains();
		//sc.example();
	}

	private void example() {
		// TODO Auto-generated method stub
		String[] st = {"resume.doc", "kavala.mp3", "dd_returns.mp4", "abcd.txt"};
		  //System.out.println(st[0]);
		  //System.out.println(st[1]);
		  
		    for(int i=0; i<st.length;i++)
		    {
		      //if(st[i].endsWith(".mp4"))
		      //if(st[i].contains(".mp4"))  
		      String s = st[i];
		      int len = s.length()-1;
		      for(int j=2; j>=0; j--)
		      {
		      System.out.print(s.charAt(len-j)); 
		      }
		      System.out.println();
		    }
		
	}

	private void contains() {
		// TODO Auto-generated method stub
		String s1 = "kashmir delhi chennai";
		  String s2 = "delhi";
		  int count = 0; 
		  for(int i=0;i<s1.length(); i++)
		  {
		    if(s2.charAt(0) == s1.charAt(i))
		    {
		      
		      for(int j=0; j<s2.length();j++)
		      {
		        if(s2.charAt(j) == s1.charAt(i))
		        {
		          i++; count++; 
		        }
		        if(count == s2.length())
		        {
		          System.out.println("yes, it contains");
		          break;
		        }
		      }
		    }
		  }  
		  if(count<s2.length())
		  {
		    System.out.println("Does not contain");
		  }
		
	}

	private void non_repeated() {
		// TODO Auto-generated method stub
		
		String s = "balaji";
	    char ch = s.charAt(0);
	    boolean match_found = false; 
	    for(int i=1; i<s.length();i++)
	    {
	      if(ch == s.charAt(i))
	      {
	        System.out.println("First Repeated Character is "+ ch);
	        match_found = true; 
	        break; 
	      }
	    }
	    if(match_found == false)
	    {
	      ch = s.charAt(1);
	      for(int i=2; i<s.length();i++)
	      {
	        if(ch == s.charAt(i))
	        {
	          System.out.println("First Repeated Character is "+ ch);
	          match_found = true; 
	          break; 
	        }
	      }
	      
	      
	    }
		
	}

	private void contain() {
		// TODO Auto-generated method stub
		  String s1 = "abcd";
		    String s2 = "ac"; 
		    int i = 0;
		    for(int j = 0; j<s1.length(); j++)  //j = 1
		    {
		    if(s2.charAt(i) == s1.charAt(j))    //b == b
		        {
		      if(i == j)
		      {
		        i++; 
		      }
		     
		        if(i==s2.length())
		        {
		          break;
		        }
		        }
		    }
		    if(i==s2.length())
		        {
		        System.out.println("yes contains"); 
		        } 
		    else
		    {
		    System.out.println("No, does not contain"); 
		    }
		
	}

}
