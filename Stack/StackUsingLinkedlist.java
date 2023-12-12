 import java.util.*;
class Stack1 
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
	Node Top=null;
	 
	void push(Scanner sc) 
	{
		int data;
		System.out.println("Enter data");
		data=sc.nextInt();
		Node new_node=new Node(data);

		if(Top==null)
		{
			Top=new_node;
			System.out.println("the item is inserted");
		}
		else 
		{
			new_node.next=Top;
			Top =new_node;
			System.out.println("the item is inserted");
		}

	}
	void pop()
	{
		if(Top==null)
		{
			System.out.println("Stack is empty");
		}
		else 
		{
			Top=Top.next;
			System.out.println("The item is deleted")
		}
	}
	void display()
	{
		Node temp=Top;
		if(Top==null)
		{
			System.out.println("stack is empty");
		}
		while(temp!=null)
		{
			System.out.println(" --");
			System.out.println("|"+temp.data+"|");
			temp=temp.next;
		}
		System.out.println(" --");
	}
}
class StackUsingLinkedlist
{
	public static void main(String[]args)
	{
		int n;
		
		Scanner sc=new Scanner(System.in);
		// System.out.println("enter the size of the stack");
		// n=sc.nextInt();
		Stack1 s=new Stack1();
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
					s.push(sc);
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