import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of pattern n=");
		int n=sc.nextInt();
		int s=1;
		for(int i=1; i<=n; i++) {
			System.out.println("  ");
			for(int j=1; j<=n; j++) {
				System.out.print(" * ");
			}
		}

	}

}
