class bubbleSort
{
	public static void main(String args[])
	{
		/*int[] a={10,3,30,4,2,1};
		for(int i=0;i<a.length;i++)
		{
			boolean swap=false;
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					swap=true;
				}
			}
			if(swap==false)
				break;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}*/
		
		int[] a={10,3,30,4,2,1};
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false)
				break;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}