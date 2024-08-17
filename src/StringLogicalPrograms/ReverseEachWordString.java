package StringLogicalPrograms;

public class ReverseEachWordString
{
    public static void main(String[] args)
    {
        String a = "krishna Indrale";

        String b[] = a.split(" ");

        String revserString ="";

        for ( int i=0; i<b.length; i++)
        {
            String word = b[i];
            String reverseWord = "";

            for ( int j=word.length()-1; j>=0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }

            revserString = revserString + reverseWord+" ";
        }

        System.out.println(revserString);

    }
}
