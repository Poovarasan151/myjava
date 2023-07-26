package namakkal;

public class StringReversal {
	String s3 ="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReversal sr = new StringReversal();
		//sr.reverse_whole_input();
		
		String s1 ="today is wednesday";
		String[] output = s1.split(" ");
		String s2=" ";
		for(int i=output.length-1; i>=0; i--)
		{
			s2 = s2 + output[i]+" ";
		}
		System.out.println(s2);
		
		

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

