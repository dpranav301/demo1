class Anagram
{
	public static void main(String args[])
	{
		String str1="ABBC";
		String str2="CABB";
		boolean b=ana(str1,str2);
		System.out.println(b);
	}
	static boolean ana(String str1,String str2)
	{
		int count[]=new int[256];
		int s1=str1.length();
		int s2=str2.length();
		
		if(s1!=s2)
			return false;
		for(int i=0;i<s1;i++)
		{
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		for(int i=0;i<256;i++)
		{
			if(count[i]!=0)
				return false;
		}
		return true;
	}
}