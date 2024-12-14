class A
{

	A()
	{
		System.out.println("Explicit Constructor");
		new A(100);
	}
	
	A(int a)
	{
		System.out.println("Integer Parameter :"+a);
		new A(500.50);
	}
	
	A(double b)
	{
		System.out.println("Double Value is :"+b);
		new A("Java");
	}
	
	A(String str)
	{
		System.out.println("String Value is :"+str);
	}
	
	
	public static void main(String args[])
	{
		new A();
		/*new A(100);
		new A(500.30);
		new A("Java Programming Language");*/
	}
}