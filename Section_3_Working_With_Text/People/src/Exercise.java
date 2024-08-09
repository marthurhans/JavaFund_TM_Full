public class Exercise {


    public static void main(String[] args) {

        //EX 1 - using ExPerson Class
        System.out.println();
        ExPerson charlie = new ExPerson("charlie", "crud");
        System.out.println(charlie.getFirstName() + " " + charlie.getLastName() +"\n");

        //EX 2
        String newSentence = catToDogConverer("My cat has fleas cats");
        System.out.println(newSentence + "\n");

        //EX3
        String newVar = "    I love my life!".strip();
        System.out.println(newVar + "\n");


        //EX4
        String newestWord = alphabetWordConverter("   alphabet");
        System.out.println(newestWord + "\n");

        //EX5
        String address = "12345 Big St., Alphabet City, CA 90210";
        String[] addressBrokenUp = address.split(",");
        int index = addressBrokenUp[0].indexOf(" ");
        System.out.println("1: " + addressBrokenUp[0].substring(0,index));
        System.out.println("2: " + addressBrokenUp[0].substring(index + 1));
        System.out.println("3: " + addressBrokenUp[1].strip());
        System.out.println("4: " + addressBrokenUp[2].strip().substring(0,2));
        System.out.println("5: " + addressBrokenUp[2].strip().substring(3));
        System.out.println();

        String myText4 = "This fuck is my fuck text!";
        System.out.println(myText4.replace("fuck", "funky"));

    }

    //EX2
    public static String catToDogConverer (String sentence) {
        return sentence.replace("cat","dog");
    }

    //EX4
    public static String alphabetWordConverter (String word) {
        String newWord = word.strip();
        newWord = newWord.replaceAll("t", "T");
        return newWord;
    }



}
