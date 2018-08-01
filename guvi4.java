import java.io.*;
import java.util.*;
class guvi4
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
            String s1=sc.nextLine();
            char a[]=s1.toCharArray();
            for(int i=0;i<a.length;i++)
            {
            if((a[i]>64&&a[i]<91)||(a[i]>96&&a[i]<123))
            {
                System.out.print("Alphabet");
            }
            else
            {
                System.out.print("no");
            }
        }
    }
}
        
