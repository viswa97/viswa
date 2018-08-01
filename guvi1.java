import java.util.*;
class guvi1
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.print("positive");
        }
        else if(a<0)
        {
            System.out.print("negative");
        }
        else
        {
            System.out.print("zero");
        }
    }
}
