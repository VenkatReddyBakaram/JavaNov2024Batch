class A
{

	int a;
	int b; // instance variables
	
	A(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void show()
	{
		int a = 400;
		System.out.println("A Value(Local) is :"+a);
		System.out.println("A Value(Instance) is :"+this.a);
		System.out.println("B Value is :"+b);
	}
	
	public static void main(String args[])
	{
		A ob = new A(100,200);
		ob.show();
	}
}

/*	
this keyword calls current class properties
this() methods calls current class constructor

super keyword calls super class properties
super() method calls super class constructor
*/
	