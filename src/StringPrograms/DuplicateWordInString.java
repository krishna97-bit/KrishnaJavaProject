package StringPrograms;

public class DuplicateWordInString
{
    public static void main(String[] args)
    {
        String a = "Krishna Indrale Krishna";

        String b[] = a.split(" ");

        for ( int i=0; i<b.length; i++)
        {
            for ( int j=i+1; j<b.length; j++)
            {
                if ( b[j].equals(b[i]))
                {
                    System.out.println("Duplicate word in string is "+b[j]);
                }
            }
        }
    }
}
