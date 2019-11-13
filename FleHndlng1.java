import java.io.*;
class FleHndlng1
{
	public static void main(String args[])
	{
		int i;
		try
		{
			FileInputStream fin=new FileInputStream("C:/Users/abc/Desktop/Tapas.txt");
			do
			{
				i=fin.read();
				if(i!= -1)
				{
					System.out.print((char)i);
				}
			}while(i!= -1)
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println("Error occured..."+e);
		}
	}
}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println("Error occured..."+e);
		}
	}
}