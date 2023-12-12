class Recursive
{
	public static void main(String []args)
	{
		int n=9;
		int s=fun(n);
		System.out.println(s);
	}
	public static int  fun( int n)
	{
		int i;

		if(n<=1)
		{
			return n;
		}
		else 
		{
			fun(n=1);
			for(i=1;i<=n;i=i+10);
			return i;
		}
	}
}