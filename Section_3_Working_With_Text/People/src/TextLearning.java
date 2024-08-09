public class TextLearning {

    public static void main(String[] args) {
        //Java Foundations UDEMY 41
        String text = """
                Smith,Fred,1/1/79,1111 ABC St.,Apple,CA
                Mick,Jerry,2/2/80,2222 DEF St.,Orange,NV
                Flinstone,Fred,3/3/81,3333 GHI St.,Pear,NV
                Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL
                Jetson,George,5/5/83,6666 MNO St.,Grapefruit,NV
                """;

        String[] people = text.split("\n", 5);
        System.out.println(people.length);
        System.out.println(people[2]);
        String[] george = people[2].split(",");
        System.out.println(george[3]);
    }
}
