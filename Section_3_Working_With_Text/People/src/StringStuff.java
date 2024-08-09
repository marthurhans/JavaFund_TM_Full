import static java.lang.StringTemplate.STR;

public class StringStuff {

    public static void main(String[] args) {
        int age = 5;
        String name = "Terry";

        System.out.println("Hello my name is "
                + name + " and I am " + age + " years old.");
        System.out.printf("Hello my name is %s and I am %d years old.\n"
                , name, age);
        System.out.println(STR."Hello my name is \{name} and I am \{age} years old.");
    }
}
