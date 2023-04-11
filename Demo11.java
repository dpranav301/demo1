import java.util.*;
class Demo11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			
			if(n%i!=0)
			{
				System.out.println("Not Prime Number");
				break;
			}
			else
			{
				System.out.println("Prime Number");
				break;
			}
		}
		if(n==0)
			{
				System.out.println("Not Prime Number");
				break;
			}
		
		
	}
}