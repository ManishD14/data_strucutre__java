package com.data_structure;

public class Reverse_list {
	Node head;
	public Reverse_list()
	{
		head=null;
	}
	public void End(int data)
	{
		Node temp=new Node(data);
		if(head==null)
			head=temp;
		else
		{
			Node curr=head;
			while(curr.next != null)
				curr=curr.next;
			curr.next=temp;
		}
	}
	public void Reverse_print(Node curr)
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			if(curr.next==null)
			{
				System.out.println(curr.data);
				return ;
		    }
			Reverse_print(curr.next);
			System.out.println(curr.data);
		}
	}
	public void display()
	{
		Node curr=head;
		while(curr !=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}

}
