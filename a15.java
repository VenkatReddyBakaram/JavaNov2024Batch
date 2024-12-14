class Furniture
{
	int noOfChairs(int chairs)
	{
		return chairs+5;
	}
	
	int noOfTables(int tables)
	{
		return tables+2;
	}		
}

class ClassRoom
{

	Furniture furniture = new Furniture(); // has-a relationship
	
	void printChairs(int chairs)
	{
		int noOfChairs = furniture.noOfChairs(chairs);
		System.out.println("No Of Chairs :"+noOfChairs);
	}
	
	void printTables(int tables)
	{
		int noOfTables = furniture.noOfTables(tables);
		System.out.println("No Of Tables :"+noOfTables);
	}
}

class A
{
	public static void main(String args[])
	{
		ClassRoom room1 = new ClassRoom();
		ClassRoom room2 = new ClassRoom();
		ClassRoom room3 = new ClassRoom();
		
		room1.printChairs(5);
		room1.printTables(10);
		
		room2.printChairs(15);
		room2.printTables(100);
		
		room3.printChairs(50);
		room3.printTables(200);
		
		
	}
}