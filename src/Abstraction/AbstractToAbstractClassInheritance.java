package Abstraction;

public class AbstractToAbstractClassInheritance
{

}

abstract class class1
{
    abstract void method1();
    abstract void method2();
    abstract void method3();
}

abstract class class2 extends class1
{
    void method1()
    {
        System.out.println("abstract method 1");
    }

    void method2()
    {
        System.out.println("abstract method 2");
    }

    abstract void method4();
}

class NonAbstract extends class2
{
    void method3()
    {
        System.out.println("abstract method 3");
    }

    void method4()
    {
        System.out.println("abstract method 4");
    }

    public static void main(String[] args)
    {
        NonAbstract NonAb = new NonAbstract();
        NonAb.method1();
        NonAb.method2();
        NonAb.method3();
        NonAb.method4();


    }
}