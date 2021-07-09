class Midle
{
	class Node
	{
		int data;
		Node next;
	}
	Node head;
	public void add(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=head;
		head=temp;
	}
	public void Midddle()
	{
		Node curr=head;
		Node temp=head;
		if(head == null) {
            System.out.println("The haed node is null, no elements in the linked list");
        }
		while(curr !=null && curr.next !=null)
		{
			curr=curr.next.next;
			temp=temp.next;
		}
		System.out.println("Middle Element: "+ temp.data);
	}
	public void Midddle1()
	{
		int count=0;
		Node curr=head;
		while(curr !=null)
		{
			curr=curr.next;
			count++;
		}
		count=count/2;
		while(head !=null)
		{
			head=head.next;
			count--;
			if(count == 0) {
                System.out.println("Middle Element: " + head.data);
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
public class Midle_NOde {

	public static void main(String[] args) {
		Midle m=new Midle();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(430);
		m.add(50);
		m.display();
		m.Midddle();
		m.Midddle1();

	}

}
