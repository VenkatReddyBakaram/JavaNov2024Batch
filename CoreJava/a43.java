interface MyConnection
{
	public abstract void connection();
}

class OracleConnection implements MyConnection
{
	public void connection()
	{
		System.out.println("Connected to Oracle database..!");
	}
}

class MySqlConnection implements MyConnection
{
	public void connection()
	{
		System.out.println("Connected to MySql database..!");
	}
}

class A
{
	public static void main(String args[])
	{
		
		String opt = args[0];
		
		MyConnection connect = null;
		
		if(opt.equals("oracle"))
			connect = new OracleConnection();
		else
			connect = new MySqlConnection();
		
		connect.connection();
	}
}