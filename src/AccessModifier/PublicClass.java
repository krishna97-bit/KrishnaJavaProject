package AccessModifier;

public class PublicClass
{
    public int a =10;
    public int b=20;


    public void publicSum()
    {
        int sum = a+b;
        System.out.println(sum);
    }

    public void publicSub()
    {
        int sub = b-a;
        System.out.println(sub);
    }

    public void publicMul()
    {
        int mul = a*b;
        System.out.println(mul);
    }

    public void publicDiv()
    {
        int div = b/a;
        System.out.println(div);
    }

}

 class PublicExtendedClass extends PublicClass
{
    public static void main(String[] args)
    {
        PublicExtendedClass pec = new PublicExtendedClass();
        pec.publicSum();
        pec.publicSub();
        pec.publicMul();
        pec.publicDiv();
    }

}


