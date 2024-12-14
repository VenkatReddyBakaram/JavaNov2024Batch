class A
{

	A()
	{
		System.out.println("Explicit Constructor");
	}
	
	A(int a)
	{
		System.out.println("Integer Parameter :"+a);
	}
	
	A(double b)
	{
		System.out.println("Double Value is :"+b);
	}
	
	A(String str)
	{
		System.out.println("String Value is :"+str);
	}
	
	
	public static void main(String args[])
	{
		new A();
		new A(100);
		new A(500.30);
		new A("Java Programming Language");
	}
}