package InheritanceHerarchical;

public class HerarchicalInheritance
{
    int[] a = {10,20,30,40,50,60,70,80,90,100};
    char[] b = {'J','A','V','A'};

    public void NoArray()
    {
        for ( int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+",");
        }
    }

    public void CharArray()
    {
        for (int j=0; j<b.length; j++)
        {
            System.out.print(b[j]+",");
        }
    }
}

class ChildClass1 extends HerarchicalInheritance
{
    public static void main(String[] args)
    {
        ChildClass1 ch1 = new ChildClass1();
        ch1.NoArray();
    }
}

class ChildClass2 extends HerarchicalInheritance
{
    public static void main(String[] args)
    {
        ChildClass2 ch2 = new ChildClass2();
        ch2.CharArray();
    }
}
