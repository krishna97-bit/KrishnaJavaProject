package StringPrograms;

public class DuplicateCharAtString
{
    public static void main(String[] args)
    {
        String a = "krishnaindrale";
        int Count = 0;

        char b[] = a.toCharArray();

        for ( int i=0; i<b.length; i++)
        {
            for ( int j=i+1; j<b.length; j++)
            {
                if ( b[j] == b[i])
                {
                    System.out.println("Duplicate Char form given String is "+b[j]);
                    Count++;
                }
            }
        }

        System.out.println(Count);
    }
}
