import java.util.*;
class guvi17
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,c=0;
       int d=a;
        while(a>0)
        {
            b=a%10;
            a=a/10;
            c=c+(b*b*b);
        }
        if(d==c)
        {
        System.out.print("armstrong");
        }
        else
        {
            System.out.print("not a armstrong");
        }
        }
}
