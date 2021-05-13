import java.util.Scanner;
public class LogrithmOf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of term n=");
		int n=sc.nextInt();
		float s=0,t=0,r=0;
		if(n>0) {
			for(float i=1; i<=n; i++) {
				if(i%2==0) {
					s=s-(1/i);
				}
				else {
					t=t+(1/i);
				}
				r=t+s;
			}
			System.out.println("the series sum is="+r);
		}
		else {
			System.out.println("Invalid input.");
		}

	}

}
