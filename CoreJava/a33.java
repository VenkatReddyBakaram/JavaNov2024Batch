class A
{

	void f1(int a)
	{
		System.out.println("A Value from A class :"+a);
	}
}
class B extends A
{

	void f1(int b)
	{
		super.f1(b+300);
		System.out.println("B Value from B class :"+b);
	}
}
class C
{
	static public void main(String args[])
	{
		B ob = new B();
		ob.f1(100);
		
		//return 1;
	}
}