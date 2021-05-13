import java.util.Scanner;

public class XpowerY {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X=");
		int X=sc.nextInt();
		System.out.println("Enter the value of Y=");
		int Y=sc.nextInt();
		int Z=1;
		 if(Y>0) {
			 for(int i=1; i<=Y; i++) {
				 Z=Z*X;
			 }
			 System.out.println("The value of X to the power Y="+Z);
		 }
		 else {
			 System.out.println("The value of X to the power Y=1");
		 }
	}

}
