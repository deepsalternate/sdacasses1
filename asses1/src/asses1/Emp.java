package asses1;

class Cons {
	String Name;
	int ID;
	int SAL;
	String ADDRESS;



	public Cons(String name, int iD, int sAL, String aDDRESS) {
		super();
		Name = name;
		ID = iD;
		SAL = sAL;
		ADDRESS = aDDRESS;
	}
	

	@Override
	public String toString() {
		return "cons [Name=" + Name + ", ID=" + ID + ", SAL=" + SAL + ", ADDRESS=" + ADDRESS + "]";
	}
	

//void display (){
//	  System.out.println('name of employee is',Name);
//	  System.out.println('Id of employee is',ID);
//	  System.out.println('Salary of employee is',SAL);
//	  System.out.println('Adress of employee is',Name);
//}

}

public class Emp {

	public static void main(String[] args) {

	
	Cons obj1 = new Cons("apple", 0, 0, "malad");
	}

}
