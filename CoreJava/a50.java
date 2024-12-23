class Outer
{
	
	void show()
	{
		class PrivateClass
		{
			void disp()
			{
				System.out.println("disp() method Private Class");
			}
		}
		PrivateClass ob = new PrivateClass();
		ob.disp();
	}
}

class A
{
	public static void main(String args[])
	{
		Outer outer = new Outer();
		outer.show();
	}
}