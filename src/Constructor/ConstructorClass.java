package Constructor;

public class ConstructorClass
{
    //non-static method
     void test1()
     {
         System.out.println("Print method1");
     }
     //  static method
      static void test2()
     {
         System.out.println("Print method1");
     }

     // method with arguments
     int test3(int a, int b)
     {
         int c = a+b;
         System.out.println("Sum of arguments");
         System.out.println(c);
         return c;
     }

    ConstructorClass()
    {
        System.out.println("Print constructor");
    }


    public static void main(String[] args)
    {
        // for calling non-static methods and constructor we have to create object of class
        ConstructorClass cc = new ConstructorClass();
        cc.test1();
        cc.test3(10,20);

        // Calling static methods
        test2();

    }


}
