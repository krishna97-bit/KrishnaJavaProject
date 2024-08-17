package SuperAndThisKeyWord;

class parentClass
{
    parentClass()
    {
        this(10);
        System.out.println("parentClass no argument constructor");
    }

    parentClass(int a)
    {
        this(10,20);
        System.out.println("parentClass 1 argument constructor");
    }

    parentClass(int a, int b)
    {
        this(10,20,30);
        System.out.println("parentClass 2 argument constructor");
    }

    parentClass(int a, int b, int c)
    {
        System.out.println("parentClass 3 argument constructor");
    }
}
public class ThisKeyWord extends parentClass
{
    public static void main(String[] args)
    {
        ThisKeyWord obb = new ThisKeyWord();




    }
}
