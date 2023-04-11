import 
class String1
{
	public static void main(String args[])
	{
		
		String str="I Love Coding";
		StringTokeniser st=new StreamTokenizer(str);
		int count=st.countTokens();
		String[] a=new String(count);
		int i=0;
		while(st.hasMoreTokens())
		{
			a[i]=st.nextToken();
			i++;
		}
		for(int j=count;j>=0;j++)
		{
			System.out.print(a[j]+" ");
		}
	}
}