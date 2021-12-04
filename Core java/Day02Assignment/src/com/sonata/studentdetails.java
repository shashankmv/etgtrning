package com.sonata;

public class studentdetails {
	
		int Stdid;
		String stdname;
		char stdclass;
		
		
		public void display() {
			System.out.println("Student Id :"+Stdid);
			System.out.println("Student Name:"+stdname);
			System.out.println("Student class:"+stdclass);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentdetails u1 = new studentdetails();
		studentdetails u2 = new studentdetails();
		
		u1.Stdid=789;
		u1.stdname="Sanjeev";
		u1.stdclass='A';
		
		u2.Stdid=643;
		u2.stdname="shashank";
		u2.stdclass='C';
		
		u1.display();
		u2.display();
	}

}
