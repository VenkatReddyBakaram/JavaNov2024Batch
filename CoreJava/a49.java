class Outer
{
	static int a = 100;
	int b = 200;
	
	static void show()
	{
		System.out.println("static show() method from outer class");
	}
	
	void disp()
	{
		System.out.println("non-static disp() method from outer class");
	}	
	
	class Inner
	{
		void access()
		{
			System.out.println(a);
			System.out.println(b);
			show();
			disp();
		}
		
		static void staticAccess()
		{
			System.out.println("staticAccess() method from Inner class");
		}
		
	}
}

class A
{
	public static void main(String args[])
	{
		Outer outer = new Outer();
		
		Outer.Inner inner = outer.new Inner();
		
		inner.access();
		Outer.Inner.staticAccess();		
	}
}