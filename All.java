/*class Demo
{
    public static void main(String args[])
    {
        int n=4;
        int res=fact(n);
        System.out.println(res);
    }
    static int fact(int n)
    {
        if(n<=0)
        return 1;
        else
        return n*fact(n-1);
    }
}*/
/*class TrailingZero
{
    public static void main(String args[])
    {
        int num=25;
        int res=zero(num);
        System.out.println(res);
    }
    static int zero(int num)
    {
        int res=0;
        for(int i=5;i<=num;i=i*5)
        {
            res=res+num/i;
            
        }
        return res;
    }
}*/
/*class gcd
{
    public static void main(String args[])
    {
        int num1=6;
        int num2=3;
        int res=GCD(num1,num2);
        System.out.println(res);
    }
    static int GCD(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return a;
    }
}*/
/*class LCM
{
    public static void main(String args[])
    {
        int num1=10;
        int num2=20;
        int lcm=(num1*num2)/(gcd(num1,num2));
        System.out.println(lcm);
    }
    static int gcd(int a,int b)
    {
         while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return a;
    }
}*/
/*class Demo
{
    public static void main(String args[])
    {
        int num=0;
        if(prime(num))
        {
            System.out.println("Yes it is prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
    static boolean prime(int num)
    {
        if(num==0 || num==1)
        {
            return false;
        }
        if(num==2 || num==3)
        {
            return true;
        }
        if(num%2==0 || num%3==0)
        {
            return false;
        }
        for(int i=5;i*i<num;i=i+6)
        {
            if(num%i==0 || num%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }
}*/
/*class Divisor
{
    public static void main(String args[])
    {
        int num=30;
        div(num);
    }
    static void div(int num)
    {
        int i=1;
        for(i=1;i*i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
        for(;i>=1;i--)
        {
            if(num%i==0)
            {
                 System.out.println(num/i);
            }
        }
    }
}*/
/*class oddOcuur
{
    public static void main(String args[])
    {
        int[] a={4,4,7,4,8,7,7,8};
        int res=a[0];
        for(int i=1;i<a.length;i++)
        {
            res=res^a[i];
        }
        System.out.println(res);
    }
}*/
/*class Demo
{
    public static void main(String args[])
    {
        int n=3;
        toh(n,'A','B','C');
    }
    static void toh(int n,char A,char B,char C)
    {
        if(n==1)
        {
            System.out.println("Move 1 from "+A+" to "+C);
            return ;
        }
        toh(n-1,A,C,B);
         System.out.println("Move "+n+" from "+A+" to "+C);
         toh(n-1,B,A,C);
    }
}*/

/*class Demo
{
    public static void main(String args[])
    {
        int n=5;
        print(n);
    }
    static void print(int n)
    {
        if(n==1)
        {System.out.println(1);return ;}
        else
        {
           
            print(n-1);
             System.out.println(n);
        }
    }
}*/
/*class Demo
{
    public static void main(String args[])
    {
        int[] a={1,2,3,4,5,6,7,8};
        largest(a);
    }
    static void largest(int[] a)
    {
        int max=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[max])
            max=i;
        }
        System.out.println(a[max]);
    }
}*/

