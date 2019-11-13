import java.io.*;
class FileExample1
{
	public static void main(String args[]) throws IOException
	{
		String str="This is LPU";
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("C:/Users/abc/Desktop/Tapas.txt");
			byte b[]=str.getBytes();
			fout.write(b);
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