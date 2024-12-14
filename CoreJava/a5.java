class A
{
	int a = 100;
	
	public static void main(String args[])
	{
		A ob1 = new A();
		ob1.a=200;
		System.out.println(ob1.a);
		A ob2 = new A();
		System.out.println(ob2.a);
		
		ob1 = ob2;
		ob1.a=500;
		System.out.println(ob2.a);
		System.out.println(ob1.a);		
	}
}