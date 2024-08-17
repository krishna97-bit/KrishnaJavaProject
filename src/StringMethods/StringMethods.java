package StringMethods;

public class StringMethods
{
    public static void main(String[] args)
    {
        String a = "krishna";
        String b = "KRISHNA";

        // 1) equal case
        System.out.println(a.equals(b));

        // 2) equal ignore case
        System.out.println(a.equalsIgnoreCase(b));

        // 3) upper case
        System.out.println(a.toUpperCase());

        // 4) lower case
        System.out.println(b.toLowerCase());

        // 5) length
        System.out.println(a.length());

        // 6) char at
        System.out.println(a.charAt(4));

        // 7) index of
        System.out.println(a.indexOf('h'));

        // 8 ) String starting from
        System.out.println(a.startsWith("k"));

        // 9) String end with
        System.out.println(a.endsWith("a"));

        // 10) Substring start with
        System.out.println(a.substring(3));

        // 11) Substring start and end with
        System.out.println(a.substring(2,6));

        // 12 ) trim
        String c = " Krishna Indrale ";
        System.out.println(c.trim());

        // 13 ) concat
        System.out.println(c.concat(a));

        // 14 ) split
         String d[] = a.split("");
         System.out.println(d[0]);
        System.out.println(d[2]);
        System.out.println(d[4]);
        System.out.println(d[6]);

        String e[] = c.split(" ");
        System.out.println(e[0]);
        System.out.println(e[1]);
        System.out.println(e[2]);

        // 15) to char array

        char f[] = a.toCharArray();
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[3]);
        System.out.println(f[5]);


    }
}
