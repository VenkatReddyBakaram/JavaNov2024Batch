interface I2{

	public abstract void f1();
	public abstract void f2();
	public abstract void f3();
	public abstract void f4();
}
abstract class AdapterI2 implements I2
{

	public void f1(){}
	
	public void f2(){}
	
	public void f3(){}

	public void f4(){}

}

class A extends AdapterI2
{
	
	public void f1(){
		System.out.println("f1() method");
	}
	
	public void f4(){
		System.out.println("f4() method");
	}
	
	
	public static void main(String args[])
	{
		A ob = new A();
		ob.f1();
		ob.f4();
	}
}
