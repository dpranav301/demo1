class Selection
{
	public static void main(String args[])
	{
		/*int[] a={90,80,90,25};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min_index])
					min_index=j;
				
			}
			int temp=a[i];
			a[i]=a[min_index];
			a[min_index]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}*/
		
		int[] a={90,80,90,25};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min_index])
					min_index=j;
			}
			int temp=a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}