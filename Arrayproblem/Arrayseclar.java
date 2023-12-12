import java.util.*;

class Arrayseclar
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int []arr=new int[s];
		System.out.println("enter the input");
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int r=max(s,arr);
		System.out.println(r);

	}
	public static int max (int n,int[] a)
	{
		
		int max=a[n-1];
		int max2=0;
		for(int i=max;i>=0;i--)
		{
			if(max>a[i])
			{
				max2=a[i];
				break;
			}
		}
		if(max2==0)
		{
			return -1;
		}
		else 
		{
			return max2;
		}
	}
}