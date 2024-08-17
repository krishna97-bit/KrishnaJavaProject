package AccessModifier;

 class ProtectedAccessModifier
{
    protected  int a = 1000;
    protected  int b = 1000;

    protected  void protectedSum()
    {
        int sum = a+b;
        System.out.println(sum);
    }

    protected  void protectedSub()
    {
        int sub = b-a;
        System.out.println(sub);
    }

    protected  void protectedMul()
    {
        int mul = a*b;
        System.out.println(mul);
    }

    protected  void protectedDiv()
    {
        int div = b/a;
        System.out.println(div);
    }
}

class extendsProtectedClass extends ProtectedAccessModifier
{
    public static void main(String[] args)
    {
        extendsProtectedClass protectedMethods = new extendsProtectedClass();
        System.out.println("Protected methods");
        protectedMethods.protectedSum();
        protectedMethods.protectedSub();
        protectedMethods.protectedMul();
        protectedMethods.protectedDiv();


        extendDefaultClass defaultMethods = new extendDefaultClass();
        System.out.println("Default methods");
        defaultMethods.defaultSum();
        defaultMethods.defaultSub();
        defaultMethods.defaultMul();
        defaultMethods.defaultDiv();

        PublicClass publicMethods = new PublicClass();
        System.out.println("public methods");
        publicMethods.publicSum();
        publicMethods.publicSub();
        publicMethods.publicMul();
        publicMethods.publicDiv();

    }
}
