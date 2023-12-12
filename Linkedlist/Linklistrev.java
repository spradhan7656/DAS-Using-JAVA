import java.util.*;

class Linklistrev
{
	public static void main(String [] args)
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		LinkedList<Integer> l2=new LinkedList<Integer>();

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l2.add(20);
		l2.add(50);
		l2.add(40);

		

		
			System.out.print(sum(l1,l2));
	}
	public static LinkedList sum(LinkedList l1,LinkedList l2)
	{
		int size1=l1.size();
		int size2=l2.size();
		int sum1=0,sum2=0,big;

		for(int i=size1-1;i>=0;i--)
		{
			sum1*=10;
			int r=(Integer)l1.get(i);

			
			sum1+=r;
		}
		for(int j=size2-1;j>=0;j--)
		{
			sum2*=10;
			int s=(Integer)l2.get(j);
			sum2+=s;
		}
		sum1+=sum2;
		
		
		LinkedList<Integer> l3=new LinkedList<Integer>();


		int res;

		while(sum1!=0)
		{
			res=sum1%10;

			l3.add(res);

			sum1/=10;
		}
		return l3;
	}
}