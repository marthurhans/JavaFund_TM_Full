import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Ex. 1");
        String tester = "Dark";
        String tester2 = "bark";
        String tester3 = "Lark";
        String tester4 = "stark";

        String regex1 = "\\w+ark";

        System.out.println(tester.matches(regex1));
        System.out.println(tester2.matches(regex1));
        System.out.println(tester3.matches(regex1));
        System.out.println(tester4.matches(regex1));
        System.out.println();

        //MARTIN SOLUTIONS:
        /*
        String regex = "[DbL]ark"; //only allows "D","b","L"
        String regex2 = "(St|[DbL])ark"; // Exercise 1.1 extra challenge
                Allows "St" - OR - "D","b","L"  ---> bitwise or ---> |
        */

        System.out.println("Ex. 2");
        String magic = "Abracadabra";
        String magicBad = "Agracadagra";

        String regex2 = "A[bg]racada(\\w)ra";
        // MARTINS
        //String regex2 = "A([bg])racada\\1ra"; This would prevent matching Abracadagra - for example

        Pattern pat = Pattern.compile(regex2, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat = pat.matcher(magic);
        Matcher matBad = pat.matcher(magicBad);

        System.out.println(mat.matches());
        System.out.println(matBad.matches());
        System.out.println();

        System.out.println("Ex. 3");
        System.out.println("To use parentheses for grouping without capturing?");
        System.out.println("        (?[find this pattern but DONT capture this!])");
        System.out.println();

        System.out.println("Ex. 4");
        String address = "9 Locust Ct., Maple Shade,   NJ 08052-1111";
        String regex4 = "(?<street>.*?),\\s+(?<city>.*?),\\s*(?<state>\\w{2})\\s*(?<zip>\\d{5} | \\d{5}[\\W]\\d{4})";

        Pattern pat2 = Pattern.compile(regex4, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat2 = pat2.matcher(address);

        if (mat2.matches()) {
            System.out.println(mat2.group("street"));
            System.out.println(mat2.group("city"));
            System.out.println(mat2.group("state"));
            System.out.println(mat2.group("zip"));
        }
        System.out.println();

        /*
        * Martin Answer
        * String regex = "(?<streetNum>\\d+)\\s+(?<streetName>.*?),\\s*(?<city>.*?),\\s*(?<state>[A-Z]{2})\\s*(?<zip>\\d{5})";
        * */

        System.out.println("Ex. 5");
        String email = "m.hans@yardsbrewing.com";
        String regex5 = "(?<first>.*?)\\.(?<last>.*?)@(?<domain>.*?)\\.(?<top>.*?)";

        Pattern pat5 = Pattern.compile(regex5, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat5 = pat5.matcher(email);

        if (mat5.matches()) {
            System.out.println(mat5.group("first"));
            System.out.println(mat5.group("last"));
            System.out.println(mat5.group("domain"));
            System.out.println(mat5.group("top"));
        }

        /*
        MARTINS -
            String email = "jerry.seinfeld@jokes.nbc.com";
            String regex = "\\w+\\.?\\w*@(\\w+\\.)+\\w+"; // allows for jokes.com or jokes.blah.com or jokes.blah.blah.com, etc.
        * */


    }
}