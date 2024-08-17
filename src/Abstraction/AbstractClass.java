package Abstraction;

abstract class AbstractClass
{

    // abstract class contains abstract methods as well as non-abstract methods
    // In non-abstract class we can not declare abstract methods
    // for abstract class we can create object because method implementation in absent

    abstract void abstractMethod1();
    abstract void abstractMethod2();

    void nonAbstractMethod1()
    {
        System.out.println("Non Abstract method");
    }

}

// when we give implementation to all the abstract methods in Non-abstract class
class NonAbstractClass extends AbstractClass
{
    void abstractMethod1()
    {
        System.out.println("Abstract method 1");
    }

    void abstractMethod2()
    {
        System.out.println("Abstract method 2");
    }
}
