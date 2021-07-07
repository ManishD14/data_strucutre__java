package com.data_structure;

public class Deletetion {
	Node head;
	public Deletetion()
	{
		head=null;
	}
	public void Start(int data)
	{
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
		
	}
	public Node del_element(int data)// imp remember Node method
	{
		Node temp=null;
		Node curr=head;
		if(curr.data == data)
			del_first();
		else
		{
			while(curr.data != data)
			{
				temp=curr;
				curr=curr.next;
			}
			temp.next=curr.next;
		}
		return curr;
	}
	public void del_pos(int p)
	{
		if(p==0)
			head=head.next;
		else
		{
			Node curr=head;
			Node temp=null;
			for(int i=0;i<p;i++)
			{
				curr=curr.next;
			}
			temp=curr.next;
			curr.next=temp.next;
		}
	}
	public void del_first()
	{
		Node temp=head;
		if(head==null)
			System.out.println("List is Empty");
		else
			head=head.next;
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
