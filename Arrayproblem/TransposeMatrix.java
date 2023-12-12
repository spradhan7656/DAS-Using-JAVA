import java.util.Scanner;

class TransposeMatrix
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n2=sc.nextInt();
		int matrix[][]= new int [n][n2];

		for (int i=0;i<n ;i++ ) 
		{
			for (int j=0;j<n2 ;j++ ) 
			{
				matrix[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<n;i++)
		{
			for (int j=0;j<i ;j++ )
			{
				
					int temp=matrix[i][j];
					matrix[i][j]=matrix[j][i];
					matrix[j][i]=temp;	
				
				
			}
		}
		System.out.print("\n");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n2;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}