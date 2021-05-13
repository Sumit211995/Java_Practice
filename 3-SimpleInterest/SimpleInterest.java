import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of p=");
		int p=sc.nextInt();
		System.out.println("Enter the value of r=");
		double r=sc.nextDouble();
		System.out.println("Enter the value of t=");
		int t=sc.nextInt();
		double SI=(p*r*t)/100;
		System.out.println("Simple Interest is="+SI);
		
	}

}
