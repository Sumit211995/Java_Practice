import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of pattern n=");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("  ");
			for(int j=1; j<=i; j++) {
				
				System.out.print(" * ");
			}
		}
	}

}
