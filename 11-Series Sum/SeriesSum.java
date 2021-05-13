import java.util.Scanner;
public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of term in the series=");
		double n=sc.nextInt();
		double s=0;
		for(double i=1; i<=n; i++) {
			s=s+(1/i);	
		}
		System.out.println("the sum of n term series is="+s);
	}

}
