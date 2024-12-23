final class A
{
	final int a = 100;
	
	final void show()
	{
		System.out.println("show() method");
	}
}

class B extends A
{
	/*void show()
	{
		System.out.println("show() method from B class");
	} */ //error
	
	public static void main(String args[])
	{
		B ob = new B();
		//ob.a = 500; error
		System.out.println(ob.a);
		ob.show();
	}
}

