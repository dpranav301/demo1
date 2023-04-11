class quick
{
	public static void main(String args[])
	{
		int[] a={5,3,8,4,2,7,1,10};
		quicksort(a,0,7);
		//System.out.print(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	static void quicksort(int[] a,int low,int high)
	{
		
		if(low<high)
		{
			int p=partition(a,low,high);
			quicksort(a,low,p);
			quicksort(a,p+1,high);
		}
	}
	static int partition(int[] a,int low,int high)
	{
		int p=a[low];
		int i=low-1;
		int j=high+1;
		while(true)
		{
			do{
				i++;
			}while(a[i]<p);
				do{
					j--;
				}while(a[j]>p);
				if(i>=j)
					return j;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
		}
	}
}