import java.util.*;
class guvi15
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a+1;i<b;i++)
        {
            if(i%2==0)
            {
            System.out.print(i+" ");
            }
        }
    }
}
