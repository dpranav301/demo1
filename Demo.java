public class Demo
{
    public static void main(String args[])
    {
       for(int row=1;row<=10;row++)
       {
           int c=row>5?10-row:row;
           for(int space=0;space<5-c;space++)
           {
               System.out.print(" ");
           }
           for(int col=c;col>=1;col--)
           {
               System.out.print(col+" ");
           }
           for(int col=2;col<=c;col++)
           {
               System.out.print(col+" ");
           }
           System.out.println();
       }
    }
}