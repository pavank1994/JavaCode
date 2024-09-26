package basicprograms;

public class Nonstatic {
	
	
	   void addition() {
		  System.out.println("addtion of two numbers");
	   }

	public static void main(String[] args) {
	 
	System.out.println("My main method");
	  Nonstatic n1=new Nonstatic();
	     n1.addition();

	}

}
