package Constructor;

class A
{
    A()
    {
        System.out.println("Default constructor of class A");
    }

    A(int a, int b)
    {
        System.out.println("Constructor with param  of class A");
        int sum = a+b;
        System.out.println(sum);
    }
}


class B extends A
{
    B()
    {
        System.out.println("Default constructor of class B");
    }

}


public class ConstructorChaining  extends B
{
    ConstructorChaining()
    {
        System.out.println("Default constructor of Chaining class");
    }

    public static void main(String[] args)
    {
        ConstructorChaining CC = new ConstructorChaining();

    }
}
