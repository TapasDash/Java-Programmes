import java.util.*;			
class JenMe
{
	public static <E extends Number> double Add(E a,E b)
	{
		return(a.doubleValue()+b.doubleValue());
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no.=");
		Integer	 x=sc.nextInt();
		System.out.println("Enter 2nd no.=");
		Integer y=sc.nextInt();
		Double m=JenMe.Add(x,y);
		System.out.println(m.doubleValue());
	}
}
