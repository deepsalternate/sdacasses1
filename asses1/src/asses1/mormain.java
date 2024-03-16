
package asses1;

class Over{
	
	void add(int a,int b){
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c){
		System.out.println((a+b)*c);
	}
}

class Riding extends Over {
	
	void add(int a,int b){
		System.out.println("this is overriding");
		System.out.println(a-b);
	}
	
}







public class mormain {
           public static void main(String[] args) {
			System.out.println();
			Over a=new Over(); 
			Riding b= new Riding();
			a.add(10, 20);
			a.add(10, 20, 30);
			b.add(10, 20);
			
			
		}
}
