package basicprograms;

import java.util.Scanner;

public class Assign9 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		  int l= sc.nextInt();
		 System.out.println(" enter the width of the rectangle");
		  double w=sc.nextDouble();
         double AreaofRectangle= l*w;
        System.out.println("Area of rectangle is" + AreaofRectangle);
          sc.close();
		  
	}

}
