package conditionalStatements;

public class LadderIfElseConditions {

    public static void main(String[] args) {

        int a= 100;
        int b=200;
        int c=300;
        int d= 400;

        if ( a>b && a>c && a>d)
        {
            System.out.println(" A is maximum value ");
        }

        else if ( b>a && b>c && b>d)
        {
           System.out.println(" B is maximum value");
        }

        else if ( c>a && c>b && c>d)
        {
            System.out.println(" c is maximum vale ");
        }

        else
        {
            System.out.println(" D is maximum value");
        }
    }
}
