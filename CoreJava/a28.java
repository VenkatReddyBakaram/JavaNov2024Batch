class Parent
{
	void properties() //overridden
	{
		System.out.println("properites() method from Parent class");
	}
}

class Child extends Parent
{
	
	void properties() // overriding
	{
		super.properties();
		System.out.println("properites() method from Child class");
	}

	public static void main(String args[])
	{
		Child ob = new Child();
		ob.properties();
		new Parent().properties();
	}
}

