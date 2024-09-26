package condtionstatements;

import java.util.Scanner;

public class IfelseCondition {

	public static void main(String[] args) {
		 Scanner c = new Scanner(System.in);
		   System.out.println("Enter the value of age");
		   int age=   c.nextInt();
		 if(age>=18) {
			 System.out.println("the person can eligible to vote");
		 }
		 else {
			 System.out.println("the person can't eligible to vote");
		 }

	}

}
