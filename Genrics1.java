class Genrics1
{
	public static void main(String args[])
	{
		Gen<String> obj1=new Gen<String>("Hello");
		String str= obj1.getObject();
		System.out.println(str);
		obj1.showType();
		
		Gen<Integer> obj2=new Gen<Integer>(36);
		int i=obj2.getObject();
		System.out.println(i);
		obj2.showType();

	}
}

class Gen<T>
{
	T object;
	Gen(T obj)
	{
		object = obj;
	}
	
	T getObject()
	{
		return object;
	}
	
	void showType()
	{
		System.out.println("Type of T is:"+object.getClass());
	}
}