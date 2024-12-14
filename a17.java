class A
{
	int a = 100;
}

class B extends A
{
	int a = 50; 
	
	int b = 500;
	
	/*
	static void disp()
	{
		System.out.println(super.a); // error because, super is non-static member
		whichi we cannot access from static function.
	} */
	
	void show()
	{
		System.out.println(super.a);
	}
	
	public static void main(String args[])
	{
		B ob = new B();
		A obA = new A();
		System.out.println(ob.a);
		ob.show();
		System.out.println(ob.b);
		
		System.out.println(obA.a);
		System.out.println(obA.b);
	}
}


