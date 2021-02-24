package assigments;

import java.util.Scanner;

public class Q3 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		
		System.out.print("Enter 'raised to the power' number: ");
		int pow = scan.nextInt();
		
		System.out.println(num+" raised to the power "+pow+" is "+numberPower(num, pow));
		
		scan.close();
	}
	
	
	public static int numberPower(int a, int b) {
		if (b==1) {
			return a;
		}else {
			return a* numberPower(a, b-1);
		}
	}

}
