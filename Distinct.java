import java.util.*;
class Distinct
{
	public static void main(String args[])
	{
		int[] a={1,1,1,1,1,2,2,2,3,3,3,4};
		HashSet<Integer> hs=new HashSet<Integer>(Arrays.asList(a));
		/*for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}*/
		System.out.println(hs);
		
	}
}