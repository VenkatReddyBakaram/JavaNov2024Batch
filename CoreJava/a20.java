class A
{

	void show()
	{
		System.out.println("Empty parameter method");
	}
	
	void show(int a)
	{
		System.out.println("Inter Value :"+a);
	}
	
	void show(float a)
	{
		System.out.println("Float Value :"+a);
	}
	
	void show(float a,float b){
		System.out.println("Tow Float Values :"+a + "\t"+b);
	}

	public static void main(String args[])
	{
		A ob = new A();
		ob.show();
		ob.show(100);
		ob.show(500.50f);
		ob.show(550.50f, 600.60f);
	}
}
