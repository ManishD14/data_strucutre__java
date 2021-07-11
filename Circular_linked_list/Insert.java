package com.data_structure;

public class Insert {
	Node head,tail;
	Insert()
	{
		head=null;
		tail=null;
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
			tail.next=head;
		}
	}
	public void End(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=tail=temp;
			temp.next=head;
		}
		else
		{
			tail.next=temp;
			tail=temp;
			tail.next=head;
		}
	}
	// add node either before or after
	public void addMid(int pos,int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=tail=temp;
			temp.next=head;
		}
		else
		{
			Node curr;
			curr=head;
			for(int i=0;i<pos-1;i++)
				curr=curr.next;
			temp.next=curr.next;
			curr.next=temp;
		}
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
