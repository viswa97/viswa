import java.util.*;
class guvi16
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            for(int j=2;j<i;j++)
            {
            if(i%j==0)
            {
                c=0;
              break;
            }
            else
            {
                c=1;
            }
            }
           if(c==1)
           {
               System.out.print(i);
           }
        }
    }
}
