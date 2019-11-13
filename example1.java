class a
{
	public void f1(int x)
	{
		System.out.println("class a");
	}
}

class b extends a
{
	public void f1(int x, int y)
	{
		System.out.println("class b");
	}
}

public class example1
{
	public static void main(String[] args)
	{
		b obj=new a();
		obj.f1(5,6);
		
	}
}