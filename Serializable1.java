import java.io.*;
class Serializable1
{
	public static void main(String args[])
	{
		try
		{
			Person p=new Person();
			FileOutputStream fout=new FileOutputStream("C:/Users/abc/Desktop/Tapas.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			oos.writeObject(p);
			oos.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println("Error Occured..."+e);		
		}
		
	}
}

class Person implements Serializable
{
	String name="Amit";
	int age=25;
	void display()
	{
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}
}