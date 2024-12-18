import java.lang.*; // default package
class A extends Object // default super class
{
	A() // default consturoctor added by java compiler
	{
		super(); // calls super class constructor
	}	
	
	public static void main(String args[])
	{
		new A();
	}
}
/*
1.Can we create java app with out using inheritance ?
No, becuase compiler will add extends Object as default statement

2.What is the super class of all java classes ?
object class which is available in java.lang package

3.What is default package package imported by java compiler ??
java.lang
*/
