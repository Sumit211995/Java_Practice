import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a=");
		int a=sc.nextInt();
		System.out.println("Enter the value of b=");
		int b=sc.nextInt();
		System.out.println("Which operation do you want to run");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		
		case '+':
		System.out.println("Addition="+(a+b));
		break;

		case '-':
			System.out.println("Subtraction="+(a-b));
			break;
			
		case '*':
			System.out.println("Mul="+(a*b));
			break;
			
		case '/':
			System.out.println("Div="+(a/b));
			break;
			
			default :
				System.out.println("Invalid Expression");
		}
	}

}
