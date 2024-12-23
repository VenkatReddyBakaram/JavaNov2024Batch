class A
{

	
	A()
	{
		System.out.println("Hey please execute me before you create every object");
		System.out.println("A() constructor executed");
	}
	
	A(int a)
	{
		System.out.println("Hey please execute me before you create every object");
		System.out.println("A(int) constructor executed with "+a);
	}
	
	A(String str)
	{
		System.out.println("Hey please execute me before you create every object");
		System.out.println("A(String) constructor executed with "+str);
	}

	public static void main(String args[])
	{
		new A();
		new A(100);
		new A("Java");		
	}
}

