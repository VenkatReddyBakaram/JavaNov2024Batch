class A
{

	void show(int a)
	{
		System.out.println("Integer :"+a);
	}
	
	void show(float a)
	{
		System.out.println("Float :"+a);
	}
	
	/*
	void show(double a)
	{
		System.out.println("Double :"+a);
	}*/
	
	public static void main(String args[])
	{
		A ob = new A();
		ob.show(100);	  
 		//ob.show(500.50f); //upcasting - compiler
		ob.show((float)500.54);	 // downcasting
		ob.show(500.54f); // direct match	
	}
}
	
	/*
1.Priority -> no Of Parameters -> Ambiguty 
2.Priority -> Checks exact data type
3.Priotity -> Upcasting
4.Priority -> Downcasting
*/