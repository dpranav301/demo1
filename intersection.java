import java.util.*;
class intersection
{
	public static void main(String args[])
	{
		int[] a={10,20,30,40,50};
		int[] b={20,40};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			if(hs.contains(b[i]))
				System.out.print(b[i]+" ");
		}
	}
}