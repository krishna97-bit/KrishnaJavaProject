package Constructor;

public class defaultConstructor
{
    int a;
    String b;
    boolean c;

    // default constructor will initialise all the variables with its default values.
    // - by the use of object java directly call default constructor of that particular class
    public static void main(String[] args)
    {
        defaultConstructor dc = new defaultConstructor();
        System.out.println(dc.a);
        System.out.println(dc.b);
        System.out.println(dc.c);
    }

}
