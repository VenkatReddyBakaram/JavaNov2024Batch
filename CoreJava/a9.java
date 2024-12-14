class A
{
	static int a = 100;
	
	int b = 200;
	
	static void show(){
		System.out.println("show() method");
	}

	public static void main(String args[])
	{
		
		A ob = new A();
		System.out.println(A.a);
		System.out.println(ob.a);
		System.out.println(ob.b);
		A.show();
	}
}