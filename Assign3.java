package basicprograms;

public class Assign3 {
	
	  static void calculation(int a , double b) {
		  double sum=a+b;
		System.out.println(sum);  
		  
	  }
	  static void calculation(double a, double b) {  
		 double sub=a-b;
	    System.out.println(sub);	 
	  }
	  
	  static void calculation(int a, int b) {
		   int multi=a*b;
		  System.out.println(multi); 
	  }

	  static void calculation(double a, int b) {
		     double div=a/b;
		System.out.println(div);     
		  
	  }

	  static void calculation(float a, double b) {
		     double mod=a%b;
		   System.out.println(mod);  
		  
	  }
	  
	public static void main(String[] args) {
		 calculation(2000,6.378373);
		 calculation(856.737337,356.839393);
		 calculation(200,600);
		 calculation(6.35336,3.88575);
		 calculation(5.34f,2.4567);

	}

}
