class GrandFather
{
	void properties()
	{
		System.out.println("Land : 5 Acrs");
		System.out.println("Godl : 10 Kgs");
	}
}

class Father extends GrandFather{

	void earnings()
	{
		System.out.println("Cars : 5 BMWS ");		
	}
}

class Child extends Father
{

	public static void main(String args[])
	{
		Child child = new Child();
		child.earnings();
		child.properties();
	}
}


