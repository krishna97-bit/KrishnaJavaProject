package ArrayPrograms;

public class AverageValueOfArray4 {

    public static void main(String[] args) {

        int a[] = { 10,20,30,40,50};
        int sum=0;
        int avg = 0;

        for ( int i=0; i<a.length; i++)
        {
            sum = sum+a[i];
            avg = sum/a.length;
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
