package ArrayPrograms;

import java.util.Arrays;

public class RemoveArrayElement7 {

    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};
        System.out.println(Arrays.toString(a));
        int removeIndex = 2;

        for ( int i =removeIndex; i<a.length-1; i++ )
        {
            a[i] = a[i+1];
        }

        System.out.println(Arrays.toString(a));
    }
}
