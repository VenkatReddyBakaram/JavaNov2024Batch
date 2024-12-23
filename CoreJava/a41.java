interface I1
{
	public static final int a = 100;
	int b = 200;
}

interface I2 extends I1
{
	
}
interface I3
{
	int i3= 600;
}

class C1
{
	public static int c1 = 500;
}

class C2 extends C1 implements I2,I3{
	
}

class A
{
	public static void main(String args[])
	{
		//I1 ob = new I1();
		
		//I1.a=400;
		
		System.out.println(I1.a);
		
		//I1.b = 500;
		
		System.out.println(I1.b);
		
		System.out.println(I2.b);
		System.out.println(C2.b);
		System.out.println(C2.c1);
		System.out.println(C2.i3);
	}
}