import java.util.Scanner;
 class AssertExample
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur age=");
		int value=sc.nextInt();
		assert value>=18:"Not valid";
		System.out.println("value is"+value);
	}
 }