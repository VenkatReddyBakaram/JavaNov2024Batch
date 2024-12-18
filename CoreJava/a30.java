class A
{

	A(int a)
	{
		System.out.println("Integer :"+a);
	}
	
	A(float a)
	{
		System.out.println("Float :"+a);
	}
	
	/*
	A(double a)
	{
		System.out.println("Double :"+a);
	}*/
	
	public static void main(String args[])
	{
		
		new A(100);	  
 		//new A(500.50f); //upcasting - compiler
		new A((float)500.54);	 // downcasting
		new A(500.54f); // direct match	
	}
}
	
	/*
1.Priority -> no Of Parameters -> Ambiguty 
2.Priority -> Checks exact data type
3.Priotity -> Upcasting
4.Priority -> Downcasting
*/


