import java.io.*;
class FleHndlng1
{
	public static void main(String args[])
	{
		int i;
		try
		{
			FileInputStream fin=new FileInputStream("C:/Users/abc/Desktop/Simple.txt");
			do
			{
				i=fin.read();
				if(i!= -1)
				{
					System.out.println((char)i);
				}
			}while(i!= -1);
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println("Error occured..."+e);
		}
	}
}