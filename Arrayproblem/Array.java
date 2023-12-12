 import java.util.*;

  class Array 
  {
  	public static void main(String [] args)
  	{
  		int r;

  		System.out.println("Enter the size of array to store data");

  		Scanner sc=new Scanner(System.in);
  		int n=sc.nextInt();

  		int a[]=new int[n];

  		Operation op=new Operation();
  		//System(cls);


 		do
 		{
 			System.out.println("\n Choose the operation");
 			System.out.println("\n1.Insertion\t2.Searching\n3.deletion\t4.Display\n5.Sorting\t6.exit");
 			r=sc.nextInt();
 			switch(r)
 			{
 			case 1:
 				  a=op.insertion(a);
 				break;
 			case 2:
 					op.serching(a);
 				break;
 			case 3:
 				a=op.delete(a);
 				break;
 			case 4:
 				op.display(a);
 				break;
 			case 5:
 				Sorting sort=new Sorting();
 				a=sort.sorts(a);
 			}
 		}while(r!=6);


  	}
  }
  class Operation
  {
  	 public int[] insertion(int arr[])
  	 {
  	 	int s;
  	 	int v;
  	 	Scanner ss=new Scanner(System.in);
  	 	System.out.println("Enter the index and value");
  	 	s=ss.nextInt();
  	 	v=ss.nextInt();

  	 	arr[s]=v;

  	 	return arr;
  	 } 

  	 public void display(int arr[])
  	 {
  	 	for(int i=0;i<arr.length;i++)
  	 	{
  	 		System.out.print(arr[i]+" ");
  	 	}
  	 }
  	 public void serching(int arr[])
  	 {
  	 	int c=0;
  	 	System.out.println("Enter the value");
  	 	Scanner sc=new Scanner(System.in);
  	 	Sorting srt=new Sorting();
  	 	Binary bn=new Binary();

  	 	int v=sc.nextInt();
  	 	System.out.println("1.liner Searching\n2.binary Searching");
  	 	int q=sc.nextInt();
  	 	if(q==1)
  	 	{
  	 	for(int i=0;i<arr.length;i++)
  	 	{
  	 		if(arr[i]==v)
  	 		{
  	 			System.out.println("find the value index is"+i);
  	 			c++;
  	 			break;
  	 		}

  	 	}
  	 	if(c==0)
  	 	{
  	 		System.out.println("not found");
  	 	}
  	 	}
  	 	if(q==2)
  	 	{
  	 		 
  	 		int []sor=srt.sorts(arr);
  	 		int res=bn.bin(sor,v);
  	 		if(res==-1)
  	 		{
  	 			System.out.println("the value is not found");
  	 		}
  	 		else 
  	 		{
  	 			System.out.println("found the value the index is "+res);
  	 		}

  	 	}

  	 }
  	 public int[] delete(int arr[])
  	 {
  	 	Scanner sc=new Scanner(System.in);
  	 	System.out.println("1.enter the index and value is deletd");
  	 	System.out.println("2.enter the value is deletd");

  	 	int k=sc.nextInt();

  	 	if(k==1)
  	 	{
  	 		System.out.println("enter the index ");
  	 		int t=sc.nextInt();

  	 		if(t!=arr.length-1){
  	 		for(int i=t;i<arr.length-1;i++)
  	 		{
  	 			arr[i]=arr[i+1];
  	 		}
  	 		}
  	 		if(t==arr.length-1)
  	 		{
  	 			arr[t]=0;
  	 		}
  	 		int z=arr.length;
  	 		arr[z-1]=0;


  	 		return arr;	
  	 	}
  	 	else 
  	 	{
  	 		System.out.println("enter the value");
  	 		int v=sc.nextInt();
  	 		for(int i=0;i<arr.length;i++)
  	 	    {
  	 		if(arr[i]==v&&arr[i]!=arr.length-1)
  	 		{
  	 			for(int j=i;j<arr.length-1;j++)
  	 			{
  	 				arr[j]=arr[j+1];
  	 			}
  	 			break;
  	 		}
  	 		if(arr[i]==arr.length-1)
  	 		{
  	 			arr[i]=0;
  	 		}
  	 		int z=arr.length;
  	 		arr[z-1]=0;

  	 	    }
  	 	    return arr;

  	 	}
  	 }
  }
  class Binary
  {
  	public int bin (int []C ,int v)
  	{
  		int low=0;
  		int high=C.length-1;
  		while(low<=high)
  		{
  			int mid=low+(high-low)/2;

  			if(C[mid]==v)
  			{
  				return mid;
  			}
  			if(C[mid]<v)
  			{
  				low=mid+1;
  			}
  			else 
  			{
  				high =mid-1;
  			}
  		}
  		return -1;
  	}
  }
  class Sorting
  {
  	public int[] sorts(int B[])
  	{
  		int t;
  	 		System.out.println("the array are sorting ");
  	 		for(int i=0;i<B.length-1;i++)
  	 		{
  	 			for(int j=0;j<B.length-i-1;j++)
  	 			{
  	 				if(B[j]>B[j+1])
  	 				{
  	 					t=B[j+1];
  	 					B[j+1]=B[j];
  	 					B[j]=t;
  	 				}
  	 			}
  	 		}
  	 		System.out.println("sorting is complete");
  	 		return B;
  	}
  }