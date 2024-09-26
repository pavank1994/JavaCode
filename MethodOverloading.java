package basicprograms;

public class MethodOverloading {
	
	   void addition(double a, double b) {
		double sum= a+b;
	  System.out.println("sum of two decimal numbers is-->" + sum);	
		
	}

	 void addition(int a, int b) { 
		int sum=a+b;
		System.out.println("sum of two interger numbers is-->" + sum);
		
	}
	
	 static void addition(int a, double b) {
		  double sum=a+b;
		  System.out.println("sum of two numbers is -->"+sum);
	 }
	 
	 static void addition(double a, int b) {
		  double sum=a+b;
		  System.out.println("sum of two numbers is-->"+sum);
	 }
	 
	  static void addition(String s, char c, boolean b) {
		  System.out.println("the name of the persion is -->" +s);
		  
	  }
	
	public static void main (String[] args) {
		   
		   MethodOverloading M1= new MethodOverloading();
		      M1.addition(7000, 14000);
		      M1.addition(5.678, 4.789);
		   addition(5, 6.34343);
		   addition(6.34435,7);
		   addition("suresh",'M',true);
	}
}
