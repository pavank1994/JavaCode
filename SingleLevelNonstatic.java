package inheritance;

  class two {
	  
	  void add(double a, double b) 
	  {
		  double sum=a+b;
		  System.out.println(sum);
	  }
	  void sub(int a, int b)
	  {
		  int sub = a-b;
		  System.out.println(sub);
	  }
	  
  }
public class SingleLevelNonstatic extends two {
	   
	  void mul(long a, long b)
	  {
		  long multi = a*b;
		  System.out.println(multi);
	  }
	  void div(float a, float b)
	  {
           float divi = a/b;		  
		 System.out.println(divi); 
	  }
	  
   public static void main(String[] args) 
   {
	   
	   SingleLevelNonstatic S1 = new SingleLevelNonstatic();
	           S1.mul(6336l, 837l);
	           S1.div(7.65f,6.78f);
	           S1.add(5.737373,8.63663);
	           S1.sub(20000,10000);
	   	   
        }	  

}
