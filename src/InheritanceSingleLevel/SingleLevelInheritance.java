package InheritanceSingleLevel;

public class SingleLevelInheritance {

    int a= 10;
    int b= 20;

    public void parentMethod1()
    {
        System.out.println("Print parent method1");
        int c = a+b;
        System.out.println(c);
    }

    public void parentMethod2()
    {
        System.out.println("Print parent method2");
        int p = 100;
        int q = 200;
        if (q > p) {
            System.out.println(" q is greater than p");
        }
    }

        public void parentMethod3()
        {
            System.out.println("Print parent method2");
            System.out.println(a);
            System.out.println(b);
        }
}

 class ChildClass1 extends SingleLevelInheritance{

    public static void main(String[] args)
    {
        ChildClass1 ch1 = new ChildClass1();
        ch1.parentMethod1();
        ch1.parentMethod2();
        ch1.parentMethod3();

    }


}
