import java.util.*;
class ReverseArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		// let's reverse the array
		int k=0,l=arr.length-1;
		while(k<l)
		{
			int temp=arr[k];
			arr[k]=arr[l];
			arr[l]=temp;
			k++;
			l--;
		}

		for(int s:arr)
		{
			System.out.print(s+" ");
		}
	}
}
//the time =O(log n)
// the space =O(log n)