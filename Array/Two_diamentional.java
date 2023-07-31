package namakkal;

public class Two_diamentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_diamentional td = new Two_diamentional();
		//td.two_d();
		//td.example();
		td.example2();

	}

	private void example2() {
		// TODO Auto-generated method stub
		int[][] a = { {20,40,23},
				{45,65,78},
				{68,62,92}
		};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j =0; j<a[i].length; j++)
			{
				if(i==j)
				{
					System.out.println(a[i][j]);
				}
			}
					
		}
		
	}

	private void example() {
		// TODO Auto-generated method stub
		int[][] a = {  {10, 20, 30},
		            {40, 50, 60},
		            {70, 80, 90}
		        };
		  for(int row = 0; row<a.length;row++)
		  {
		    for(int col=a[row].length-1; col>=0;col--)
		    {
		      //if(row + col ==2)
		      System.out.print(a[row][col]+" ");
		    }
		    System.out.println();
		  }
		
	}

	private void two_d() {
		// TODO Auto-generated method stub
		
		
		/*int[][] values = 
		      {
		          {5,10,15,20},
		          {10,20,30,40,50},
		          {20,40,60,70,80,90}
		      };
		    System.out.println(values.length);
		    System.out.println(values[0].length);
		    System.out.println(values[1].length);
		    System.out.println(values[2].length); */

		
		
		
		
//		int[] quarterly = {50,56, 60, 35, 42};
//	    int[] half = {60,36, 50, 85, 92};
//	    int[] annual = {51,58, 68, 45, 62};
//	    int[][] marks = {quarterly, half, annual};
//	    System.out.println(marks.length);
//	    for(int exam = 0; exam<marks.length; exam++)
//	    {
//	    for(int sub =0;sub<marks[exam].length;sub++)
//	      System.out.print(marks[exam][sub]+" ");
//	    System.out.println();
//		
		
		
		
		int[][] marks = {
	            {50,56, 60, 35, 42}, 
	            {60,36, 50},
	            {51,58, 68, 45}
	            };
	    System.out.println(marks.length);
	    for(int exam = 0; exam<marks.length; exam++)
	    {
	    	//int total =0;
	    for(int sub =0;sub<marks[exam].length;sub++)
	      System.out.print(marks[exam][sub]+" ");
	    System.out.println();
//	    exam++;
	    }
	}

}
