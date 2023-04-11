import java.util.*;
class freq
{
	public static void main(String args[])
	{
		int[] a={1,1,1,2,2,2,2,3,3,4,5,56,56};
		HashMap<Integer,Integer> hs=new LinkedHashMap<>();
		for(int x:a)
		{
			hs.put(x,hs.getOrDefault(x,0)+1);
		}
		for(Map.Entry<Integer,Integer> hs1:hs.entrySet())
		{
			if(hs1.getValue()>1)
			System.out.println(hs1.getKey()+" "+hs1.getValue());
		}
	}
}