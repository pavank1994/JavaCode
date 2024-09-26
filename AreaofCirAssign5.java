package basicprograms;

import java.util.Scanner;

public class AreaofCirAssign5{

public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the radius of the circle");
	      double r= sc.nextDouble();
	     double area= r*r*Math.PI;  
	   System.out.println("Area of the circle is -->" + area);
	      sc.close();
			
		}
			
	}


