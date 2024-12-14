class Base
{
	
	Base(int a)
	{
		System.out.println("Base class Constructor : "+a);
	}

	void show()
	{
		System.out.println("show() method from Base class");		
	}
}

class Derieved extends Base
{
	
	Derieved(int a)
	{
		super(a); // super method invokes super class constructor
		System.out.println("Derieved class Constructor: "+a);
	}
	
	void display()
	{
		super.show(); // super keyword invokes super class method/variable
		System.out.println("display() method from Derieved class");
	}
	
	public static void main(String args[])
	{
		Derieved ob = new Derieved(100);
		ob.display();
		//ob.show();
	}
}



	
	