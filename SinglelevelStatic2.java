package inheritance;

   class one {
	   
	    static void add(int a,int b)
	    {
	    	int sum=a+b;
	    	System.out.println("sum of two numbers is :" + sum);
	    }
	    static void sub(int a, int b)
	    {
	    	  int sub=a-b;
	    	  System.out.println("sub of two numbers is :" + sub); 
	    }
   }

  public class SinglelevelStatic2 extends one  
  {
	   static void mul(int a, int b)
	   {
		   int mul = a*b;
		   System.out.println("mul of two numbers is :" + mul);
	   }
	   static void div(int a, int b) 
	   {
		   int div = a/b;
		   System.out.println("divison of two numbers is :" + div);
	   }

  public static void main(String[] args) 
  {
	    mul(1000, 2000);
	    div(50000,25000);
	    add(567,435);
        sub(837373,938);
  }
}