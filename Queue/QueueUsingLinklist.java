import java.util.Scanner;

class QueueUsingLinklist
{

	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}

	}

	Node Front=null;
	Node Rear=null;

	public void enqueue()
	{
		int data;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the data");
		data=sc.nextInt();
		Node new_node=new Node(data);
		if(Front==null)
		{
			Front=new_node;
			Rear=new_node;
		}
		else 
		{
			Rear.next=new_node;
			Rear=new_node;
		}
		System.out.println("data inserted");
	}

	public void dequeue()
	{
		if(Front==null)
		{
			System.out.println("UnderFlow");
		}
		else 
		{
			if(Front==Rear)
			{
				Front=null;
				Rear=null;
			}
			else 
			{
				Front=Front.next;
			}
		}
	}

	public void display()
	{
		Node Temp=Front;
		if(Front==null)
		{
			System.out.println("UnderFlow");
		}
		else 
		{
			while(Temp!=null)
			{
				System.out.print(Temp.data+"->");
				Temp=Temp.next;
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// System.out.println("enter the size of the stack");
		// n=sc.nextInt();
		QueueUsingLinklist s=new QueueUsingLinklist();
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