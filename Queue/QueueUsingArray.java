import java.util.Scanner;

class QueueUsingArray
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int n=sc.nextInt();
	int a[]=new int[n];
	int f=-1;
	int r=-1;

	

	public void enqueue()
	{
		if(r==(a.length-1))
		{
			System.out.println("The Queue is overFlow");
		}
		else 
		{
			if(r==-1&&f==-1)
			{
				r=0;
				f=0;
				System.out.println("Enter the data");
				a[r]=sc.nextInt();
			}
			else 
			{
				r++;
				System.out.println("Enter the data");
				a[r]=sc.nextInt();
			}
			System.out.println("The data is inserted");
		}

	}

	public void dequeue()
	{
		if(f==-1&&r==-1)
		{
			System.out.println("The Queue is underFlow");
		}
		else 
		{
			if(r==f)
			{
				f=-1;
				r=-1;
			}
			else 
			{
				f++;
				System.out.println("The data is deleted");
			}
		}
	}

	public void display()
	{
		if(f==-1&&r==-1)
		{
			System.out.println("The Queue is underFlow");
		}
		else 
		{
				for (int i=f;i<=r ;i++ ) 
				{
					System.out.print(a[i]+" ");
				}
		}
		System.out.print("\n");
		
	}
	public static void main(String[] args) 
	{
		int n;
		
		Scanner sc=new Scanner(System.in);
		// System.out.println("enter the size of the stack");
		// n=sc.nextInt();
		QueueUsingArray s=new QueueUsingArray();
		int d,i;
		do 
		{
			System.out.println("Press 1 to enqueue");
			System.out.println("Press 2 to dequeue");
			System.out.println("Press 3 to display");
			System.out.println("enter your choice");
			d=sc.nextInt();
			switch(d)
			{
				case 1:
					s.enqueue();
					break;
				case 2:
					s.dequeue();
					break;
				case 3:
					s.display();
					break;	
			}
			System.out.println("Enter 0 To go back to the menu");
			System.out.println("Enter any key to exit");
			i=sc.nextInt();
		}while(i==0);
		System.out.println("exit sucessfully");
	}
	
}