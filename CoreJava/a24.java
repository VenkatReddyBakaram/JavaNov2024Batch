class Super
{
	Super()
	{
		System.out.println("Super class Constructor");
	}
}

class Sub extends Super
{

	Sub()
	{
		super();
		//this(100);
		System.out.println("Sub class Constructor");
	}
	
	Sub(int a)
	{
		System.out.println("Inter Value :"+a);
	}
	
	public static void main(String args[])
	{
		new Sub();	
	}
}
/*
FAQ)Can we call super() and this() together?
No,because super() and this()method alwasy need to be called as first statement 
*/