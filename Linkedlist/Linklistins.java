import java.util.*;
public class Linklistins
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
	public void creation()
	{
		int data,n,ch,p;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("Enter the data");
		data=sc.nextInt();
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
		}
		else 
		{
			System.out.println("1.insert data beginning\n2.insert the data at the end\n3.insert the data in the between");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				new_node.next=head;
				head=new_node;
				break;
			case 2:
				Node temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=new_node;
				break;
			case 3:
				System.out.println("enter the position of the node");
				p=sc.nextInt();
				Node temp1=head;
				for(int i=0;i<p-1;i++)
				{
					temp1=temp1.next;
				}
				new_node.next=temp1.next;
				temp1.next=new_node;
				break;
			}
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

			while(temp!=null)
			{
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	public static void main(String [] args)
	{
		Linklistins ll=new Linklistins();

		ll.creation();
		ll.traverser();
	}
}