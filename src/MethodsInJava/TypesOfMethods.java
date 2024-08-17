package MethodsInJava;

public class TypesOfMethods
{
    // 1) static method
    public static void staticMethod()
    {
        System.out.println("Print static method");
    }

    // 2) Non-static method
    public void nonStaticMethod()
    {
        System.out.println("Print Non-static method");
    }

    // 3) Method with arguments
    public void methodWithArguments(int a, int b)
    {
        int add = a+b;
        System.out.println(add);
    }

    //4) method with arguments but return type is not void
    public int method4(int a, int b)
    {
       int add = a+b;
       System.out.println(add);
       return add;
    }

    //5) method without arguments but return type is not void
    public int method5()
    {
        int a=100;
        int b=500;
        int c = b-a;
        System.out.println(c);
        return c;
    }




    public static void main(String[] args)
    {
        // call static method
        staticMethod();

        // call non-static method
        TypesOfMethods tom = new TypesOfMethods();
        tom.nonStaticMethod();

        // call method with arguments
        tom.methodWithArguments(10,20);

        // call method with arguments but return type is not void
        tom.method4(20,40);

        // call method without arguments but return type is not void
        tom.method5();



    }
}
