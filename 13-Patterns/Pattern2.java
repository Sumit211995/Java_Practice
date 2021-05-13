import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of pattern n=");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("  ");
			for(int j=1; j<=i-1; j++) {
				
				System.out.print(" ");
				
			}
			for(int k=i; k<=n; k++) {
				System.out.print("*");
			}
		}

	}

}
