import java.io.*;
import java.util.*;
class FileExample4			
{
	public static void main(String args[]) throws IOException
	{
		String str="This is LPU";
		File f=new File("C:/Users/abc/Desktop/Tapas.txt");
		Scanner sc=null;
		try
		{
			sc=new Scanner(f);
			while(sc.hasNext())
			{
				str=sc.nextLine();
				System.out.println(str);
			}
		}
		catch(IOException e)
		{
			System.out.println("Error Occured..."+e);		
		}
		finally
		{
			if(sc!=null)
			{
				sc.close();
			}
		}
	}
}