package basicprograms;

import java.util.Scanner;

public class AreaofTriangleAssign7 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of base");
		 int b = sc.nextInt();
		System.out.println("Enter the value of height"); 
		 int h= sc.nextInt();
		 double area= 0.5*b*h;
		 System.out.println("area of the traingle is -->" + area);
		 sc.close();
	}

}
