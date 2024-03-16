
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
			
			
			
		}
}
