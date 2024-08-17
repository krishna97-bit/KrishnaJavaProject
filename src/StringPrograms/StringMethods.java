package StringPrograms;

public class StringMethods
{
    public static void main(String[] args)
    {
        String a = "krishna";
        String b = "KRISHNA";

        //String Methods
        //1) equal method
        System.out.println(a.equals(b));

        //2) equal ignore case
        System.out.println(a.equalsIgnoreCase(b));

        //3) length
        System.out.println(a.length());

        //4) char at
        System.out.println(a.charAt(3));

        //5) index of
        System.out.println(a.indexOf('s'));

        //6) String starting with
        System.out.println(a.startsWith("k"));

        //7) String ending with
        System.out.println(a.endsWith("a"));

        //8) substring staring with
        System.out.println(a.substring(4));

        //9) substring start and end with
        System.out.println(a.substring(2,7));

        // 10) Trim
        // remove extra spaces
        String c = " krishna Indrale ";
        System.out.println(c.trim());

        // 11) concat
        // it will connect 2 string in single string
        System.out.println(a.concat(c));

        //12) To char array
        // it will convert our string in to char array
        char p[] = a.toCharArray();
        System.out.println(p[0]);
        System.out.println(p[2]);
        System.out.println(p[4]);
        System.out.println(p[6]);

        //13) spilt
        // it will convert out string in to string array
        String d = "Krishna Indrale";
        String q[] = d.split(" ");
        System.out.println(q[0]);
        System.out.println(q[1]);

        //14) Upper case
        System.out.println(a.toUpperCase());

        //15) lower case
        System.out.println(b.toLowerCase());





    }
}
