class Parent 
{
	int var;
	void display()
	{
		System.out.println(var);
	}
}

class Child extends Parent
{
	int var;
	void display()
	{
		System.out.println(var);
	}
	void fun()
	{
		var=100;
		super.var=200;
		display();
		super.display();
	}
}

class InheritanceTest1
{
	public static void main(String args[])
	{
			Child c=new Child();
			c.fun();
	}
}

