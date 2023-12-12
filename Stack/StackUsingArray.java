 import java.util.*;
class Stack 
{
	Scanner sc=new Scanner(System.in);
	int n=10;
	int top=-1;
  
	
	// Stack(int n)
	// {
	// 	this.n=n;	
	// }
	int[]a=new int[n];
	void push() 
	{
		System.out.println(top);
		if(top==(n-1))
		{
			System.out.println("overflow"); 
		}
		else 
		{
			System.out.println("enter the data");
			int i=sc.nextInt();
			top=top+1;
			a[top]=i;
			System.out.println("item inserted");
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("UnderFlow");
		}
		else 
		{
			top=top-1;
			System.out.println("item deleted");
		}
	}
	void display()
	{
		for(int j=top;j>=0;j--)
		{
			System.out.println(" --");
			System.out.println("|"+a[j]+"|");
		}
		System.out.println(" --");
	}
}
class StackUsingArray
{
	public static void main(String[]args)
	{
		int n;
		
		Scanner sc=new Scanner(System.in);
		// System.out.println("enter the size of the stack");
		// n=sc.nextInt();
		Stack s=new Stack();
		int d,i;
		do 
		{
			System.out.println("Press 1 to push");
			System.out.println("Press 2 to pop");
			System.out.println("Press 3 to display");
			System.out.println("enter your choice");
			d=sc.nextInt();
			switch(d)
			{
				case 1:
					s.push();
					break;
				case 2:
					s.pop();
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