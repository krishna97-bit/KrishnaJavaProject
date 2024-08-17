package Array;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50,60,70,80,90,100};

        for ( int i=a.length-1; i>=0; i--)
        {
            System.out.print(a[i]+",");
            System.out.println("reverse String");
        }

    }
}
