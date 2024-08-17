package Constructor;

public class ConstructorWithoutParam
{
    ConstructorWithoutParam()
    {
        System.out.println("Constructor without param");
        int a=10;
        int b=20;
        System.out.println(a);
        System.out.println(b);
        int sum = a+b;
        System.out.println(sum);
    }


    public static void main(String[] args)
    {
        ConstructorWithoutParam CWOP = new ConstructorWithoutParam();

    }

}
