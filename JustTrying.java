import java.io.*;
class JustTrying
{
	public static void main(String args[])
	{
			
			votingMachine(Integer.parseInt(args[0]));
			
	}
	static void votingMachine(int age) throws IOException
	{
		if(age<18)
		{
			throw new IOException("you are not eligible for voting");
		}
		else
		{
			System.out.println("you are eligible for voting");
		}
	}
}