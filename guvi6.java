import java.util.*;
class guvi6
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         if (a%4!=0)
         {
              System.out.print("no");
         }
         else if (a%400==0) 
         {
              System.out.print("yes");
              }
              else if (a%100==0)
              {
                   System.out.print("no");
              }
              else
              {
                   System.out.print("yes");
              }
    }
}
  
