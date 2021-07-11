package com.data_structure;

public class Delete {
	Node head,tail;
	int count;
	Delete()
	{
		head=tail=null;
		count=0;
	}
	public void Start(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=tail=temp;
			temp.next=head;
		}
		else
		{
			Node curr=head;
			temp.next=curr;
			head=temp;
			tail.next=temp;
			
			
		}
	}
	public void delFirst()
	{
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			if(head!=tail)
			{
			  head=head.next;
			  tail.next=head;
			 }
		    else
			   head=tail=null;
		}
	}
	public void delLast()
	{
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			if(head!=tail)
			{
			  Node curr=head;
			  while(curr.next!=tail)
				  curr=curr.next;
			  tail=curr;
			  tail.next=head;
			}
		
 			else
				   head=tail=null;
		}
    }
	public Node delPos(int pos)
	{
		Node curr=head;
		Node temp=head;
		int c=0;

		if(head==null)
			System.out.println("List is Empty");
		do
		{
			curr=curr.next;
			count++;
		}while(curr !=head);
		
		if(pos>=count || pos<0)
		{
			System.out.printf("\nIndex is not Found\n"); 
	        return null; 
		}
		while(pos>0)
		{
			if(pos==count)
			{
				curr.next=temp.next;
				return head;
			}
			curr=curr.next;
			temp=curr.next;
			count--;
			c++;
		}
		return head;
	}
	public void display()
	{
		Node curr=head;
		do
		{
			System.out.println(curr.data);
			curr=curr.next;
		}while(curr !=head);
		
	}
 
}
