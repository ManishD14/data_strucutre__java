package com.data_structure;

public class Insertion_operation {
	 Node head;
	public Insertion_operation()
	{
		head=null;
	}
	public void Start(int data)
	{
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
		
	}
	public void End(int data)
	{
		Node temp=new Node(data);
		if(head==null)
			head=temp;
		else
		{
			Node curr=head;
			while (curr.next!=null)
				curr=curr.next;
			curr.next=temp;
		}
	}
	public void At(int i,int data)
	{
		Node temp=new Node(data);
		if(i==0)
			Start(data);
		else
		{
			Node curr=head;
			for(int j=0;j<i;j++)
				curr=curr.next;
			temp.next=curr.next;
			curr.next=temp;
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
