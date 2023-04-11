class leftRotate
{
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6};
		int d=3;int n=a.length;
		/*rotate(a,0,d-1);
		rotate(a,d,n-1);
		rotate(a,0,n-1);*/
		rotate(a,d,n-1);
		rotate(a,d-1,0);
		rotate(a,0,n-1);
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}
	static void rotate(int[] a,int low,int high)
	{
		while(low<high)
		{
			int temp=a[high];
			a[high]=a[low];
			a[low]=temp;
			low++;
			high--;
		}
	}
}