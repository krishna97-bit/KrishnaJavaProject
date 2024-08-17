package AccessModifier;

public class PublicClass2 extends PublicClass
{
    public static void main(String[] args)
    {
        PublicClass2 pc2 = new PublicClass2();
        // call public variables from one class to another class
        System.out.println(pc2.a);
        System.out.println(pc2.b);

        // call public methods from one class to another class
        pc2.publicSum();
        pc2.publicSub();
        pc2.publicMul();
        pc2.publicDiv();

    }
}
