import java.io.*;
class DeSerializable1
{
	public static void main(String args[])
	{
		try
		{
			FileIntputStream fin=new FileInputStream("C:/Users/abc/Desktop/Tapas.txt");
			ObjectIntputStream oos=new ObjectInputStream(fin);
			Person p=(Person)oos.readObject();
			p.display();
			oos.close();
			fin.close();
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