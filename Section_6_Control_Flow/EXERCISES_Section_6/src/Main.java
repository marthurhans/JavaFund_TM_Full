public class Main {

    public static void main(String[] args) {

        System.out.println();
        String[] daysArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",};
        System.out.println("START QUESTION 1");
        printDays(daysArray);
        printDays2(daysArray);
        printDays3(daysArray);
        printDays4(daysArray);

        String[] daysArray2 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",};
        System.out.println("START QUESTION 2");
        printDaysWhile(daysArray2);
        printDaysWhile2(daysArray2);
        printDaysWhile3(daysArray2);
        printDaysWhile4(daysArray2);

        String[] daysArray3 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",};
        System.out.println("START QUESTION 3");
        printDaysDoWhile(daysArray3);
        printDaysDoWhile2(daysArray3);
        printDaysDoWhile3(daysArray3);
        printDaysDoWhile4(daysArray3);
    }


    //EXERCISE_1
    public static void printDays(String[] daysArray){
        for (int i = 0; i < daysArray.length; i++) {
            System.out.println(daysArray[i]);
        }
        System.out.println();
    }

    //EXERCISE_1.1
    public static void printDays2(String[] daysArray){
        for (String days : daysArray) {
            System.out.println(days);
        }
        System.out.println();
    }

    //EXERCISE_1.2
    public static void printDays3(String[] daysArray){
        for (int i = 0; i < daysArray.length; i++) {
            if(i % 2 == 1) {
                daysArray[i] = daysArray[i].toUpperCase();
            }
            System.out.println(daysArray[i]);
        }
        System.out.println();
    }

    //EXERCISE_1.3
    public static void printDays4(String[] daysArray){
        for (int i = 0; i < daysArray.length; i++) {
            String output = i % 2 == 1 ? daysArray[i].toUpperCase() : daysArray[i];
            System.out.println(output);
        }
        System.out.println();
    }

    //EXERCISE_2
    public static void printDaysWhile(String[] daysArray) {
        int i = 0;
        while (i < daysArray.length) {
            System.out.println(daysArray[i]);
            i++;
    }
        System.out.println();
    }

    //EXERCISE_2.1
    public static void printDaysWhile2(String[] daysArray){
        System.out.println("There is no enhanced while loop\n");
    }

    //EXERCISE_2.2
    public static void printDaysWhile3(String[] daysArray){
        int i = 0;
        while (i < daysArray.length) {
            if(i % 2 == 1) {
                daysArray[i] = daysArray[i].toUpperCase().concat("!!!!!!!!");
            }
            System.out.println(daysArray[i]);
            i++;
        }
        System.out.println();
    }

    //EXERCISE_2.3
    public static void printDaysWhile4(String[] daysArray){
        int i = 0;
        while (i < daysArray.length) {
            String output = i % 2 == 1 ? daysArray[i].toUpperCase() : daysArray[i];
            System.out.println(output);
            i++;
        }
        System.out.println();
    }

    //EXERCISE_3
    public static void printDaysDoWhile(String[] daysArray) {
        int i = 0;
        do {
            System.out.println(daysArray[i]);
            i++;
        } while (i < daysArray.length);
        System.out.println();
    }

    //EXERCISE_3.1
    public static void printDaysDoWhile2(String[] daysArray){
        System.out.println("There is no enhanced do-while loop\n");
    }

    //EXERCISE_3.2
    public static void printDaysDoWhile3(String[] daysArray){
        int i = 0;
        do {
            if(i % 2 == 1) {
                daysArray[i] = daysArray[i].toUpperCase().concat("****");
            }
            System.out.println(daysArray[i]);
            i++;
        } while (i < daysArray.length);
        System.out.println();
    }

    //EXERCISE_3.3
    public static void printDaysDoWhile4(String[] daysArray){
        int i = 0;
        do {
            String output = i % 2 == 1 ? daysArray[i].toUpperCase() : daysArray[i];
            System.out.println(output);
            i++;
        } while (i < daysArray.length);
        System.out.println();
    }




}