package StringLogicalPrograms;

public class DuplicateCharInArray
{
    public static void main(String[] args)
    {
        String a = "krisnaindrale";
        // we have to convert our string into array
        char b[] = a.toCharArray();
        for ( int i=0; i<b.length; i++)
        {
            for ( int j=i+1; j<b.length; j++)
            {
                if(b[j] == b[i])
                {
                    System.out.println("Duplicate char in array is "+b[j]);
                }
            }
        }
    }
}
