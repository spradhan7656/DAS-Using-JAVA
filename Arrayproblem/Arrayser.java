import java.util.Scanner;
class Arrayser
{
	
  public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=2;
        int si=sc.nextInt();

        int A[]=new int[si];
        int B[]=new int[si];

        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<B.length;i++)
        {
            B[i]=sc.nextInt();
        }
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=0;j<i-A.length-1;j++)
            {
                if((A[j]>A[j+1])||(B[j]>B[j+1]))
                {
                    int t,t1;
                    t=A[j];
                    t1=B[j];
                    A[j]=A[j+1];B[j]=A[j+1]; 
                    A[j+1]=t;B[j+1]=t1;               }
            }
        }
        System.out.println("\n");
       for(int a:A)
       {
       	System.out.print(a+" " );
       }
       System.out.println("\n");
       for(int b: B)
       {
       	System.out.print(b+" ");
       }
    }
}

