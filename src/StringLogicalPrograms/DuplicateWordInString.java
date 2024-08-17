package StringLogicalPrograms;

public class DuplicateWordInString
{
    public static void main(String[] args)
    {
        String a = "Krishna Indrale Krishna";
        // we have to divide our string multiple string in array formate

        String b[] = a.split(" ");

        for ( int i=0; i<b.length; i++)
        {
            for ( int j=i+1; j<b.length; j++)
            {
                if ( b[j].equals(b[i]))
                {
                    System.out.println("Duplicate word in string is "+b[i]);
                }
            }
        }


    }
}
