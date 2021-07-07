package com.data_structure;

public class Demo {

	public static void main(String[] args) {
		Insertion_operation l=new Insertion_operation();
		Deletetion d=new Deletetion();
		Min_Max_Dublicate m=new Min_Max_Dublicate();
		Reverse_list r=new Reverse_list();
		r.End(10);
		r.End(20);
		r.End(34);
		r.End(45);
		r.End(56);
		r.End(59);
		m.Dublicate(45);
		r.display();
		System.out.println("\n reverse list");
		r.Reverse_print(r.head);
		
		
	
		
	}

}
