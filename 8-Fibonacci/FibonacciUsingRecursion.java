package forLoop;

public class FibonacciUsingRecursion {
		static int r=0,s=1,t=0;
		static void printFibonacci(int n) {
			if(n>0) {
			t=r+s;
			r=s;
			s=t;
			System.out.print(" "+t);
			printFibonacci(n-1);
		}
		}
	public static void main(String[] args) {
			int n=10;
			System.out.println(r+" "+s);
			printFibonacci(n-2);
	}

}
