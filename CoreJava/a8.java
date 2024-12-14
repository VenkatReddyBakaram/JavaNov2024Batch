class B
{
	
	static void staticShow(){
		System.out.println("static  show method");
	}
	
	static
	{
		System.out.println("Project Name : VEMS");
		System.out.println("Project Version : 1.0.0");
	}
}

class A
{
	static
	{
		System.out.println("Project Powered By : V Tech Soluttions");
		System.out.println("Project Released date  : 30-May-2026");
	}
	
	static
	{
		System.out.println("Project Future Released date  : 30-Dec-2026");
	}
	
	static public void main(String args[])
	{
		B.staticShow();
		System.out.println("main method");		
	}
}