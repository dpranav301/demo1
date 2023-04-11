class demo3
{
	public static void main(String args[])
	{
		A a=new B();
		a.add();
	}
}
class A
{
	public static void add()
	{
		System.out.println("Hello i am in A");
	}
}
class B extends A
{
	public static void add()
	{
		System.out.println("Hello i am in B");
	}
}