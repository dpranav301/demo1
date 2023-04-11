class Arrayreverse
{
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6,7};
		reverse(a);
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}
	static void reverse(int[] a)
	{
		int low=0;
		int high=a.length-1;
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