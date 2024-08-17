package StringPrograms;

public class RemoveAllNosInString
{
    public static void main(String[] args)
    {
        String a = "Krishna1997Indrale";

        // print only no's in given string
        String number = a.replaceAll("[^0-9]","");
        System.out.println("Number present in string is "+number);

        // print only String without no's
        String character  = a.replaceAll("[0-9]","");
        System.out.println(character+" ");

        // print only char in string

        char b[] = a.toCharArray();

        for ( int i=0; i<b.length; i++)
        {
            char ch = a.charAt(i);
            if ( Character.isLetter(ch))
            {
               System.out.println(b[i]);
            }
        }

    }
}
