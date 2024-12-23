class PostgreConnection
{
	
	void connect()
	{
		System.out.println("Connected to Postgre database..!");
	}
}

class DB2Connecion
{
	void connect()
	{
		System.out.println("Connected to DB2 database..!");
	}
}

class A
{
	public static void main(String args[])
	{
		/*PostgreConnection connect = new PostgreConnection();
		connect.connect();*/
		
		DB2Connecion connect = new DB2Connecion();
		connect.connect();
	}
}