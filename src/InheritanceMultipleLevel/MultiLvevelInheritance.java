package InheritanceMultipleLevel;

public class MultiLvevelInheritance
{
    int a= 10;
    int b= 20;
    int c = 30;

    public void parentMethod1()
    {
        System.out.println("ParentMethod1");
        System.out.println("Sum of variables "+(a+b+c));
    }

    public void parentMethod2()
    {
        System.out.println("ParentMethod2");
        System.out.println("subtraction of variables "+(c-b-a));
    }

    public void parentMethod3()
    {
        System.out.println("ParentMethod3");
        System.out.println("Multiplication of variables "+(c*b*a));
    }
}

class ChildClass1 extends MultiLvevelInheritance
{
    int d = a*b;
    int e = a*c;

    public void childMethod1()
    {
        System.out.println("ChildMethod1");
        System.out.println(d);

    }

    public void childMethod2()
    {
        System.out.println("ChildMethod2");
        System.out.println(e);

    }

    public void childMethod3()
    {
        System.out.println("ChildMethod3");
        System.out.println(d+e);

    }
    public static void main(String[] args)
    {
        ChildClass1 ch1 = new ChildClass1();
        ch1.parentMethod1();
        ch1.parentMethod2();
        ch1.parentMethod3();
    }
}

class childClass2 extends ChildClass1
{
    public static void main(String[] args)
    {
        childClass2 ch2 = new childClass2();
        ch2.parentMethod1();
        ch2.childMethod2();
        ch2.parentMethod3();
        ch2.childMethod1();
        ch2.childMethod2();
        ch2.childMethod3();

    }

}
