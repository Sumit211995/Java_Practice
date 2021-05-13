package forLoop;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		double s=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n=");
		double n=sc.nextInt();
		//double r=n;
			for(int i=1; i<=n;i++) {
				
				s=s*i;
				
				//r=r-1;
				//s=n-1;
				
			}
		System.out.println("The factorial of given no is="+s);
	}

}
