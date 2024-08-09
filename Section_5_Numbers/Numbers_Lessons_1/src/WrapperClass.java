public class WrapperClass {

    public static void main(String[] args) {
        int num1 = 7;
        Integer num1B = Integer.valueOf(num1); // auto-boxing
        Double myDouble = Double.valueOf(2343.222);
        Float myFloat = Float.valueOf(23.23f);
        Byte myByte = Byte.valueOf("23");

        storeData(num1);

        int age = Integer.parseInt("23");
        int age2 = Integer.parseInt(args[0]);
        double amount = Double.parseDouble("234.56");
        boolean isUSCitizen = Boolean.parseBoolean("True");


        System.out.printf("You will be %d in 15 years.%n", age2 + 15);


    }


    /**
     * Takes in any type of data and stores it somewhere generically
     */
    public static void storeData(Object obj) {

    }
}
