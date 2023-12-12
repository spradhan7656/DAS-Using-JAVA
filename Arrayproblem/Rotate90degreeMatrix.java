import java.util.Scanner;

class Rotate90degreeMatrix
{
	public static void main(String[] args) 
	{
		System.out.println("enter the same row and same coloum");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 

		int matrix[][]=new int[n][n];

		for (int i=0;i<n ;i++ ) 
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}	
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{ 
				int temp =matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++)
		{
			int k=0,l=n-1;

			while(k<l)
			{
				int temp2=matrix[i][k];
				matrix[i][k]=matrix[i][l];
				matrix[i][l]=temp2;
				l--;
				k++;
			}
		}
		System.out.print("\n");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
}