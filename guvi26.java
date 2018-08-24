import java.io.*;
import java.util.*;
class guvi26
{
    public static void main(String arg[])
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
    }
}

