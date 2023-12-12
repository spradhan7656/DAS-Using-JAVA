import java.util.Scanner;
class Arraysum2 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size:-");
		int s=sc.nextInt();
		System.out.print("enter the data");
		int arr[]=new int[s];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the target");
		int t=sc.nextInt();
		for(int i=0;i<arr.length-1;i++)
		{
			for (int j=i+1;j<arr.length;j++ )
			 {
				if((arr[i]+arr[j])==t)
				{
					System.out.println(i+" "+j);
				}
			}
		}
	}
}