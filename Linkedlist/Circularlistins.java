import java.util.*;
class Circularlistins
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
			tell=new_node;
			new_node.next=head;
		}
		else 
		{
			Node temp=head;
			System.out.println("1.insert data beginning \n2.insert the end \n3.insert the data between");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				new_node.next=head;
				head=new_node;
				tell.next=head;
				break;
			case 2:
				new_node.next=head;
				tell.next=new_node;
				tell=new_node;
				break;
			case 3:

				System.out.println("enter the position");
				p=sc.nextInt();
				for(int i=0;i<p-1;i++)
				{
					temp=temp.next;
				}
				new_node.next=temp.next;
				temp.next=new_node;
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

			do 
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}while(temp!=head);

		}
	}
	public void deleted()
	{
		int data,n,m,p;
	 	Scanner sc=new Scanner(System.in);
	 	do
	 	{
	 		if(head==null)
	 		{
	 			System.out.println("link list is empty");
	 			break;
	 		}
	 		else 
	 		{
	 			System.out.println("1.Delete data beginning\n2.Deleted the data at the end \n3.Deleted the data in the between ");
	 			m=sc.nextInt();
	 		switch(m)
	 		{
	 		case 1:
	 			Node temp=head;
	 			temp=temp.next;
	 			head=temp;
	 			tell.next=head;
	 			break;
	 		case 2:
	 			Node temp1=head;
	 			Node ptr=temp1.next;
	 			while(ptr.next!=head)
	 			{
	 				temp1=ptr;
	 				ptr=ptr.next;
	 			}
	 			// while(temp1.next!=tell)
	 			// {
	 			// 	temp1=temp1.next;
	 			// }
	 			temp1.next=head;
	 			tell=temp1;
	 			break;
	 		case 3:
	 			System.out.println("enter the position of the node");
				    p=sc.nextInt();
				    Node temp2=head;
				    Node ptr1=temp2.next;
				    for(int i=1;i<p-1;i++)
				    {
				    		temp2=ptr1;
				    		ptr1=ptr1.next;
				    }
				    temp2.next=ptr1.next;
				break;
	 		}
	 	}
	 	System.out.println("Do you want to add more data. if yes press 1 ");
		n=sc.nextInt();
	    }while(n==1);
	}
	public static void main(String []args)
	{

		Circularlistins cl=new Circularlistins();
		cl.creation();
		cl.deleted();
		cl.traverser();
	}
}