/*class Demo
{
    public static void main(String args[])
    {
        int[] a={1,2,3,4,5,6,7};
        small(a);
    }
    static void small(int[] a)
    {
        int res=-1;int largest=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<a[largest])
            {
                res=largest;
                largest=i;
            }
            else if(a[i]!=a[largest])
            {
                if(res==-1 || a[i]<a[res])
                {
                    res=i;
                }
            }
        }
        System.out.println("largest="+a[largest]);
        System.out.println("Smallest="+a[res]);
    }
}*/
/*class demo
{
    public static void main(String args[])
    {
        int[] a={1,2,3,4,5};
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
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
    }
}*/
/*import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        Integer[] a={1,2,3,4,5,6};
        List<Integer> al=Arrays.asList(a);
        Collections.reverse(al);
        a=al.toArray(new Integer[al.size()]);
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
}*/
/*class Demo
{
    public static void main(String args[])
    {
        int[] a={1,0,2,3,0,0,0,5,0};
        int res=a.length-1;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]!=0)
            {
                int temp=a[i];
                a[i]=0;
                a[res]=temp;
                res--;
            }
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
}*/
/*class Demo
{
    public static void main(String args[])
    {
        int[] a={1,2,3,4,5,56,7};
        rotate(a,3);
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
    static void rotate(int[] a,int d)
    {
        reverse(a,0,d-1);
        reverse(a,d,a.length-1);
        reverse(a,0,a.length-1);
    }
    static void reverse(int[] a,int low,int high)
    {
        while(low<high)
        {
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
    }
}*/
import java.util.*;
/*class Demo
{
    public static void main(String args[])
    {
        int a[]={1,5,3,8,2};
        int res=maxProfit(a,0,a.length-1);
        System.out.println(res);
    }
    static int maxProfit(int[] a,int start,int end)
    {
        if(end<=start)
        return 0;
        int profit=0;
        for(int i=start;i<end;i++)
        {
            for(int j=i+1;j<end;j++)
            {
                if(a[j]>a[i])
                {
                    int curr_profit=a[j]-a[i]+maxProfit(a,start,i-1)+maxProfit(a,j+1,end);
                    profit=Math.max(curr_profit,profit);
                }
            }
        }
        return profit;
    }
}*/

/*class Demo
{
    public static void main(String args[])
    {
        int[] a={1,5,3,8,2};
        int res=maxProfit(a,0,a.length-1);
        System.out.println(res);
    }
    static int maxProfit(int[] a,int start,int end)
    {
        if(end<=start)
        return 0;
        int profit=0;
        for(int i=start;i<end;i++)
        {
            for(int j=i+1;j<end;j++)
            {
                if(a[j]>a[i])
                {
                    int curr_profit=a[j]-a[i]+maxProfit(a,start,i-1)+maxProfit(a,j+1,end);
                    profit=Math.max(curr_profit,profit);
                }
            }
        }
        return profit;
    }
}*/

/*class Demo
{
    public static void main(String args[])
    {
        int[] a={3,0,1,2,5};
        int res=getWater(a);
        System.out.println(res);
    }
    static int getWater(int[] a)
    {
        int res=0;
        for(int i=1;i<a.length;i++)
        {
            int lmax=a[i];
            for(int j=0;j<i;j++)
            {
                lmax=Math.max(lmax,a[j]);
            }
            int rmax=a[i];
            for(int j=i+1;j<a.length;j++)
            {
                rmax=Math.max(rmax,a[j]);
            }
            res=res+(Math.min(lmax,rmax)-a[i]);
        }
        return res;
    }
}*/
/*class Demo
{
    public static void main(String args[])
    {
        int[] a={1,2,3};
        int res=getWater(a);
        System.out.println(res);
    }
    static int getWater(int[] a)
    {
        int res=0;
        for(int i=1;i<a.length;i++)
        {
            int lmax=a[i];
            for(int j=0;j<i;j++)
            {
                lmax=Math.max(lmax,a[j]);
            }
            int rmax=a[i];
            for(int j=i+1;j<a.length;j++)
            {
                rmax=Math.max(rmax,a[j]);
            }
            res=res+(Math.min(lmax,rmax)-a[i]);
        }
        return res;
    }
}*/
/*class Demo
{
    public static void main(String args[])
    {
        int[] left={1,2,4};
        int[] right={4,5,7};
        int res=freq(left,right);
        System.out.println(res);
    }
    static int freq(int[] left,int[] right)
    {
        int[] fre=new int[100];
        for(int i=0;i<left.length;i++)
        {
            for(int j=left[i];j<=right[i];j++)
            {
                fre[j]+=1;
            }
        }
        int res=0;
        for(int i=0;i<100;i++)
        {
            if(fre[i]>fre[res])
            {
                res=i;
            }
        }
        return res;
    }
}*/