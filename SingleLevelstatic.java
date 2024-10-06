package inheritance;

 class Parent {
	
	   static void parentdisplay() 
	   {	
		   System.out.println("This is parent method");
	   }
}
     class subject extends Parent 
     {
	   
	    static void childdisplay() 
	    {
	    	System.out.println("this is child class method");
	    	
	    }
	   
     }     
     public class SingleLevelstatic 
     {
        public static void main(String[] args) {
			 Parent.parentdisplay();
			 subject.childdisplay();
			 subject.parentdisplay();
		}
    	 
}

     