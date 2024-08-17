package ForLoopInJava;

public class DiamondStarPattern {

    public static void main(String[] args)
    {
        for ( int a=0; a<=5; a++)
        {
            for ( int b=5; b>a; b--)
            {
                System.out.print(" ");
            }

            for ( int c=0; c<=a; c++)
            {
                System.out.print(" *");
            }

            System.out.println();
        }

        for ( int d=0; d<=5; d++)
        {
            for ( int e=0; e<=d; e++)
            {
                System.out.print(" ");
            }

            for ( int f=5; f>d; f--)
            {
                System.out.print(" *");
            }

            System.out.println();
        }

    }
}
