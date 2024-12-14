class A
{

	void sum()
	{
		int a = 100;
		int b = 200;
		
		System.out.println("Addition is :"+(a+b));
	}
	
	void sub(int a, int b)
	{
		System.out.println("Substraction is :"+(a-b));
	}
	
	int mul()
	{
		int a = 100;
		int b = 20;
		
		return a*b;
	}
		
	int div(int a, int b)
	{
		return a/b;
	}
	
	static int add(int a, int b)
	{
		return a+b;
	}

	public static void main(String args[])
	{
		A ob = new A();
		ob.sum();
		ob.sub(100,50);
		int mul = ob.mul();
		System.out.println("Multiplication is :"+mul);
		System.out.println("Multiplication is :"+ob.div(20,5));		
		
		System.out.println("Result is :"+A.add(100,200));
	}
}

	
	
	
		