class Merg
{
	public static void main(String args[])
	{
		int[] a={30,10,18,3,2,16,50,1};
		int low=0;int high=a.length-1;
		mergSort(a,low,high);
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		
	}
	static void mergSort(int[] a,int low,int high)
	{
		if(low<high)
		{
			int mid=low+(high-low)/2;
			mergSort(a,low,mid);
			mergSort(a,mid+1,high);
			merg(a,low,mid,high);
		}
	}
	static void merg(int[] a,int low,int mid,int high)
	{
		int n1=mid+1-low;
		int n2=high-mid;
		int[] left=new int[n1];
		int[] right=new int[n2];
		for(int i=0;i<n1;i++)
		{
			left[i]=a[i+low];
		}
		for(int j=0;j<n2;j++)
		{
			right[j]=a[mid+1+j];
		}
		int i=0,j=0,k=low;
		while(i<n1 && j<n2)
		{
			if(left[i]<right[j])
			{
				a[k]=left[i];
				i++;
				k++;
			}
			else
			{
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<n1)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=right[j];
			j++;
			k++;
		}
	}
}