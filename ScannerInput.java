package basicprograms;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		 System.out.println("Enter the age of the person");
		    int age = s1.nextInt();
          System.out.println("the age of the person is -->" + age);	
          int a = s1.nextInt();
          int b=  s1.nextInt();
          int sum = a+b;
        System.out.println("sum of two numbers is --->" +sum); 
        s1.close();

	}

}
