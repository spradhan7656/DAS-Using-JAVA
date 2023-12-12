import java.util.*;
class Circularlist
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
	Node head=null;
	Node tell=null;
	public void creation()
	{
		int data,n;
		Scanner sc=new Scanner(System.in);
		do 
		{
		System.out.println("Enter the data");
		data=sc.nextInt();
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
			tell=new_node;
			new_node.next=head;
		}
		else 
		{
			new_node.next=head;
			head=new_node;
			tell.next=head;

		}
		System.out.println("Do you want to add more data. if yes press 1 ");
		n=sc.nextInt();
		}while(n==1);
	}
	
	public void traverser()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("LL does not exist");
		}
		else 
		{

			do 
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}while(temp!=head);

		}
	}
	public static void main(String []args)
	{

		Circularlist cl=new Circularlist();
		cl.creation();
		cl.traverser();
	}
}
