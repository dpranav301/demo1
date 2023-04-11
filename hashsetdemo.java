import java.util.*;
class hashsetdemo
{
	public static void main(String args[])
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		HashSet<String> hs1=new HashSet<>(hs);
		System.out.println(hs1);
		hs1.add(null);
		hs1.add("Z");

		System.out.println(hs1);

	}
}