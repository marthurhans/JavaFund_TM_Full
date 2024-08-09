package com.mikehans.exercise8;

public class Main {

    public static void main(String[] args) {
        //EX 1.0
        for (DaysOfWeek days : DaysOfWeek.values()) {
            System.out.println(days);
        }

        for (int i = 0; i < DaysOfWeek.values().length; i++) {
            System.out.println(DaysOfWeek.values()[i]);
        }

        System.out.println(DaysOfWeek.values()[6]);
        System.out.println();

        //EX 1.1
        for (DaysOfWeek days : DaysOfWeek.values()) {
            String daysCapped = days.toString();
            daysCapped = daysCapped.charAt(0) + daysCapped.substring(1).toLowerCase();
            System.out.println(daysCapped);
        }
        System.out.println();

        //EX 1.3
        DaysOfWeek[] daysRandom = DaysOfWeek.values();
//        System.out.println(Arrays.toString(daysRandom));
        for (int i = 0; i < 10; i++) {
            int xx = (int) ((Math.random()) * 7);
            System.out.println(daysRandom[xx]);
        }
        System.out.println();

        //Ex 1.2 - Alternate between printing the first letter capitalized
        // or whatever letter is approximately
        //in the middle of the word.
        // For example: Sunday, monDay, Tuesday, wednEsday, etc.
        //EX 1.2 ME
        DaysOfWeek[] days = DaysOfWeek.values();
        for (int i = 0; i < DaysOfWeek.values().length; i++) {
            String newDay = java.lang.String.valueOf(days[i]).toLowerCase();
            if(i % 2 == 0) {
                newDay = newDay.substring(0,1).toUpperCase() + newDay.substring(1);
                System.out.println(newDay);
            } else {
                char[] newChar = newDay.toCharArray();
                int mid = newChar.length /2;
                newChar[mid] = Character.toUpperCase(newChar[mid]);
                String convertedDay = new String (newChar);
                System.out.println(convertedDay);
            }
        }

        System.out.println();

        //EX 1.2 Terry
        int index = 0;
        for (DaysOfWeek day : DaysOfWeek.values()) {
            String dayText = day.toString().toLowerCase();
            if (index % 2 == 0) {
                System.out.println(dayText.substring(0, 1).toUpperCase() + dayText.substring(1));
            } else {
                int middleIndex = dayText.length() / 2;
                StringBuilder sb = new StringBuilder();
                sb.append(dayText.substring(0,middleIndex));
                sb.append(dayText.substring(middleIndex, middleIndex+1).toUpperCase());
                sb.append(dayText.substring(middleIndex + 1));
                System.out.println(sb.toString());
            }
            index++;
        }
        System.out.println();

        //EX 2.0
        System.out.println("EX 2.0");
        for (WeekDaysWithFood foodWeek : WeekDaysWithFood.values()) {
            String day = foodWeek.toString();
            day = day.substring(0,1) + day.substring(1).toLowerCase();
            String food = foodWeek.getFood();
            System.out.printf("We eat %s on %s%n", food, day);
        }
        System.out.println();

        //EX 2.1
        System.out.println("EX 2.1");
        for (WeekDaysWithFood foodWeek : WeekDaysWithFood.values()) {
            String day = foodWeek.toString();
            day = day.substring(0,1) + day.substring(1).toLowerCase();
            String food = charCap(foodWeek.getFood());
            System.out.printf("We eat %s on %s%n", food, day);
        }
        System.out.println();


        //EX 3
        System.out.println("EX 3");
        System.out.println(getMealsForDays("friday, thursday, monday, saturday, tuesday"));
        System.out.println();

        //EX 4
        System.out.println("EX 4");
        int yolo = convert('w');
        System.out.println(yolo);
        System.out.println();

        //EX 5
        System.out.println("EX 5");
        char foofoo = convert(1);
        System.out.println(foofoo);
        System.out.println();

        //EX 6
        System.out.println("EX 6");
        System.out.println(numberFlip(8));
    }
    //EX 2.1 methods
    private static String charCap (String food2) {
        String[] splitString = food2.split("\\s");
        //splits "Pot Luck Roast" into an array separated by spaces (//s)
        //could have also used " "
        //ex. splitString now equals {"pot", "luck", "roast"}
        for (int i = 0; i < splitString.length; i++) {
            splitString[i] = splitString[i].substring(0,1).toUpperCase().concat(splitString[i].substring(1));
        } //simple capitalization technique used on every string element in the array
        //ex. splitString now equals {"Pot", "Luck", "Roast"}
        food2 = java.lang.String.join(" ", splitString);
        //NEW ---> String.join takes an array and adds the string elements together
        // with a space in between
        //It will not add a space to the final word!
        //ex. food now equals {"Pot Luck Roast"}
        return food2;
    }

    //EX 3 method
    public static String getMealsForDays(String foodList) {
        String finalOutput = "";
        String[] splitString = foodList.split(",\\s+");
        for (int i = 0; i < splitString.length; i++) {
            for(WeekDaysWithFood day : WeekDaysWithFood.values()) {
                if(splitString[i].equalsIgnoreCase(day.name())) {
                    String food = day.getFood();
                    finalOutput += food + ", ";
                }
            }
        }
        return finalOutput.substring(0,finalOutput.length()-2);
        //length()-1 is the last element of the string, which is a space
        //length()-2 is the element BEFORE the last element, which is the comma

    }

    //EX 3 method TERRY
    private static String getMealsForDays2(String dayCSV) {
        String[] days = dayCSV.split(",");
        StringBuilder sb = new StringBuilder();
        for (String day : days) {
            sb.append(WeekDaysWithFood.valueOf(day.strip().toUpperCase()).getFood());

            // notice we add a comma & a space after each meal.
            // The last comma-space will need to be removed
            // otherwise, we'll return "...pizza, tacos, "
            // instead of "...pizza, tacos"
            sb.append(", ");
        }
        // Get index of the last comma because that needs to be removed
        // We could do this by simply getting the length of the StringBuilder minus 2
        // (2 because ", " is two characters long and it's at the end of the String)
        // (the String of meals we're about to return) OR we could alternatively
        // call StringBuilder.lastIndexOf(", "); which would give us the same thing
        // Also, need to remove the space character right after the last comma
        int lastCommaIndex = sb.length() - 2;
//        int lastCommaSpaceIndex = sb.lastIndexOf(", ");
        sb.delete(lastCommaIndex, lastCommaIndex + 1); // lastCommaIndex + 1 represents the space following the comma
        return sb.toString();
    }


    //EX 4 method
    public static int convert(char letter) {
        return letter - 96;
    }

    //EX 5 method
    public static char convert(int num) {
        return (char) (num +96);
    }

    //EX 6 method
    public static int numberFlip (int num) {
//        int num2 = ((num-4)*2)*-1;
//        num2 = num2 + num;
//        return num2;
        return 8 - num;
    }
}

enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum WeekDaysWithFood {
    SUNDAY("pot roast"),
    MONDAY("spaghetti"),
    TUESDAY("tacos"),
    WEDNESDAY("chicken"),
    THURSDAY("meatloaf"),
    FRIDAY("hamburgers"),
    SATURDAY("pizza");

    private String food;

    WeekDaysWithFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}

