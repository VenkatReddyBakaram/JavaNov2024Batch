class A
{
	public void show()
	{
		System.out.println("public show() method");
	}
	
	protected void display()
	{
		System.out.println("protected display() method");
	}
	
	void disp()
	{
		System.out.println("default disp() method");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("public show() method");
	}
	
	public void display()
	{
		System.out.println("protected display() method");
	}
	
	public void disp()
	{
		System.out.println("default disp() method");
	}
	
	public static void main(String args[])
	{
		B ob = new B();
		ob.show();
		ob.display();
		ob.disp();
		
	}
}

/*
Levels of access specifiers

overridden			overriding
public 				public 
protected 			protected,public
default				default,protected,public

*/