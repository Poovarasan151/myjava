package namakkal;

public class Two_D_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_D_Matrix td = new Two_D_Matrix();
		//td_matrix_addition();
		//td_matrix_example();
		//td_matrix_spiral();
        td_matrix_test();

	}

	private static void td_matrix_test() {
		// TODO Auto-generated method stub
		int[][] a =new int[4][4];
		int min_row=0, max_row=3;
		int min_col=0, max_col=3;
	
		
		
		int no=1;
		
		while(no<=16)
		{
		
		for(int col=min_col; col<=max_col; col++)
		{
			a[min_row][col]=no;
			no++;
			//System.out.print(a[min_row][col]);	
		}
		min_row++;
		
		for(int row=min_row; row<=max_row; row++)
		{
			a[row][max_col]=no;
			no++;
			//System.out.println(a[row][max_col]);
			
		}
		max_col--;
		
		for(int col=max_col; col>=min_col; col--)
		{
			a[max_row][col]=no;
			no++;
		}
		max_row--;
		
		for(int row=max_row; row>=min_row; row--)
		{
			a[row][min_col]=no;
			no++;
		}
		min_col++;
		}
		
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		
	}

	private static void td_matrix_spiral() {
		// TODO Auto-generated method stub
		int[][] c = new int[4][4];
		  int minRow =0, maxRow = 3; 
		  int minCol = 0, maxCol = 3; 
		  
		  
		  
		  int no = 1; 
		  
		while(no<=16)  
		{
		  for(int col = minCol; col<=maxCol; col++)
		    {c[minRow][col] = no; no++;}  
		  minRow++;//minRow = 1  maxRow = 3

		  for(int row=minRow;row<=maxRow;row++)
		    {c[row][maxCol] = no; no++;}
		  maxCol--;  //minCol = 0, maxCol = 2

		  for(int col=maxCol; col>=minCol;col--)
		    {c[maxRow][col] = no; no++;}
		  maxRow--; // minRow = 1 maxRow = 2
		  
		  for(int row = maxRow; row>=minRow;row--)
		    {c[row][minCol] = no; no++;}
		  minCol++;

		}
		  
		  for(int i=0; i<4; i++)
		  {
		    for(int j=0; j<4; j++)
		    {
		      System.out.print(c[i][j]+"   ");
		    }
		    System.out.println();
		  }
		
	}

	private static void td_matrix_example() {
		// TODO Auto-generated method stub
		
		int[][] c = new int[4][4];
		  int minRow =0, maxRow = 3; 
		  int minCol = 0, maxCol = 3; 
		  
		  
		  int no = 1; 
		  
		  while(no<=16)
		  {
		  
		  for(int col = minCol; col<=maxCol; col++)
		    {
			  c[minRow][col] = no; 
			  no++;
			  System.out.print( c[minRow][col]);
		    }
		    
		  minRow++;//minRow = 1  maxRow = 3
		  
		//  c[minRow][1] = no; no++;
		//  c[minRow][2] = no; no++;
		//  c[minRow][3] = no; no++;
		//  
		  for(int row=minRow;row<=maxRow;row++)
		    {
			  c[row][maxCol] = no;
			  no++;
			  System.out.print(c[row][maxCol]);
			  }
		  maxCol--;  //minCol = 0, maxCol = 2
		//  c[2][3] = no; no++;
		//  c[3][3] = no; no++;
		  for(int col=maxCol; col>=minCol;col--)
		    {
			  c[maxRow][col] = no;
			  no++;
			  System.out.print( c[maxRow][col]);
			  }
		  maxRow--; // minRow = 1 maxRow = 2
		//  c[3][1] = no; no++;
		//  c[3][0] = no; no++;
		  
		  for(int row = maxRow; row>=minRow;row--)
		    {
			  c[row][minCol] = no; 
			  no++;
			 System.out.print(c[row][minCol]);
			  }
		  minCol++;
		  }
		//  c[1][minCol] = no; no++;
		  
//		  for(int i=0; i<4; i++)
//		  {
//		    for(int j=0; j<4; j++)
//		    {
//		      System.out.print(c[i][j]+"  ");
//		    }
//		    System.out.println();
//		  }
		
	}

	private static void td_matrix_addition() {
		// TODO Auto-generated method stub
		
		int[][] a = { {10,20,30},
					  {40,50,60},
					  {70,80,90}
					};
		
		int[][] b ={ {70,80,90},
		 			 {40,50,60},
		 			 {10,20,10}
		           };
		System.out.println(a.length);
		
		int[] []c = new int[3][3];
		for(int row =0; row<c.length; row++)
		{
		
		for(int col=0; col<a[0].length; col++)
		{
			c[row][col] =a[row][col] + b[row][col];
			System.out.print(c[row][col]+" ");
		}
		System.out.println();
		
	}

}
}
