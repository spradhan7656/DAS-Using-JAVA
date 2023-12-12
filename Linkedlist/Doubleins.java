import java.util.*;
class Doubleins
{
	static class Node
	{
		int data;
		Node next;
		Node prev;

		Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
		Node head=null;
		Node tail=null;

		public  void creation()
		{
			int data,n,ch,p;
			do
			{
				System.out.println("enter the data");
				Scanner sc=new Scanner(System.in);
				data=sc.nextInt();

				Node new_node=new Node(data);

				if(head==null)
				{
					head=new_node;
					tail=new_node;
				}
				else 
				{
					System.out.println("1.begning\n2.end\n3.specific position");
					ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						head.prev=new_node;
						new_node.next=head;
						head=new_node;
						break;
					case 2:
						new_node.prev=tail;
						tail.next=new_node;
						tail=new_node;  
						break;
					case 3:
						System.out.println("Enter the position");
						p=sc.nextInt();
						Node temp1=head;
						Node ptr=temp1.next;
						for(int i=0;i<p-1;i++)
						{
							temp1=ptr;
							ptr=ptr.next;
						}
						ptr.prev=new_node;
						new_node.next=ptr;
						new_node.prev=temp1;
						temp1.next=new_node;
						break;
					}
				}
				System.out.println("enter 1 to continue");
				n=sc.nextInt();
			}while(n==1);
			
		}

		public void traverser()
		{
			Node temp=head;
			if(temp==null)
			{
				System.out.println("LL doesnot exist");
			}
			else 
			{
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.next;
				}
			}
		}
		public static void main(String []args)
		{
			Doubleins dl=new Doubleins();
			dl.creation();
			dl.traverser();

		}
	
}