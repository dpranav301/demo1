class MoveZeroToEnd
{
	public static void main(String args[])
	{
		int[] a={1,2,0,4,0,5,0,0,0,7};
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=0;
				a[res]=temp;
				res++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}