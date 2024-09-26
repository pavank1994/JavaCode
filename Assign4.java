package basicprograms;

public class Assign4 {

	 void calculation(int a , double b) {
		  double sum=a+b;
		System.out.println(sum);  
		  
	  }
	   void calculation(double a, double b) {  
		 double sub=a-b;
	    System.out.println(sub);	 
	  }
	  
	   void calculation(int a, int b) {
		   int multi=a*b;
		  System.out.println(multi); 
	  }

	   void calculation(double a, int b) {
		     double div=a/b;
		System.out.println(div);     
		  
	  }

	   void calculation(float a, double b) {
		     double mod=a%b;
		   System.out.println(mod);  
		  
	  }
	  
	public static void main(String[] args) {
        
		   Assign4 A4 = new Assign4();
		     A4.calculation(6, 4.784848);
		     A4.calculation(23.45677, 7.3434343);
		     A4.calculation(250, 450);
		     A4.calculation(93.636363, 25);
		     A4.calculation(6.53535f, 3.636363);
		
}
}