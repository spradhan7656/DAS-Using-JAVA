import java.util.*;
class Doubledel
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
				tail=new_node;
			}
			else 
			{
				System.out.println("1.insert beiggning\n2.insert end\n3.specific position");
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
						System.out.println("enter the position");
						p=sc.nextInt();
						Node temp=head;
						Node ptr=temp.next;
						for(int i=0;i<p-1;i++)
						{
							temp=ptr;
							ptr=ptr.next;
						}
						ptr.prev=new_node;
						new_node.next=ptr;
						new_node.prev=temp;
						temp.next=new_node;
						break;
				}
				
			}

			System.out.println("press 1 for continue");
			n=sc.nextInt();
			
		}while(n==1);

	}
	public void traverser()
	{
		Node temp1=head;

		if(temp1==null)
		{
			System.out.println("ll does not exist");
		}

		while(temp1!=null)
		{
			System.out.print(temp1.data+" ");
			temp1=temp1.next;
		}
	}
	public void deleted()
	{
		int p1,p,n;
		Scanner sc=new Scanner(System.in);
		

		do
		{
			
			if(head==null)
			{
			System.out.println("ll is empty");
			}
			else 
			{
				System.out.println("1.Deleted beginning\n2.delete at the end\n3:delete at specific position");
				p1=sc.nextInt();

					switch(p1)
					{
						case 1:
							Node temp2=head;
							temp2=temp2.next;
							head=temp2;
							temp2.prev=null;
							
							break;
						case 2:
							Node temp4=head;
							temp4=temp4.prev;
							temp4.next=null;
							tail=temp4;
							break;
						case 3:
							Node temp3= head;
							Node ptr=temp3.next;
							System.out.println("enter the position");
							p=sc.nextInt();
							for(int i=0;i<p-1;i++)
							{
								temp3=ptr;
								ptr=ptr.next;
							}
							temp3.next=ptr.next;
							ptr=ptr.next;
							ptr.prev=temp3;
							break;


					}
			}
			System.out.println("press 1 to continue");
			n=sc.nextInt();
		}while(n==1);
		
		

	}
	public static void main(String []args)
	{
		Doubledel dl=new Doubledel();
		dl.creation();
		dl.deleted();
		dl.traverser();
	}
}