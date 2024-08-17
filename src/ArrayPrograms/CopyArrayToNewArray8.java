package ArrayPrograms;

import java.util.Arrays;

public class CopyArrayToNewArray8 {

    public static void main(String[] args) {

        int[] OriginalArray = {10,20,30,40,50};

        int[]copyArray = new int[5];
        System.out.println(Arrays.toString(OriginalArray));

        for( int i=0; i<OriginalArray.length; i++)
        {
            copyArray[i] = OriginalArray[i];
        }

        System.out.println(Arrays.toString(copyArray));
    }
}
