package asses1;

class A {
	int id;
	static int rollno;
	String name;

	void meth1(int id) {
		System.out.println("non staic");
		System.out.println(id);
	}

	static void meth2( int rollno){
		  System.out.println("non-static");
		  System.out.println(rollno);
	  }
	  
  }

public class main2 {
		public static void main(String[] args) {
		A ob1= new A();
		ob1.meth1(10);
		ob1.meth1(20);
		System.out.println(ob1.id);
		System.out.println(ob1.name);
	}
}
