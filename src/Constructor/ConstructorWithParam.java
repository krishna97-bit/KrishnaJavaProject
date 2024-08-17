package Constructor;

public class ConstructorWithParam
{
    ConstructorWithParam( int a, int b)
    {
        System.out.println("Constructor with param");
        System.out.println(a);
        System.out.println(b);
        int sum = a+b;
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        ConstructorWithParam cwp = new ConstructorWithParam(10,20);



    }
}
