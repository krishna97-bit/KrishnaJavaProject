package StringPrograms;

public class CharCountInString
{
    public static void main(String[] args)
    {
        String a = "Krishna Indrale";
        int count = 0;

        for ( int i=0; i<a.length(); i++)
        {
            if(a.charAt(i) !=' ')
            {
              count++;
            }
        }

        System.out.println(count);


    }
}
