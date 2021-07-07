package com.data_strucutre;

public class INSERT_OP {
	Node head,tail;
	public INSERT_OP()
	{
		head=tail=null;
	}
	public void Start(int data)
	{
		Node temp=new Node(data);
		if(head==null)
			head=tail=temp;
		else
		{
		head.prev=temp;
		temp.next=head;
		head=temp;
		}
	}
	public void End(int data)
	{
		Node temp=new Node(data);
		if(head==null)
			head=tail=temp;
		else
		{
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
	}
	public void after(int i,int data)
	{
		Node aft=head;
		Node temp=new Node(data);
		while(aft.data !=i)
			aft=aft.next;
		temp.next=aft.next;
		aft.prev=temp;
		aft.next=temp;
		temp.prev=aft;
				
		
	}
	public void display()
	{
		Node curr=head;
		while(curr !=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

}
