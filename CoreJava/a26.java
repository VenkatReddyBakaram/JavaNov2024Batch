class A
{
	public static void main(String args[])
	{
		int a = 100;
		double b = a; // upcasting -> int -> long -> float -> double
		
		System.out.println("Integer :"+a);
		System.out.println("Double :"+b);
		
		double x = 500.50;
		System.out.println("Double X :"+x);
		
		int y = (int)x; //downcasting double -> int
		
		System.out.println("Integer Y :"+y);
	}
}
		
		