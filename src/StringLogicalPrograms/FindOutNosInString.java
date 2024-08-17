package StringLogicalPrograms;

public class FindOutNosInString
{
    public static void main(String[] args)
    {
        String a = "Krishna1997Indrale";
        // WAP to print only no's in the string

        String numbers = a.replaceAll("[^0-9]","");
        System.out.println(numbers);


        // WAP to print only char's in the string

        String chars = a.replaceAll("[0-9]","");
        System.out.println(chars);

    }
}
