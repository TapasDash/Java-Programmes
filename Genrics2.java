class Genrics2
{
	public static void main(String args[])
	{
		Integer a[]={1,2,3,4,5};
		Gen<Integer> ob1=new Gen<Integer>(a);
		ob1.display();
		Float f[]={1.2f,2.3f,4.5f,6.7f};
		Gen<Float> ob2=new Gen<Float>(f);
		ob2.display();
		ArrayList arl=new ArrayList(1,2,3,4,5);
		Gen<ArrayList> obj3=new Gen<ArrayList>(arl);
		obj3.display();
	}
}

class Gen<T>
{
	T arr[];
	Gen(T arr[])
	{
		this.arr=arr;
	}
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}