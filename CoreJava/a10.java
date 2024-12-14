class A
{
	static int a = 100;
	
	int b = 200;
	
	public static void main(String args[])
	{
		A ob1 = new A();
		
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		
		A ob2 = new A();
		ob2.b=500;
		ob2.a=600;
		
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		
		System.out.println(ob1.a);
		System.out.println(ob1.b);
	}
}