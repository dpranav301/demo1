import java.util.*;
class iteratordemo
{
	public static void main(String args[])
	{
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		//System.out.println(v);
		/*Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}*/
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			Integer z=(Integer)it.next();
			if(z==1)
			{
				it.remove();
			}

		}
					System.out.println(v);
	}
}