class A
{

	A()
	{
		this(100);
		System.out.println("Explicit Constructor");
		//this(100); -> error because this() method should be placed always as first statement
	}
	
	A(int a)	{
		
		this(500.50);
		System.out.println("Integer Parameter :"+a);
	}
	
	A(double b)
	{
		this("Java");
		System.out.println("Double Value is :"+b);
	}
	
	A(String str)
	{
		System.out.println("String Value is :"+str);
	}
	
	
	public static void main(String args[])
	{
		new A();		
	}
}

