package basicprograms;

public class MainMethodOverload {
	
    public static void main(String[] args)
    {
      System.out.println("this is original main method"); 
    	main();
    	main("Mohan",'s');
    }
    
    public static void main() {
    	
    	System.out.println("this is main method with no arguments");
    }

    public static void main(String name, char geneder) {
    	
    	System.out.println("Main method with String and char argument");
    	
    }
    
}
