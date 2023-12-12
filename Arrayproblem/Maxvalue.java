import java.util.*;
class Maxvalue
{
	public static void main(String [] args)
	{
		int max=Integer.MIN_VALUE,index=0;// it return the value is minimum value 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		// find the maximum value in the array
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				index=i;
			}
		}
		System.out.print("the maximum of the value of the array is "+max+" its index is "+index);
	}
}