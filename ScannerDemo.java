package org.learning;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter no. 1");
		int no1 = sc.nextInt();
		System.out.println("Enter no. 2");
		int no2= sc.nextInt();
		System.out.println("result is ");
		System.out.println(no1*no2);*/
		
		
		/*System.out.println("Tell me your name");  // single name
		String name = sc.next();
		System.out.println("welcome to IT world:"+name);*/

		/*System.out.println("Tell me your name");
		String name = sc.nextLine();
		System.out.println("welcome to IT world:"+name); */  //double name

		System.out.println("Tell me any number");
		int no = sc.nextInt();
		while(no>=1)
		{
			System.out.println(no);
			no--; 
		}
	}
}

	


