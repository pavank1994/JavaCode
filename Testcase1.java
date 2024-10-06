	package inheritance;

 class  Test2{
	   Test2()
	   {
		   	System.out.println("Parent no-org constructor");
	   }
	 
	   Test2(int x)
	   {
		  System.out.println("Parent org constructor");  
	   }
}
    class child extends Test2 
    {
    	  child()
    	  {
    		    super();
    		 System.out.println("child no-org constructor"); 
    	  }
       child (int y)
       {
    	     super(10);
    	  System.out.println("child parameterized constructor"); 
       }
    }      
      class Testcase1 extends child
   {   
         Testcase1()
         {
              super();
        	System.out.println("this is testcase1"); 
         }
    public static void main(String[] args)
    {
        Testcase1 t1= new Testcase1();
               
      }  
    }
  