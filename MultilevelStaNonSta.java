package inheritance;

class inheritance1
{
	static void first() {
		System.out.println("super most class");
	}
}
class inheritance2 extends inheritance1
{
	void two()
	{
		System.out.println(" parent class");
	}
}

  public class MultilevelStaNonSta extends inheritance2  {
      void three() 
      {
    	  System.out.println("this is subclass");
      }
    public static void main(String[] args) {
    	
    	MultilevelStaNonSta M1 = new MultilevelStaNonSta();
		     M1.three();
		     M1.two();
		     first();
	}
}
