import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number=");
		int n=sc.nextInt();
		int count=0,s,t;
		if(n>0) {
			for(int i=1;i<=n;i++) {
				s=n % i;
				if(s==0) {
						count=count+1;
				}
			}
			    	if(count==2) {
			    		System.out.println("It is a prime number.");
			    		}
			    	else {
			    		System.out.println("It's not a prime number.");
			    	}
	}
			else {
			System.out.println("Wrong input");
		}

}
}
