class Persons
{
	void show()
	{	
		System.out.println("Parent");
	}
}

class Student extends Persons
{
	void show()
	{
		System.out.println("child");
	}
	void display()
	{
		System.out.println("display");
	}
}

class Test
{
	public static void main(String args[])
	{
		Student s= new Student();
		s.show();
	}
}
