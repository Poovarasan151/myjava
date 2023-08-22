package input.output;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles m1 =new Mobiles("sony",20);
		Mobiles m2 =new Mobiles("samsung",25);
		Mobiles m3 =new Mobiles("apple",28);
		Mobiles m4 =new Mobiles("vivo",12);
		
		
		ArrayList<Mobiles> mobileList = new ArrayList<Mobiles>();
		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);
		
		System.out.println(mobileList);
		
		Collections.sort(mobileList);
		
		System.out.println(mobileList);
		
		

	}

}
