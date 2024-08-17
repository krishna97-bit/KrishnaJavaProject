package SuperAndThisKeyWord;

class A
{
    A()
    {
        System.out.println("No Arguments parent class constructor");
    }

    A(int a, int b)
    {   this("java");
        int sum = a+b;
        System.out.println("2 Arguments parent class constructor");
    }

    A(String a)
    {   this();
        System.out.println("String Argument parent class constructor");
    }
}


public class SuperKeyWord extends A
{
    SuperKeyWord()
    { super(10,20);
        System.out.println("No Arguments child class constructor");
    }

    SuperKeyWord( int p, int q)
    {
        int sum = p+q;
        System.out.println("2 int Arguments child class constructor");
    }

    SuperKeyWord ( char o)
    {
        System.out.println("1 char Arguments child class constructor");
    }


    public static void main(String[] args)
    {
        System.out.println("Execution with no argument object");
        SuperKeyWord SuperKey = new SuperKeyWord();


    }

}
