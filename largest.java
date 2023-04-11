class largest
{
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6,7};
		int max=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[max]>a[i])
				max=i;
		}
		System.out.println(a[max]);
		
		int res=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[max])
			{
				if(res==-1)
					res=i;
				else if(a[res]>a[i])
					res=i;
			}
		}
		System.out.println("Second largest="+a[res]);
	}
}