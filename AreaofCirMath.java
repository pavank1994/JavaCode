package basics;

import java.util.Scanner;

public class AreaofCirMath {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("pleas enter the value of radius");
	     double r = sc.nextDouble();
         double areaofcircle = Math.PI*r*r;  
       System.out.println("Area of circle is : " + areaofcircle ); 
        sc.close();
	}

}
