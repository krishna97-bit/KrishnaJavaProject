package AccessModifier;

 class PrivateAccessModifier
{
    private int a = 1;
    private int b=2;

    private void privateSum()
    {
        int sum = a+b;
        System.out.println(sum);
    }

    private void privateSub()
    {
        int sub = b-a;
        System.out.println(sub);
    }

    private void privateMul()
    {
        int mul = b*a;
        System.out.println(mul);
    }

    private void privateDiv()
    {
        int div = b/a;
        System.out.println(div);
    }
}

class extendsPrivateClass extends PrivateAccessModifier
{
    public static void main(String[] args)
    {
        extendsPrivateClass privateMethods = new extendsPrivateClass();
        // we can not extend private class methods and variables from one class to another class

        PublicExtendedClass pec = new PublicExtendedClass();
        System.out.println("Public methods");
        pec.publicSum();
        pec.publicSub();
        pec.publicMul();
        pec.publicDiv();

        extendDefaultClass defaultMethods = new extendDefaultClass();
        System.out.println("Default methods");
        defaultMethods.defaultSum();
        defaultMethods.defaultSub();
        defaultMethods.defaultMul();
        defaultMethods.defaultDiv();

        extendsProtectedClass protectedMethods = new extendsProtectedClass();
        System.out.println("Protected methods");
        protectedMethods.protectedSum();
        protectedMethods.protectedSub();
        protectedMethods.protectedMul();
        protectedMethods.protectedDiv();


    }



}
