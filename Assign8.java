package basicprograms;

import java.util.Scanner;

public class Assign8 {

	public static void main(String[] args) {
	       
	  Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the side of square");
	      int side=sc.nextInt();
	    int AreaofSquare= side*side;
	    System.out.println(" Area of Square is ---> " + AreaofSquare);
	      sc.close();

	}

}
