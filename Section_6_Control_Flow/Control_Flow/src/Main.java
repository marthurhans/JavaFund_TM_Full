public class Main {


    public static void main(String[] args) {
        //ENHANCED FOR LOOP
        System.out.println();
        String[] fruits = {"apple", "orange", "pear", "plum"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}