package basicprograms;

import java.util.Scanner;

public class Assign6 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the radius of circle");
	     int r = sc.nextInt();
	     double CircumofCirlce= 2*Math.PI*r;
	    System.out.println("Circumference of the circle is ----> " + CircumofCirlce); 
	       sc.close();

	}

}
