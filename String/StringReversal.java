package namakkal;

public class StringReversal {
	String s3 ="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReversal sr = new StringReversal();
		//sr.reverse_whole_input();
		
//		String s1 ="today is wednesday";
//		String[] output = s1.split(" ");
//		String s2=" ";
//		for(int i=output.length-1; i>=0; i--)
//		{
//			s2 = s2 + output[i]+" ";
//		}
//		System.out.println(s2);
		
		//String name ="harish";
		
//		StringBuffer sb = new StringBuffer("abcd");
//		sb.reverse();
//		System.out.println(sb);
//		
		
//		String name ="harish";
//		StringBuilder reverse = new StringBuilder();
//		for(int i=name.length()-1; i>=0; i--)
//		{
//			reverse = reverse.append(name.charAt(i));
//			System.out.println(reverse.hashCode());
//		}
//		System.out.println(reverse);

		
		String input ="   hello";
		System.out.println(input.length());
		input = input.stripLeading();
		System.out.println(input.length());
		
		
//		sr.strip_front();
//		sr.strip_last();
		
		

	}

	private void strip_last() {
		// TODO Auto-generated method stub
		String s= "h el lo   ";
		    boolean last_letter = false; //false
		    String output = ""; 
		    for(int i=s.length()-1; i>=0;i--)
		    {
		      if(s.charAt(i)!=' ') {
		      output = output + s.charAt(i); //ol le h
		      last_letter = true;  //true
		      }
		      else if(last_letter==true)
		      {
		        output = output + s.charAt(i);//h 
		      }
		    }
		    System.out.println(s);
		    System.out.println(output);
		
	}

	private void strip_front() {
		// TODO Auto-generated method stub
		
		 String s = "   h el lo";
		    boolean first_letter = false; //false
		    String output = ""; 
		    for(int i=0; i<s.length();i++)
		    {
		      if(s.charAt(i)!=' ') {
		      output = output + s.charAt(i); //h
		      first_letter = true;  //true
		      }
		      else if(first_letter==true)
		      {
		        output = output + s.charAt(i);//h 
		      }
		    }
		    System.out.println(s);
		    System.out.println(output);
		
	}

	private void reverse_whole_input() {
		// TODO Auto-generated method stub
		   String s1 = "Today is Wednesday";
		    
		    String s2 = ""; 
		    
		    //System.out.println("s1 --> " + s1);
		    for(int i=s1.length()-1;i>=0;i--)
		    {
		      if(s1.charAt(i)!= ' ') {
		        s2 = s2 + s1.charAt(i); //YNNAD
		      }
		      else
		      {
		        reverse(s2);//reverse("YNNAD");
		        s2 = ""; 
		        continue; 
		      }
		    }
		    reverse(s2);
		    System.out.println("s2 --> " + s2);
		    
		  }

	private void reverse(String s2) {
		// TODO Auto-generated method stub
		  for(int i=s2.length()-1; i>=0; i--)
		    {
		      s3 = s3 + s2.charAt(i);//BENI DANNY
		    }
		    s3 = s3+" ";
		    System.out.println("s3 --> "+ s3);
		
	}
		
	}

