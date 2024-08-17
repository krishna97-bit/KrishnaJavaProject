package AccessModifier;

 class DefaultClass {

     int a= 100;
     int b=200;

     void defaultSum ()
     {
         int sum = a+b;
         System.out.println(sum);
     }
     void defaultSub()
     {
         int sub = b-a;
         System.out.println(sub);
     }
     void defaultMul()
     {
         int mul = a*b;
         System.out.println(mul);
     }
     void defaultDiv()
     {
         int div = b/a;
         System.out.println(div);
     }

}

class extendDefaultClass extends DefaultClass
{
    public static void main(String[] args)
    {
        extendDefaultClass defaultMethods = new extendDefaultClass();
        defaultMethods.defaultSum();
        defaultMethods.defaultSub();
        defaultMethods.defaultMul();
        defaultMethods.defaultDiv();

        PublicClass publicMethods = new PublicClass();
        publicMethods.publicSum();
        publicMethods.publicSub();
        publicMethods.publicMul();
        publicMethods.publicDiv();



    }
}
