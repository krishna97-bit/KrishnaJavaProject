package Inheritance;

public class ParentClasses
{
    int aa = 100;
public void parentMethod1()
{
    System.out.println(" Print parent method1");
    int a = 20;
    int b = 10;
    if (a > b)
    {
        System.out.println(" a is grater than b");
    }

}

public void parentMethod2()
{
    System.out.println(" Print parent method2");
    int c = 200;
    int d = aa+c;
    System.out.println(d);

}
}

class ChildClass1 extends ParentClasses
{
    int p = 10;
    int q = 20;
    int r = 30;
    public void maximumValue()
    {
        if (p > q && p > r)
        {
            System.out.println(" p value is maximum");
        }
        else if ( q>p && q>r)
        {
            System.out.println(" q value is maximum");
        }
        else
        {
            System.out.println(" r value is maximum");
        }
    }
    public static void main(String[] args) {

        ChildClass1 ch1 = new ChildClass1();
        System.out.println(ch1.aa);
        ch1.parentMethod1();
        ch1.parentMethod2();


    }
}

class ChildClass2 extends ChildClass1
{
    public static void main(String[] args)
    {
        ChildClass2 ch2 = new ChildClass2();
        System.out.println(" Print maximum values");
        ch2.maximumValue();
        ch2.parentMethod1();
        ch2.parentMethod2();

    }

}
