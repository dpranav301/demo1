class subsequence
{
	public static void main(String args[])
	{
		String s1="ABCDEFGH";
		String s2="ACHZ";
		int j=0;
		int m=s1.length();
		int n=s2.length();
		for(int i=0;i<m & j<n;i++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				j++;
			}
		}
		if(j==n)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}