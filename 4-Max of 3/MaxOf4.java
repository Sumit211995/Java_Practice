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
		System.out.println("Enter the value of d=");
		int d=sc.nextInt();
			if(a>b) {
			 if(a>c) {
				 if(a>d) {
					 System.out.println("The maximum no of given 4 no's, a=" +a);
				 }else {
					 System.out.println("The maximum no of given 4 no's, d=" +d);
			 	 }
			 } else if(b>c) {
					 	if(b>d) {
					 		System.out.println("The maximum no of given 4 no's, b=" +b);
					 	}
					 	else {
					 		System.out.println("The maximum no of given 4 no's, d=" +d);
					 	}
				 	}else if(c>d) {
						 System.out.println("The maximum no of given 4 no's, c=" +c);
						 
					 }
				 	else {
				 		System.out.println("The maximum no of given 4 no's, d=" +d);
				 	}
			}
			 else if(b>c) {
				 if(b>d) {
					 System.out.println("The maximum no of given 4 no's, b=" +b);
				 }
				 else {
				 System.out.println("The maximum no of given 4 no's, d=" +d);
			 }
			}
			 else if(c>d){
				 System.out.println("The maximum no of given 4 no's, c=" +c);
			 }
			 else {
				 System.out.println("The maximum no of given 4 no's, d=" +d);
			 }
		 }
	
	}
	
				 
				 



