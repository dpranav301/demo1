class insertion
{
	public static void main(String args[])
	{
		int[] a={20,5,40,60,10,30};
		int n=a.length;
		for(int i=1;i<n;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
				
			}
			a[j+1]=key;
			 System.out.print("After iteration " + i + ": ");
			 for(int z=0;z<n;z++)
			 {
				 System.out.print(a[z]+" ");
			 }
			 System.out.println();
		}
		
	}
}