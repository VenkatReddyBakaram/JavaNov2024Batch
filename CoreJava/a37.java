abstract class Abs
{
	void concrete()
	{
		System.out.println("concrete method");
	}
	
	abstract void absMethod();
	abstract void absMethod2();
}

class AbsImpl extends Abs
{
	
	void absMethod()
	{
		System.out.println("abstract method-1");
	}
	
	void absMethod2()
	{
		System.out.println("abstract method-2");
	}
	
	void show(){}
}

class A
{
	public static void main(String args[])
	{
		Abs ob = new AbsImpl();
		ob.concrete();
		ob.absMethod();
		ob.absMethod2();
		ob.show();
		
		AbsImpl ob2 = new AbsImpl();
		ob2.absMethod();
		ob2.absMethod2();
		ob2.concrete();
			
	}
}