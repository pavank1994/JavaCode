package basicprograms;

public class Assign1 {
	
	   static void method1() {
		   System.out.println("this is method1");
	   }
	   
	 public static int method2() {
		  int a=10;
		  int b=20;
		  int sum=a+b;
		  System.out.println(sum);	 
		  return sum;
	 }
	 
	 public static void method3() {
		 int a=10;
		 int b=5;
		 if (a>b) {
		  System.out.println(" a is greater than b ");	 
		 }
	 }
	 
	 static void method4() {
		  System.out.println("this is method4");
	  }
	  
	 static void method5() {
		 System.out.println("this is method5");
	 }

	public static void main(String[] args) {
		System.out.println("amazon");
		  method1();
		  method2();
		  method3();
		  method4();
		  method5();
	}

}
