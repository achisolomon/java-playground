package fibonnachi;

public class fibo {

	public static int calcfib ( int n)
	{
		if ( n <= 1 )
		{	
			return 1;
		}
		return calcfib(n-1) + calcfib(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(" fib 1 : "+ calcfib(1));
		System.out.println(" fib 2 : "+ calcfib(2));
		System.out.println(" fib 3 : "+ calcfib(3));
		System.out.println(" fib 4 : "+ calcfib(4));
		System.out.println(" fib 5 : "+ calcfib(5));
		System.out.println(" fib 6 : "+ calcfib(6));
		System.out.println(" fib -6 : "+ calcfib(-6));
	}

}
