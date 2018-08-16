import java.util.*;
class guvi12
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        int n=a.length();
        for(int i=n-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
            if(b.equals(a))
            {
                System.out.print("palindrome");
            }
            else
            {
                System.out.print("not a palindrome");
            }
        }
    }
