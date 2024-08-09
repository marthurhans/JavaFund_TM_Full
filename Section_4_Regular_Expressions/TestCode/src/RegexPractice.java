import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    public static void main(String[] args) {
        sl();
        System.out.println("Cat".matches("[cC]at"));
        System.out.println("\\RACEWAY\\");
        sl();

        String phoneRegex = """
                #This REGEX parses phone numbers
                (?:(?<countryCode>\\d{1,2})[-.,\\s]?)? # gets country code
                (?:\\(?(?<areaCode>\\d{3})\\)?[-.,\\s]?) # gets area code
                (?:(?<exchange>\\d{3})[-.,\\s]?) # gets exchange
                (?<lineNumber>\\d{4}) # gets line number
                """;
        String phoneNumber = "333.444.5555";

        System.out.println(phoneNumber.matches(phoneRegex));

        Pattern pat = Pattern.compile(phoneRegex, Pattern.COMMENTS);
        Matcher mat = pat.matcher(phoneNumber);
        //more formal way of doing the above (behind-the-scenes walkthrough)

        if(mat.matches()) {
            System.out.format("Country code: %s\n",mat.group("countryCode"));
            System.out.format("Area code: %s\n", mat.group("areaCode"));
            System.out.format("Exchange: %s\n", mat.group("exchange"));
            System.out.format("Line number: %s\n", mat.group("lineNumber"));
        }

    }

    public static void sl() {
        System.out.println();
    }

}
