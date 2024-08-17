package Operater;

public class ArithmaticalOperaters {

    // Arithmatical Operaters
    // 1) Additions
    // 2) subtraction
    // 3) multiplication
    // 4) division
    // 6) incremental increase
    // 7 ) Decremental decrease

    public static void main(String[] args) {

      // additions
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        // subtraction
        int d =  b-a;
        System.out.println(d);

        // multiplication
        int e = a*b;
        System.out.println(e);
        // division
        int f = b/a;
        System.out.println(f);

        // pre incremental increase

        System.out.println(++a);

        // post incremental increase

        System.out.println(b++);
        System.out.println(b);

        int x= 100;
        int y = 200;

        // pre decremental decrease
        System.out.println(++x);

        // post decremental decrease

        System.out.println(y++);
        System.out.println(y);



    }
}
