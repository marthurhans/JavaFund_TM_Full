import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeopleMatching {

    public static void main(String[] args) {

        String people = """
                Flintstone, Fred, 1/1/1900
                Rubble, Barney, 2/2/1905
                Flintstone, Wilma, 3/3/1910
                Rubble, Betty, 4/4/1915
                """;

        String regex = "(?<lastName>\\w+)," +
                "\\s*(?<firstName>\\w+)," +
                "\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{2,4})\\n";
        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher((people));
        System.out.println();

        while (match.find()) {
            System.out.printf("%s %s %s%n", match.group("firstName"),
                    match.group("lastName"), match.group("dob"));
        }

        int i = 0;
        while(i <5) {
            System.out.println("Looping");
            i++;
        }
    }
}
