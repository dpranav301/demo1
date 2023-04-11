class A
{
	public Object sum()
	{
		System.out.println("Hello");
		return "Hello";
	}
}
class demo2 extends A
{
	public static void main(String args[])
	{
		demo2 d=new demo2();
		d.sum();
	}
	public String sum()
		{
			System.out.println("Hi");
			return null;
		}
}