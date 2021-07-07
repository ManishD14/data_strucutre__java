package com.data_strucutre;

public class Deletion {
	Node head,tail;
	public Deletion()
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
	public void del_first()
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			if(head !=null)
				head=head.next;
			else
				head=tail=null;
		}
	}
	public void del_last()
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			if(head !=tail)
			{
			tail=tail.prev;
			tail.next=null;
			}
			else
			{
				head=tail=null;
			}
		}
	}
	public void Del_Pos(int n)
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			Node curr=head;
			for(int i=0;i<n-1;i++)
				curr=curr.next;
			if(curr==head)
				head=curr.next;
			else if(curr==tail)
				tail=tail.prev;
			else
			{
				curr.prev.next=curr.next;
				curr.next.prev=curr.prev;
			}
		}
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
