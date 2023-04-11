class largestAndSecondLargest
{
	/*public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6,7};
		int res=-1;int largest=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[largest])
			{
				res=largest;
				largest=i;
			}
			if(a[i]!=a[largest])
			{
				if(res==-1 || a[i]>a[res])
				{
					res=i;
				}
			}
		}
		System.out.println("Largest element="+a[largest]);
		System.out.println("Second Largest="+a[res]);
	}*/
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6,7};
		int res=-1;int largest=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[largest])
			{
				res=largest;
				largest=i;
			}
			if(a[i]!=a[largest])
			{
				if(res==-1 || a[i]<a[res])
				{
					res=i;
				}
			}
		}
		System.out.println("smallest element="+a[largest]);
		System.out.println("Second smallest Largest="+a[res]);
	}
	
}