package Array;

public class MaximumAndMinimumNoInArray
{

    public static void main(String[] args)
    {
        int a[] = { 10,14,47,78,89,96,63,32,25,85,45,10,63,1,5,7,9,3};
        int max = a[0];
        int min = a[0];

        // maximum no from array
        for ( int i=0; i<a.length; i++)
        {
            if ( a[i] > max)
            {
                max = a[i];
            }
        }

        System.out.println("Maximum no from give array is "+max);


        // Minimum no from arrray
        for ( int j=0; j<a.length; j++)
        {
            if ( a[j] < min)
            {
                min = a[j];
            }
        }

        System.out.println("Minimum value from given array is "+min);

    }
}
