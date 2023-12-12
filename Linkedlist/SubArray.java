class SubArray
{
	public static void main(String []args)
	{
		int a[]={123,5321,6342};
		int b[]={123,5321,6342};
		int c[]={123,5321,6342};
		int d[]={123,5321,6342};
		int e[]={123,5321,6342};
		int A[]=new int [5];
		A[0]=a[];
		A[1]=b[];
		A[2]=c[];
		A[3]=d[];
		A[4]=e[];
		for(int i=0;i<5;i++)
		{
			System.out.println(A[i]+" ");
		}
	}
}