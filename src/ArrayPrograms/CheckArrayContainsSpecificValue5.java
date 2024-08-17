package ArrayPrograms;

public class CheckArrayContainsSpecificValue5 {

    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};

        for ( int i=0; i<a.length; i++)
        {
            if ( a[i] == 40)
            {
                System.out.println("Array contains 40 value");
            }


        }
    }
}
