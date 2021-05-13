import java.util.Scanner;

public class MaxOf3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a=");
		int a=sc.nextInt();
		System.out.println("Enter the value of b=");
		int b=sc.nextInt();
		System.out.println("Enter the value of c=");
		int c=sc.nextInt();
			if(a>b) {
			 if(a>c) {
				System.out.println("The maximum no of given 3 no's, a=" +a);
			}
			 else {
				 System.out.println("The maximum no of given 3 no's, c=" +c);
			 }
			}
			else if(b>c) {
				System.out.println("The maximum no of given 3 no's, b=" +b);
			}
			else {
				System.out.println("The maximum no of given 3 no's, c=" +c);
			}
	}
	

}

