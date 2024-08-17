package ArrayPrograms;

public class MaximumAndMinimumValues10 {

    public static void main(String[] args) {

        int[] a= {45,76,65,67,93,54,87,12,77,43,79};

        int max = a[0];
        int min = a[0];

        //Minimum value in the given array
        for ( int i=0; i<a.length; i++)
        {
            if ( a[i] <min )
            {
                min = a[i];
            }
        }
        System.out.println("Minimum value in the given array "+min);

        // Maximum value in the given array

        for ( int j=0; j<a.length; j++)
        {
            if (a[j] >max)
            {
                max = a[j];
            }
        }

        System.out.println("Maximum value in the given array "+max);
    }
}
