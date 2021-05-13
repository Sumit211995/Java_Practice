import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		int r=0,s=1,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n=");
		int n=sc.nextInt();
	
		System.out.println("The value of fibonacci series is =");
		System.out.print(r+" "+s);
		
		for(int i=2; i<n; i++) {
			 t=r+s;
			 System.out.print(" " +t);
			 r=s;
			 s=t;
		}
			
	}

}
