
class MyCalculator <T extends Number>
{
	T t,j;
	MyCalculator(T t,T j)
	{
		this.t=t;
		this.j=j;
	}
	public double Add()
	{
		Double c;
		c=t.doubleValue()+j.doubleValue();
		return(c.doubleValue());
	}
	
	public static void main(String args[])
	{
		MyCalculator<Integer> mc1=new MyCalculator<Integer>(5,9);
		MyCalculator<Float> mc2=new MyCalculator<Float>(1.2f,1.3f);
		MyCalculator<Double> mc3=new MyCalculator<Double>(1.2,1.3);
		System.out.println(mc1.Add());
		System.out.println(mc2.Add());
		System.out.println(mc3.Add());
		
	}
}