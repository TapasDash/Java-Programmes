import java.io.*;
class FileExample3
{
	public static void main(String args[]) throws IOException
	{
		String str="This is LPU";
		PrintWriter fout=null;
		try
		{
			fout=new PrintWriter("C:/Users/abc/Desktop/Tapas.txt");
			fout.print(str);
			fout.println("I am in same line");
			fout.print("I am in 2nd line now");
		}
		catch(IOException e)
		{
			System.out.println("Error Occured..."+e);		
		}
		finally
		{
			if(fout!=null)
			{
				fout.close();
			}
		}
	}
}