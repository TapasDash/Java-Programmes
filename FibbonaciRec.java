import java.util.*;
class FibbonaciRec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Upto How many terms of fibonnaci series u wnt to print=");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(fib(i));
		}
	}
	
	static int fib(int n)
	{
		if(n==1 || n==2)
		{
			return(1);
		}
		else
		{
			return(fib(n-1)+fib(n-2));
		}
	}
} 
