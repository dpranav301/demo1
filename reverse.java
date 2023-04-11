import java.util.*;
class reverse
{
	/*public static void main(String args[])
	{
		String s1="I Love Coding";
		String[] a=s1.split(" ");
		Stack<String> s=new Stack<>();
		for(String x:a)
		{
			s.push(x);
			s.push(" ");
		}
		for(int i=0;i<s.size();i++)
		{
			System.out.print(s.pop());
		}
		
	}*/
	public static void main(String args[])
	{
		String s1="I Love Coding";
		char[] a=s1.toCharArray();
		int start=0;
		for(int end=0;end<a.length;end++)
		{
			if(a[end]==' ')
			{
				reverse1(a,start,end-1);
				start=end+1;
			}
		}
		reverse1(a,start,a.length-1);
		reverse1(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
	static void reverse1(char[]a,int low,int high)
	{
		while(low<=high)
		{
			char temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
	}
}