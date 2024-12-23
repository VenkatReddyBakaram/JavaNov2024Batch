class StaticOuter
{
	static int a = 100;
	
	int b = 200;
	
	static void show()
	{
		System.out.println("static show() method from outer class");
	}

	static class StaticInner
	{
		void display()
		{
			System.out.println("display() method from Inner class");
			show();
		}
		
		static void disp()
		{
			System.out.println(a);
			//System.out.println(b); error
			System.out.println("static disp() method from Inner class");
			show();
		}
	}
}

class A
{
	public static void main(String args[])
	{
		System.out.println(StaticOuter.a);
		StaticOuter.show();
		
		StaticOuter.StaticInner ob = new StaticOuter.StaticInner();
		ob.display();
		ob.disp();
		StaticOuter.StaticInner.disp();
	}
}