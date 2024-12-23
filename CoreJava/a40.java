class A
{
	static int a= 100;
	int b = 200;

	static
	{
		System.out.println("static block as a common block");
		System.out.println("static variable :"+a);
		//System.out.println("instance variable :"+b); cannot access instance variables in static block
	}

	{
		System.out.println("Hey please execute me before you create every object");		
		System.out.println("static variable :"+a);
		System.out.println("instance variable :"+b);
	}
	
	{
		System.out.println("Init block-2");
	}
	
	{
		System.out.println("Init block-3");
	}
	
	A()
	{
		System.out.println("A() constructor executed");
	}
	
	A(int a)
	{
		System.out.println("A(int) constructor executed with "+a);
	}
	
	A(String str)
	{
		System.out.println("A(String) constructor executed with "+str);
	}

	public static void main(String args[])
	{
		new A();
		new A(100);
		new A("Java");		
	}
}

