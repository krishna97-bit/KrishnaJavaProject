package Operater;

public class logicaloperater {
    public static void main(String[] args) {


        // Logical operater
        // 1) And (&&)
        // 2) Or (||)
        // 3) Not (!)

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;



        // And

        // true + true = true
        // false + true = false
        // true + false = false
        // false + false = false

        boolean e = a>b && d>a;
        System.out.println(e);

        boolean f = a<b && d>a;
        System.out.println(f);

        boolean g = a<b && d<c;
        System.out.println(g);

        boolean h = a>b && d<c;
        System.out.println(h);

        // Or

        // true + true = true
        // false + true = true
        // true + false = true
        // false + false = false

        System.out.println("Or");

        boolean i = a>b || d>a;
        System.out.println(i);

        boolean j = a<b || d>a;
        System.out.println(j);

        boolean k = a<b || d<c;
        System.out.println(k);

        boolean l = a>b || d<c;
        System.out.println(l);

        // Not
        // ! true = false
        // ! false = true

        System.out.println("Not");
        boolean m = a<b;
        System.out.println(m);

        boolean n = !m;
        System.out.println(n);
    }
}
