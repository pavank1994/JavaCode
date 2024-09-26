package basicprograms;

public class Assign2 {
	
	void addition(){
		int a=10;
		double b=3.4567;
	   double sum= a+b;
	 System.out.println(" addition of two numbers is --> "+ sum);	
		
	}
	
	void substraction() {
		 double x=4.56733;
		 int y=3;
         double sub=x-y;
        System.out.println("substraction of two numbers is -->"+sub); 
	}

	void multiplication() {
		float f=4.567f;
	     double s=7.3443554;
		double multi=s*f;
	  System.out.println("Multiplication of two numbers is -->"+multi);
	}
	  
	  void division() {
		double b=7.93938383;
		double c=5.93939393;
		double div = b/c;
	System.out.println("division of two numbers is -->"+ div);
	  }
	  
	  void modulus() {
		int f=6;
		int h=3;
		int mod=f%h;  
	  System.out.println("modulus of two numbers is-->"+ mod);	  
	  }
 	
	public static void main(String[] args)
	{
		Assign2 c1 = new Assign2();
		   c1.addition();
		   c1.substraction();
		   c1.multiplication();
		   c1.division();
		   c1.modulus();
	}
	
	
}
