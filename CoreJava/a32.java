class A
{
	void f1()
	{
		System.out.println("f1() method from super class-A");
	}
	
	void f2()
	{
		System.out.println("f2() method from super class-A");
	}
}

class B extends A
{

	void f1()
	{
		System.out.println("f1() method from Sub class-B");
	}
	
	/*
	void f2()
	{
		System.out.println("f2() method from Sub class-B");
	}*/
	
	void f3()
	{
		System.out.println("f3() method from Sub class-B");
	}
	
	public static void main(String args[])
	{
		A ob = new B();
		
		ob.f1();
		ob.f2();
		//ob.f3();
		
		B ob1 = new B();
		ob1.f3();
		ob1.f1();
	}
}
	