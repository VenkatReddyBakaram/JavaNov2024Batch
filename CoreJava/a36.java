class A
{
	protected void show()
	{
		System.out.println("show() method from A class");
	}
	
	void disp2(){
		System.out.println("disp2() method from A class");
	}
}
class B extends A 
{
	void disp()
	{
		disp2();
		show();
	}
	
	public static void main(String args[])
	{
		B ob = new B();
		ob.disp();
	}
}

