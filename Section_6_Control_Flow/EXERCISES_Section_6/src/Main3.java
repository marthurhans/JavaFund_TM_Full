import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

    public static void main(String[] args) {
        String addresses = """
                12345 First Street, First City, AA 90210
                22222 Second Street, Second City, BB 22222
                33333 Third Street, Third City, CC 33333
                44444 Fourth Street, Fourth City, DD 44444
                55555 Fifth Street, Fifth City, EE 55555
                66666 Sixth Street, Sixth City, FF 66666
                77777 Seventh Street, Seventh City, GG 77777
                88888 Eighth Street, Eighth City, HH 88888
                99999 Ninth Street, Ninth City, II 99999
                00000 Tenth Street, Tenth City, JJ 00000
                """;

        String regex = "^(?<address>.*?),\\s*(?<city>.*?)\\s*(?<state>\\w{2})\\s*(?<postal>\\d{5})$";
    Pattern pat = Pattern.compile(regex, Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher match = pat.matcher((addresses));
        System.out.println();

        while (match.find()) {
            System.out.printf("%s %s %s %s%n", match.group("address"),
                    match.group("city"), match.group("state"), match.group("postal"));
        }

    }



}
