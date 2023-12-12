import java.util.*;
class Arratrotate
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array");

		int s=sc.nextInt();

		int a[]=new int[s];

		for(int i=0;i<s;i++)
			{
				a[i]=sc.nextInt();
			}

		System.out.println("enter the no of rotate");

		int r=sc.nextInt();

		for(int t=0;t<r;t++)
		{

			int ss=a[0];
			for(int j=0;j<s-1;j++)
			{
				a[j]=a[j+1];
			}
			a[s-1]=ss;
		}
		
		for(int x=0;x<s;x++)
		{
			System.out.print(a[x]+" ");
		}
	}
}
 