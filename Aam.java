interface Shape1
{
	void area();
}
interface Shape2
{
	void area();
}
class Ghi implements Shape1,Shape2
{
	public void area()
	{
		System.out.println("maa chuda bhosdike...");
	}
}
class Aam
{
	public static void main(String args[])
	{
		Ghi g=new Ghi();
		g.area();
	}
}