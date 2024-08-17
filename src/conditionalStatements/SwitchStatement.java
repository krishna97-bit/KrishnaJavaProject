package conditionalStatements;

public class SwitchStatement {

    public static void main(String[] args) {

        int number  = 36;
        String shirtSize;

        switch (number)
        {
            case 28:
            shirtSize = " Extra Small";
            System.out.println("Size of shirt is "+shirtSize);
            break;

            case 30:
                shirtSize = "  Small";
                System.out.println("Size of shirt is "+shirtSize);
                break;

            case 32:
                shirtSize = " Medium";
                System.out.println("Size of shirt is "+shirtSize);
                break;

            case 34:
                shirtSize = "Large";
                System.out.println("Size of shirt is "+shirtSize);
                break;

            case 36:
                shirtSize = "Extra Large";
                System.out.println("Size of shirt is "+shirtSize);
                break;

            default:
                System.out.println("insert correct size ");


        }
    }
}
