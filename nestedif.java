package condtionstatements;

public class nestedif {
	public static void main(String[] args) {
    
		char gender1='M';
		char gender2='F';
		int age=40;
		if(gender1=='F')
		{
			   if(age>12) 
			   {
				   System.out.println("Adult fare"); 
			   }    
			   else 
			   {
		           System.out.println("half ticket");		   
			   }
		}		   
		else 
		{
		 System.out.println("it's free for female");	
		}
     }
}

