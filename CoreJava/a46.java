class SingleTon
{

	private static SingleTon singleton = null;
	
	private SingleTon()
	{
		System.out.println("Instance memory is created..!");
	}
	
	public static SingleTon getSingleTon()
	{
		if(singleton == null)
			singleton = new SingleTon();
		
		return singleton;
	}
	
	void connect()
	{
		System.out.println("connected");
	}
}
class A
{
	public static void main(String args[])
	{
		SingleTon singleton1 = SingleTon.getSingleTon();
		singleton1.connect();
		SingleTon singleton2 = SingleTon.getSingleTon();
		singleton2.connect();
		SingleTon singleton3 = SingleTon.getSingleTon();
		singleton3.connect();
		SingleTon.getSingleTon().connect();
		SingleTon.getSingleTon().connect();
		SingleTon.getSingleTon().connect();
		SingleTon.getSingleTon().connect();
		SingleTon.getSingleTon().connect();
		SingleTon.getSingleTon().connect();
		SingleTon.getSingleTon().connect();
		SingleTon.getSingleTon().connect();
	}
}
	
	