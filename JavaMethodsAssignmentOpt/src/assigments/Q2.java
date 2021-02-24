package assigments;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		
		System.out.println("The "+num+"th Fibonacci number is "+fib(num));

		scan.close();
	}
	
	
	
	public static int fib(int num) {
		if (num ==1) {
			return 1;
		}
		if (num == 0 ) {
			return 0;
		}
		else {
			return fib(num-2) + fib(num-1);
		}
	}

}
