public class LearnStrings {

    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple";
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        System.out.println(fruit == anotherFruit);
        System.out.println(vegetable == anotherVegetable);

        String myText = "abcdefg";
        System.out.println(myText.toUpperCase());

        String myText2 = "ABCDEFG";
        System.out.println(myText2.toLowerCase());

        String myText3 = "";
        System.out.println(myText3.isEmpty());
        System.out.println(myText3.isBlank());

        String myText4 = "This Fuck is my fuck text!";
        System.out.println(myText4.replace("fuck", "funky"));
        System.out.println(myText4.replace('t','Z'));

        String firstName = "   Jake   ";
        System.out.format("'%s'", firstName.strip());
        System.out.format("'%s'", strip(firstName));
        System.out.println();

        String multiLineTextBlock = """
                aaaa
                bbbb
                cccc
                """;
        System.out.println(multiLineTextBlock);

        //Java Foundations UDEMY 34
        String myText5 = "Apples";
        System.out.println(myText5.charAt(3));
        System.out.println();

        //Java Foundations UDEMY 35
        String firstWord = "Apple";
        String secondWord = "Canada";
        String thirdWord = "apple";

        System.out.println(firstWord.compareTo(secondWord));
        System.out.println(secondWord.compareTo(firstWord));
        System.out.println(firstWord.compareTo(thirdWord));
        System.out.println(firstWord.compareToIgnoreCase(thirdWord));
        System.out.println("Using my method: " + compareTo(firstWord,thirdWord));

        //Java Foundations UDEMY 36
        String myText6 = "Four score and seven years ago";
        System.out.println(myText6.contains("seven"));

        //Java Foundations UDEMY 37
        String text1 = "This is my text1";
        String text2 = "This is my text2";
        System.out.println(text1 + "! " + text2 + "! " );
        System.out.println(text1.concat(text2));
        System.out.println("my string literal: ".concat(text1));
        String finalString = new StringBuilder(text1.length() + text2.length() + 1)
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        System.out.println(finalString);
        System.out.format("%s %s\n", text1, text2);
        String oneMoreString = String.format("%s %s", text1, text2);
        System.out.println(oneMoreString);
        System.out.println();

        //Java Foundations UDEMY 38
        myText6 = "Four score and seven years ago";
        System.out.println(myText6.length());
        myText = "for";
        char[] chars = myText.toCharArray();
        int index = (int)(Math.floor(Math.random()*5));
        System.out.println(index);
        if (index < myText.length()) {
            System.out.println(chars[index]);
        }
        System.out.println();

        //Java Foundations UDEMY 39
        myText = "apple";
        System.out.println(myText);
        String myNewText = myText.substring(0);
        myNewText = myText.substring(0,1)
                .toUpperCase()
                + myText.substring(1);
        String myNewTextConcat = myText.substring(0,1)
                .toUpperCase()
                .concat(myText.substring(1));
        System.out.println(myNewTextConcat);
        System.out.println(myText.substring(0,2));
        String myNewTextSB = new StringBuilder()
                .append(myText.substring(0,1).toUpperCase())
                .append(myText.substring(1))
                .toString();
        System.out.println(myNewTextSB);
        String myNewTextSB2 = new StringBuilder((myText.substring(0,1).toUpperCase()))
                .append(myText.substring(1))
                .toString();
        System.out.println(myNewTextSB2);

        //Java Foundations UDEMY 40
        myText = "Four score and seven years ago";
        System.out.println(myText.indexOf("seven"));
        myText = "ABCDEFGABCDEFG";
        System.out.println(myText.indexOf(67));
        System.out.println(myText.lastIndexOf("A"));
        System.out.println(myText.indexOf("A", 2));

        String phoneNumber = "(234) 333-5551";
        int indexAreaCode = phoneNumber.indexOf("(");
        int indexExchange = phoneNumber.indexOf(" ");
        int indexLineNumber = phoneNumber.indexOf("-");

        System.out.println(indexAreaCode);
        String areaCode = phoneNumber.substring(indexAreaCode+1, indexAreaCode+4);
        String exchange = phoneNumber.substring(indexExchange+1, indexExchange+4);
        String lineNumber = phoneNumber.substring(indexLineNumber+1);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);
        System.out.println();

        System.out.println(parseAreaCode(phoneNumber));
        System.out.println(parseExchange(phoneNumber));
        System.out.println(parseLineNumber(phoneNumber));

        //Java Foundations UDEMY 42
        String fileName = "   file001.txt".strip();
        System.out.println(fileName.endsWith(".txt"));
        System.out.println(fileName.startsWith("file"));


        //Java Foundations UDEMY 43
        System.out.println();
        String firstString = "Apple";
        String secondString = "Apple";
        StringBuffer thirdString = new StringBuffer("Apple");

        System.out.println(firstString.contentEquals(secondString));
        System.out.println(firstString.equals(secondString));

        System.out.println(firstString.contentEquals(thirdString));
        System.out.println(firstString.equals(thirdString));




    }

    //UDEMY 33
    public static String strip(String text) {
        return text.replace(" ","");
    }



    //UDEMY 35
    public static int compareTo(String first, String second) {
        return first.toLowerCase().compareTo(second.toLowerCase());
    }



    //UDEMY 40
    public static String parseAreaCode(String phoneNumber) {
        int indexAreaCode = phoneNumber.indexOf("(");
        return phoneNumber.substring(indexAreaCode+1, indexAreaCode+4);
    }

    public static String parseExchange(String phoneNumber) {
        int indexExchange = phoneNumber.indexOf(" ");
        return phoneNumber.substring(indexExchange+1, indexExchange+4);
    }

    public static String parseLineNumber(String phoneNumber) {
        int indexLineNumber = phoneNumber.indexOf("-");
        return phoneNumber.substring(indexLineNumber+1);
    }

}
