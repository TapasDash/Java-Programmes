class Pan
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(3/0);
			System.out.println("ksjgduka");
		}
		catch(Exception e)
		{
			System.out.println("Exception="+e.getMessage());
		}
		System.out.println("Hello");
	}
}