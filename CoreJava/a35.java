class A
{
	private int a;
	
	private void show(int a)
	{
		this.a = a;
		System.out.println("private A :"+this.a);
	}
	
	void disp(int a)
	{
		show(a);
	}
	
	private class C
	{
		
	}
}
class B
{
	public static void main(String args[])
	{
		A ob = new A();		
		ob.disp(100);
		//ob.show();
	}
}

