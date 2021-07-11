package com.data_structure;

public class Demo {
	public static void main(String args[]) {
		//*Insert l=new Insert();
		/*Delete l=new Delete();
		l.Start(10);
		l.Start(20);
		l.Start(25);
		l.Start(30);
		l.Start(40);
		l.display();
		System.out.println("After adding at 3 pos");
		l.delFirst();
		l.delLast();
		l.delPos(2);
		l.display();*/
		/*l.End(55);
		l.End(45);
		l.End(35);
		l.display();
		System.out.println("After adding at 3 pos");
		l.addMid(3, 45);
        l.display();*/
		Split_half l=new Split_half();
		l.Start(10);
		l.Start(20);
		l.Start(23);
		l.Start(30);
		l.Start(40);
		l.Start(15);
		l.Start(25);
		l.Start(25);
		l.Start(35);
		l.Start(45);
		l.display();
		l.split();
		
		
	}

}
