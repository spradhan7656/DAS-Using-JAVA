import java.util.*;
class Linkjava
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
	 		System.out.println("enter the data");
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
	 				System.out.println("enter the position ");
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
	 		System.out.println("Link list not exist");
	 	}
	 	else 
	 	{
	 	while(head!=null)
	 	{
	 		System.out.print(temp.data+" ");
	 		temp=temp.next;
	 	}
	 }
	 }
	 public void delet()
	 {
	 	int data,n,m,p;
	 	Scanner sc=new Scanner(System.in);
	 	do
	 	{
	 		if(head==null)
	 		{
	 			System.out.println("link list is empty");
	 		}
	 		else 
	 		{
	 			System.out.println("!.Delete data beginning\n2.Deleted the data at the end \n3.Deleted the data in the between ");
	 			m=sc.nextInt();
	 		switch(m)
	 		{
	 		case 1:
	 			Node temp=head;
	 			temp=temp.next;
	 			head=temp;
	 			break;
	 		case 2:
	 			Node temp1=head;
	 			Node ptr=temp1.next;
	 			while(ptr.next!=null)
	 			{
	 				temp1=ptr;
	 				ptr=ptr.next;
	 			}
	 			temp1.next=null;
	 			break;
	 		case 3:
	 			System.out.println("enter the position of the node");
				    p=sc.nextInt();
				    Node temp2=head;
				    Node ptr1=temp2.next;
				    for(int i=0;i<p-2;i++)
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
	 public static void main(String [] args)
	{
		Linkjava ll=new Linkjava();

		ll.creation();
		ll.delet();
		ll.traverser();
	}
}