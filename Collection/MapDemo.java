package input.output;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap hm = new LinkedHashMap();
		hm.put("virat", 45);
		hm.put("dhoni", 55);
		hm.put("rohit", 85);
		hm.put("dhawan", 50);
		hm.put("kapil", 100);
		hm.put("rohit", 91);
		hm.put("rohit", 91);
		hm.put("raina", 91);
		
		
		System.out.println(hm);
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
//		System.out.println(hm.entrySet());
		
//	     Set s=hm.entrySet();
//	     int no=0;
//	     for(Object ob :s)
//	     {
//	    	
//	    	Entry entry =(Entry)ob;
//	    	//System.out.println(entry.getKey()+":"+entry.getValue());
//	    	int score=(Integer)entry.getValue();
//	    	no=no+score;
//	    	
//	    	if(score==100)
//	    	{
//	    		System.out.println(entry.getKey());
//	    	}
//	    	
//	    	 
//	    	 //System.out.println(ob);
//	     }
//	     System.out.println(no);  
		
		
		
		
		Set s=hm.entrySet();
	     int score=0;
	     String name="";
	     int big=0;
	     for(Object ob :s)
	     {
	    	 Entry entry =(Entry)ob;
	    	 
	    	 score=(Integer)entry.getValue();
	    	 
	    	 if(score>big)
	    	 {
	    		 big=score;
	    		 name=(String)entry.getKey();	    	 }
	     }
	     System.out.println(name+" Highest score"+big);
		System.out.println(hm.get("kapil"));
		System.out.println(hm.containsKey("kapil"));
		System.out.println(hm.containsValue(100));
		
		
		
		
	}

}
