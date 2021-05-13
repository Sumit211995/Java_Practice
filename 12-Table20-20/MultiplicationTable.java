import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the term n for Multiplication table =");
		int n=sc.nextInt();
		int s=1;
		for(int i=1; i<=n; i++) {
			System.out.println("  ");
			for(int j=1; j<=n; j++) {
				s=i*j;
				System.out.print("  "+s);
			}
			
		}

	}

}
