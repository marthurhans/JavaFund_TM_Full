public class Main2 {

    public static void main(String[] args) {

        System.out.println();
        String[] daysArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        //EXERCISE_4
        String food = "nothing";
        for (String days: daysArray) {
            if(days.equals("Monday")) {
                food = "pot roast";
            } else if(days.equals("Tuesday")) {
                food = "spaghetti";
            } else if(days.equals("Wednesday")) {
                food = "tacos";
            } else if(days.equals("Thursday")) {
                food = "chicken";
            } else if(days.equals("Friday")) {
                food = "meatloaf";
            } else if(days.equals("Saturday")) {
                food = "hamburgers";
            } else if(days.equals("Sunday")) {
                food = "pizza";
            } else {
                food = "FUCKING NOTHING";
            }
            System.out.printf("We eat %s on %s%n", food, days);
        }
        System.out.println();

        //EXERCISE_5


            for (String days: daysArray) {
                switch (days) {
                    case "Monday":
                        food = "pot roast";
                        System.out.printf("We eat %s on %s%n", food, days);
                        break;
                    case "Tuesday":
                        food = "spaghetti";
                        System.out.printf("We eat %s on %s%n", food, days);
                        break;
                    case "Wednesday":
                        food = "tacos";
                        System.out.printf("We eat %s on %s%n", food, days);
                        break;
                    case "Thursday":
                        food = "chicken";
                        System.out.printf("We eat %s on %s%n", food, days);
                        break;
                    case "Friday":
                        food = "meatloaf";
                        System.out.printf("We eat %s on %s%n", food, days);
                        break;
                    case "Saturday":
                        food = "hamburgers";
                        System.out.printf("We eat %s on %s%n", food, days);
                        break;
                    case "Sunday":
                        food = "pizza";
                        System.out.printf("We eat %s on %s%n", food, days);
                        break;
                    default:
                        food = "FUCK ALL";
                        System.out.printf("We eat %s on %s%n", food, days);
                        break;
                }
            }

        System.out.println();

        //EXERCISE_6
        //EXERCISE_6.1
        //EXERCISE_6.2

        for (String days2: daysArray){
                food = switch (days2) {
                    case "Monday" -> "pot luck roast";
                    case "Tuesday" -> "spaghetti";
                    case "Wednesday" -> "tacos";
                    case "Thursday" -> "chicken";
                    case "Friday" -> "meatloaf";
                    case "Saturday" -> "hamburgers";
                    case "Sunday" -> "pizza";
                    default -> "DICK";
                };
                food = wordCap(food);
            System.out.printf("We eat %s on %s%n", food, days2);
        }


        //EXERCISE_7
        System.out.println();
        int totalChars = 0;
        for (String days : daysArray) {
            totalChars += days.length();
        }
        System.out.println(totalChars);


    }

    private static String wordCap(String food) {
        String[] splitString = food.split("\\s");
        for (int i = 0; i < splitString.length; i++) {
            splitString[i] = splitString[i].substring(0,1).toUpperCase().concat(splitString[i].substring(1));
        }
        food = String.join(" ", splitString);
        return food;
    }



}
