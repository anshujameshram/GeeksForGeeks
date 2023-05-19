package practice;

public class Spiral_matrix {
	public static void PrintSpiral(int m,int n,int mat[][])
	{
		//m=total no of rows
		//n=total no. of columns
		int i,k=0,l=0;
		//k=0 is set to 1st element of row
		//l=0 is set to 1st element of column
		int last_row=m-1,last_col=n-1;
		while(k<=last_row && l<=last_col)
		{
			//print the first row
			for(i=l;i<=last_col;i++)
			{
				System.out.print(mat[k][i]+" ");				
			}
			k++; //k should go to the next row ,as all elements of 1st row is printed
			for(i=k;i<=last_row;i++)
			{
				//print the last column
				System.out.print(mat[i][last_col]+" ");
			}
			last_col--; //it will point to 3rd column
			
			if(k<=last_row)
			{
				for(i=last_col;i>=l;i--)
				{
					System.out.print(mat[last_row][i]+" ");
				}
				last_row--; //point to 3rd row index
			}
			//print last row
			if(l<=last_col)
			{
				for(i=last_row;i>=k;i--)
				{
					System.out.print(mat[i][l]+" ");
				}
				l++; //to go into the inner matrix i.e 2nd column
			}	
		}
	}
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 },
                	{ 5, 6, 7, 8 },
                	{ 9, 10, 11, 12 },
                	{ 13, 14, 15, 16 } };

  // Function call
		PrintSpiral(4,4,a);
	}

}
