class A
{
	
	static int a = 100;  // static variable
	
	int b = 200; // instance variable
	
	
	public static void main(String args[])
	{
		A ob = new A();
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		
		ob = null;
		
		System.out.println(ob.a);
		System.out.println(ob.b);
	}
}