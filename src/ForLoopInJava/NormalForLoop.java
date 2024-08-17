package ForLoopInJava;

public class NormalForLoop
{
    // print 1 to 10 nos by  using for loop

    public static void main(String[] args)
    {
        for ( int i=0; i<10; i++)
        {
            System.out.println(i);
        }

        int a[] = { 10,20,30,40,50,60,70,80,90,100};

        System.out.println("print all no in array by using for loop");

        for ( int j=0; j<a.length; j++)
        {
            System.out.print(a[j]+",");
        }

    }
}
