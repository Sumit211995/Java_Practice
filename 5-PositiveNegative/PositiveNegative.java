package ifElse;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number=");
		int a=sc.nextInt();
		if(a<0) {
			System.out.println("The given number is negative.");
		}
		else {
			System.out.println("The given number is positive."); 
		}

	}

}
