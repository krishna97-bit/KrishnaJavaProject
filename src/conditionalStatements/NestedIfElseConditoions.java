package conditionalStatements;

public class NestedIfElseConditoions {

    public static void main(String[] args) {

        int a = 50;
        int b= 20;
        int c= 5;
        int d = 20;

        if ( b>a)
        {
            System.out.println("b is greater than a");

            if ( a>c)
            {
                System.out.println("a is greater than c");

                if ( d>c)
                {
                    System.out.println("d is greater than c");
                }
            }
        }
        else
        {
            System.out.println("a is greater than b");
        }
    }
}
