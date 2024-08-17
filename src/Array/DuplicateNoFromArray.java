package Array;

public class DuplicateNoFromArray
{
    public static void main(String[] args)
    {
        int a[] = { 10,14,47,78,89,96,63,32,25,85,45,10,63,1,5,7,9,3};

        for ( int i=0; i<a.length; i++)
        {
            for ( int j=i+1; j<a.length; j++)
            {
                if(a[j] == a[i])
                {
                    System.out.println("Duplicate no's from array is "+a[i]);
                }
            }
        }

    }
}
