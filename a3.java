class A
{
	int a;  
	float b;
	double c;
	boolean flag;
	String name;
	
	
	
	public static void main(String args[])
	{
		A ob = new A();	
	
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.flag);
		System.out.println(ob.name);
		
		ob.a=100;
		ob.b=50.60f;
		ob.c = 56.78;
		ob.flag = true;
		ob.name = "String Here";
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.flag);
		System.out.println(ob.name);
	}
}