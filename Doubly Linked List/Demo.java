package com.data_strucutre;

public class Demo {

	public static void main(String[] args) {
		INSERT_OP l=new INSERT_OP();
		l.Start(10);
		Deletion d=new Deletion();
		d.Start(10);
		d.Start(20);
		d.Start(30);
		d.Start(40);
		d.Start(50);
		d.Start(60);
		/*d.del_first();
		d.del_last();*/
		d.Del_Pos(1);
		d.display();

	}

}
