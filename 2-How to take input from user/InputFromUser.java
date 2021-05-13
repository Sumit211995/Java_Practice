import java.util.Scanner; //Scanner is class which is already available in java or util package.
public class InputFromUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //object creation of Scanner class so that we can use it.
		System.out.println("Enter the value of X="); //printing a simple message.
		int x=sc.nextInt(); //input taken from user.
		System.out.println("the value of X is=" +x); //printing the value of x.
		
		
	}

}
 //for string- ( String S= sc.nextLine).