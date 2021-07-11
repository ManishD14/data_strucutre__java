package com.data_structure;

public class Split_half {

	Node head,tail;
	static Node list1,list2;
	Split_half()
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
	public void split()
	{
		Node l1=head;
		Node l2=head;
		for(int i=0;l2.next!=head && l2.next.next !=head;i++)
		{
			l2=l2.next.next;
			l1=l1.next;
		}
		 if (l2.next.next == head) { 
	            l2 = l2.next; 
	        } 
	        list1 = head; 
	        
	        if (head.next != head) { 
	            list2 = l1.next; 
	        }
	        l2.next = l1.next; 
	        l1.next = head; 
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
