class A
{
	public static void main(String args[])
	{
		//int a;
		int b = 200; // case -2 - Ignored by JVM
		int c= 300;
		int d = 600;
		//System.out.println(a); // case -1 
		System.out.println(c); // case-3
	}
	//System.out.println(d); // case-4 - error
}