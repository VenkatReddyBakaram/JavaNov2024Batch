interface I
{
	public abstract void show();
}

class IImpl implements I//Approach-1
{
	public void show()
	{
		System.out.println("show() method impmlementation");
	}
}

class A
{
	public static void main(String args[])
	{
		/*I ob = new IImpl();
		ob.show();*/
		
		I ob = new I() // Anonymous class
		{
			public void show()
			{
				System.out.println("show() method impmlementation");
			}
		};
		
		ob.show();	
	}
}
