package com.data_structure;

public class Min_Max_Dublicate {
	Node head;
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
	public void Min_Node()
	{
		Node curr=head;
		int min=head.data;
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			while(curr !=null)
			{
			if(min>curr.data)
				min=curr.data;
			curr=curr.next;
			}
			System.out.println("min is "+min);
		}
		
	}
	public void Max_Node()
	{
		Node curr=head;
		int max=head.data;
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			while(curr !=null)
			{
				if(max<curr.data)
					max=curr.data;
				curr=curr.next;
			}
			System.out.println("Max_Node "+max);
		}
	}
	public void Dublicate(int ele)
	{
		Node curr=head;
		int i=0;
		while(curr!=null)
		{
			if(curr.data==ele)
				i++;
			curr=curr.next;
		}
		System.out.println(ele+"repeated "+i);
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
