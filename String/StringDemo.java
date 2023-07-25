package namakkal;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo sd = new StringDemo();
		sd.first();
		//sd.check_starting("balaji","ba");
		//sd.check_ending("kalai","lai");
		//sd.give_space("MonTuesWednesThursFri");
		//sd.first_letter_caps("harish thangavel");
		//sd.odd_letter_caps("bharani");
		

	}

	private void odd_letter_caps(String s1) {
		// TODO Auto-generated method stub
		for(int i=0; i<s1.length(); i++)
		{
			if(i%2==0)
			{
				System.out.println((char) (s1.charAt(i)-32));
			}
			else
			{
			System.out.println(s1.charAt(i));
			}
		
		}
		
		
	}

	private void first_letter_caps(String s1) {
		// TODO Auto-generated method stub
		for(int i=0; i<s1.length();i++)
		{
			if(i==0 ||  s1.charAt(i-1)==' ') 
			{
				System.out.print((char) (s1.charAt(i)-32));
			}
			else
			{
				System.out.print(s1.charAt(i));
			}
		
		}
	}
	
	
	private void give_space(String s1) {
		// TODO Auto-generated method stub
		for(int i=0; i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' && (s1.charAt(i)<='Z'))
			{
				//System.out.print();
				if(i!=0)
				System.out.print("day "+s1.charAt(i));
				else
					System.out.print(s1.charAt(i)); //Monday T
			}
			else
			{
				System.out.print(s1.charAt(i));
			}
		}
		
		
	}

	private void check_ending(String s1, String s2) {
		// TODO Auto-generated method stub
		int len1 = s1.length();
		int len2 = s2.length();
		int count = 0; 
	for(int i=1; i<=s2.length();i++) 
	{
		if(s2.charAt(len2-i) == s1.charAt(len1-i))
		{
			count++; 
			continue; 
		}
		else
		{
			System.out.println("Not ends with");
			break;
		}
	}
	if(count == s2.length())
	{
		System.out.println("Yes, ends with ");
	}
		
	}

	private void check_starting(String s1, String s2) {
		// TODO Auto-generated method stub
		int count = 0; 
		for(int i=0; i<s2.length();i++)
		{
			if(s2.charAt(i) == s1.charAt(i))
			{
				count++; 
				continue; 
			}
			else
			{
				System.out.println("No, not starts with");
				break;
			}
		}
		if(count == s2.length())
		System.out.println("yes, starts with ");
		
	}
		
	

	private void first() {
		// TODO Auto-generated method stub
		String name = "balaji";
		System.out.println(name.length()); 
		char ch = name.charAt(0);
		System.out.println(ch);
		ch = name.charAt(1);
		System.out.println(ch);
		ch = name.charAt(2);
		System.out.println(ch);
		
		System.out.println(name.contains("ki"));
		
		System.out.println(name.endsWith("ji")); 
		
		System.out.println(name.startsWith("bala")); 
		
		
	}

}
