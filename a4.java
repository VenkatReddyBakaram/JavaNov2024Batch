class A
{
	int a = 100;
	
	public static void main(String args[])
	{
		A ob = new A();
		System.out.println(ob.a);
		ob.a = 200;
		System.out.println(ob.a);
		A ob2 = new A();
		System.out.println(ob2.a);	
		ob2.a=500;
		System.out.println(ob2.a);
		System.out.println(ob.a);		
	}
}