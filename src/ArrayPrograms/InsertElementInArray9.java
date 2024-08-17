package ArrayPrograms;

import java.util.Arrays;

public class InsertElementInArray9 {

    public static void main(String[] args) {

        int[] a = {10,20,30,40,50};

        int indexPosition = 2;
        int newValue = 15;

        System.out.println(Arrays.toString(a));

       for ( int i=a.length-1; i>=indexPosition; i--)
       {
           a[i] = a[i-1];
       }

       a[indexPosition] = newValue;

       System.out.println(Arrays.toString(a));


    }
}
